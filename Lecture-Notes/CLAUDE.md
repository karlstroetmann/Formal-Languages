# Lecture notes "Formal Languages and Their Applications"

## Building

```
pdflatex -shell-escape formal-languages.tex
```

- `-shell-escape` is required: `minted` calls `pygmentize`, and `imakeidx` runs `makeindex` automatically.
- Run it 2–3 times so that references, the index, and the list of notation settle.  A clean build has
  0 errors and no "multiply defined" or "undefined reference" warnings.
- The bibliography needs `bibtex formal-languages` only when `cs.bib` or the `\cite`s change.
- The tracked build output `formal-languages.idx` is committed together with source changes.
- The PDF is not tracked, since every version would stay in the history.  It is published as the asset of
  the GitHub release `lecture-notes`: `gh release upload lecture-notes formal-languages.pdf --clobber`.
  Keep the images small (about 200 dpi at the printed width), since the PDF contains all of them.

## Structure

- `formal-languages.tex` is the main file: preamble (grouped by purpose, `hyperref`/`glossaries` last),
  then the `\include`d chapters.  Figures are included as `\includegraphics{Abbildungen/...}`.
- Chapter order: introduction, regular-expressions, scanners, finite-state-machines, regular-languages,
  context-free-languages, larkita, larkita-interpreter (chapter 8), earley-parser, shift-reduce-parser +
  lr-parser (chapter 10), larkita-lalr, jasmin, compiler + compiler-2 (chapter 13).
- `notation.tex` holds the entries of the *List of Notation* (package `glossaries`).
- The Python notebooks live in `../Python/Chapter-NN/`, numbered like the chapters
  (`Chapter-04-05` covers chapters 4 and 5).  They run in the conda environment `fl`, e.g.
  `conda run -n fl jupyter nbconvert --to notebook --execute --output /tmp/out.ipynb X.ipynb`;
  the Homebrew Python lacks the required packages.
- Type checking of notebooks: all notebooks use basedpyright (`conda run -n fl basedpyright X.ipynb`; live in
  JupyterLab via jupyterlab-lsp).
  The settings are in `../Python/pyrightconfig.json` (mode "standard"; the default mode warns about every
  unused return value, e.g. of `outfile.write`).  JupyterLab is started in `../Python`, so the language
  server finds this file.  Recursive types are written as `type X = ...`; no forward declarations are
  needed.  The author does not want `# type: ignore` or other suppressions; errors are fixed by declarations:
  - basedpyright cannot follow `%run`.  After a `%run X.ipynb`, a cell `if TYPE_CHECKING:` declares the
    functions, classes, types, and variables that the notebook uses from `X` (never executed).
    `python ../Python/check_declarations.py` checks that these declarations agree with the definitions.
  - Methods that are defined in later cells and attached via `Class.m = m` are declared in the class body
    with the body `...`; the checker then also checks the attached implementation against the declaration.
  - The type aliases of chapters 4 and 5 have one meaning in all notebooks (`State`, `Char`, `Delta`, `NFA`,
    `TransRel`, `DFA`, `RegExp` with `int` for the empty language, since the checker widens `Literal[0]`).
  - Bugs and limits of basedpyright: after `x += ...` in a later cell, `x` counts as unbound, so write
    `x = x + ...`; cells starting with a cell magic like `%%time` are skipped entirely.

## Conventions

- New notions are introduced as `\blue{term}` followed by `\index{term}`.  Index entries that start with a
  formatting command need a sort key, e.g. `\index{DFA@\simtextsc{Dfa}}`.  Use singular forms and English.
- Notation gets an entry in `notation.tex` plus `\glsadd{key}` at the place where it is defined
  (`\glsadd` prints nothing).
- `\simtextsc{...}` fakes small caps (the font Atkinson Hyperlegible has none).
- Code listings use `minted`.  Listings that show notebook code must match the notebook
  (`../Python/Chapter-13/Compiler.ipynb` for chapter 13).
- The page layout is A4 with a 17cm text block.  The author does not want text or fonts to become smaller.

## Pitfalls

- `minted` listings that are too wide do not produce "Overfull \hbox" warnings; check the PDF itself.
- The login shell is zsh: unquoted `$VAR` lists are not word-split, and `set -- $x` does not split.

## Working with the author

- Ask before changes whose outcome is a matter of taste or content; the author prefers to be asked when
  in doubt.
- Commit and push only after the author has agreed.
