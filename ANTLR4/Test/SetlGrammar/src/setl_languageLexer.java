// $ANTLR 3.2 Sep 23, 2009 12:02:23 setl_language.g 2011-04-29 18:58:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class setl_languageLexer extends Lexer {
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
    public static final int MULTI_COMMENT=8;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int BOOLEAN=5;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int VAR=4;
    public static final int COMMENT=9;
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
    public static final int NUMBER=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=10;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=6;

    // delegates
    // delegators

    public setl_languageLexer() {;} 
    public setl_languageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public setl_languageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "setl_language.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_language.g:3:7: ( ':=' )
            // setl_language.g:3:9: ':='
            {
            match(":="); 


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
            // setl_language.g:4:7: ( '+=' )
            // setl_language.g:4:9: '+='
            {
            match("+="); 


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
            // setl_language.g:5:7: ( '-=' )
            // setl_language.g:5:9: '-='
            {
            match("-="); 


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
            // setl_language.g:6:7: ( ';' )
            // setl_language.g:6:9: ';'
            {
            match(';'); 

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
            // setl_language.g:7:7: ( 'print' )
            // setl_language.g:7:9: 'print'
            {
            match("print"); 


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
            // setl_language.g:8:7: ( '(' )
            // setl_language.g:8:9: '('
            {
            match('('); 

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
            // setl_language.g:9:7: ( ',' )
            // setl_language.g:9:9: ','
            {
            match(','); 

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
            // setl_language.g:10:7: ( ')' )
            // setl_language.g:10:9: ')'
            {
            match(')'); 

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
            // setl_language.g:11:7: ( 'if' )
            // setl_language.g:11:9: 'if'
            {
            match("if"); 


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
            // setl_language.g:12:7: ( 'then' )
            // setl_language.g:12:9: 'then'
            {
            match("then"); 


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
            // setl_language.g:13:7: ( 'else' )
            // setl_language.g:13:9: 'else'
            {
            match("else"); 


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
            // setl_language.g:14:7: ( 'end' )
            // setl_language.g:14:9: 'end'
            {
            match("end"); 


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
            // setl_language.g:15:7: ( 'while' )
            // setl_language.g:15:9: 'while'
            {
            match("while"); 


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
            // setl_language.g:16:7: ( 'loop' )
            // setl_language.g:16:9: 'loop'
            {
            match("loop"); 


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
            // setl_language.g:17:7: ( 'for' )
            // setl_language.g:17:9: 'for'
            {
            match("for"); 


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
            // setl_language.g:18:7: ( 'in' )
            // setl_language.g:18:9: 'in'
            {
            match("in"); 


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
            // setl_language.g:19:7: ( 'return' )
            // setl_language.g:19:9: 'return'
            {
            match("return"); 


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
            // setl_language.g:20:7: ( 'procedure' )
            // setl_language.g:20:9: 'procedure'
            {
            match("procedure"); 


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
            // setl_language.g:21:7: ( '+' )
            // setl_language.g:21:9: '+'
            {
            match('+'); 

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
            // setl_language.g:22:7: ( '-' )
            // setl_language.g:22:9: '-'
            {
            match('-'); 

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
            // setl_language.g:23:7: ( '*' )
            // setl_language.g:23:9: '*'
            {
            match('*'); 

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
            // setl_language.g:24:7: ( '/' )
            // setl_language.g:24:9: '/'
            {
            match('/'); 

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
            // setl_language.g:25:7: ( 'mod' )
            // setl_language.g:25:9: 'mod'
            {
            match("mod"); 


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
            // setl_language.g:26:7: ( '**' )
            // setl_language.g:26:9: '**'
            {
            match("**"); 


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
            // setl_language.g:27:7: ( '[' )
            // setl_language.g:27:9: '['
            {
            match('['); 

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
            // setl_language.g:28:7: ( ']' )
            // setl_language.g:28:9: ']'
            {
            match(']'); 

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
            // setl_language.g:29:7: ( '+/' )
            // setl_language.g:29:9: '+/'
            {
            match("+/"); 


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
            // setl_language.g:30:7: ( '*/' )
            // setl_language.g:30:9: '*/'
            {
            match("*/"); 


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
            // setl_language.g:31:7: ( '#' )
            // setl_language.g:31:9: '#'
            {
            match('#'); 

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
            // setl_language.g:32:7: ( 'arb' )
            // setl_language.g:32:9: 'arb'
            {
            match("arb"); 


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
            // setl_language.g:33:7: ( 'pow' )
            // setl_language.g:33:9: 'pow'
            {
            match("pow"); 


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
            // setl_language.g:34:7: ( '{' )
            // setl_language.g:34:9: '{'
            {
            match('{'); 

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
            // setl_language.g:35:7: ( '}' )
            // setl_language.g:35:9: '}'
            {
            match('}'); 

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
            // setl_language.g:36:7: ( '..' )
            // setl_language.g:36:9: '..'
            {
            match(".."); 


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
            // setl_language.g:37:7: ( ':' )
            // setl_language.g:37:9: ':'
            {
            match(':'); 

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
            // setl_language.g:38:7: ( '|' )
            // setl_language.g:38:9: '|'
            {
            match('|'); 

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
            // setl_language.g:39:7: ( 'or' )
            // setl_language.g:39:9: 'or'
            {
            match("or"); 


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
            // setl_language.g:40:7: ( 'and' )
            // setl_language.g:40:9: 'and'
            {
            match("and"); 


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
            // setl_language.g:41:7: ( 'not' )
            // setl_language.g:41:9: 'not'
            {
            match("not"); 


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
            // setl_language.g:42:7: ( '==' )
            // setl_language.g:42:9: '=='
            {
            match("=="); 


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
            // setl_language.g:43:7: ( '!=' )
            // setl_language.g:43:9: '!='
            {
            match("!="); 


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
            // setl_language.g:44:7: ( '<=' )
            // setl_language.g:44:9: '<='
            {
            match("<="); 


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
            // setl_language.g:45:7: ( '>=' )
            // setl_language.g:45:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_language.g:46:7: ( '<' )
            // setl_language.g:46:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_language.g:47:7: ( '>' )
            // setl_language.g:47:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_language.g:186:12: ( ( 'TRUE' | 'true' | 'FALSE' | 'false' ) )
            // setl_language.g:186:14: ( 'TRUE' | 'true' | 'FALSE' | 'false' )
            {
            // setl_language.g:186:14: ( 'TRUE' | 'true' | 'FALSE' | 'false' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'T':
                {
                alt1=1;
                }
                break;
            case 't':
                {
                alt1=2;
                }
                break;
            case 'F':
                {
                alt1=3;
                }
                break;
            case 'f':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // setl_language.g:186:15: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // setl_language.g:186:24: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 3 :
                    // setl_language.g:186:33: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;
                case 4 :
                    // setl_language.g:186:43: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // setl_language.g:187:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // setl_language.g:187:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // setl_language.g:187:30: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // setl_language.g:
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
            	    break loop2;
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
            // setl_language.g:188:9: ( '0' .. '9' | ( '1' .. '9' ) ( '0' .. '9' )+ )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='1' && LA4_0<='9')) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>='0' && LA4_1<='9')) ) {
                    alt4=2;
                }
                else {
                    alt4=1;}
            }
            else if ( (LA4_0=='0') ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // setl_language.g:188:11: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // setl_language.g:188:22: ( '1' .. '9' ) ( '0' .. '9' )+
                    {
                    // setl_language.g:188:22: ( '1' .. '9' )
                    // setl_language.g:188:23: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // setl_language.g:188:32: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // setl_language.g:188:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
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
            // setl_language.g:189:9: ( '\"' (~ ( '\"' ) )* '\"' )
            // setl_language.g:189:11: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // setl_language.g:189:15: (~ ( '\"' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // setl_language.g:189:15: ~ ( '\"' )
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
            	    break loop5;
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
            // setl_language.g:191:15: ( '/*' (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )* ( '*' )+ '/' )
            // setl_language.g:191:17: '/*' (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )* ( '*' )+ '/'
            {
            match("/*"); 

            // setl_language.g:191:22: (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )*
            loop7:
            do {
                int alt7=3;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // setl_language.g:191:23: ~ ( '*' )
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
            	    // setl_language.g:191:32: ( '*' )+ ~ ( '*' | '/' )
            	    {
            	    // setl_language.g:191:32: ( '*' )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0=='*') ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // setl_language.g:191:32: '*'
            	    	    {
            	    	    match('*'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
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
            	    break loop7;
                }
            } while (true);

            // setl_language.g:191:50: ( '*' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // setl_language.g:191:50: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            // setl_language.g:192:15: ( '--' (~ ( '\\n' ) )* )
            // setl_language.g:192:17: '--' (~ ( '\\n' ) )*
            {
            match("--"); 

            // setl_language.g:192:22: (~ ( '\\n' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // setl_language.g:192:22: ~ ( '\\n' )
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
            	    break loop9;
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
            // setl_language.g:193:15: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // setl_language.g:193:17: ( ' ' | '\\t' | '\\n' | '\\r' )
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
        // setl_language.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | BOOLEAN | VAR | NUMBER | STRING | MULTI_COMMENT | COMMENT | WS )
        int alt10=52;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // setl_language.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // setl_language.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // setl_language.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // setl_language.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // setl_language.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // setl_language.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // setl_language.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // setl_language.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // setl_language.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // setl_language.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // setl_language.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // setl_language.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // setl_language.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // setl_language.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // setl_language.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // setl_language.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // setl_language.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // setl_language.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // setl_language.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // setl_language.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // setl_language.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // setl_language.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // setl_language.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // setl_language.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // setl_language.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // setl_language.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // setl_language.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // setl_language.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // setl_language.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // setl_language.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // setl_language.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // setl_language.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // setl_language.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // setl_language.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // setl_language.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // setl_language.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // setl_language.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // setl_language.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // setl_language.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // setl_language.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // setl_language.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // setl_language.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // setl_language.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // setl_language.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // setl_language.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // setl_language.g:1:280: BOOLEAN
                {
                mBOOLEAN(); 

                }
                break;
            case 47 :
                // setl_language.g:1:288: VAR
                {
                mVAR(); 

                }
                break;
            case 48 :
                // setl_language.g:1:292: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 49 :
                // setl_language.g:1:299: STRING
                {
                mSTRING(); 

                }
                break;
            case 50 :
                // setl_language.g:1:306: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 

                }
                break;
            case 51 :
                // setl_language.g:1:320: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 52 :
                // setl_language.g:1:328: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA7_eotS =
        "\5\uffff";
    static final String DFA7_eofS =
        "\5\uffff";
    static final String DFA7_minS =
        "\2\0\3\uffff";
    static final String DFA7_maxS =
        "\2\uffff\3\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA7_specialS =
        "\1\0\1\1\3\uffff}>";
    static final String[] DFA7_transitionS = {
            "\52\2\1\1\uffd5\2",
            "\52\3\1\1\4\3\1\4\uffd0\3",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 191:22: (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_0 = input.LA(1);

                        s = -1;
                        if ( (LA7_0=='*') ) {s = 1;}

                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_1 = input.LA(1);

                        s = -1;
                        if ( ((LA7_1>='\u0000' && LA7_1<=')')||(LA7_1>='+' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {s = 3;}

                        else if ( (LA7_1=='*') ) {s = 1;}

                        else if ( (LA7_1=='/') ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\1\uffff\1\50\1\53\1\56\1\uffff\1\43\3\uffff\7\43\1\76\1\100\1\43"+
        "\3\uffff\1\43\4\uffff\2\43\2\uffff\1\107\1\111\2\43\14\uffff\2\43"+
        "\1\117\1\120\11\43\5\uffff\3\43\1\135\1\43\4\uffff\4\43\1\143\2"+
        "\uffff\3\43\1\147\2\43\1\152\2\43\1\155\1\156\1\157\1\uffff\1\160"+
        "\4\43\1\uffff\1\165\1\166\1\167\1\uffff\1\43\1\171\1\uffff\2\43"+
        "\4\uffff\1\166\1\43\1\175\1\43\3\uffff\1\177\1\uffff\1\166\1\43"+
        "\1\166\1\uffff\1\43\1\uffff\1\u0082\1\43\1\uffff\1\43\1\u0085\1"+
        "\uffff";
    static final String DFA10_eofS =
        "\u0086\uffff";
    static final String DFA10_minS =
        "\1\11\1\75\1\57\1\55\1\uffff\1\157\3\uffff\1\146\1\150\1\154\1\150"+
        "\1\157\1\141\1\145\2\52\1\157\3\uffff\1\156\4\uffff\1\162\1\157"+
        "\2\uffff\2\75\1\122\1\101\14\uffff\1\151\1\167\2\60\1\145\1\165"+
        "\1\163\1\144\1\151\1\157\1\162\1\154\1\164\5\uffff\1\144\1\142\1"+
        "\144\1\60\1\164\4\uffff\1\125\1\114\1\156\1\143\1\60\2\uffff\1\156"+
        "\2\145\1\60\1\154\1\160\1\60\1\163\1\165\3\60\1\uffff\1\60\1\105"+
        "\1\123\1\164\1\145\1\uffff\3\60\1\uffff\1\145\1\60\1\uffff\1\145"+
        "\1\162\4\uffff\1\60\1\105\1\60\1\144\3\uffff\1\60\1\uffff\1\60\1"+
        "\156\1\60\1\uffff\1\165\1\uffff\1\60\1\162\1\uffff\1\145\1\60\1"+
        "\uffff";
    static final String DFA10_maxS =
        "\1\175\3\75\1\uffff\1\162\3\uffff\1\156\1\162\1\156\1\150\2\157"+
        "\1\145\1\57\1\52\1\157\3\uffff\1\162\4\uffff\1\162\1\157\2\uffff"+
        "\2\75\1\122\1\101\14\uffff\1\157\1\167\2\172\1\145\1\165\1\163\1"+
        "\144\1\151\1\157\1\162\1\154\1\164\5\uffff\1\144\1\142\1\144\1\172"+
        "\1\164\4\uffff\1\125\1\114\1\156\1\143\1\172\2\uffff\1\156\2\145"+
        "\1\172\1\154\1\160\1\172\1\163\1\165\3\172\1\uffff\1\172\1\105\1"+
        "\123\1\164\1\145\1\uffff\3\172\1\uffff\1\145\1\172\1\uffff\1\145"+
        "\1\162\4\uffff\1\172\1\105\1\172\1\144\3\uffff\1\172\1\uffff\1\172"+
        "\1\156\1\172\1\uffff\1\165\1\uffff\1\172\1\162\1\uffff\1\145\1\172"+
        "\1\uffff";
    static final String DFA10_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\1\10\12\uffff\1\31\1\32\1\35\1\uffff"+
        "\1\40\1\41\1\42\1\44\2\uffff\1\50\1\51\4\uffff\1\57\1\60\1\61\1"+
        "\64\1\1\1\43\1\2\1\33\1\23\1\3\1\63\1\24\15\uffff\1\30\1\34\1\25"+
        "\1\62\1\26\5\uffff\1\52\1\54\1\53\1\55\5\uffff\1\11\1\20\14\uffff"+
        "\1\45\5\uffff\1\37\3\uffff\1\14\2\uffff\1\17\2\uffff\1\27\1\36\1"+
        "\46\1\47\4\uffff\1\12\1\56\1\13\1\uffff\1\16\3\uffff\1\5\1\uffff"+
        "\1\15\2\uffff\1\21\2\uffff\1\22";
    static final String DFA10_specialS =
        "\u0086\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\46\2\uffff\1\46\22\uffff\1\46\1\36\1\45\1\25\4\uffff\1\6"+
            "\1\10\1\20\1\2\1\7\1\3\1\31\1\21\12\44\1\1\1\4\1\37\1\35\1\40"+
            "\2\uffff\5\43\1\42\15\43\1\41\6\43\1\23\1\uffff\1\24\3\uffff"+
            "\1\26\3\43\1\13\1\16\2\43\1\11\2\43\1\15\1\22\1\34\1\33\1\5"+
            "\1\43\1\17\1\43\1\12\2\43\1\14\3\43\1\27\1\32\1\30",
            "\1\47",
            "\1\52\15\uffff\1\51",
            "\1\55\17\uffff\1\54",
            "",
            "\1\60\2\uffff\1\57",
            "",
            "",
            "",
            "\1\61\7\uffff\1\62",
            "\1\63\11\uffff\1\64",
            "\1\65\1\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\72\15\uffff\1\71",
            "\1\73",
            "\1\74\4\uffff\1\75",
            "\1\77",
            "\1\101",
            "",
            "",
            "",
            "\1\103\3\uffff\1\102",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "",
            "",
            "\1\106",
            "\1\110",
            "\1\112",
            "\1\113",
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
            "\1\114\5\uffff\1\115",
            "\1\116",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\136",
            "",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\150",
            "\1\151",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\153",
            "\1\154",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\170",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\172",
            "\1\173",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\174",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\176",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0080",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\1\u0081",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\u0083",
            "",
            "\1\u0084",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | BOOLEAN | VAR | NUMBER | STRING | MULTI_COMMENT | COMMENT | WS );";
        }
    }
 

}