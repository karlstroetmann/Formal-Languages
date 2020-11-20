# Generated from Grammar.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t")
        buf.write("9\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\6\2")
        buf.write("\17\n\2\r\2\16\2\20\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\3\3\4\3")
        buf.write("\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5")
        buf.write("\3\5\3\5\3\5\5\5\67\n\5\3\5\2\2\6\2\4\6\b\2\2\29\2\n\3")
        buf.write("\2\2\2\4\24\3\2\2\2\6%\3\2\2\2\b\66\3\2\2\2\n\16\b\2\1")
        buf.write("\2\13\f\5\4\3\2\f\r\b\2\1\2\r\17\3\2\2\2\16\13\3\2\2\2")
        buf.write("\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2")
        buf.write("\2\22\23\b\2\1\2\23\3\3\2\2\2\24\25\b\3\1\2\25\26\7\6")
        buf.write("\2\2\26\27\7\3\2\2\27\30\5\6\4\2\30\37\b\3\1\2\31\32\7")
        buf.write("\4\2\2\32\33\5\6\4\2\33\34\b\3\1\2\34\36\3\2\2\2\35\31")
        buf.write("\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2")
        buf.write("\2\2!\37\3\2\2\2\"#\7\5\2\2#$\b\3\1\2$\5\3\2\2\2%+\b\4")
        buf.write("\1\2&\'\5\b\5\2\'(\b\4\1\2(*\3\2\2\2)&\3\2\2\2*-\3\2\2")
        buf.write("\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\b\4\1\2/")
        buf.write("\7\3\2\2\2\60\61\7\6\2\2\61\67\b\5\1\2\62\63\7\7\2\2\63")
        buf.write("\67\b\5\1\2\64\65\7\b\2\2\65\67\b\5\1\2\66\60\3\2\2\2")
        buf.write("\66\62\3\2\2\2\66\64\3\2\2\2\67\t\3\2\2\2\6\20\37+\66")
        return buf.getvalue()


class GrammarParser ( Parser ):

    grammarFileName = "Grammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "':'", "'|'", "';'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "VARIABLE", "TOKEN", "LITERAL", "WS" ]

    RULE_start = 0
    RULE_grmrl = 1
    RULE_body = 2
    RULE_item = 3

    ruleNames =  [ "start", "grmrl", "body", "item" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    VARIABLE=4
    TOKEN=5
    LITERAL=6
    WS=7

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class StartContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.g = None
            self._grmrl = None # GrmrlContext

        def grmrl(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(GrammarParser.GrmrlContext)
            else:
                return self.getTypedRuleContext(GrammarParser.GrmrlContext,i)


        def getRuleIndex(self):
            return GrammarParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = GrammarParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            Rules = []
            self.state = 12 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 9
                localctx._grmrl = self.grmrl()
                Rules += localctx._grmrl.rl
                self.state = 14 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==GrammarParser.VARIABLE):
                    break

            localctx.g = Rules
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class GrmrlContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.rl = None
            self.v = None # Token
            self.b1 = None # BodyContext
            self.b2 = None # BodyContext

        def VARIABLE(self):
            return self.getToken(GrammarParser.VARIABLE, 0)

        def body(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(GrammarParser.BodyContext)
            else:
                return self.getTypedRuleContext(GrammarParser.BodyContext,i)


        def getRuleIndex(self):
            return GrammarParser.RULE_grmrl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterGrmrl" ):
                listener.enterGrmrl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitGrmrl" ):
                listener.exitGrmrl(self)




    def grmrl(self):

        localctx = GrammarParser.GrmrlContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_grmrl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            RuleList = []
            self.state = 19
            localctx.v = self.match(GrammarParser.VARIABLE)
            self.state = 20
            self.match(GrammarParser.T__0)
            self.state = 21
            localctx.b1 = self.body()
            RuleList.append(((None if localctx.v is None else localctx.v.text),) + localctx.b1.il)
            self.state = 29
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==GrammarParser.T__1:
                self.state = 23
                self.match(GrammarParser.T__1)
                self.state = 24
                localctx.b2 = self.body()
                RuleList.append(((None if localctx.v is None else localctx.v.text),) + localctx.b2.il)
                self.state = 31
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 32
            self.match(GrammarParser.T__2)
            localctx.rl = RuleList
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BodyContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.il = None
            self.i = None # ItemContext

        def item(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(GrammarParser.ItemContext)
            else:
                return self.getTypedRuleContext(GrammarParser.ItemContext,i)


        def getRuleIndex(self):
            return GrammarParser.RULE_body

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBody" ):
                listener.enterBody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBody" ):
                listener.exitBody(self)




    def body(self):

        localctx = GrammarParser.BodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_body)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            Body = []
            self.state = 41
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << GrammarParser.VARIABLE) | (1 << GrammarParser.TOKEN) | (1 << GrammarParser.LITERAL))) != 0):
                self.state = 36
                localctx.i = self.item()
                Body.append(localctx.i.atom)
                self.state = 43
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            localctx.il = tuple(Body)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ItemContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.atom = None
            self.v = None # Token
            self.t = None # Token
            self.l = None # Token

        def VARIABLE(self):
            return self.getToken(GrammarParser.VARIABLE, 0)

        def TOKEN(self):
            return self.getToken(GrammarParser.TOKEN, 0)

        def LITERAL(self):
            return self.getToken(GrammarParser.LITERAL, 0)

        def getRuleIndex(self):
            return GrammarParser.RULE_item

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterItem" ):
                listener.enterItem(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitItem" ):
                listener.exitItem(self)




    def item(self):

        localctx = GrammarParser.ItemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_item)
        try:
            self.state = 52
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [GrammarParser.VARIABLE]:
                self.enterOuterAlt(localctx, 1)
                self.state = 46
                localctx.v = self.match(GrammarParser.VARIABLE)
                localctx.atom = (None if localctx.v is None else localctx.v.text)
                pass
            elif token in [GrammarParser.TOKEN]:
                self.enterOuterAlt(localctx, 2)
                self.state = 48
                localctx.t = self.match(GrammarParser.TOKEN)
                localctx.atom = (None if localctx.t is None else localctx.t.text)
                pass
            elif token in [GrammarParser.LITERAL]:
                self.enterOuterAlt(localctx, 3)
                self.state = 50
                localctx.l = self.match(GrammarParser.LITERAL)
                localctx.atom = (None if localctx.l is None else localctx.l.text)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





