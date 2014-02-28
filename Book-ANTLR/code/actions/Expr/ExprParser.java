// Generated from Expr.g4 by ANTLR 4.0

    import java.util.*;

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
		T__2=1, T__1=2, T__0=3, MUL=4, DIV=5, ADD=6, SUB=7, ID=8, INT=9, NEWLINE=10, 
		WS=11;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'('", "'='", "'*'", "'/'", "'+'", "'-'", "ID", "INT", 
		"NEWLINE", "WS"
	};
	public static final int
		RULE_stat = 0, RULE_expr = 1;
	public static final String[] ruleNames = {
		"stat", "expr"
	};

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	    /** "memory" for our calculator; variable/value pairs go here */
	    Map<String, Integer> memory = new HashMap<String, Integer>();

	    int eval(int left, int op, int right) {
	        switch ( op ) {
	            case MUL : return left * right;
	            case DIV : return left / right;
	            case ADD : return left + right;
	            case SUB : return left - right;
	        }
	        return 0;
	    }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public ExprContext expr;
		public Token ID;
		public TerminalNode NEWLINE() { return getToken(ExprParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			setState(15);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(4); ((StatContext)_localctx).expr = expr(0);
				setState(5); match(NEWLINE);
				 System.out.println(((StatContext)_localctx).expr.v);   
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(8); ((StatContext)_localctx).ID = match(ID);
				setState(9); match(3);
				setState(10); ((StatContext)_localctx).expr = expr(0);
				setState(11); match(NEWLINE);
				 memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).expr.v); 
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(14); match(NEWLINE);
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
		public int _p;
		public int v;
		public ExprContext a;
		public Token INT;
		public Token ID;
		public ExprContext expr;
		public Token op;
		public ExprContext b;
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
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

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(18); ((ExprContext)_localctx).INT = match(INT);
				 ((ExprContext)_localctx).v =  (((ExprContext)_localctx).INT!=null?Integer.valueOf(((ExprContext)_localctx).INT.getText()):0);                   
				}
				break;
			case ID:
				{
				setState(20); ((ExprContext)_localctx).ID = match(ID);
				 String id = (((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null);
				                                    ((ExprContext)_localctx).v =  memory.containsKey(id) ? memory.get(id) : 0;
				                                  
				}
				break;
			case 2:
				{
				setState(22); match(2);
				setState(23); ((ExprContext)_localctx).expr = expr(0);
				setState(24); match(1);
				((ExprContext)_localctx).v =  _localctx.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(30);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(31); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(6);
						 ((ExprContext)_localctx).v =  eval(((ExprContext)_localctx).a.v, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.v); 
						}
						break;

					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState, _p);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(34);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(35);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(36); ((ExprContext)_localctx).b = ((ExprContext)_localctx).expr = expr(5);
						 ((ExprContext)_localctx).v =  eval(((ExprContext)_localctx).a.v, (((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getType():0), ((ExprContext)_localctx).b.v); 
						}
						break;
					}
					} 
				}
				setState(43);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 5 >= _localctx._p;

		case 1: return 4 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\r/\4\2\t\2\4\3\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5"+
		"\2\22\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\2\4\2\4\2\4"+
		"\3\6\7\3\b\t\62\2\21\3\2\2\2\4\35\3\2\2\2\6\7\5\4\3\2\7\b\7\f\2\2\b\t"+
		"\b\2\1\2\t\22\3\2\2\2\n\13\7\n\2\2\13\f\7\5\2\2\f\r\5\4\3\2\r\16\7\f\2"+
		"\2\16\17\b\2\1\2\17\22\3\2\2\2\20\22\7\f\2\2\21\6\3\2\2\2\21\n\3\2\2\2"+
		"\21\20\3\2\2\2\22\3\3\2\2\2\23\24\b\3\1\2\24\25\7\13\2\2\25\36\b\3\1\2"+
		"\26\27\7\n\2\2\27\36\b\3\1\2\30\31\7\4\2\2\31\32\5\4\3\2\32\33\7\3\2\2"+
		"\33\34\b\3\1\2\34\36\3\2\2\2\35\23\3\2\2\2\35\26\3\2\2\2\35\30\3\2\2\2"+
		"\36+\3\2\2\2\37 \6\3\2\3 !\t\2\2\2!\"\5\4\3\2\"#\b\3\1\2#*\3\2\2\2$%\6"+
		"\3\3\3%&\t\3\2\2&\'\5\4\3\2\'(\b\3\1\2(*\3\2\2\2)\37\3\2\2\2)$\3\2\2\2"+
		"*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3\2\2\2-+\3\2\2\2\6\21\35)+";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}