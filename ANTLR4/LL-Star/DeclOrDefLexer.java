// $ANTLR 3.2 Sep 23, 2009 12:02:23 DeclOrDef.g 2012-10-19 10:49:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DeclOrDefLexer extends Lexer {
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int INT=5;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;

    // delegates
    // delegators

    public DeclOrDefLexer() {;} 
    public DeclOrDefLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public DeclOrDefLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "DeclOrDef.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DeclOrDef.g:3:6: ( '(' )
            // DeclOrDef.g:3:8: '('
            {
            match('('); 

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
            // DeclOrDef.g:4:6: ( ')' )
            // DeclOrDef.g:4:8: ')'
            {
            match(')'); 

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
            // DeclOrDef.g:5:6: ( ';' )
            // DeclOrDef.g:5:8: ';'
            {
            match(';'); 

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
            // DeclOrDef.g:6:6: ( '{' )
            // DeclOrDef.g:6:8: '{'
            {
            match('{'); 

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
            // DeclOrDef.g:7:7: ( '}' )
            // DeclOrDef.g:7:9: '}'
            {
            match('}'); 

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
            // DeclOrDef.g:8:7: ( 'void' )
            // DeclOrDef.g:8:9: 'void'
            {
            match("void"); 


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
            // DeclOrDef.g:9:7: ( 'int' )
            // DeclOrDef.g:9:9: 'int'
            {
            match("int"); 


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
            // DeclOrDef.g:10:7: ( ',' )
            // DeclOrDef.g:10:9: ','
            {
            match(','); 

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
            // DeclOrDef.g:11:7: ( 'return' )
            // DeclOrDef.g:11:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DeclOrDef.g:22:4: ( ( 'A' .. 'Z' | 'a' .. 'z' )+ )
            // DeclOrDef.g:22:6: ( 'A' .. 'Z' | 'a' .. 'z' )+
            {
            // DeclOrDef.g:22:6: ( 'A' .. 'Z' | 'a' .. 'z' )+
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
            	    // DeclOrDef.g:
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // DeclOrDef.g:23:4: ( '0' | ( '1' .. '9' ) ( '0' .. '9' )* )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // DeclOrDef.g:23:6: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // DeclOrDef.g:23:12: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // DeclOrDef.g:23:12: ( '1' .. '9' )
                    // DeclOrDef.g:23:13: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // DeclOrDef.g:23:23: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // DeclOrDef.g:23:24: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
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
    // $ANTLR end "INT"

    public void mTokens() throws RecognitionException {
        // DeclOrDef.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | ID | INT )
        int alt4=11;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // DeclOrDef.g:1:10: T__6
                {
                mT__6(); 

                }
                break;
            case 2 :
                // DeclOrDef.g:1:15: T__7
                {
                mT__7(); 

                }
                break;
            case 3 :
                // DeclOrDef.g:1:20: T__8
                {
                mT__8(); 

                }
                break;
            case 4 :
                // DeclOrDef.g:1:25: T__9
                {
                mT__9(); 

                }
                break;
            case 5 :
                // DeclOrDef.g:1:30: T__10
                {
                mT__10(); 

                }
                break;
            case 6 :
                // DeclOrDef.g:1:36: T__11
                {
                mT__11(); 

                }
                break;
            case 7 :
                // DeclOrDef.g:1:42: T__12
                {
                mT__12(); 

                }
                break;
            case 8 :
                // DeclOrDef.g:1:48: T__13
                {
                mT__13(); 

                }
                break;
            case 9 :
                // DeclOrDef.g:1:54: T__14
                {
                mT__14(); 

                }
                break;
            case 10 :
                // DeclOrDef.g:1:60: ID
                {
                mID(); 

                }
                break;
            case 11 :
                // DeclOrDef.g:1:63: INT
                {
                mINT(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\6\uffff\2\12\1\uffff\1\12\2\uffff\4\12\1\23\1\12\1\25\1\uffff\1"+
        "\12\1\uffff\1\12\1\30\1\uffff";
    static final String DFA4_eofS =
        "\31\uffff";
    static final String DFA4_minS =
        "\1\50\5\uffff\1\157\1\156\1\uffff\1\145\2\uffff\1\151\2\164\1\144"+
        "\1\101\1\165\1\101\1\uffff\1\162\1\uffff\1\156\1\101\1\uffff";
    static final String DFA4_maxS =
        "\1\175\5\uffff\1\157\1\156\1\uffff\1\145\2\uffff\1\151\2\164\1\144"+
        "\1\172\1\165\1\172\1\uffff\1\162\1\uffff\1\156\1\172\1\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\2\uffff\1\10\1\uffff\1\12\1\13\7\uffff"+
        "\1\7\1\uffff\1\6\2\uffff\1\11";
    static final String DFA4_specialS =
        "\31\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\1\2\2\uffff\1\10\3\uffff\12\13\1\uffff\1\3\5\uffff\32\12"+
            "\6\uffff\10\12\1\7\10\12\1\11\3\12\1\6\4\12\1\4\1\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "\1\15",
            "",
            "\1\16",
            "",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\32\12\6\uffff\32\12",
            "\1\24",
            "\32\12\6\uffff\32\12",
            "",
            "\1\26",
            "",
            "\1\27",
            "\32\12\6\uffff\32\12",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | ID | INT );";
        }
    }
 

}