// $ANTLR 3.2 Sep 23, 2009 12:02:23 DeclOrDef.g 2012-10-19 10:49:03

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class DeclOrDefParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "'('", "')'", "';'", "'{'", "'}'", "'void'", "'int'", "','", "'return'"
    };
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


        public DeclOrDefParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public DeclOrDefParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return DeclOrDefParser.tokenNames; }
    public String getGrammarFileName() { return "DeclOrDef.g"; }



    // $ANTLR start "decl_or_def"
    // DeclOrDef.g:7:1: decl_or_def : ( type ID '(' args ')' ';' | type ID '(' args ')' '{' body '}' );
    public final void decl_or_def() throws RecognitionException {
        try {
            // DeclOrDef.g:8:5: ( type ID '(' args ')' ';' | type ID '(' args ')' '{' body '}' )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // DeclOrDef.g:8:7: type ID '(' args ')' ';'
                    {
                    pushFollow(FOLLOW_type_in_decl_or_def18);
                    type();

                    state._fsp--;

                    match(input,ID,FOLLOW_ID_in_decl_or_def20); 
                    match(input,6,FOLLOW_6_in_decl_or_def22); 
                    pushFollow(FOLLOW_args_in_decl_or_def24);
                    args();

                    state._fsp--;

                    match(input,7,FOLLOW_7_in_decl_or_def26); 
                    match(input,8,FOLLOW_8_in_decl_or_def28); 

                    }
                    break;
                case 2 :
                    // DeclOrDef.g:9:7: type ID '(' args ')' '{' body '}'
                    {
                    pushFollow(FOLLOW_type_in_decl_or_def40);
                    type();

                    state._fsp--;

                    match(input,ID,FOLLOW_ID_in_decl_or_def42); 
                    match(input,6,FOLLOW_6_in_decl_or_def44); 
                    pushFollow(FOLLOW_args_in_decl_or_def46);
                    args();

                    state._fsp--;

                    match(input,7,FOLLOW_7_in_decl_or_def48); 
                    match(input,9,FOLLOW_9_in_decl_or_def50); 
                    pushFollow(FOLLOW_body_in_decl_or_def52);
                    body();

                    state._fsp--;

                    match(input,10,FOLLOW_10_in_decl_or_def54); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "decl_or_def"


    // $ANTLR start "type"
    // DeclOrDef.g:12:1: type : ( 'void' | 'int' );
    public final void type() throws RecognitionException {
        try {
            // DeclOrDef.g:12:5: ( 'void' | 'int' )
            // DeclOrDef.g:
            {
            if ( (input.LA(1)>=11 && input.LA(1)<=12) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "args"
    // DeclOrDef.g:16:1: args : arg ( ',' arg )* ;
    public final void args() throws RecognitionException {
        try {
            // DeclOrDef.g:16:5: ( arg ( ',' arg )* )
            // DeclOrDef.g:16:7: arg ( ',' arg )*
            {
            pushFollow(FOLLOW_arg_in_args87);
            arg();

            state._fsp--;

            // DeclOrDef.g:16:11: ( ',' arg )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // DeclOrDef.g:16:12: ',' arg
            	    {
            	    match(input,13,FOLLOW_13_in_args90); 
            	    pushFollow(FOLLOW_arg_in_args92);
            	    arg();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "args"


    // $ANTLR start "arg"
    // DeclOrDef.g:18:1: arg : 'int' ID ;
    public final void arg() throws RecognitionException {
        try {
            // DeclOrDef.g:18:5: ( 'int' ID )
            // DeclOrDef.g:18:7: 'int' ID
            {
            match(input,12,FOLLOW_12_in_arg103); 
            match(input,ID,FOLLOW_ID_in_arg105); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "arg"


    // $ANTLR start "body"
    // DeclOrDef.g:20:1: body : 'return' INT ;
    public final void body() throws RecognitionException {
        try {
            // DeclOrDef.g:20:5: ( 'return' INT )
            // DeclOrDef.g:20:7: 'return' INT
            {
            match(input,14,FOLLOW_14_in_body113); 
            match(input,INT,FOLLOW_INT_in_body115); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "body"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\14\uffff";
    static final String DFA1_eofS =
        "\14\uffff";
    static final String DFA1_minS =
        "\1\13\1\4\1\6\1\14\1\4\1\7\1\14\1\10\1\4\2\uffff\1\7";
    static final String DFA1_maxS =
        "\1\14\1\4\1\6\1\14\1\4\1\15\1\14\1\11\1\4\2\uffff\1\15";
    static final String DFA1_acceptS =
        "\11\uffff\1\2\1\1\1\uffff";
    static final String DFA1_specialS =
        "\14\uffff}>";
    static final String[] DFA1_transitionS = {
            "\2\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\7\5\uffff\1\6",
            "\1\10",
            "\1\12\1\11",
            "\1\13",
            "",
            "",
            "\1\7\5\uffff\1\6"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "7:1: decl_or_def : ( type ID '(' args ')' ';' | type ID '(' args ')' '{' body '}' );";
        }
    }
 

    public static final BitSet FOLLOW_type_in_decl_or_def18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_decl_or_def20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_decl_or_def22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_decl_or_def24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_decl_or_def26 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_decl_or_def28 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_decl_or_def40 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_decl_or_def42 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_decl_or_def44 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_args_in_decl_or_def46 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_decl_or_def48 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_decl_or_def50 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_body_in_decl_or_def52 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_decl_or_def54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args87 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_args90 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_arg_in_args92 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12_in_arg103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_arg105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_body113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_body115 = new BitSet(new long[]{0x0000000000000002L});

}