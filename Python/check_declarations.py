#!/usr/bin/env python3
"""Check that the declaration cells of the notebooks match the definitions that they declare.

The type checker basedpyright analyzes every notebook on its own and cannot follow the magic command
`%run`.  Therefore, a notebook that loads another notebook via `%run` declares the functions, classes,
types, and variables that it uses from the loaded notebook in a cell of the following form:

    from typing import TYPE_CHECKING
    if TYPE_CHECKING:
        import graphviz as gv
        type AST = str | int | float | tuple[str, *tuple['AST', ...]]
        def tuple2dot(t: AST) -> gv.Digraph: ...

Python never executes this block, since `TYPE_CHECKING` is `False` at run time, but the type checker
reads it.  However, the type checker cannot notice when such a declaration no longer agrees with the
definition in the loaded notebook.  This script does:  For every declaration in an `if TYPE_CHECKING:`
block it looks up the definition in the notebooks that have been loaded via `%run` before this block,
including the notebooks that these notebooks load in turn, and compares
- the parameters and the return types of functions and methods,
- the right hand sides of type aliases, and
- the annotations of variables and attributes.
Furthermore, if a declaration uses a type alias that is defined both in the notebook itself and in a
loaded notebook, the two definitions have to agree.

Usage:  python check_declarations.py [NOTEBOOK ...]
Without arguments, all notebooks below the directory of this script are checked.  The exit status is 1
if a problem has been found.
"""
import ast
import json
import re
import sys
from pathlib import Path

RUN = re.compile(r'^%run\s+(\S+)', re.M)


def code_cells(path: Path) -> list[str]:
    nb = json.loads(path.read_text(encoding='utf-8'))
    return [''.join(c['source']) for c in nb['cells'] if c['cell_type'] == 'code']


def parse_cell(source: str) -> ast.Module | None:
    """Parse a code cell.  Lines with IPython magics or shell commands are blanked out first."""
    try:
        return ast.parse(source)
    except SyntaxError:
        lines = ['' if line.startswith(('%', '!')) else line for line in source.split('\n')]
        try:
            return ast.parse('\n'.join(lines))
        except SyntaxError:
            return None


def is_type_checking_block(node: ast.stmt) -> bool:
    if not isinstance(node, ast.If):
        return False
    test = node.test
    return (isinstance(test, ast.Name) and test.id == 'TYPE_CHECKING' or
            isinstance(test, ast.Attribute) and test.attr == 'TYPE_CHECKING')


def defined_name(node: ast.stmt) -> str | None:
    """The name that a top-level statement defines, if any."""
    match node:
        case ast.FunctionDef(name=name) | ast.ClassDef(name=name):
            return name
        case ast.TypeAlias(name=ast.Name(id=name)):
            return name
        case ast.Assign(targets=[ast.Name(id=name)]) | ast.AnnAssign(target=ast.Name(id=name)):
            return name
    return None


class Definitions:
    """The top-level definitions of the notebooks loaded so far.  Declarations are not definitions."""
    def __init__(self) -> None:
        self.nodes: dict[str, ast.stmt] = {}
        self.annotations: dict[str, ast.expr] = {}
        self.origin: dict[str, str] = {}

    def add(self, node: ast.stmt, origin: str) -> None:
        name = defined_name(node)
        if name is None:
            return
        self.nodes[name] = node
        self.origin[name] = origin
        if isinstance(node, ast.AnnAssign):
            self.annotations[name] = node.annotation

    def update(self, other: 'Definitions') -> None:
        self.nodes.update(other.nodes)
        self.annotations.update(other.annotations)
        self.origin.update(other.origin)


_cache: dict[Path, Definitions] = {}


def definitions(path: Path, active: frozenset[Path] = frozenset()) -> Definitions:
    """All definitions that `%run path` makes available."""
    path = path.resolve()
    if path in _cache:
        return _cache[path]
    defs = Definitions()
    if path in active or not path.exists():
        return defs
    for source in code_cells(path):
        for target in RUN.findall(source):
            defs.update(definitions(path.parent / target, active | {path}))
        tree = parse_cell(source)
        if tree is not None:
            for node in tree.body:
                if not is_type_checking_block(node):
                    defs.add(node, path.name)
    _cache[path] = defs
    return defs


def signature(f: ast.FunctionDef) -> str:
    params = '' if not f.type_params else '[' + ', '.join(ast.unparse(p) for p in f.type_params) + ']'
    result = '' if f.returns is None else ' -> ' + ast.unparse(f.returns)
    return f'{params}({ast.unparse(f.args)}){result}'


def alias_value(node: ast.stmt) -> str | None:
    """The right hand side of a type alias or of an assignment."""
    match node:
        case ast.TypeAlias(value=value) | ast.Assign(value=value):
            return ast.unparse(value)
        case ast.AnnAssign(value=value) if value is not None:
            return ast.unparse(value)
    return None


