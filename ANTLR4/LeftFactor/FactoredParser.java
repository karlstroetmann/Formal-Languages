// $ANTLR 3.2 Sep 23, 2009 12:02:23 Factored.g 2010-10-25 13:03:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FactoredParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "WS", "'x'", "'y'", "'z'"
    };
    public static final int T__7=7;
    public static final int EOF=-1;
    public static final int WS=4;
    public static final int T__5=5;
    public static final int T__6=6;

    // delegates
    // delegators


        public FactoredParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FactoredParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return FactoredParser.tokenNames; }
    public String getGrammarFileName() { return "Factored.g"; }



    // $ANTLR start "a"
    // Factored.g:7:1: a : 'x' ( b | c ) ;
    public final void a() throws RecognitionException {
        try {
            // Factored.g:7:3: ( 'x' ( b | c ) )
            // Factored.g:7:5: 'x' ( b | c )
            {
            match(input,5,FOLLOW_5_in_a26); 
            // Factored.g:7:9: ( b | c )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==6) ) {
                alt1=1;
            }
            else if ( (LA1_0==7) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // Factored.g:7:11: b
                    {
                    pushFollow(FOLLOW_b_in_a30);
                    b();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Factored.g:7:15: c
                    {
                    pushFollow(FOLLOW_c_in_a34);
                    c();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "a"


    // $ANTLR start "b"
    // Factored.g:10:1: b : 'y' ;
    public final void b() throws RecognitionException {
        try {
            // Factored.g:10:3: ( 'y' )
            // Factored.g:10:5: 'y'
            {
            match(input,6,FOLLOW_6_in_b46); 

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
    // Factored.g:12:1: c : 'z' ;
    public final void c() throws RecognitionException {
        try {
            // Factored.g:12:3: ( 'z' )
            // Factored.g:12:5: 'z'
            {
            match(input,7,FOLLOW_7_in_c55); 

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


 

    public static final BitSet FOLLOW_5_in_a26 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_b_in_a30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_c_in_a34 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_b46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_c55 = new BitSet(new long[]{0x0000000000000002L});

}