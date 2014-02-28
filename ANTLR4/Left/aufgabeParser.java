// $ANTLR 3.0 aufgabe.g 2009-05-20 15:31:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class aufgabeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "'x'", "'y'", "'z'", "'u'"
    };
    public static final int EOF=-1;

        public aufgabeParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "aufgabe.g"; }



    // $ANTLR start aufgabe
    // aufgabe.g:3:1: aufgabe : a ;
    public final void aufgabe() throws RecognitionException {
        try {
            // aufgabe.g:3:10: ( a )
            // aufgabe.g:3:10: a
            {
            pushFollow(FOLLOW_a_in_aufgabe9);
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
    // $ANTLR end aufgabe


    // $ANTLR start a
    // aufgabe.g:5:1: a : ( b 'x' | 'y' b 'z' | 'u' 'z' | 'y' 'u' 'x' );
    public final void a() throws RecognitionException {
        try {
            // aufgabe.g:5:5: ( b 'x' | 'y' b 'z' | 'u' 'z' | 'y' 'u' 'x' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==7) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==6) ) {
                    alt1=3;
                }
                else if ( (LA1_1==4) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5:1: a : ( b 'x' | 'y' b 'z' | 'u' 'z' | 'y' 'u' 'x' );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==5) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==7) ) {
                    int LA1_5 = input.LA(3);

                    if ( (LA1_5==4) ) {
                        alt1=4;
                    }
                    else if ( (LA1_5==6) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("5:1: a : ( b 'x' | 'y' b 'z' | 'u' 'z' | 'y' 'u' 'x' );", 1, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("5:1: a : ( b 'x' | 'y' b 'z' | 'u' 'z' | 'y' 'u' 'x' );", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5:1: a : ( b 'x' | 'y' b 'z' | 'u' 'z' | 'y' 'u' 'x' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // aufgabe.g:5:5: b 'x'
                    {
                    pushFollow(FOLLOW_b_in_a17);
                    b();
                    _fsp--;

                    match(input,4,FOLLOW_4_in_a19); 

                    }
                    break;
                case 2 :
                    // aufgabe.g:6:5: 'y' b 'z'
                    {
                    match(input,5,FOLLOW_5_in_a26); 
                    pushFollow(FOLLOW_b_in_a28);
                    b();
                    _fsp--;

                    match(input,6,FOLLOW_6_in_a30); 

                    }
                    break;
                case 3 :
                    // aufgabe.g:7:5: 'u' 'z'
                    {
                    match(input,7,FOLLOW_7_in_a36); 
                    match(input,6,FOLLOW_6_in_a38); 

                    }
                    break;
                case 4 :
                    // aufgabe.g:8:5: 'y' 'u' 'x'
                    {
                    match(input,5,FOLLOW_5_in_a45); 
                    match(input,7,FOLLOW_7_in_a47); 
                    match(input,4,FOLLOW_4_in_a49); 

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


    // $ANTLR start b
    // aufgabe.g:11:1: b : 'u' ;
    public final void b() throws RecognitionException {
        try {
            // aufgabe.g:11:5: ( 'u' )
            // aufgabe.g:11:5: 'u'
            {
            match(input,7,FOLLOW_7_in_b60); 

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
    // $ANTLR end b


 

    public static final BitSet FOLLOW_a_in_aufgabe9 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_b_in_a17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4_in_a19 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_5_in_a26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_b_in_a28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_a30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_a36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_a38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_5_in_a45 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_a47 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4_in_a49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_b60 = new BitSet(new long[]{0x0000000000000002L});

}