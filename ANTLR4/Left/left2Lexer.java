// $ANTLR 3.2 Sep 23, 2009 12:02:23 left2.g 2011-10-31 14:41:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class left2Lexer extends Lexer {
    public static final int U=4;
    public static final int EOF=-1;
    public static final int V=5;

    // delegates
    // delegators

    public left2Lexer() {;} 
    public left2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public left2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "left2.g"; }

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            int _type = U;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // left2.g:13:3: ( ( 'x' )* )
            // left2.g:13:5: ( 'x' )*
            {
            // left2.g:13:5: ( 'x' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='x') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // left2.g:13:5: 'x'
            	    {
            	    match('x'); 

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
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            int _type = V;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // left2.g:14:3: ( ( 'x' )* )
            // left2.g:14:5: ( 'x' )*
            {
            // left2.g:14:5: ( 'x' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='x') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // left2.g:14:5: 'x'
            	    {
            	    match('x'); 

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
    // $ANTLR end "V"

    public void mTokens() throws RecognitionException {
        // left2.g:1:8: ( U | V )
        int alt3=2;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // left2.g:1:10: U
                {
                mU(); 

                }
                break;
            case 2 :
                // left2.g:1:12: V
                {
                mV(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\2\2\1\uffff";
    static final String DFA3_eofS =
        "\3\uffff";
    static final String DFA3_minS =
        "\2\170\1\uffff";
    static final String DFA3_maxS =
        "\2\170\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\1";
    static final String DFA3_specialS =
        "\3\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\1",
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
            return "1:1: Tokens : ( U | V );";
        }
    }
 

}