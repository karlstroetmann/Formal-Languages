// $ANTLR 3.0 left.g 2009-03-06 13:50:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class leftParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "U", "V", "W", "'a'", "'b'", "'d'", "'x'"
    };
    public static final int U=4;
    public static final int W=6;
    public static final int V=5;
    public static final int EOF=-1;

        public leftParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "left.g"; }



    // $ANTLR start left
    // left.g:3:1: left : a ;
    public final void left() throws RecognitionException {
        try {
            // left.g:3:7: ( a )
            // left.g:3:7: a
            {
            pushFollow(FOLLOW_a_in_left9);
            a();
            _fsp--;


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
    // $ANTLR end left


    // $ANTLR start a
    // left.g:5:1: a : ( 'a' 'b' U 'd' | 'a' V 'b' 'd' | 'a' 'b' W | 'x' U | 'x' V );
    public final void a() throws RecognitionException {
        try {
            // left.g:5:5: ( 'a' 'b' U 'd' | 'a' V 'b' 'd' | 'a' 'b' W | 'x' U | 'x' V )
            int alt1=5;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==7) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==V) ) {
                    alt1=2;
                }
                else if ( (LA1_1==8) ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4==U) ) {
                        alt1=1;
                    }
                    else if ( (LA1_4==W) ) {
                        alt1=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("5:1: a : ( 'a' 'b' U 'd' | 'a' V 'b' 'd' | 'a' 'b' W | 'x' U | 'x' V );", 1, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5:1: a : ( 'a' 'b' U 'd' | 'a' V 'b' 'd' | 'a' 'b' W | 'x' U | 'x' V );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==10) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==U) ) {
                    alt1=4;
                }
                else if ( (LA1_2==V) ) {
                    alt1=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5:1: a : ( 'a' 'b' U 'd' | 'a' V 'b' 'd' | 'a' 'b' W | 'x' U | 'x' V );", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5:1: a : ( 'a' 'b' U 'd' | 'a' V 'b' 'd' | 'a' 'b' W | 'x' U | 'x' V );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // left.g:5:5: 'a' 'b' U 'd'
                    {
                    match(input,7,FOLLOW_7_in_a17); 
                    match(input,8,FOLLOW_8_in_a19); 
                    match(input,U,FOLLOW_U_in_a21); 
                    match(input,9,FOLLOW_9_in_a23); 

                    }
                    break;
                case 2 :
                    // left.g:6:5: 'a' V 'b' 'd'
                    {
                    match(input,7,FOLLOW_7_in_a30); 
                    match(input,V,FOLLOW_V_in_a32); 
                    match(input,8,FOLLOW_8_in_a34); 
                    match(input,9,FOLLOW_9_in_a36); 

                    }
                    break;
                case 3 :
                    // left.g:7:5: 'a' 'b' W
                    {
                    match(input,7,FOLLOW_7_in_a42); 
                    match(input,8,FOLLOW_8_in_a44); 
                    match(input,W,FOLLOW_W_in_a46); 

                    }
                    break;
                case 4 :
                    // left.g:8:5: 'x' U
                    {
                    match(input,10,FOLLOW_10_in_a52); 
                    match(input,U,FOLLOW_U_in_a54); 

                    }
                    break;
                case 5 :
                    // left.g:9:5: 'x' V
                    {
                    match(input,10,FOLLOW_10_in_a60); 
                    match(input,V,FOLLOW_V_in_a62); 

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
    // $ANTLR end a


 

    public static final BitSet FOLLOW_a_in_left9 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_a17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_a19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_U_in_a21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_a23 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_a30 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_V_in_a32 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_a34 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_a36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_a42 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_a44 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_W_in_a46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_a52 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_U_in_a54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_a60 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_V_in_a62 = new BitSet(new long[]{0x0000000000000002L});

}