// Generated from Grammatik.g4 by ANTLR 4.1

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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, VAR=6, TOKEN=7, LITERAL=8, WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'*/'", "':'", "'|'", "';'", "'/*'", "VAR", "TOKEN", "LITERAL", 
		"WS"
	};
	public static final int
		RULE_cfg = 0, RULE_grammarRule = 1, RULE_body = 2, RULE_item = 3, RULE_comment = 4;
	public static final String[] ruleNames = {
		"cfg", "grammarRule", "body", "item", "comment"
	};

	@Override
	public String getGrammarFileName() { return "Grammatik.g4"; }

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
	public static class CfgContext extends ParserRuleContext {
		public Grammar g;
		public GrammarRuleContext r;
		public List<GrammarRuleContext> grammarRule() {
			return getRuleContexts(GrammarRuleContext.class);
		}
		public GrammarRuleContext grammarRule(int i) {
			return getRuleContext(GrammarRuleContext.class,i);
		}
		public CfgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cfg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterCfg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitCfg(this);
		}
	}

	public final CfgContext cfg() throws RecognitionException {
		CfgContext _localctx = new CfgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cfg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<Rule> rules = new ArrayList<Rule>(); 
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(11); ((CfgContext)_localctx).r = grammarRule();
				 rules.add(((CfgContext)_localctx).r.regel); 
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
			 ((CfgContext)_localctx).g =  new Grammar(rules); 
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

	public static class GrammarRuleContext extends ParserRuleContext {
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
		public GrammarRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterGrammarRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitGrammarRule(this);
		}
	}

	public final GrammarRuleContext grammarRule() throws RecognitionException {
		GrammarRuleContext _localctx = new GrammarRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_grammarRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 List<Body> bodyList = new ArrayList<Body>(); 
			setState(21); ((GrammarRuleContext)_localctx).v = match(VAR);
			setState(22); match(2);
			setState(23); ((GrammarRuleContext)_localctx).b = body();
			 bodyList.add(((GrammarRuleContext)_localctx).b.b); 
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(25); match(3);
				setState(26); ((GrammarRuleContext)_localctx).c = body();
				 bodyList.add(((GrammarRuleContext)_localctx).c.b); 
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34); match(4);
			 ((GrammarRuleContext)_localctx).regel =  new Rule((((GrammarRuleContext)_localctx).v!=null?((GrammarRuleContext)_localctx).v.getText():null), bodyList); 
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
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
			setState(51);
			switch (_input.LA(1)) {
			case 3:
			case 4:
			case VAR:
			case TOKEN:
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				 List<Item> l = new ArrayList<Item>(); 
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << TOKEN) | (1L << LITERAL))) != 0)) {
					{
					{
					setState(38); ((BodyContext)_localctx).item = item();
					 l.add(((BodyContext)_localctx).item.element); 
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 ((BodyContext)_localctx).b =  new Body(l); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				 List<Item> l = new ArrayList<Item>(); 
				setState(48); comment();
				 ((BodyContext)_localctx).b =  new Body(l); 
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
			setState(59);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(53); ((ItemContext)_localctx).VAR = match(VAR);
				 ((ItemContext)_localctx).element =  new Variable((((ItemContext)_localctx).VAR!=null?((ItemContext)_localctx).VAR.getText():null)    ); 
				}
				break;
			case TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); ((ItemContext)_localctx).TOKEN = match(TOKEN);
				 ((ItemContext)_localctx).element =  new MyToken( (((ItemContext)_localctx).TOKEN!=null?((ItemContext)_localctx).TOKEN.getText():null)  ); 
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); ((ItemContext)_localctx).LITERAL = match(LITERAL);
				 ((ItemContext)_localctx).element =  new Literal( (((ItemContext)_localctx).LITERAL!=null?((ItemContext)_localctx).LITERAL.getText():null)); 
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

	public static class CommentContext extends ParserRuleContext {
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammatikListener ) ((GrammatikListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(5);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(62);
					matchWildcard();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(68); match(1);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\13I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\7\6B\n\6\f\6\16\6E\13"+
		"\6\3\6\3\6\3\6\3C\7\2\4\6\b\n\2\2J\2\f\3\2\2\2\4\26\3\2\2\2\6\65\3\2\2"+
		"\2\b=\3\2\2\2\n?\3\2\2\2\f\20\b\2\1\2\r\16\5\4\3\2\16\17\b\2\1\2\17\21"+
		"\3\2\2\2\20\r\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\24"+
		"\3\2\2\2\24\25\b\2\1\2\25\3\3\2\2\2\26\27\b\3\1\2\27\30\7\b\2\2\30\31"+
		"\7\4\2\2\31\32\5\6\4\2\32!\b\3\1\2\33\34\7\5\2\2\34\35\5\6\4\2\35\36\b"+
		"\3\1\2\36 \3\2\2\2\37\33\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3"+
		"\2\2\2#!\3\2\2\2$%\7\6\2\2%&\b\3\1\2&\5\3\2\2\2\'-\b\4\1\2()\5\b\5\2)"+
		"*\b\4\1\2*,\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2"+
		"\2/-\3\2\2\2\60\66\b\4\1\2\61\62\b\4\1\2\62\63\5\n\6\2\63\64\b\4\1\2\64"+
		"\66\3\2\2\2\65\'\3\2\2\2\65\61\3\2\2\2\66\7\3\2\2\2\678\7\b\2\28>\b\5"+
		"\1\29:\7\t\2\2:>\b\5\1\2;<\7\n\2\2<>\b\5\1\2=\67\3\2\2\2=9\3\2\2\2=;\3"+
		"\2\2\2>\t\3\2\2\2?C\7\7\2\2@B\13\2\2\2A@\3\2\2\2BE\3\2\2\2CD\3\2\2\2C"+
		"A\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\3\2\2G\13\3\2\2\2\b\22!-\65=C";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}