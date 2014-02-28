// $ANTLR 3.2 Sep 23, 2009 12:02:23 grammatik.g 2012-11-02 16:52:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class grammatikLexer extends Lexer {
    public static final int WS=9;
    public static final int LINE_COMMENT=8;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int MULTI_COMMENT=7;
    public static final int LITERAL=6;
    public static final int VAR=4;
    public static final int EOF=-1;
    public static final int TOKEN=5;

    // delegates
    // delegators

    public grammatikLexer() {;} 
    public grammatikLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public grammatikLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "grammatik.g"; }

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammatik.g:3:7: ( ':' )
            // grammatik.g:3:9: ':'
            {
            match(':'); 

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
            // grammatik.g:4:7: ( '|' )
            // grammatik.g:4:9: '|'
            {
            match('|'); 

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
            // grammatik.g:5:7: ( ';' )
            // grammatik.g:5:9: ';'
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

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammatik.g:32:9: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // grammatik.g:32:11: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // grammatik.g:32:11: ( 'a' .. 'z' )
            // grammatik.g:32:12: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // grammatik.g:32:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // grammatik.g:
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
            // grammatik.g:33:9: ( ( 'A' .. 'Z' ) ( 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // grammatik.g:33:11: ( 'A' .. 'Z' ) ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // grammatik.g:33:11: ( 'A' .. 'Z' )
            // grammatik.g:33:12: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            // grammatik.g:33:21: ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // grammatik.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
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
            // grammatik.g:34:9: ( '\\'' (~ ( '\\'' ) )+ '\\'' )
            // grammatik.g:34:11: '\\'' (~ ( '\\'' ) )+ '\\''
            {
            match('\''); 
            // grammatik.g:34:16: (~ ( '\\'' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // grammatik.g:34:16: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
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

    // $ANTLR start "MULTI_COMMENT"
    public final void mMULTI_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammatik.g:36:15: ( '/*' (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )* ( '*' )+ '/' )
            // grammatik.g:36:17: '/*' (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )* ( '*' )+ '/'
            {
            match("/*"); 

            // grammatik.g:36:22: (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )*
            loop5:
            do {
                int alt5=3;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // grammatik.g:36:23: ~ ( '*' )
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
            	    // grammatik.g:36:32: ( '*' )+ ~ ( '*' | '/' )
            	    {
            	    // grammatik.g:36:32: ( '*' )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0=='*') ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // grammatik.g:36:32: '*'
            	    	    {
            	    	    match('*'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
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
            	    break loop5;
                }
            } while (true);

            // grammatik.g:36:50: ( '*' )+
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
            	    // grammatik.g:36:50: '*'
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

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammatik.g:37:15: ( '//' (~ ( '\\n' ) )* )
            // grammatik.g:37:17: '//' (~ ( '\\n' ) )*
            {
            match("//"); 

            // grammatik.g:37:22: (~ ( '\\n' ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // grammatik.g:37:22: ~ ( '\\n' )
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
            	    break loop7;
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

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // grammatik.g:38:15: ( ( ' ' | '\\t' | '\\v' | '\\n' | '\\r' ) )
            // grammatik.g:38:17: ( ' ' | '\\t' | '\\v' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' '||input.LA(1)=='v' ) {
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
        // grammatik.g:1:8: ( T__10 | T__11 | T__12 | VAR | TOKEN | LITERAL | MULTI_COMMENT | LINE_COMMENT | WS )
        int alt8=9;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // grammatik.g:1:10: T__10
                {
                mT__10(); 

                }
                break;
            case 2 :
                // grammatik.g:1:16: T__11
                {
                mT__11(); 

                }
                break;
            case 3 :
                // grammatik.g:1:22: T__12
                {
                mT__12(); 

                }
                break;
            case 4 :
                // grammatik.g:1:28: VAR
                {
                mVAR(); 

                }
                break;
            case 5 :
                // grammatik.g:1:32: TOKEN
                {
                mTOKEN(); 

                }
                break;
            case 6 :
                // grammatik.g:1:38: LITERAL
                {
                mLITERAL(); 

                }
                break;
            case 7 :
                // grammatik.g:1:46: MULTI_COMMENT
                {
                mMULTI_COMMENT(); 

                }
                break;
            case 8 :
                // grammatik.g:1:60: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 9 :
                // grammatik.g:1:73: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA5_eotS =
        "\5\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\2\0\3\uffff";
    static final String DFA5_maxS =
        "\2\uffff\3\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\1\3\1\2";
    static final String DFA5_specialS =
        "\1\0\1\1\3\uffff}>";
    static final String[] DFA5_transitionS = {
            "\52\2\1\1\uffd5\2",
            "\52\4\1\1\4\4\1\3\uffd0\4",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 36:22: (~ ( '*' ) | ( '*' )+ ~ ( '*' | '/' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='*') ) {s = 1;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_1 = input.LA(1);

                        s = -1;
                        if ( (LA5_1=='/') ) {s = 3;}

                        else if ( (LA5_1=='*') ) {s = 1;}

                        else if ( ((LA5_1>='\u0000' && LA5_1<=')')||(LA5_1>='+' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFF')) ) {s = 4;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA8_eotS =
        "\14\uffff";
    static final String DFA8_eofS =
        "\14\uffff";
    static final String DFA8_minS =
        "\1\11\6\uffff\1\52\4\uffff";
    static final String DFA8_maxS =
        "\1\174\6\uffff\1\57\4\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\4\1\11\1\7\1\10";
    static final String DFA8_specialS =
        "\14\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\11\2\uffff\1\11\22\uffff\1\11\6\uffff\1\6\7\uffff\1\7\12"+
            "\uffff\1\1\1\3\5\uffff\32\5\6\uffff\25\10\1\4\4\10\1\uffff\1"+
            "\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\4\uffff\1\13",
            "",
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
            return "1:1: Tokens : ( T__10 | T__11 | T__12 | VAR | TOKEN | LITERAL | MULTI_COMMENT | LINE_COMMENT | WS );";
        }
    }
 

}