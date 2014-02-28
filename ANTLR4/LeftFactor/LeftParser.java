// $ANTLR 3.2 Sep 23, 2009 12:02:23 Left.g 2012-10-12 09:48:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LeftParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "'x'", "'y'", "'z'"
    };
    public static final int WS=4;
    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int T__6=6;
    public static final int T__5=5;

    // delegates
    // delegators


        public LeftParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LeftParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return LeftParser.tokenNames; }
    public String getGrammarFileName() { return "Left.g"; }



    // $ANTLR start "a"
    // Left.g:8:1: a : ( 'x' b | 'x' c );
    public final void a() throws RecognitionException {
        try {
            // Left.g:8:3: ( 'x' b | 'x' c )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==5) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==6) ) {
                    alt1=1;
                }
                else if ( (LA1_1==7) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // Left.g:8:5: 'x' b
                    {
                    match(input,5,FOLLOW_5_in_a27); 
                    pushFollow(FOLLOW_b_in_a29);
                    b();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Left.g:9:5: 'x' c
                    {
                    match(input,5,FOLLOW_5_in_a35); 
                    pushFollow(FOLLOW_c_in_a37);
                    c();

                    state._fsp--;


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
    // $ANTLR end "a"


    // $ANTLR start "b"
    // Left.g:12:1: b : 'y' ;
    public final void b() throws RecognitionException {
        try {
            // Left.g:12:3: ( 'y' )
            // Left.g:12:5: 'y'
            {
            match(input,6,FOLLOW_6_in_b48); 

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
    // $ANTLR end "b"


    // $ANTLR start "c"
    // Left.g:14:1: c : 'z' ;
    public final void c() throws RecognitionException {
        try {
            // Left.g:14:3: ( 'z' )
            // Left.g:14:5: 'z'
            {
            match(input,7,FOLLOW_7_in_c57); 

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
    // $ANTLR end "c"

    // Delegated rules


 

    public static final BitSet FOLLOW_5_in_a27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_b_in_a29 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_5_in_a35 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_c_in_a37 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_b48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_c57 = new BitSet(new long[]{0x0000000000000002L});

}