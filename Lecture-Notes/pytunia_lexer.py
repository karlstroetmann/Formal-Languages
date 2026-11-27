"""A Pygments lexer for the assembler code of Pytunia, used by minted for the listings of chapters 12 and 13.

minted only loads a custom lexer whose file name and SHA-256 hash are listed in ~/.latexminted_config:

    {"custom_lexers": {"pytunia_lexer.py": ["<sha256 of this file>"]}}

Hence, the hash has to be updated whenever this file changes (shasum -a 256 pytunia_lexer.py).

Pytunia accepts the syntax of Jasmin and, in addition, types written as in Java, e.g.

    .method public static main(java.lang.String[]) void
    invokestatic Primes.max(int, int) int

The lexer of Jasmin only knows the descriptors of the JVM, e.g. "[Ljava/lang/String;".  It colours the "["
of "java.lang.String[]" as punctuation, but the "]" as a type, it counts the comma between two parameters
as part of a type, and it splits a class name at every capital "L".  This lexer extends the lexer of
Jasmin by the types in Java notation:  The name of a type is coloured as a type and the brackets "[]" of an
array type as punctuation, as in Pygments' lexer of Java.
"""
from pygments.lexer import bygroups, inherit
from pygments.lexers.jvm import JasminLexer
from pygments.token import Keyword, Punctuation

# an identifier of Java, and a primitive type or a class name, whose parts are separated by "." or "/"
_IDENTIFIER = r'(?:[^\W\d]|\$)[\w$]*'
_TYPE_NAME = rf'{_IDENTIFIER}(?:[./]{_IDENTIFIER})*'

# a type in Java notation ends before a blank, a comma, a closing parenthesis, or the end of the line
_TYPE_END = r'(?=[\s,)]|$)'


class PytuniaLexer(JasminLexer):
    """The assembler code of Pytunia: the syntax of Jasmin together with types in Java notation."""
    name = 'Pytunia'
    url = 'https://github.com/karlstroetmann/pytunia'
    aliases = ['pytunia']
    filenames = ['*.jas']

    tokens = {
        # the type of a parameter, of a return value, of a field, or of a local variable
        'descriptor/convert-dots': [
            (rf'({_TYPE_NAME})((?:\[\])*){_TYPE_END}', bygroups(Keyword.Type, Punctuation), '#pop'),
            inherit,
        ],
        'descriptor/no-dots': [
            (rf'({_TYPE_NAME})((?:\[\])*){_TYPE_END}', bygroups(Keyword.Type, Punctuation), '#pop'),
            inherit,
        ],
        # the list of parameters, which are separated by commas
        'descriptors/convert-dots': [
            (r',', Punctuation),
            inherit,
        ],
        # an array type as the operand of checkcast, instanceof, anewarray, and ldc
        'class/no-dots': [
            (rf'({_TYPE_NAME})((?:\[\])+){_TYPE_END}', bygroups(Keyword.Type, Punctuation), '#pop'),
            inherit,
        ],
    }
