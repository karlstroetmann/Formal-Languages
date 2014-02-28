// Generated from Grammatik.g by ANTLR 4.1

    import java.util.List;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammatikLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, VAR=4, TOKEN=5, LITERAL=6, MULTI_COMMENT=7, LINE_COMMENT=8, 
		WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"':'", "'|'", "';'", "VAR", "TOKEN", "LITERAL", "MULTI_COMMENT", "LINE_COMMENT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "VAR", "TOKEN", "LITERAL", "MULTI_COMMENT", "LINE_COMMENT", 
		"WS"
	};


	public GrammatikLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammatik.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6: MULTI_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 7: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 8: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  skip();  break;
		}
	}
	private void MULTI_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\13[\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\7\5\36\n\5\f\5\16\5!\13\5\3\6\3\6\7\6%\n\6\f"+
		"\6\16\6(\13\6\3\7\3\7\6\7,\n\7\r\7\16\7-\3\7\3\7\3\b\3\b\3\b\3\b\3\b\6"+
		"\b\67\n\b\r\b\16\b8\3\b\7\b<\n\b\f\b\16\b?\13\b\3\b\6\bB\n\b\r\b\16\b"+
		"C\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tM\n\t\f\t\16\tP\13\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\5\nX\n\n\3\n\3\n\2\13\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\2\21\n\3\23\13\4\3\2\n\6\2\62;C\\aac|\5\2\62;C\\aa\3\2))\3\2,,\4\2"+
		",,\61\61\3\2\f\f\4\2\13\13\"\"\4\2\f\f\17\17d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2\7\31\3\2\2\2\t\33\3\2\2"+
		"\2\13\"\3\2\2\2\r)\3\2\2\2\17\61\3\2\2\2\21H\3\2\2\2\23W\3\2\2\2\25\26"+
		"\7<\2\2\26\4\3\2\2\2\27\30\7~\2\2\30\6\3\2\2\2\31\32\7=\2\2\32\b\3\2\2"+
		"\2\33\37\4c|\2\34\36\t\2\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37"+
		" \3\2\2\2 \n\3\2\2\2!\37\3\2\2\2\"&\4C\\\2#%\t\3\2\2$#\3\2\2\2%(\3\2\2"+
		"\2&$\3\2\2\2&\'\3\2\2\2\'\f\3\2\2\2(&\3\2\2\2)+\7)\2\2*,\n\4\2\2+*\3\2"+
		"\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7)\2\2\60\16\3\2\2\2"+
		"\61\62\7\61\2\2\62\63\7,\2\2\63=\3\2\2\2\64<\n\5\2\2\65\67\7,\2\2\66\65"+
		"\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:<\n\6\2\2;\64\3\2"+
		"\2\2;\66\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\7"+
		",\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\61\2\2FG\b"+
		"\b\2\2G\20\3\2\2\2HI\7\61\2\2IJ\7\61\2\2JN\3\2\2\2KM\n\7\2\2LK\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\b\t\3\2R\22\3\2\2"+
		"\2SX\t\b\2\2TU\7^\2\2UX\7x\2\2VX\t\t\2\2WS\3\2\2\2WT\3\2\2\2WV\3\2\2\2"+
		"XY\3\2\2\2YZ\b\n\4\2Z\24\3\2\2\2\f\2\37&-8;=CNW";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}