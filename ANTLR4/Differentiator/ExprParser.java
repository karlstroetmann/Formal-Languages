// Generated from Expr.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, VAR=9, 
		NUM=10, WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "'log'", "')'", "'+'", "'-'", "'*'", "'('", "'/'", "'exp'", 
		"VAR", "NUM", "WS"
	};
	public static final int
		RULE_expr = 0, RULE_product = 1, RULE_factor = 2;
	public static final String[] ruleNames = {
		"expr", "product", "factor"
	};

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public Expr result;
		public ProductContext p;
		public ProductContext q;
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); ((ExprContext)_localctx).p = product();
			 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p.result; 
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==4) {
				{
				setState(18);
				switch (_input.LA(1)) {
				case 3:
					{
					{
					setState(8); match(3);
					setState(9); ((ExprContext)_localctx).q = product();
					}
					 ((ExprContext)_localctx).result =  new Sum(       _localctx.result, ((ExprContext)_localctx).q.result); 
					}
					break;
				case 4:
					{
					{
					setState(13); match(4);
					setState(14); ((ExprContext)_localctx).q = product();
					}
					 ((ExprContext)_localctx).result =  new Difference(_localctx.result, ((ExprContext)_localctx).q.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ProductContext extends ParserRuleContext {
		public Expr result;
		public FactorContext f;
		public FactorContext g;
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_product);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); ((ProductContext)_localctx).f = factor();
			 ((ProductContext)_localctx).result =  ((ProductContext)_localctx).f.result; 
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5 || _la==7) {
				{
				setState(35);
				switch (_input.LA(1)) {
				case 5:
					{
					{
					setState(25); match(5);
					setState(26); ((ProductContext)_localctx).g = factor();
					}
					 ((ProductContext)_localctx).result =  new Product( _localctx.result, ((ProductContext)_localctx).g.result); 
					}
					break;
				case 7:
					{
					{
					setState(30); match(7);
					setState(31); ((ProductContext)_localctx).g = factor();
					}
					 ((ProductContext)_localctx).result =  new Quotient(_localctx.result, ((ProductContext)_localctx).g.result); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public Expr result;
		public ExprContext expr;
		public Token VAR;
		public Token NUM;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode VAR() { return getToken(ExprParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_factor);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); match(6);
				setState(41); ((FactorContext)_localctx).expr = expr();
				setState(42); match(2);
				 ((FactorContext)_localctx).result =  ((FactorContext)_localctx).expr.result;                  
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); match(8);
				setState(46); match(6);
				setState(47); ((FactorContext)_localctx).expr = expr();
				setState(48); match(2);
				 ((FactorContext)_localctx).result =  new Exponential(((FactorContext)_localctx).expr.result); 
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); match(1);
				setState(52); match(6);
				setState(53); ((FactorContext)_localctx).expr = expr();
				setState(54); match(2);
				 ((FactorContext)_localctx).result =  new Logarithm(  ((FactorContext)_localctx).expr.result); 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(57); ((FactorContext)_localctx).VAR = match(VAR);
				 ((FactorContext)_localctx).result =  new Variable((((FactorContext)_localctx).VAR!=null?((FactorContext)_localctx).VAR.getText():null));       
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); ((FactorContext)_localctx).NUM = match(NUM);
				 ((FactorContext)_localctx).result =  new Number((((FactorContext)_localctx).NUM!=null?((FactorContext)_localctx).NUM.getText():null));         
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\rB\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\2\5\2\4\6\2\2F\2\b\3\2"+
		"\2\2\4\31\3\2\2\2\6?\3\2\2\2\b\t\5\4\3\2\t\26\b\2\1\2\n\13\7\5\2\2\13"+
		"\f\5\4\3\2\f\r\3\2\2\2\r\16\b\2\1\2\16\25\3\2\2\2\17\20\7\6\2\2\20\21"+
		"\5\4\3\2\21\22\3\2\2\2\22\23\b\2\1\2\23\25\3\2\2\2\24\n\3\2\2\2\24\17"+
		"\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\3\3\2\2\2\30\26"+
		"\3\2\2\2\31\32\5\6\4\2\32\'\b\3\1\2\33\34\7\7\2\2\34\35\5\6\4\2\35\36"+
		"\3\2\2\2\36\37\b\3\1\2\37&\3\2\2\2 !\7\t\2\2!\"\5\6\4\2\"#\3\2\2\2#$\b"+
		"\3\1\2$&\3\2\2\2%\33\3\2\2\2% \3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2"+
		"(\5\3\2\2\2)\'\3\2\2\2*+\7\b\2\2+,\5\2\2\2,-\7\4\2\2-.\b\4\1\2.@\3\2\2"+
		"\2/\60\7\n\2\2\60\61\7\b\2\2\61\62\5\2\2\2\62\63\7\4\2\2\63\64\b\4\1\2"+
		"\64@\3\2\2\2\65\66\7\3\2\2\66\67\7\b\2\2\678\5\2\2\289\7\4\2\29:\b\4\1"+
		"\2:@\3\2\2\2;<\7\13\2\2<@\b\4\1\2=>\7\f\2\2>@\b\4\1\2?*\3\2\2\2?/\3\2"+
		"\2\2?\65\3\2\2\2?;\3\2\2\2?=\3\2\2\2@\7\3\2\2\2\7\24\26%\'?";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}