// Generated from Grammatik.g by ANTLR 4.1

    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammatikParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, VAR=4, TOKEN=5, LITERAL=6, MULTI_COMMENT=7, LINE_COMMENT=8, 
		WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "':'", "'|'", "';'", "VAR", "TOKEN", "LITERAL", "MULTI_COMMENT", 
		"LINE_COMMENT", "WS"
	};
	public static final int
		RULE_grammatik = 0, RULE_myRule = 1, RULE_body = 2, RULE_item = 3;
	public static final String[] ruleNames = {
		"grammatik", "myRule", "body", "item"
	};

	@Override
	public String getGrammarFileName() { return "Grammatik.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammatikParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammatikContext extends ParserRuleContext {
		public Grammar g;
		public MyRuleContext r;
		public MyRuleContext myRule(int i) {
			return getRuleContext(MyRuleContext.class,i);
		}
		public List<MyRuleContext> myRule() {
			return getRuleContexts(MyRuleContext.class);
		}
		public GrammatikContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammatik; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterGrammatik(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitGrammatik(this);
		}
	}

	public final GrammatikContext grammatik() throws RecognitionException {
		GrammatikContext _localctx = new GrammatikContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammatik);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<Rule> rules = new ArrayList<Rule>(); 
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(9); ((GrammatikContext)_localctx).r = myRule();
				 rules.add(((GrammatikContext)_localctx).r.regel); 
				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
			 ((GrammatikContext)_localctx).g =  new Grammar(rules); 
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

	public static class MyRuleContext extends ParserRuleContext {
		public Rule regel;
		public Token v;
		public BodyContext b;
		public BodyContext c;
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public TerminalNode VAR() { return getToken(GrammatikParser.VAR, 0); }
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public MyRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_myRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterMyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitMyRule(this);
		}
	}

	public final MyRuleContext myRule() throws RecognitionException {
		MyRuleContext _localctx = new MyRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_myRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<Body> bodyList = new ArrayList<Body>(); 
			setState(19); ((MyRuleContext)_localctx).v = match(VAR);
			setState(20); match(1);
			setState(21); ((MyRuleContext)_localctx).b = body();
			 bodyList.add(((MyRuleContext)_localctx).b.b); 
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2) {
				{
				{
				setState(23); match(2);
				setState(24); ((MyRuleContext)_localctx).c = body();
				 bodyList.add(((MyRuleContext)_localctx).c.b); 
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32); match(3);
			 ((MyRuleContext)_localctx).regel =  new Rule(new Variable((((MyRuleContext)_localctx).v!=null?((MyRuleContext)_localctx).v.getText():null)), bodyList); 
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

	public static class BodyContext extends ParserRuleContext {
		public Body b;
		public ItemContext item;
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<Item> l = new ArrayList<Item>(); 
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << TOKEN) | (1L << LITERAL))) != 0)) {
				{
				{
				setState(36); ((BodyContext)_localctx).item = item();
				 l.add(((BodyContext)_localctx).item.element); 
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 ((BodyContext)_localctx).b =  new Body(l); 
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

	public static class ItemContext extends ParserRuleContext {
		public Item element;
		public Token VAR;
		public Token TOKEN;
		public Token LITERAL;
		public TerminalNode LITERAL() { return getToken(GrammatikParser.LITERAL, 0); }
		public TerminalNode VAR() { return getToken(GrammatikParser.VAR, 0); }
		public TerminalNode TOKEN() { return getToken(GrammatikParser.TOKEN, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_item);
		try {
			setState(52);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); ((ItemContext)_localctx).VAR = match(VAR);
				 ((ItemContext)_localctx).element =  new Variable((((ItemContext)_localctx).VAR!=null?((ItemContext)_localctx).VAR.getText():null)    ); 
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); ((ItemContext)_localctx).TOKEN = match(TOKEN);
				 ((ItemContext)_localctx).element =  new MyToken( (((ItemContext)_localctx).TOKEN!=null?((ItemContext)_localctx).TOKEN.getText():null)  ); 
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); ((ItemContext)_localctx).LITERAL = match(LITERAL);
				 ((ItemContext)_localctx).element =  new MyToken( (((ItemContext)_localctx).LITERAL!=null?((ItemContext)_localctx).LITERAL.getText():null)); 
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\139\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\6\2\17\n\2\r\2\16\2\20\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\67\n\5\3\5\2\6\2\4\6\b\2\29\2\n\3\2\2\2\4\24\3\2\2\2\6%\3\2\2\2"+
		"\b\66\3\2\2\2\n\16\b\2\1\2\13\f\5\4\3\2\f\r\b\2\1\2\r\17\3\2\2\2\16\13"+
		"\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22\23"+
		"\b\2\1\2\23\3\3\2\2\2\24\25\b\3\1\2\25\26\7\6\2\2\26\27\7\3\2\2\27\30"+
		"\5\6\4\2\30\37\b\3\1\2\31\32\7\4\2\2\32\33\5\6\4\2\33\34\b\3\1\2\34\36"+
		"\3\2\2\2\35\31\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2"+
		"\2!\37\3\2\2\2\"#\7\5\2\2#$\b\3\1\2$\5\3\2\2\2%+\b\4\1\2&\'\5\b\5\2\'"+
		"(\b\4\1\2(*\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2"+
		"-+\3\2\2\2./\b\4\1\2/\7\3\2\2\2\60\61\7\6\2\2\61\67\b\5\1\2\62\63\7\7"+
		"\2\2\63\67\b\5\1\2\64\65\7\b\2\2\65\67\b\5\1\2\66\60\3\2\2\2\66\62\3\2"+
		"\2\2\66\64\3\2\2\2\67\t\3\2\2\2\6\20\37+\66";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}