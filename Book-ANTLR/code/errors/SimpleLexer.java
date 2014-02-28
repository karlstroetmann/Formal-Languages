// Generated from Simple.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, INT=9, 
		ID=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "')'", "'('", "'int'", "'='", "'class'", "'}'", "';'", "INT", "ID", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "INT", 
		"ID", "WS"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		case 10: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\rE\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n\63\n\n\f\n\16\n\66\13\n"+
		"\5\n8\n\n\3\13\6\13;\n\13\r\13\16\13<\3\f\6\f@\n\f\r\f\16\fA\3\f\3\f\2"+
		"\r\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27"+
		"\r\2\3\2\6\3\2\63;\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"H\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5"+
		"\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13#\3\2\2\2\r%\3\2\2\2\17+\3\2\2"+
		"\2\21-\3\2\2\2\23\67\3\2\2\2\25:\3\2\2\2\27?\3\2\2\2\31\32\7}\2\2\32\4"+
		"\3\2\2\2\33\34\7+\2\2\34\6\3\2\2\2\35\36\7*\2\2\36\b\3\2\2\2\37 \7k\2"+
		"\2 !\7p\2\2!\"\7v\2\2\"\n\3\2\2\2#$\7?\2\2$\f\3\2\2\2%&\7e\2\2&\'\7n\2"+
		"\2\'(\7c\2\2()\7u\2\2)*\7u\2\2*\16\3\2\2\2+,\7\177\2\2,\20\3\2\2\2-.\7"+
		"=\2\2.\22\3\2\2\2/8\7\62\2\2\60\64\t\2\2\2\61\63\t\3\2\2\62\61\3\2\2\2"+
		"\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\67"+
		"/\3\2\2\2\67\60\3\2\2\28\24\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=\26\3\2\2\2>@\t\5\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2A"+
		"B\3\2\2\2BC\3\2\2\2CD\b\f\2\2D\30\3\2\2\2\7\2\64\67<A";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}