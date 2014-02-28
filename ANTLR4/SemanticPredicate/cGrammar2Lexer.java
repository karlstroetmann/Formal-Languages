// $ANTLR 3.2 Sep 23, 2009 12:02:23 cGrammar2.g 2012-10-19 11:55:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class cGrammar2Lexer extends Lexer {
    public static final int WS=5;
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;

    // delegates
    // delegators

    public cGrammar2Lexer() {;} 
    public cGrammar2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public cGrammar2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "cGrammar2.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cGrammar2.g:3:6: ( ';' )
            // cGrammar2.g:3:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cGrammar2.g:4:6: ( '(' )
            // cGrammar2.g:4:8: '('
            {
            match('('); 

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
            // cGrammar2.g:5:6: ( ')' )
            // cGrammar2.g:5:8: ')'
            {
            match(')'); 

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
            // cGrammar2.g:6:6: ( 'typedef' )
            // cGrammar2.g:6:8: 'typedef'
            {
            match("typedef"); 


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
            // cGrammar2.g:7:7: ( 'unsigned' )
            // cGrammar2.g:7:9: 'unsigned'
            {
            match("unsigned"); 


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
            // cGrammar2.g:8:7: ( 'int' )
            // cGrammar2.g:8:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cGrammar2.g:38:9: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // cGrammar2.g:38:11: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // cGrammar2.g:38:11: ( 'a' .. 'z' )
            // cGrammar2.g:38:12: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

            // cGrammar2.g:38:21: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // cGrammar2.g:
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
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // cGrammar2.g:39:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // cGrammar2.g:39:11: ( ' ' | '\\t' | '\\n' | '\\r' )
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
        // cGrammar2.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | ID | WS )
        int alt2=8;
        alt2 = dfa2.predict(input);
        switch (alt2) {
            case 1 :
                // cGrammar2.g:1:10: T__6
                {
                mT__6(); 

                }
                break;
            case 2 :
                // cGrammar2.g:1:15: T__7
                {
                mT__7(); 

                }
                break;
            case 3 :
                // cGrammar2.g:1:20: T__8
                {
                mT__8(); 

                }
                break;
            case 4 :
                // cGrammar2.g:1:25: T__9
                {
                mT__9(); 

                }
                break;
            case 5 :
                // cGrammar2.g:1:30: T__10
                {
                mT__10(); 

                }
                break;
            case 6 :
                // cGrammar2.g:1:36: T__11
                {
                mT__11(); 

                }
                break;
            case 7 :
                // cGrammar2.g:1:42: ID
                {
                mID(); 

                }
                break;
            case 8 :
                // cGrammar2.g:1:45: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\4\uffff\3\7\2\uffff\5\7\1\21\2\7\1\uffff\4\7\1\30\1\7\1\uffff\1"+
        "\32\1\uffff";
    static final String DFA2_eofS =
        "\33\uffff";
    static final String DFA2_minS =
        "\1\11\3\uffff\1\171\2\156\2\uffff\1\160\1\163\1\164\1\145\1\151"+
        "\1\60\1\144\1\147\1\uffff\1\145\1\156\1\146\1\145\1\60\1\144\1\uffff"+
        "\1\60\1\uffff";
    static final String DFA2_maxS =
        "\1\172\3\uffff\1\171\2\156\2\uffff\1\160\1\163\1\164\1\145\1\151"+
        "\1\172\1\144\1\147\1\uffff\1\145\1\156\1\146\1\145\1\172\1\144\1"+
        "\uffff\1\172\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\7\1\10\10\uffff\1\6\6\uffff\1\4\1"+
        "\uffff\1\5";
    static final String DFA2_specialS =
        "\33\uffff}>";
    static final String[] DFA2_transitionS = {
            "\2\10\2\uffff\1\10\22\uffff\1\10\7\uffff\1\2\1\3\21\uffff\1"+
            "\1\45\uffff\10\7\1\6\12\7\1\4\1\5\5\7",
            "",
            "",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\22",
            "\1\23",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            "\1\31",
            "",
            "\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | ID | WS );";
        }
    }
 

}