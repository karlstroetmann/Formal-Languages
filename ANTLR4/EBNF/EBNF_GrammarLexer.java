// $ANTLR 3.2 Sep 23, 2009 12:02:23 EBNF_Grammar.g 2011-11-04 10:12:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EBNF_GrammarLexer extends Lexer {
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int WS=8;
    public static final int T__13=13;
    public static final int T__21=21;
    public static final int ACTION=7;
    public static final int T__19=19;
    public static final int MULTI_COMMENT=10;
    public static final int T__33=33;
    public static final int T__14=14;
    public static final int LINE_COMMENT=9;
    public static final int T__11=11;
    public static final int T__22=22;
    public static final int T__29=29;
    public static final int VAR=4;
    public static final int T__30=30;
    public static final int LITERAL=6;
    public static final int T__17=17;
    public static final int TOKEN=5;
    public static final int T__31=31;
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__16=16;
    public static final int T__32=32;
    public static final int T__24=24;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__15=15;

    // delegates
    // delegators

    public EBNF_GrammarLexer() {;} 
    public EBNF_GrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public EBNF_GrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "EBNF_Grammar.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EBNF_Grammar.g:3:7: ( 'grammar' )
            // EBNF_Grammar.g:3:9: 'grammar'
            {
            match("grammar"); 


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
            // EBNF_Grammar.g:4:7: ( ';' )
            // EBNF_Grammar.g:4:9: ';'
            {
            match(';'); 

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
            // EBNF_Grammar.g:5:7: ( 'options' )
            // EBNF_Grammar.g:5:9: 'options'
            {
            match("options"); 


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
            // EBNF_Grammar.g:6:7: ( '@header' )
            // EBNF_Grammar.g:6:9: '@header'
            {
            match("@header"); 


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
            // EBNF_Grammar.g:7:7: ( '@lexer::header' )
            // EBNF_Grammar.g:7:9: '@lexer::header'
            {
            match("@lexer::header"); 


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
            // EBNF_Grammar.g:8:7: ( 'returns' )
            // EBNF_Grammar.g:8:9: 'returns'
            {
            match("returns"); 


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
            // EBNF_Grammar.g:9:7: ( '@init' )
            // EBNF_Grammar.g:9:9: '@init'
            {
            match("@init"); 


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
            // EBNF_Grammar.g:10:7: ( '@after' )
            // EBNF_Grammar.g:10:9: '@after'
            {
            match("@after"); 


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
            // EBNF_Grammar.g:11:7: ( ':' )
            // EBNF_Grammar.g:11:9: ':'
            {
            match(':'); 

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
            // EBNF_Grammar.g:12:7: ( '[' )
            // EBNF_Grammar.g:12:9: '['
            {
            match('['); 

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
            // EBNF_Grammar.g:13:7: ( ',' )
            // EBNF_Grammar.g:13:9: ','
            {
            match(','); 

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
            // EBNF_Grammar.g:14:7: ( ']' )
            // EBNF_Grammar.g:14:9: ']'
            {
            match(']'); 

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
            // EBNF_Grammar.g:15:7: ( '<' )
            // EBNF_Grammar.g:15:9: '<'
            {
            match('<'); 

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
            // EBNF_Grammar.g:16:7: ( '>' )
            // EBNF_Grammar.g:16:9: '>'
            {
            match('>'); 

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
            // EBNF_Grammar.g:17:7: ( '|' )
            // EBNF_Grammar.g:17:9: '|'
            {
            match('|'); 

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
            // EBNF_Grammar.g:18:7: ( '*' )
            // EBNF_Grammar.g:18:9: '*'
            {
            match('*'); 

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
            // EBNF_Grammar.g:19:7: ( '+' )
            // EBNF_Grammar.g:19:9: '+'
            {
            match('+'); 

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
            // EBNF_Grammar.g:20:7: ( '?' )
            // EBNF_Grammar.g:20:9: '?'
            {
            match('?'); 

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
            // EBNF_Grammar.g:21:7: ( '=>' )
            // EBNF_Grammar.g:21:9: '=>'
            {
            match("=>"); 


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
            // EBNF_Grammar.g:22:7: ( '(' )
            // EBNF_Grammar.g:22:9: '('
            {
            match('('); 

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
            // EBNF_Grammar.g:23:7: ( ')' )
            // EBNF_Grammar.g:23:9: ')'
            {
            match(')'); 

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
            // EBNF_Grammar.g:24:7: ( '=' )
            // EBNF_Grammar.g:24:9: '='
            {
            match('='); 

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
            // EBNF_Grammar.g:25:7: ( '~' )
            // EBNF_Grammar.g:25:9: '~'
            {
            match('~'); 

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
            // EBNF_Grammar.g:26:7: ( '..' )
            // EBNF_Grammar.g:26:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EBNF_Grammar.g:118:10: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // EBNF_Grammar.g:118:12: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // EBNF_Grammar.g:118:12: ( 'a' .. 'z' )
            // EBNF_Grammar.g:118:13: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // EBNF_Grammar.g:118:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // EBNF_Grammar.g:
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

    // $ANTLR start "TOKEN"
    public final void mTOKEN() throws RecognitionException {
        try {
            int _type = TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EBNF_Grammar.g:119:10: ( ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // EBNF_Grammar.g:119:12: ( 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // EBNF_Grammar.g:119:12: ( 'A' .. 'Z' )
            // EBNF_Grammar.g:119:13: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            // EBNF_Grammar.g:119:22: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // EBNF_Grammar.g:
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
    // $ANTLR end "TOKEN"

    // $ANTLR start "LITERAL"
    public final void mLITERAL() throws RecognitionException {
        try {
            int _type = LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EBNF_Grammar.g:120:10: ( '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\'' | '\\\\' | 't' | 'n' | 'r' ) )+ '\\'' )
            // EBNF_Grammar.g:120:12: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\'' | '\\\\' | 't' | 'n' | 'r' ) )+ '\\''
            {
            match('\''); 
            // EBNF_Grammar.g:120:17: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\'' | '\\\\' | 't' | 'n' | 'r' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }
                else if ( (LA3_0=='\\') ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // EBNF_Grammar.g:120:18: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // EBNF_Grammar.g:120:31: '\\\\' ( '\\'' | '\\\\' | 't' | 'n' | 'r' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LITERAL"

    // $ANTLR start "ACTION"
    public final void mACTION() throws RecognitionException {
        try {
            int _type = ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EBNF_Grammar.g:122:10: ( '{' ( ACTION | ~ ( '{' | '}' ) )* '}' ( '?' )? )
            // EBNF_Grammar.g:122:12: '{' ( ACTION | ~ ( '{' | '}' ) )* '}' ( '?' )?
            {
            match('{'); 
            // EBNF_Grammar.g:122:16: ( ACTION | ~ ( '{' | '}' ) )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='{') ) {
                    alt4=1;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='z')||LA4_0=='|'||(LA4_0>='~' && LA4_0<='\uFFFF')) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // EBNF_Grammar.g:122:17: ACTION
            	    {
            	    mACTION(); 

            	    }
            	    break;
            	case 2 :
            	    // EBNF_Grammar.g:122:26: ~ ( '{' | '}' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
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

            match('}'); 
            // EBNF_Grammar.g:122:43: ( '?' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='?') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // EBNF_Grammar.g:122:44: '?'
                    {
                    match('?'); 

                    }
                    break;

            }

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ACTION"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EBNF_Grammar.g:123:10: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // EBNF_Grammar.g:123:12: ( ' ' | '\\t' | '\\n' | '\\r' )
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

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EBNF_Grammar.g:125:15: ( '//' (~ ( '\\n' ) )* )
            // EBNF_Grammar.g:125:17: '//' (~ ( '\\n' ) )*
            {
            match("//"); 

            // EBNF_Grammar.g:125:22: (~ ( '\\n' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // EBNF_Grammar.g:125:23: ~ ( '\\n' )
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
            	    break loop6;
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
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // EBNF_Grammar.g:126:15: ( '/*' (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )* ( '*' )+ '/' )
            // EBNF_Grammar.g:126:17: '/*' (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )* ( '*' )+ '/'
            {
            match("/*"); 

            // EBNF_Grammar.g:126:22: (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )*
            loop8:
            do {
                int alt8=3;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // EBNF_Grammar.g:126:23: ~ ( '*' )
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
            	    // EBNF_Grammar.g:126:32: ( '*' )+ ~ ( '*' | '/' )
            	    {
            	    // EBNF_Grammar.g:126:32: ( '*' )+
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
            	    	    // EBNF_Grammar.g:126:32: '*'
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
            	    break loop8;
                }
            } while (true);

            // EBNF_Grammar.g:126:52: ( '*' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // EBNF_Grammar.g:126:52: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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

    public void mTokens() throws RecognitionException {
        // EBNF_Grammar.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | VAR | TOKEN | LITERAL | ACTION | WS | LINE_COMMENT | MULTI_COMMENT )
        int alt10=31;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // EBNF_Grammar.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // EBNF_Grammar.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // EBNF_Grammar.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // EBNF_Grammar.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // EBNF_Grammar.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // EBNF_Grammar.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // EBNF_Grammar.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // EBNF_Grammar.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // EBNF_Grammar.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // EBNF_Grammar.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // EBNF_Grammar.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // EBNF_Grammar.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // EBNF_Grammar.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // EBNF_Grammar.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // EBNF_Grammar.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // EBNF_Grammar.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // EBNF_Grammar.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // EBNF_Grammar.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // EBNF_Grammar.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // EBNF_Grammar.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // EBNF_Grammar.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // EBNF_Grammar.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // EBNF_Grammar.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // EBNF_Grammar.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // EBNF_Grammar.g:1:154: VAR
                {
                mVAR(); 

                }
                break;
            case 26 :
                // EBNF_Grammar.g:1:158: TOKEN
                {
                mTOKEN(); 

                }
                break;
            case 27 :
                // EBNF_Grammar.g:1:164: LITERAL
                {
                mLITERAL(); 

                }
                break;
            case 28 :
                // EBNF_Grammar.g:1:172: ACTION
                {
                mACTION(); 

                }
                break;
            case 29 :
                // EBNF_Grammar.g:1:179: WS
                {
                mWS(); 

                }
                break;
            case 30 :
                // EBNF_Grammar.g:1:182: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 31 :
                // EBNF_Grammar.g:1:195: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA8_eotS =
        "\5\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\2\0\3\uffff";
    static final String DFA8_maxS =
        "\2\uffff\3\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\1\1\2\1\3";
    static final String DFA8_specialS =
        "\1\1\1\0\3\uffff}>";
    static final String[] DFA8_transitionS = {
            "\52\2\1\1\uffd5\2",
            "\52\3\1\1\4\3\1\4\uffd0\3",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 126:22: (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                        s = -1;
                        if ( ((LA8_1>='\u0000' && LA8_1<=')')||(LA8_1>='+' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {s = 3;}

                        else if ( (LA8_1=='*') ) {s = 1;}

                        else if ( (LA8_1=='/') ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_0 = input.LA(1);

                        s = -1;
                        if ( (LA8_0=='*') ) {s = 1;}

                        else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\1\uffff\1\25\1\uffff\1\25\1\uffff\1\25\12\uffff\1\43\12\uffff\2"+
        "\25\4\uffff\1\25\4\uffff\14\25\1\65\1\66\1\67\3\uffff";
    static final String DFA10_eofS =
        "\70\uffff";
    static final String DFA10_minS =
        "\1\11\1\162\1\uffff\1\160\1\141\1\145\12\uffff\1\76\11\uffff\1\52"+
        "\1\141\1\164\4\uffff\1\164\4\uffff\1\155\1\151\1\165\1\155\1\157"+
        "\1\162\1\141\2\156\1\162\2\163\3\60\3\uffff";
    static final String DFA10_maxS =
        "\1\176\1\162\1\uffff\1\160\1\154\1\145\12\uffff\1\76\11\uffff\1"+
        "\57\1\141\1\164\4\uffff\1\164\4\uffff\1\155\1\151\1\165\1\155\1"+
        "\157\1\162\1\141\2\156\1\162\2\163\3\172\3\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\3\uffff\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
        "\1\22\1\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33\1\34\1\35\3\uffff"+
        "\1\4\1\5\1\7\1\10\1\uffff\1\23\1\26\1\36\1\37\17\uffff\1\1\1\3\1"+
        "\6";
    static final String DFA10_specialS =
        "\70\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\6\uffff\1\27\1\21\1\22\1\15"+
            "\1\16\1\10\1\uffff\1\24\1\32\12\uffff\1\6\1\2\1\12\1\20\1\13"+
            "\1\17\1\4\32\26\1\7\1\uffff\1\11\3\uffff\6\25\1\1\7\25\1\3\2"+
            "\25\1\5\10\25\1\30\1\14\1\uffff\1\23",
            "\1\33",
            "",
            "\1\34",
            "\1\40\6\uffff\1\35\1\37\2\uffff\1\36",
            "\1\41",
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
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45\4\uffff\1\44",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "",
            "\1\50",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | VAR | TOKEN | LITERAL | ACTION | WS | LINE_COMMENT | MULTI_COMMENT );";
        }
    }
 

}