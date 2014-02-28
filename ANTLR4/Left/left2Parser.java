// $ANTLR 3.2 Sep 23, 2009 12:02:23 left2.g 2011-10-31 14:41:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class left2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "U", "V"
    };
    public static final int U=4;
    public static final int EOF=-1;
    public static final int V=5;

    // delegates
    // delegators


        public left2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public left2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return left2Parser.tokenNames; }
    public String getGrammarFileName() { return "left2.g"; }



    // $ANTLR start "left2"
    // left2.g:7:1: left2 : a ;
    public final void left2() throws RecognitionException {
        try {
            // left2.g:7:6: ( a )
            // left2.g:7:8: a
            {
            pushFollow(FOLLOW_a_in_left225);
            a();

            state._fsp--;


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
    // $ANTLR end "left2"


    // $ANTLR start "a"
    // left2.g:9:1: a : ( U | V );
    public final void a() throws RecognitionException {
        try {
            // left2.g:9:3: ( U | V )
            // left2.g:
            {
            if ( (input.LA(1)>=U && input.LA(1)<=V) ) {
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
    // $ANTLR end "a"

    // Delegated rules


 

    public static final BitSet FOLLOW_a_in_left225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_a0 = new BitSet(new long[]{0x0000000000000002L});

}