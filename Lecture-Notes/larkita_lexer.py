"""Pygments lexers for Larkita grammars, used by minted for the listings of grammars.

minted only loads a custom lexer whose file name and SHA-256 hash are listed in ~/.latexminted_config:

    {"custom_lexers": {"larkita_lexer.py": ["<sha256 of this file>"]}}

Hence, the hash has to be updated whenever this file changes (shasum -a 256 larkita_lexer.py).
"""
from pygments.lexer import RegexLexer, bygroups, inherit, using
from pygments.lexers.python import PythonLexer
from pygments.token import Comment, Keyword, Name, Number, Operator, Punctuation, String, Whitespace


class LarkitaLexer(RegexLexer):
    """A grammar for Larkita.  If the grammar is followed by the end of a Python string, the rest is Python."""
    name = 'Larkita'
    aliases = ['larkita']
    filenames = ['*.lark', '*.g']

    tokens = {
        'root': [
            # the rule or terminal that is defined in this line
            (r'^([ \t]*)([?!]?_?[a-z][a-z_0-9]*)(\.\d+)?([ \t]*)(:)',
             bygroups(Whitespace, Name.Function, Number, Whitespace, Punctuation)),
            (r'^([ \t]*)(_?[A-Z][A-Z_0-9]*)(\.\d+)?([ \t]*)(:)',
             bygroups(Whitespace, Name.Variable, Number, Whitespace, Punctuation)),
            # line breaks are separate tokens, so that the rules above see the beginning of every line
            (r'\n', Whitespace),
            (r'[ \t]+', Whitespace),
            (r'(""")((?:.|\n)*)', bygroups(String.Double, using(PythonLexer))),
            (r'//[^\n]*', Comment.Single),
            (r'%(ignore|import|declare|override|extend)\b', Keyword.Namespace),
            (r'(->)([ \t]*)(_?[a-zA-Z][a-zA-Z_0-9]*|"[^"\n]*")', bygroups(Operator, Whitespace, Name.Label)),
            (r'"(\\.|[^"\\\n])*"i?', String),
            (r'/(?!/)(\\/|\\\\|[^/\n])*?/[imslux]*', String.Regex),
            (r'_?[A-Z][A-Z_0-9]*', Name.Variable),
            (r'_?[a-z][a-z_0-9]*', Name),
            (r'\d+', Number),
            (r'[|*+?~]|\.\.', Operator),
            (r'[()\[\]:,.]', Punctuation),
        ],
    }


class PythonLarkitaLexer(PythonLexer):
    """Python code in which the raw strings r\"\"\"...\"\"\" are Larkita grammars.  The string may be unfinished."""
    name = 'Python with Larkita grammars'
    aliases = ['python-larkita']

    tokens = {
        'root': [
            (r'(r)(""")((?:.|\n)*?)("""|\Z)',
             bygroups(String.Affix, String.Double, using(LarkitaLexer), String.Double)),
            inherit,
        ],
    }
