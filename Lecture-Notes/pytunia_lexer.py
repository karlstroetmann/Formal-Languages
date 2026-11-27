"""A Pygments lexer for the assembler code of Pytunia, used by minted for the listings of chapters 12 and 13.

minted only loads a custom lexer whose file name and SHA-256 hash are listed in ~/.latexminted_config:

    {"custom_lexers": {"pytunia_lexer.py": ["<sha256 of this file>"]}}

Hence, the hash has to be updated whenever this file changes (shasum -a 256 pytunia_lexer.py).

The lexer extends the lexer of Jasmin by Pytunia's types in Java notation, e.g. "main(java.lang.String[]) void"
and "max(int, int) int":  The name of a type is coloured as a type and the brackets "[]" of an array type as
punctuation, as in the lexer of Java.  Pytunia ships the same class as the Pygments plugin 'pytunia' in its module
pytunia/pygments_lexer.py, which the notebooks use.  Keep the classes identical.
"""
from pygments.lexer import bygroups, inherit
from pygments.lexers.jvm import JasminLexer
from pygments.token import Keyword, Punctuation, Whitespace

# an identifier of Java, and a primitive type or a class name, whose parts
# are separated by "." or "/"
_IDENTIFIER = r'(?:[^\W\d]|\$)[\w$]*'
_TYPE_NAME = rf'{_IDENTIFIER}(?:[./]{_IDENTIFIER})*'

# a type in Java notation ends before a blank, a comma, a closing
# parenthesis, or the end of the line
_TYPE_END = r'(?=[\s,)]|$)'

# a type in Java notation, and an array type in Java notation
_JAVA_TYPE = (rf'({_TYPE_NAME})((?:\[\])*){_TYPE_END}',
              bygroups(Keyword.Type, Punctuation), '#pop')
_ARRAY_TYPE = (rf'({_TYPE_NAME})((?:\[\])+){_TYPE_END}',
               bygroups(Keyword.Type, Punctuation), '#pop')


class PytuniaLexer(JasminLexer):
    """The assembler code of pytunia: the syntax of Jasmin together with
    the types in Java notation."""
    name = 'Pytunia'
    url = 'https://github.com/karlstroetmann/pytunia'
    aliases = ['pytunia']
    filenames = ['*.j', '*.jas']

    tokens = {
        # the type of a parameter, of a return value, of a field, or of a
        # local variable
        'descriptor/convert-dots': [_JAVA_TYPE, inherit],
        'descriptor/no-dots': [_JAVA_TYPE, inherit],
        # the parameters of a method, which are separated by commas
        'descriptors/convert-dots': [(r'[ \t]+', Whitespace),
                                     (r',', Punctuation), inherit],
        # the operand of checkcast, instanceof, anewarray, and ldc, and a
        # class in a .stack frame
        'class/no-dots': [_ARRAY_TYPE, inherit],
    }
