// $ANTLR 3.2 Sep 23, 2009 12:02:23 danglingBacktrack.g 2012-10-19 12:26:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class danglingBacktrackParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NUMBER", "WS", "'if'", "'('", "')'", "'else'", "'while'", "'{'", "'}'", "'='", "';'", "'=='", "'<'"
    };
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


        public danglingBacktrackParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public danglingBacktrackParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return danglingBacktrackParser.tokenNames; }
    public String getGrammarFileName() { return "danglingBacktrack.g"; }



    // $ANTLR start "prog"
    // danglingBacktrack.g:3:1: prog : ( stmnt )+ ;
    public final void prog() throws RecognitionException {
        try {
            // danglingBacktrack.g:3:7: ( ( stmnt )+ )
            // danglingBacktrack.g:3:9: ( stmnt )+
            {
            // danglingBacktrack.g:3:9: ( stmnt )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==7||(LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // danglingBacktrack.g:3:9: stmnt
            	    {
            	    pushFollow(FOLLOW_stmnt_in_prog11);
            	    stmnt();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "prog"


    // $ANTLR start "stmnt"
    // danglingBacktrack.g:5:1: stmnt options {backtrack=true; } : ( 'if' '(' boolExp ')' stmnt 'else' stmnt | 'if' '(' boolExp ')' stmnt | 'while' '(' boolExp ')' stmnt | '{' ( stmnt )* '}' | ID '=' expr ';' );
    public final void stmnt() throws RecognitionException {
        try {
            // danglingBacktrack.g:9:7: ( 'if' '(' boolExp ')' stmnt 'else' stmnt | 'if' '(' boolExp ')' stmnt | 'while' '(' boolExp ')' stmnt | '{' ( stmnt )* '}' | ID '=' expr ';' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 7:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred1_danglingBacktrack()) ) {
                    alt3=1;
                }
                else if ( (synpred2_danglingBacktrack()) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                alt3=3;
                }
                break;
            case 12:
                {
                alt3=4;
                }
                break;
            case ID:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // danglingBacktrack.g:9:9: 'if' '(' boolExp ')' stmnt 'else' stmnt
                    {
                    match(input,7,FOLLOW_7_in_stmnt42); if (state.failed) return ;
                    match(input,8,FOLLOW_8_in_stmnt44); if (state.failed) return ;
                    pushFollow(FOLLOW_boolExp_in_stmnt46);
                    boolExp();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,9,FOLLOW_9_in_stmnt48); if (state.failed) return ;
                    pushFollow(FOLLOW_stmnt_in_stmnt50);
                    stmnt();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,10,FOLLOW_10_in_stmnt52); if (state.failed) return ;
                    pushFollow(FOLLOW_stmnt_in_stmnt54);
                    stmnt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // danglingBacktrack.g:10:9: 'if' '(' boolExp ')' stmnt
                    {
                    match(input,7,FOLLOW_7_in_stmnt64); if (state.failed) return ;
                    match(input,8,FOLLOW_8_in_stmnt66); if (state.failed) return ;
                    pushFollow(FOLLOW_boolExp_in_stmnt68);
                    boolExp();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,9,FOLLOW_9_in_stmnt70); if (state.failed) return ;
                    pushFollow(FOLLOW_stmnt_in_stmnt72);
                    stmnt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // danglingBacktrack.g:11:9: 'while' '(' boolExp ')' stmnt
                    {
                    match(input,11,FOLLOW_11_in_stmnt83); if (state.failed) return ;
                    match(input,8,FOLLOW_8_in_stmnt85); if (state.failed) return ;
                    pushFollow(FOLLOW_boolExp_in_stmnt87);
                    boolExp();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,9,FOLLOW_9_in_stmnt89); if (state.failed) return ;
                    pushFollow(FOLLOW_stmnt_in_stmnt91);
                    stmnt();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // danglingBacktrack.g:12:9: '{' ( stmnt )* '}'
                    {
                    match(input,12,FOLLOW_12_in_stmnt102); if (state.failed) return ;
                    // danglingBacktrack.g:12:13: ( stmnt )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==ID||LA2_0==7||(LA2_0>=11 && LA2_0<=12)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // danglingBacktrack.g:12:13: stmnt
                    	    {
                    	    pushFollow(FOLLOW_stmnt_in_stmnt104);
                    	    stmnt();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match(input,13,FOLLOW_13_in_stmnt107); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // danglingBacktrack.g:13:9: ID '=' expr ';'
                    {
                    match(input,ID,FOLLOW_ID_in_stmnt117); if (state.failed) return ;
                    match(input,14,FOLLOW_14_in_stmnt119); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_stmnt121);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,15,FOLLOW_15_in_stmnt123); if (state.failed) return ;

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
    // $ANTLR end "stmnt"


    // $ANTLR start "expr"
    // danglingBacktrack.g:16:1: expr : ( ID | NUMBER );
    public final void expr() throws RecognitionException {
        try {
            // danglingBacktrack.g:16:7: ( ID | NUMBER )
            // danglingBacktrack.g:
            {
            if ( (input.LA(1)>=ID && input.LA(1)<=NUMBER) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
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
    // $ANTLR end "expr"


    // $ANTLR start "boolExp"
    // danglingBacktrack.g:20:1: boolExp : ( expr '==' expr | expr '<' expr );
    public final void boolExp() throws RecognitionException {
        try {
            // danglingBacktrack.g:21:7: ( expr '==' expr | expr '<' expr )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=ID && LA4_0<=NUMBER)) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==17) ) {
                    alt4=2;
                }
                else if ( (LA4_1==16) ) {
                    alt4=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // danglingBacktrack.g:21:9: expr '==' expr
                    {
                    pushFollow(FOLLOW_expr_in_boolExp171);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,16,FOLLOW_16_in_boolExp173); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_boolExp175);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // danglingBacktrack.g:22:9: expr '<' expr
                    {
                    pushFollow(FOLLOW_expr_in_boolExp185);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,17,FOLLOW_17_in_boolExp187); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_boolExp190);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "boolExp"

    // $ANTLR start synpred1_danglingBacktrack
    public final void synpred1_danglingBacktrack_fragment() throws RecognitionException {   
        // danglingBacktrack.g:9:9: ( 'if' '(' boolExp ')' stmnt 'else' stmnt )
        // danglingBacktrack.g:9:9: 'if' '(' boolExp ')' stmnt 'else' stmnt
        {
        match(input,7,FOLLOW_7_in_synpred1_danglingBacktrack42); if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred1_danglingBacktrack44); if (state.failed) return ;
        pushFollow(FOLLOW_boolExp_in_synpred1_danglingBacktrack46);
        boolExp();

        state._fsp--;
        if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred1_danglingBacktrack48); if (state.failed) return ;
        pushFollow(FOLLOW_stmnt_in_synpred1_danglingBacktrack50);
        stmnt();

        state._fsp--;
        if (state.failed) return ;
        match(input,10,FOLLOW_10_in_synpred1_danglingBacktrack52); if (state.failed) return ;
        pushFollow(FOLLOW_stmnt_in_synpred1_danglingBacktrack54);
        stmnt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_danglingBacktrack

    // $ANTLR start synpred2_danglingBacktrack
    public final void synpred2_danglingBacktrack_fragment() throws RecognitionException {   
        // danglingBacktrack.g:10:9: ( 'if' '(' boolExp ')' stmnt )
        // danglingBacktrack.g:10:9: 'if' '(' boolExp ')' stmnt
        {
        match(input,7,FOLLOW_7_in_synpred2_danglingBacktrack64); if (state.failed) return ;
        match(input,8,FOLLOW_8_in_synpred2_danglingBacktrack66); if (state.failed) return ;
        pushFollow(FOLLOW_boolExp_in_synpred2_danglingBacktrack68);
        boolExp();

        state._fsp--;
        if (state.failed) return ;
        match(input,9,FOLLOW_9_in_synpred2_danglingBacktrack70); if (state.failed) return ;
        pushFollow(FOLLOW_stmnt_in_synpred2_danglingBacktrack72);
        stmnt();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_danglingBacktrack

    // Delegated rules

    public final boolean synpred2_danglingBacktrack() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_danglingBacktrack_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_danglingBacktrack() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_danglingBacktrack_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_stmnt_in_prog11 = new BitSet(new long[]{0x0000000000001892L});
    public static final BitSet FOLLOW_7_in_stmnt42 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stmnt44 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_boolExp_in_stmnt46 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_stmnt48 = new BitSet(new long[]{0x0000000000001C90L});
    public static final BitSet FOLLOW_stmnt_in_stmnt50 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_stmnt52 = new BitSet(new long[]{0x0000000000001890L});
    public static final BitSet FOLLOW_stmnt_in_stmnt54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_stmnt64 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stmnt66 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_boolExp_in_stmnt68 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_stmnt70 = new BitSet(new long[]{0x0000000000001890L});
    public static final BitSet FOLLOW_stmnt_in_stmnt72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_stmnt83 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stmnt85 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_boolExp_in_stmnt87 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_stmnt89 = new BitSet(new long[]{0x0000000000001890L});
    public static final BitSet FOLLOW_stmnt_in_stmnt91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_stmnt102 = new BitSet(new long[]{0x0000000000003890L});
    public static final BitSet FOLLOW_stmnt_in_stmnt104 = new BitSet(new long[]{0x0000000000003890L});
    public static final BitSet FOLLOW_13_in_stmnt107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stmnt117 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_stmnt119 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_expr_in_stmnt121 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_stmnt123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_boolExp171 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_boolExp173 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_expr_in_boolExp175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_boolExp185 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_boolExp187 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_expr_in_boolExp190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_synpred1_danglingBacktrack42 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred1_danglingBacktrack44 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_boolExp_in_synpred1_danglingBacktrack46 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred1_danglingBacktrack48 = new BitSet(new long[]{0x0000000000001C90L});
    public static final BitSet FOLLOW_stmnt_in_synpred1_danglingBacktrack50 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_synpred1_danglingBacktrack52 = new BitSet(new long[]{0x0000000000001890L});
    public static final BitSet FOLLOW_stmnt_in_synpred1_danglingBacktrack54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_synpred2_danglingBacktrack64 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_synpred2_danglingBacktrack66 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_boolExp_in_synpred2_danglingBacktrack68 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_synpred2_danglingBacktrack70 = new BitSet(new long[]{0x0000000000001890L});
    public static final BitSet FOLLOW_stmnt_in_synpred2_danglingBacktrack72 = new BitSet(new long[]{0x0000000000000002L});

}