def class_members(cls: ast.ClassDef) -> tuple[dict[str, ast.FunctionDef], dict[str, ast.expr]]:
    """The methods of a class and the annotations of its attributes, including those in `__init__`."""
    methods = {f.name: f for f in cls.body if isinstance(f, ast.FunctionDef)}
    attributes = {a.target.id: a.annotation for a in cls.body
                  if isinstance(a, ast.AnnAssign) and isinstance(a.target, ast.Name)}
    init = methods.get('__init__')
    if init is not None:
        for node in ast.walk(init):
            if (isinstance(node, ast.AnnAssign) and isinstance(node.target, ast.Attribute)
                    and isinstance(node.target.value, ast.Name) and node.target.value.id == 'self'):
                attributes.setdefault(node.target.attr, node.annotation)
    return methods, attributes


def check_class(decl: ast.ClassDef, defn: ast.ClassDef, where: str) -> list[str]:
    problems = []
    methods, attributes = class_members(defn)
    for member in decl.body:
        match member:
            case ast.FunctionDef(name=name):
                if name not in methods:
                    problems.append(f'method {decl.name}.{name} is not declared in the class body in {where}')
                elif signature(member) != signature(methods[name]):
                    problems.append(f'{decl.name}.{name}{signature(member)} differs from '
                                    f'{decl.name}.{name}{signature(methods[name])} in {where}')
            case ast.AnnAssign(target=ast.Name(id=name), annotation=annotation):
                if name not in attributes:
                    problems.append(f'attribute {decl.name}.{name} has no annotation in {where}')
                elif ast.unparse(annotation) != ast.unparse(attributes[name]):
                    problems.append(f'{decl.name}.{name}: {ast.unparse(annotation)} differs from '
                                    f'{ast.unparse(attributes[name])} in {where}')
    return problems


def check_declaration(decl: ast.stmt, loaded: Definitions) -> list[str]:
    if isinstance(decl, (ast.Import, ast.ImportFrom, ast.Pass)) or (
            isinstance(decl, ast.Expr) and isinstance(decl.value, ast.Constant)):
        return []
    name = defined_name(decl)
    if name is None:
        return [f'line "{ast.unparse(decl)[:60]}" is not a declaration']
    if name not in loaded.nodes:
        return [f'{name} is declared, but not defined in the notebooks loaded with %run']
    defn, where = loaded.nodes[name], loaded.origin[name]
    match decl:
        case ast.FunctionDef():
            if not isinstance(defn, ast.FunctionDef):
                return [f'{name} is declared as a function, but it is no function in {where}']
            if signature(decl) != signature(defn):
                return [f'{name}{signature(decl)} differs from {name}{signature(defn)} in {where}']
        case ast.ClassDef():
            if not isinstance(defn, ast.ClassDef):
                return [f'{name} is declared as a class, but it is no class in {where}']
            return check_class(decl, defn, where)
        case ast.AnnAssign(annotation=annotation, value=None):
            if name not in loaded.annotations:
                return [f'the variable {name} has no annotation in {where}']
            if ast.unparse(annotation) != ast.unparse(loaded.annotations[name]):
                return [f'{name}: {ast.unparse(annotation)} differs from '
                        f'{name}: {ast.unparse(loaded.annotations[name])} in {where}']
        case _:
            if alias_value(decl) != alias_value(defn):
                return [f'{name} = {alias_value(decl)} differs from {name} = {alias_value(defn)} in {where}']
    return []


def used_names(decl: ast.stmt) -> set[str]:
    return {n.id for n in ast.walk(decl) if isinstance(n, ast.Name)}


def check_notebook(path: Path) -> tuple[int, list[str]]:
    """Returns the number of declarations and the problems found in the notebook at `path`."""
    loaded = Definitions()
    local = Definitions()
    count, problems = 0, []
    for number, source in enumerate(code_cells(path)):
        for target in RUN.findall(source):
            loaded.update(definitions(path.parent / target))
        tree = parse_cell(source)
        if tree is None:
            continue
        for node in tree.body:
            if not is_type_checking_block(node):
                local.add(node, path.name)
                continue
            declared = {defined_name(d) for d in node.body} - {None}
            for decl in node.body:
                count += defined_name(decl) is not None
                problems += [f'code cell {number}: {p}' for p in check_declaration(decl, loaded)]
                for name in sorted(used_names(decl) - declared):
                    if name in local.nodes and name in loaded.nodes and \
                            alias_value(local.nodes[name]) != alias_value(loaded.nodes[name]):
                        problems.append(f'code cell {number}: {name} is defined differently here and in '
                                        f'{loaded.origin[name]}')
    return count, sorted(set(problems), key=problems.index)


def main(arguments: list[str]) -> int:
    root = Path(__file__).resolve().parent
    if arguments:
        notebooks = [Path(a) for a in arguments]
    else:
        # hidden directories like .ipynb_checkpoints and .virtual_documents contain no real notebooks
        notebooks = sorted(p for p in root.rglob('*.ipynb')
                           if not any(part.startswith('.') for part in p.relative_to(root).parts))
    total, failed = 0, 0
    for path in notebooks:
        try:
            count, problems = check_notebook(path)
        except (OSError, json.JSONDecodeError) as error:
            count, problems = 0, [f'cannot be read: {error}']
        total += count
        if problems:
            failed += 1
            print(f'{path}:')
            for p in problems:
                print(f'    {p}')
    print(f'{total} declarations checked, {failed} notebooks with problems.')
    return 1 if failed else 0


if __name__ == '__main__':
    sys.exit(main(sys.argv[1:]))
