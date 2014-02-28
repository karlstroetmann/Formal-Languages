// Generated from Expr.g4 by ANTLR 4.0

    import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, MUL=4, DIV=5, ADD=6, SUB=7, ID=8, INT=9, NEWLINE=10, 
		WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"')'", "'('", "'='", "'*'", "'/'", "'+'", "'-'", "ID", "INT", "NEWLINE", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "MUL", "DIV", "ADD", "SUB", "ID", "INT", "NEWLINE", 
		"WS"
	};


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\r=\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\6\t)\n\t\r\t\16\t*\3\n\6\n.\n\n\r\n\16\n/\3\13"+
		"\5\13\63\n\13\3\13\3\13\3\f\6\f8\n\f\r\f\16\f9\3\f\3\f\2\r\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\2\3\2\5\4"+
		"C\\c|\3\62;\4\13\13\"\"@\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2"+
		"\2\2\13!\3\2\2\2\r#\3\2\2\2\17%\3\2\2\2\21(\3\2\2\2\23-\3\2\2\2\25\62"+
		"\3\2\2\2\27\67\3\2\2\2\31\32\7+\2\2\32\4\3\2\2\2\33\34\7*\2\2\34\6\3\2"+
		"\2\2\35\36\7?\2\2\36\b\3\2\2\2\37 \7,\2\2 \n\3\2\2\2!\"\7\61\2\2\"\f\3"+
		"\2\2\2#$\7-\2\2$\16\3\2\2\2%&\7/\2\2&\20\3\2\2\2\')\t\2\2\2(\'\3\2\2\2"+
		")*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\22\3\2\2\2,.\t\3\2\2-,\3\2\2\2./\3\2\2"+
		"\2/-\3\2\2\2/\60\3\2\2\2\60\24\3\2\2\2\61\63\7\17\2\2\62\61\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\3\2\2\2\64\65\7\f\2\2\65\26\3\2\2\2\668\t\4\2\2\67\66"+
		"\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\f\2\2<\30\3\2\2"+
		"\2\7\2*/\629";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}