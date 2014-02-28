// Generated from Prefix.g by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrefixParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, NUMBER=5, WS=6;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"program", "expr"
	};

	@Override
	public String getGrammarFileName() { return "Prefix.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrefixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); ((ProgramContext)_localctx).expr = expr();
			 System.out.println(((ProgramContext)_localctx).expr.result); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public int result;
		public ExprContext e1;
		public ExprContext e2;
		public Token NUMBER;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(PrefixParser.NUMBER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrefixListener ) ((PrefixListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(29);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(7); match(1);
				setState(8); ((ExprContext)_localctx).e1 = expr();
				setState(9); ((ExprContext)_localctx).e2 = expr();
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).e1.result + ((ExprContext)_localctx).e2.result; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(12); match(2);
				setState(13); ((ExprContext)_localctx).e1 = expr();
				setState(14); ((ExprContext)_localctx).e2 = expr();
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).e1.result - ((ExprContext)_localctx).e2.result; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(17); match(3);
				setState(18); ((ExprContext)_localctx).e1 = expr();
				setState(19); ((ExprContext)_localctx).e2 = expr();
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).e1.result * ((ExprContext)_localctx).e2.result; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(22); match(4);
				setState(23); ((ExprContext)_localctx).e1 = expr();
				setState(24); ((ExprContext)_localctx).e2 = expr();
				 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).e1.result / ((ExprContext)_localctx).e2.result; 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(27); ((ExprContext)_localctx).NUMBER = match(NUMBER);
				 ((ExprContext)_localctx).result =  new Integer((((ExprContext)_localctx).NUMBER!=null?((ExprContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\b\"\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\3\2\4\2\4\2\2#\2\6\3\2\2\2"+
		"\4\37\3\2\2\2\6\7\5\4\3\2\7\b\b\2\1\2\b\3\3\2\2\2\t\n\7\3\2\2\n\13\5\4"+
		"\3\2\13\f\5\4\3\2\f\r\b\3\1\2\r \3\2\2\2\16\17\7\4\2\2\17\20\5\4\3\2\20"+
		"\21\5\4\3\2\21\22\b\3\1\2\22 \3\2\2\2\23\24\7\5\2\2\24\25\5\4\3\2\25\26"+
		"\5\4\3\2\26\27\b\3\1\2\27 \3\2\2\2\30\31\7\6\2\2\31\32\5\4\3\2\32\33\5"+
		"\4\3\2\33\34\b\3\1\2\34 \3\2\2\2\35\36\7\7\2\2\36 \b\3\1\2\37\t\3\2\2"+
		"\2\37\16\3\2\2\2\37\23\3\2\2\2\37\30\3\2\2\2\37\35\3\2\2\2 \5\3\2\2\2"+
		"\3\37";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}