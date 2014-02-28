// $ANTLR 3.2 Sep 23, 2009 12:02:23 danglingBacktrack.g 2012-10-19 12:26:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class danglingBacktrackLexer extends Lexer {
    public static final int WS=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int NUMBER=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;

    // delegates
    // delegators

    public danglingBacktrackLexer() {;} 
    public danglingBacktrackLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public danglingBacktrackLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "danglingBacktrack.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // danglingBacktrack.g:3:6: ( 'if' )
            // danglingBacktrack.g:3:8: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // danglingBacktrack.g:4:6: ( '(' )
            // danglingBacktrack.g:4:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // danglingBacktrack.g:5:6: ( ')' )
            // danglingBacktrack.g:5:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // danglingBacktrack.g:6:7: ( 'else' )
            // danglingBacktrack.g:6:9: 'else'
            {
            match("else"); 


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
            // danglingBacktrack.g:7:7: ( 'while' )
            // danglingBacktrack.g:7:9: 'while'
            {
            match("while"); 


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
            // danglingBacktrack.g:8:7: ( '{' )
            // danglingBacktrack.g:8:9: '{'
            {
            match('{'); 

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
            // danglingBacktrack.g:9:7: ( '}' )
            // danglingBacktrack.g:9:9: '}'
            {
            match('}'); 

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
            // danglingBacktrack.g:10:7: ( '=' )
            // danglingBacktrack.g:10:9: '='
            {
            match('='); 

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
            // danglingBacktrack.g:11:7: ( ';' )
            // danglingBacktrack.g:11:9: ';'
            {
            match(';'); 

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
            // danglingBacktrack.g:12:7: ( '==' )
            // danglingBacktrack.g:12:9: '=='
            {
            match("=="); 


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
            // danglingBacktrack.g:13:7: ( '<' )
            // danglingBacktrack.g:13:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // danglingBacktrack.g:25:8: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // danglingBacktrack.g:25:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // danglingBacktrack.g:25:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // danglingBacktrack.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // danglingBacktrack.g:26:8: ( ( '0' .. '9' )+ )
            // danglingBacktrack.g:26:10: ( '0' .. '9' )+
            {
            // danglingBacktrack.g:26:10: ( '0' .. '9' )+
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
            	    // danglingBacktrack.g:26:11: '0' .. '9'
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // danglingBacktrack.g:27:8: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // danglingBacktrack.g:27:10: ( ' ' | '\\t' | '\\n' | '\\r' )
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
        // danglingBacktrack.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | ID | NUMBER | WS )
        int alt3=14;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // danglingBacktrack.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // danglingBacktrack.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // danglingBacktrack.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // danglingBacktrack.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // danglingBacktrack.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // danglingBacktrack.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // danglingBacktrack.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // danglingBacktrack.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // danglingBacktrack.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // danglingBacktrack.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // danglingBacktrack.g:1:67: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // danglingBacktrack.g:1:73: ID
                {
                mID(); 

                }
                break;
            case 13 :
                // danglingBacktrack.g:1:76: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 14 :
                // danglingBacktrack.g:1:83: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\1\13\2\uffff\2\13\2\uffff\1\22\5\uffff\1\23\2\13\3\uffff"+
        "\2\13\1\30\1\13\1\uffff\1\32\1\uffff";
    static final String DFA3_eofS =
        "\33\uffff";
    static final String DFA3_minS =
        "\1\11\1\146\2\uffff\1\154\1\150\2\uffff\1\75\5\uffff\1\101\1\163"+
        "\1\151\3\uffff\1\145\1\154\1\101\1\145\1\uffff\1\101\1\uffff";
    static final String DFA3_maxS =
        "\1\175\1\146\2\uffff\1\154\1\150\2\uffff\1\75\5\uffff\1\172\1\163"+
        "\1\151\3\uffff\1\145\1\154\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\6\1\7\1\uffff\1\11\1\13\1\14\1\15\1\16"+
        "\3\uffff\1\12\1\10\1\1\4\uffff\1\4\1\uffff\1\5";
    static final String DFA3_specialS =
        "\33\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\15\2\uffff\1\15\22\uffff\1\15\7\uffff\1\2\1\3\6\uffff\12"+
            "\14\1\uffff\1\11\1\12\1\10\3\uffff\32\13\6\uffff\4\13\1\4\3"+
            "\13\1\1\15\13\1\5\3\13\1\6\1\uffff\1\7",
            "\1\16",
            "",
            "",
            "\1\17",
            "\1\20",
            "",
            "",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "\32\13\6\uffff\32\13",
            "\1\24",
            "\1\25",
            "",
            "",
            "",
            "\1\26",
            "\1\27",
            "\32\13\6\uffff\32\13",
            "\1\31",
            "",
            "\32\13\6\uffff\32\13",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | ID | NUMBER | WS );";
        }
    }
 

}