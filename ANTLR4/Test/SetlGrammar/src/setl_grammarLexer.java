// $ANTLR 3.2 Sep 23, 2009 12:02:23 setl_grammar.g 2011-04-28 18:00:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class setl_grammarLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int MULTI_COMMENT=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int VAR=4;
    public static final int COMMENT=8;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=9;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=5;

    // delegates
    // delegators

    public setl_grammarLexer() {;} 
    public setl_grammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public setl_grammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "setl_grammar.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:3:7: ( ':=' )
            // setl_grammar.g:3:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:4:7: ( '+:=' )
            // setl_grammar.g:4:9: '+:='
            {
            match("+:="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:5:7: ( '-:=' )
            // setl_grammar.g:5:9: '-:='
            {
            match("-:="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:6:7: ( ';' )
            // setl_grammar.g:6:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:7:7: ( 'print' )
            // setl_grammar.g:7:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:8:7: ( '(' )
            // setl_grammar.g:8:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:9:7: ( ',' )
            // setl_grammar.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:10:7: ( ')' )
            // setl_grammar.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:11:7: ( 'if' )
            // setl_grammar.g:11:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:12:7: ( 'then' )
            // setl_grammar.g:12:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:13:7: ( 'else' )
            // setl_grammar.g:13:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:14:7: ( 'end' )
            // setl_grammar.g:14:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:15:7: ( 'while' )
            // setl_grammar.g:15:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:16:7: ( 'loop' )
            // setl_grammar.g:16:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:17:7: ( 'for' )
            // setl_grammar.g:17:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:18:7: ( 'in' )
            // setl_grammar.g:18:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:19:7: ( 'return' )
            // setl_grammar.g:19:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:20:7: ( 'procedure' )
            // setl_grammar.g:20:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:21:7: ( '+' )
            // setl_grammar.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:22:7: ( '-' )
            // setl_grammar.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:23:7: ( '*' )
            // setl_grammar.g:23:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:24:7: ( '/' )
            // setl_grammar.g:24:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:25:7: ( 'mod' )
            // setl_grammar.g:25:9: 'mod'
            {
            match("mod"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:26:7: ( '**' )
            // setl_grammar.g:26:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:27:7: ( '+/' )
            // setl_grammar.g:27:9: '+/'
            {
            match("+/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:28:7: ( '*/' )
            // setl_grammar.g:28:9: '*/'
            {
            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:29:7: ( '#' )
            // setl_grammar.g:29:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:30:7: ( 'arb' )
            // setl_grammar.g:30:9: 'arb'
            {
            match("arb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:31:7: ( '[' )
            // setl_grammar.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:32:7: ( ']' )
            // setl_grammar.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:33:7: ( '{' )
            // setl_grammar.g:33:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:34:7: ( '}' )
            // setl_grammar.g:34:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:35:7: ( '.' )
            // setl_grammar.g:35:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:36:7: ( ':' )
            // setl_grammar.g:36:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:37:7: ( '|' )
            // setl_grammar.g:37:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:38:7: ( 'or' )
            // setl_grammar.g:38:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:39:7: ( 'and' )
            // setl_grammar.g:39:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:40:7: ( 'not' )
            // setl_grammar.g:40:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:41:7: ( '==' )
            // setl_grammar.g:41:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:42:7: ( '!=' )
            // setl_grammar.g:42:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:43:7: ( '<=' )
            // setl_grammar.g:43:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:44:7: ( '>=' )
            // setl_grammar.g:44:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:45:7: ( '<' )
            // setl_grammar.g:45:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:46:7: ( '>' )
            // setl_grammar.g:46:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:94:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // setl_grammar.g:94:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // setl_grammar.g:94:30: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // setl_grammar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:95:9: ( '0' .. '9' | ( '1' .. '9' ) ( '0' .. '9' )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>='0' && LA3_1<='9')) ) {
                    alt3=2;
                }
                else {
                    alt3=1;}
            }
            else if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // setl_grammar.g:95:11: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // setl_grammar.g:95:22: ( '1' .. '9' ) ( '0' .. '9' )+
                    {
                    // setl_grammar.g:95:22: ( '1' .. '9' )
                    // setl_grammar.g:95:23: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // setl_grammar.g:95:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // setl_grammar.g:95:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:96:9: ( '\"' (~ ( '\"' ) )* '\"' )
            // setl_grammar.g:96:11: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // setl_grammar.g:96:15: (~ ( '\"' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // setl_grammar.g:96:15: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:98:15: ( '/*' (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )* ( '*' )+ '/' )
            // setl_grammar.g:98:17: '/*' (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )* ( '*' )+ '/'
            {
            match("/*"); 

            // setl_grammar.g:98:22: (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )*
            loop6:
            do {
                int alt6=3;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // setl_grammar.g:98:23: ~ ( '*' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // setl_grammar.g:98:32: ( '*' )+ ~ ( '*' | '/' )
            	    {
            	    // setl_grammar.g:98:32: ( '*' )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0=='*') ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // setl_grammar.g:98:32: '*'
            	    	    {
            	    	    match('*'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // setl_grammar.g:98:50: ( '*' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // setl_grammar.g:98:50: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match('/'); 
             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTI_COMMENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:99:15: ( '--' (~ ( '\\n' ) )* )
            // setl_grammar.g:99:17: '--' (~ ( '\\n' ) )*
            {
            match("--"); 

            // setl_grammar.g:99:22: (~ ( '\\n' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // setl_grammar.g:99:22: ~ ( '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_grammar.g:100:15: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // setl_grammar.g:100:17: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // setl_grammar.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | VAR | NUMBER | STRING | MULTI_COMMENT | COMMENT | WS )
        int alt9=50;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // setl_grammar.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // setl_grammar.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // setl_grammar.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // setl_grammar.g:1:28: T__13
                {
                mT__13(); 

                }
                break;
            case 5 :
                // setl_grammar.g:1:34: T__14
                {
                mT__14(); 

                }
                break;
            case 6 :
                // setl_grammar.g:1:40: T__15
                {
                mT__15(); 

                }
                break;
            case 7 :
                // setl_grammar.g:1:46: T__16
                {
                mT__16(); 

                }
                break;
            case 8 :
                // setl_grammar.g:1:52: T__17
                {
                mT__17(); 

                }
                break;
            case 9 :
                // setl_grammar.g:1:58: T__18
                {
                mT__18(); 

                }
                break;
            case 10 :
                // setl_grammar.g:1:64: T__19
                {
                mT__19(); 

                }
                break;
            case 11 :
                // setl_grammar.g:1:70: T__20
                {
                mT__20(); 

                }
                break;
            case 12 :
                // setl_grammar.g:1:76: T__21
                {
                mT__21(); 

                }
                break;
            case 13 :
                // setl_grammar.g:1:82: T__22
                {
                mT__22(); 

                }
                break;
            case 14 :
                // setl_grammar.g:1:88: T__23
                {
                mT__23(); 

                }
                break;
            case 15 :
                // setl_grammar.g:1:94: T__24
                {
                mT__24(); 

                }
                break;
            case 16 :
                // setl_grammar.g:1:100: T__25
                {
                mT__25(); 

                }
                break;
            case 17 :
                // setl_grammar.g:1:106: T__26
                {
                mT__26(); 

                }
                break;
            case 18 :
                // setl_grammar.g:1:112: T__27
                {
                mT__27(); 

                }
                break;
            case 19 :
                // setl_grammar.g:1:118: T__28
                {
                mT__28(); 

                }
                break;
            case 20 :
                // setl_grammar.g:1:124: T__29
                {
                mT__29(); 

                }
                break;
            case 21 :
                // setl_grammar.g:1:130: T__30
                {
                mT__30(); 

                }
                break;
            case 22 :
                // setl_grammar.g:1:136: T__31
                {
                mT__31(); 

                }
                break;
            case 23 :
                // setl_grammar.g:1:142: T__32
                {
                mT__32(); 

                }
                break;
            case 24 :
                // setl_grammar.g:1:148: T__33
                {
                mT__33(); 

                }
                break;
            case 25 :
                // setl_grammar.g:1:154: T__34
                {
                mT__34(); 

                }
                break;
            case 26 :
                // setl_grammar.g:1:160: T__35
                {
                mT__35(); 

                }
                break;
            case 27 :
                // setl_grammar.g:1:166: T__36
                {
                mT__36(); 

                }
                break;
            case 28 :
                // setl_grammar.g:1:172: T__37
                {
                mT__37(); 

                }
                break;
            case 29 :
                // setl_grammar.g:1:178: T__38
                {
                mT__38(); 

                }
                break;
            case 30 :
                // setl_grammar.g:1:184: T__39
                {
                mT__39(); 

                }
                break;
            case 31 :
                // setl_grammar.g:1:190: T__40
                {
                mT__40(); 

                }
                break;
            case 32 :
                // setl_grammar.g:1:196: T__41
                {
                mT__41(); 

                }
                break;
            case 33 :
                // setl_grammar.g:1:202: T__42
                {
                mT__42(); 

                }
                break;
            case 34 :
                // setl_grammar.g:1:208: T__43
                {
                mT__43(); 

                }
                break;
            case 35 :
                // setl_grammar.g:1:214: T__44
                {
                mT__44(); 

                }
                break;
            case 36 :
                // setl_grammar.g:1:220: T__45
                {
                mT__45(); 

                }
                break;
            case 37 :
                // setl_grammar.g:1:226: T__46
                {
                mT__46(); 

                }
                break;
            case 38 :
                // setl_grammar.g:1:232: T__47
                {
                mT__47(); 

                }
                break;
            case 39 :
                // setl_grammar.g:1:238: T__48
                {
                mT__48(); 

                }
                break;
            case 40 :
                // setl_grammar.g:1:244: T__49
                {
                mT__49(); 

                }
                break;
            case 41 :
                // setl_grammar.g:1:250: T__50
                {
                mT__50(); 

                }
                break;
            case 42 :
                // setl_grammar.g:1:256: T__51
                {
                mT__51(); 

                }
                break;
            case 43 :
                // setl_grammar.g:1:262: T__52
                {
                mT__52(); 

                }
                break;
            case 44 :
                // setl_grammar.g:1:268: T__53
                {
                mT__53(); 

                }
                break;
            case 45 :
                // setl_grammar.g:1:274: VAR
                {
                mVAR(); 

                }
                break;
            case 46 :
                // setl_grammar.g:1:278: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 47 :
                // setl_grammar.g:1:285: STRING
                {
                mSTRING(); 

                }
                break;
            case 48 :
                // setl_grammar.g:1:292: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 

                }
                break;
            case 49 :
                // setl_grammar.g:1:306: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 50 :
                // setl_grammar.g:1:314: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA6_eotS =
        "\5\uffff";
    static final String DFA6_eofS =
        "\5\uffff";
    static final String DFA6_minS =
        "\2\0\3\uffff";
    static final String DFA6_maxS =
        "\2\uffff\3\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\1\1\3\1\2";
    static final String DFA6_specialS =
        "\1\0\1\1\3\uffff}>";
    static final String[] DFA6_transitionS = {
            "\52\2\1\1\uffd5\2",
            "\52\4\1\1\4\4\1\3\uffd0\4",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 98:22: (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                        s = -1;
                        if ( (LA6_0=='*') ) {s = 1;}

                        else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_1 = input.LA(1);

                        s = -1;
                        if ( (LA6_1=='/') ) {s = 3;}

                        else if ( (LA6_1=='*') ) {s = 1;}

                        else if ( ((LA6_1>='\u0000' && LA6_1<=')')||(LA6_1>='+' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA9_eotS =
        "\1\uffff\1\46\1\51\1\54\1\uffff\1\41\3\uffff\7\41\1\71\1\73\1\41"+
        "\1\uffff\1\41\6\uffff\2\41\2\uffff\1\102\1\104\14\uffff\1\41\1\107"+
        "\1\110\7\41\5\uffff\3\41\1\123\1\41\4\uffff\2\41\2\uffff\2\41\1"+
        "\131\2\41\1\134\1\41\1\136\1\137\1\140\1\uffff\1\141\2\41\1\144"+
        "\1\145\1\uffff\1\41\1\147\1\uffff\1\41\4\uffff\1\151\1\41\2\uffff"+
        "\1\153\1\uffff\1\41\1\uffff\1\41\1\uffff\1\156\1\41\1\uffff\1\41"+
        "\1\161\1\uffff";
    static final String DFA9_eofS =
        "\162\uffff";
    static final String DFA9_minS =
        "\1\11\1\75\1\57\1\55\1\uffff\1\162\3\uffff\1\146\1\150\1\154\1\150"+
        "\2\157\1\145\2\52\1\157\1\uffff\1\156\6\uffff\1\162\1\157\2\uffff"+
        "\2\75\14\uffff\1\151\2\60\1\145\1\163\1\144\1\151\1\157\1\162\1"+
        "\164\5\uffff\1\144\1\142\1\144\1\60\1\164\4\uffff\1\156\1\143\2"+
        "\uffff\1\156\1\145\1\60\1\154\1\160\1\60\1\165\3\60\1\uffff\1\60"+
        "\1\164\1\145\2\60\1\uffff\1\145\1\60\1\uffff\1\162\4\uffff\1\60"+
        "\1\144\2\uffff\1\60\1\uffff\1\156\1\uffff\1\165\1\uffff\1\60\1\162"+
        "\1\uffff\1\145\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\175\1\75\2\72\1\uffff\1\162\3\uffff\1\156\1\150\1\156\1\150\2"+
        "\157\1\145\1\57\1\52\1\157\1\uffff\1\162\6\uffff\1\162\1\157\2\uffff"+
        "\2\75\14\uffff\1\157\2\172\1\145\1\163\1\144\1\151\1\157\1\162\1"+
        "\164\5\uffff\1\144\1\142\1\144\1\172\1\164\4\uffff\1\156\1\143\2"+
        "\uffff\1\156\1\145\1\172\1\154\1\160\1\172\1\165\3\172\1\uffff\1"+
        "\172\1\164\1\145\2\172\1\uffff\1\145\1\172\1\uffff\1\162\4\uffff"+
        "\1\172\1\144\2\uffff\1\172\1\uffff\1\156\1\uffff\1\165\1\uffff\1"+
        "\172\1\162\1\uffff\1\145\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\1\10\12\uffff\1\33\1\uffff\1\35\1\36"+
        "\1\37\1\40\1\41\1\43\2\uffff\1\47\1\50\2\uffff\1\55\1\56\1\57\1"+
        "\62\1\1\1\42\1\2\1\31\1\23\1\3\1\61\1\24\12\uffff\1\30\1\32\1\25"+
        "\1\60\1\26\5\uffff\1\51\1\53\1\52\1\54\2\uffff\1\11\1\20\12\uffff"+
        "\1\44\5\uffff\1\14\2\uffff\1\17\1\uffff\1\27\1\34\1\45\1\46\2\uffff"+
        "\1\12\1\13\1\uffff\1\16\1\uffff\1\5\1\uffff\1\15\2\uffff\1\21\2"+
        "\uffff\1\22";
    static final String DFA9_specialS =
        "\162\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\36\1\43\1\23\4\uffff\1\6"+
            "\1\10\1\20\1\2\1\7\1\3\1\31\1\21\12\42\1\1\1\4\1\37\1\35\1\40"+
            "\2\uffff\32\41\1\25\1\uffff\1\26\3\uffff\1\24\3\41\1\13\1\16"+
            "\2\41\1\11\2\41\1\15\1\22\1\34\1\33\1\5\1\41\1\17\1\41\1\12"+
            "\2\41\1\14\3\41\1\27\1\32\1\30",
            "\1\45",
            "\1\50\12\uffff\1\47",
            "\1\53\14\uffff\1\52",
            "",
            "\1\55",
            "",
            "",
            "",
            "\1\56\7\uffff\1\57",
            "\1\60",
            "\1\61\1\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67\4\uffff\1\70",
            "\1\72",
            "\1\74",
            "",
            "\1\76\3\uffff\1\75",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "",
            "",
            "\1\101",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\105\5\uffff\1\106",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\124",
            "",
            "",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\132",
            "\1\133",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\135",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\142",
            "\1\143",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\146",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\150",
            "",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\152",
            "",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\154",
            "",
            "\1\155",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\157",
            "",
            "\1\160",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | VAR | NUMBER | STRING | MULTI_COMMENT | COMMENT | WS );";
        }
    }
 

}