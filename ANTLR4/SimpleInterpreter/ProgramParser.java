// Generated from Program.g4 by ANTLR 4.1

    import java.util.TreeMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProgramParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, ID=9, 
		INT=10, WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "':='", "'+'", "'-'", "'*'", "'('", "'/'", "';'", 
		"ID", "INT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_stmnt = 1, RULE_expr = 2, RULE_product = 3, RULE_factor = 4;
	public static final String[] ruleNames = {
		"program", "stmnt", "expr", "product", "factor"
	};

	@Override
	public String getGrammarFileName() { return "Program.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    TreeMap<String, Integer> varTable = new TreeMap<String, Integer>();

	public ProgramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StmntContext stmnt(int i) {
			return getRuleContext(StmntContext.class,i);
		}
		public List<StmntContext> stmnt() {
			return getRuleContexts(StmntContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); stmnt();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << ID) | (1L << INT))) != 0) );
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

	public static class StmntContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public StmntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmnt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterStmnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitStmnt(this);
		}
	}

	public final StmntContext stmnt() throws RecognitionException {
		StmntContext _localctx = new StmntContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmnt);
		try {
			setState(25);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15); ((StmntContext)_localctx).ID = match(ID);
				setState(16); match(2);
				setState(17); ((StmntContext)_localctx).expr = expr();
				setState(18); match(8);
				 varTable.put((((StmntContext)_localctx).ID!=null?((StmntContext)_localctx).ID.getText():null), ((StmntContext)_localctx).expr.result); 
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); ((StmntContext)_localctx).expr = expr();
				setState(22); match(8);
				 System.out.println(((StmntContext)_localctx).expr.result);     
				}
				break;
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
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); ((ExprContext)_localctx).p = product();
			 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p.result; 
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==4) {
				{
				setState(39);
				switch (_input.LA(1)) {
				case 3:
					{
					{
					setState(29); match(3);
					setState(30); ((ExprContext)_localctx).q = product();
					}
					 _localctx.result += ((ExprContext)_localctx).q.result; 
					}
					break;
				case 4:
					{
					{
					setState(34); match(4);
					setState(35); ((ExprContext)_localctx).q = product();
					}
					 _localctx.result -= ((ExprContext)_localctx).q.result; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43);
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
		public int result;
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
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitProduct(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_product);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); ((ProductContext)_localctx).f = factor();
			 ((ProductContext)_localctx).result =  ((ProductContext)_localctx).f.result; 
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5 || _la==7) {
				{
				setState(56);
				switch (_input.LA(1)) {
				case 5:
					{
					{
					setState(46); match(5);
					setState(47); ((ProductContext)_localctx).g = factor();
					}
					 _localctx.result *= ((ProductContext)_localctx).g.result; 
					}
					break;
				case 7:
					{
					{
					setState(51); match(7);
					setState(52); ((ProductContext)_localctx).g = factor();
					}
					 _localctx.result /= ((ProductContext)_localctx).g.result; 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(60);
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
		public int result;
		public ExprContext expr;
		public Token ID;
		public Token INT;
		public TerminalNode INT() { return getToken(ProgramParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(ProgramParser.ID, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProgramListener ) ((ProgramListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_factor);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); match(6);
				setState(62); ((FactorContext)_localctx).expr = expr();
				setState(63); match(1);
				 ((FactorContext)_localctx).result =  ((FactorContext)_localctx).expr.result;           
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); ((FactorContext)_localctx).ID = match(ID);
				 ((FactorContext)_localctx).result =  varTable.get((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null)); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); ((FactorContext)_localctx).INT = match(INT);
				 ((FactorContext)_localctx).result =  new Integer((((FactorContext)_localctx).INT!=null?((FactorContext)_localctx).INT.getText():null)); 
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\rK\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6I\n\6\3\6\2\7\2\4\6\b\n\2\2M\2\r\3\2\2\2\4\33\3\2\2\2\6\35\3"+
		"\2\2\2\b.\3\2\2\2\nH\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17"+
		"\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\7\13\2\2\22\23\7\4\2\2\23"+
		"\24\5\6\4\2\24\25\7\n\2\2\25\26\b\3\1\2\26\34\3\2\2\2\27\30\5\6\4\2\30"+
		"\31\7\n\2\2\31\32\b\3\1\2\32\34\3\2\2\2\33\21\3\2\2\2\33\27\3\2\2\2\34"+
		"\5\3\2\2\2\35\36\5\b\5\2\36+\b\4\1\2\37 \7\5\2\2 !\5\b\5\2!\"\3\2\2\2"+
		"\"#\b\4\1\2#*\3\2\2\2$%\7\6\2\2%&\5\b\5\2&\'\3\2\2\2\'(\b\4\1\2(*\3\2"+
		"\2\2)\37\3\2\2\2)$\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-+"+
		"\3\2\2\2./\5\n\6\2/<\b\5\1\2\60\61\7\7\2\2\61\62\5\n\6\2\62\63\3\2\2\2"+
		"\63\64\b\5\1\2\64;\3\2\2\2\65\66\7\t\2\2\66\67\5\n\6\2\678\3\2\2\289\b"+
		"\5\1\29;\3\2\2\2:\60\3\2\2\2:\65\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2"+
		"=\t\3\2\2\2><\3\2\2\2?@\7\b\2\2@A\5\6\4\2AB\7\3\2\2BC\b\6\1\2CI\3\2\2"+
		"\2DE\7\13\2\2EI\b\6\1\2FG\7\f\2\2GI\b\6\1\2H?\3\2\2\2HD\3\2\2\2HF\3\2"+
		"\2\2I\13\3\2\2\2\t\17\33)+:<H";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}