# Generated from Grammar.g4 by ANTLR 4.8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\t")
        buf.write("\61\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t")
        buf.write("\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5\32\n\5")
        buf.write("\f\5\16\5\35\13\5\3\6\3\6\7\6!\n\6\f\6\16\6$\13\6\3\7")
        buf.write("\3\7\6\7(\n\7\r\7\16\7)\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t")
        buf.write("\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\b\3\2c|\4\2aac|\3\2")
        buf.write("C\\\4\2C\\aa\3\2))\5\2\13\f\17\17\"\"\2\63\2\3\3\2\2\2")
        buf.write("\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r")
        buf.write("\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\25\3")
        buf.write("\2\2\2\t\27\3\2\2\2\13\36\3\2\2\2\r%\3\2\2\2\17-\3\2\2")
        buf.write("\2\21\22\7<\2\2\22\4\3\2\2\2\23\24\7~\2\2\24\6\3\2\2\2")
        buf.write("\25\26\7=\2\2\26\b\3\2\2\2\27\33\t\2\2\2\30\32\t\3\2\2")
        buf.write("\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2")
        buf.write("\2\34\n\3\2\2\2\35\33\3\2\2\2\36\"\t\4\2\2\37!\t\5\2\2")
        buf.write(" \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\f\3\2\2")
        buf.write("\2$\"\3\2\2\2%\'\7)\2\2&(\n\6\2\2\'&\3\2\2\2()\3\2\2\2")
        buf.write(")\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7)\2\2,\16\3\2\2\2-")
        buf.write(".\t\7\2\2./\3\2\2\2/\60\b\b\2\2\60\20\3\2\2\2\6\2\33\"")
        buf.write(")\3\b\2\2")
        return buf.getvalue()


class GrammarLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    VARIABLE = 4
    TOKEN = 5
    LITERAL = 6
    WS = 7

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "':'", "'|'", "';'" ]

    symbolicNames = [ "<INVALID>",
            "VARIABLE", "TOKEN", "LITERAL", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "VARIABLE", "TOKEN", "LITERAL", 
                  "WS" ]

    grammarFileName = "Grammar.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


