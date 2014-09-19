// Generated from Program.g4 by ANTLR 4.4

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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

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
	public String getSerializedATN() { return _serializedATN; }

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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << ID) | (1L << INT))) != 0) );
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
				setState(16); match(T__6);
				setState(17); ((StmntContext)_localctx).expr = expr(0);
				setState(18); match(T__0);
				 varTable.put((((StmntContext)_localctx).ID!=null?((StmntContext)_localctx).ID.getText():null), ((StmntContext)_localctx).expr.result); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); ((StmntContext)_localctx).expr = expr(0);
				setState(22); match(T__0);
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
		public ExprContext e;
		public ProductContext p;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28); ((ExprContext)_localctx).p = product(0);
			 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).p.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.e = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(31);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					 ((ExprContext)_localctx).result =  ((ExprContext)_localctx).e.result; 
					setState(41);
					switch (_input.LA(1)) {
					case T__5:
						{
						setState(33); match(T__5);
						setState(34); ((ExprContext)_localctx).p = product(0);
						 _localctx.result += ((ExprContext)_localctx).p.result; 
						}
						break;
					case T__4:
						{
						setState(37); match(T__4);
						setState(38); ((ExprContext)_localctx).p = product(0);
						 _localctx.result -= ((ExprContext)_localctx).p.result; 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ProductContext extends ParserRuleContext {
		public int result;
		public ProductContext p;
		public FactorContext f;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
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
		return product(0);
	}

	private ProductContext product(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProductContext _localctx = new ProductContext(_ctx, _parentState);
		ProductContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_product, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(49); ((ProductContext)_localctx).f = factor();
			 ((ProductContext)_localctx).result =  ((ProductContext)_localctx).f.result; 
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProductContext(_parentctx, _parentState);
					_localctx.p = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_product);
					setState(52);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					 ((ProductContext)_localctx).result =  ((ProductContext)_localctx).p.result; 
					setState(64);
					switch (_input.LA(1)) {
					case T__3:
						{
						{
						setState(54); match(T__3);
						setState(55); ((ProductContext)_localctx).f = factor();
						}
						 _localctx.result *= ((ProductContext)_localctx).f.result; 
						}
						break;
					case T__1:
						{
						{
						setState(59); match(T__1);
						setState(60); ((ProductContext)_localctx).f = factor();
						}
						 _localctx.result /= ((ProductContext)_localctx).f.result; 
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
			setState(80);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(71); match(T__2);
				setState(72); ((FactorContext)_localctx).expr = expr(0);
				setState(73); match(T__7);
				 ((FactorContext)_localctx).result =  ((FactorContext)_localctx).expr.result;           
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); ((FactorContext)_localctx).ID = match(ID);
				 ((FactorContext)_localctx).result =  varTable.get((((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null)); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); ((FactorContext)_localctx).INT = match(INT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);
		case 3: return product_sempred((ProductContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean product_sempred(ProductContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rU\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\7\5E\n\5"+
		"\f\5\16\5H\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\6\2\4\6"+
		"\b\7\2\4\6\b\n\2\2W\2\r\3\2\2\2\4\33\3\2\2\2\6\35\3\2\2\2\b\62\3\2\2\2"+
		"\nR\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\3\3\2\2\2\21\22\7\13\2\2\22\23\7\4\2\2\23\24\5\6\4\2\24\25"+
		"\7\n\2\2\25\26\b\3\1\2\26\34\3\2\2\2\27\30\5\6\4\2\30\31\7\n\2\2\31\32"+
		"\b\3\1\2\32\34\3\2\2\2\33\21\3\2\2\2\33\27\3\2\2\2\34\5\3\2\2\2\35\36"+
		"\b\4\1\2\36\37\5\b\5\2\37 \b\4\1\2 /\3\2\2\2!\"\f\4\2\2\"+\b\4\1\2#$\7"+
		"\5\2\2$%\5\b\5\2%&\b\4\1\2&,\3\2\2\2\'(\7\6\2\2()\5\b\5\2)*\b\4\1\2*,"+
		"\3\2\2\2+#\3\2\2\2+\'\3\2\2\2,.\3\2\2\2-!\3\2\2\2.\61\3\2\2\2/-\3\2\2"+
		"\2/\60\3\2\2\2\60\7\3\2\2\2\61/\3\2\2\2\62\63\b\5\1\2\63\64\5\n\6\2\64"+
		"\65\b\5\1\2\65F\3\2\2\2\66\67\f\4\2\2\67B\b\5\1\289\7\7\2\29:\5\n\6\2"+
		":;\3\2\2\2;<\b\5\1\2<C\3\2\2\2=>\7\t\2\2>?\5\n\6\2?@\3\2\2\2@A\b\5\1\2"+
		"AC\3\2\2\2B8\3\2\2\2B=\3\2\2\2CE\3\2\2\2D\66\3\2\2\2EH\3\2\2\2FD\3\2\2"+
		"\2FG\3\2\2\2G\t\3\2\2\2HF\3\2\2\2IJ\7\b\2\2JK\5\6\4\2KL\7\3\2\2LM\b\6"+
		"\1\2MS\3\2\2\2NO\7\13\2\2OS\b\6\1\2PQ\7\f\2\2QS\b\6\1\2RI\3\2\2\2RN\3"+
		"\2\2\2RP\3\2\2\2S\13\3\2\2\2\t\17\33+/BFR";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}