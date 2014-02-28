// $ANTLR 3.0 /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g 2007-09-01 22:54:47

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class LispParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "OP", "ID", "NUMBER", "LETTER", "DIGIT", "WS", "'\\n'", "'('", "')'"
    };
    public static final int WS=9;
    public static final int LETTER=7;
    public static final int OP=4;
    public static final int NUMBER=6;
    public static final int DIGIT=8;
    public static final int ID=5;
    public static final int EOF=-1;
    public static final String[] ruleNames = new String[] {
        "invalidRule", "program", "symExpr", "symbol"
    };

    public int ruleLevel = 0;
    public LispParser(TokenStream input, int port) {
            super(input, port);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }

    }
    public LispParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT);
    }
    public LispParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);
    }

    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g"; }



    // $ANTLR start program
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:3:1: program : ( symExpr '\\n' )+ ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule("program");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(3, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:3:9: ( ( symExpr '\\n' )+ )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:3:11: ( symExpr '\\n' )+
            {
            dbg.location(3,11);
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:3:11: ( symExpr '\\n' )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=OP && LA1_0<=NUMBER)||LA1_0==11) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:3:12: symExpr '\\n'
            	    {
            	    dbg.location(3,12);
            	    pushFollow(FOLLOW_symExpr_in_program11);
            	    symExpr();
            	    _fsp--;

            	    dbg.location(3,20);
            	    match(input,10,FOLLOW_10_in_program13); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(3, 26);

        }
        finally {
            dbg.exitRule("program");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end program


    // $ANTLR start symExpr
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:5:1: symExpr : ( symbol | '(' ( symExpr )* ')' );
    public final void symExpr() throws RecognitionException {
        try { dbg.enterRule("symExpr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(5, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:5:9: ( symbol | '(' ( symExpr )* ')' )
            int alt3=2;
            try { dbg.enterDecision(3);

            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=OP && LA3_0<=NUMBER)) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("5:1: symExpr : ( symbol | '(' ( symExpr )* ')' );", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:5:11: symbol
                    {
                    dbg.location(5,11);
                    pushFollow(FOLLOW_symbol_in_symExpr23);
                    symbol();
                    _fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:6:11: '(' ( symExpr )* ')'
                    {
                    dbg.location(6,11);
                    match(input,11,FOLLOW_11_in_symExpr36); 
                    dbg.location(6,15);
                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:6:15: ( symExpr )*
                    try { dbg.enterSubRule(2);

                    loop2:
                    do {
                        int alt2=2;
                        try { dbg.enterDecision(2);

                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=OP && LA2_0<=NUMBER)||LA2_0==11) ) {
                            alt2=1;
                        }


                        } finally {dbg.exitDecision(2);}

                        switch (alt2) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:6:16: symExpr
                    	    {
                    	    dbg.location(6,16);
                    	    pushFollow(FOLLOW_symExpr_in_symExpr39);
                    	    symExpr();
                    	    _fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(2);}

                    dbg.location(6,26);
                    match(input,12,FOLLOW_12_in_symExpr43); 

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
        dbg.location(7, 9);

        }
        finally {
            dbg.exitRule("symExpr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end symExpr


    // $ANTLR start symbol
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:9:1: symbol : ( OP | ID | NUMBER );
    public final void symbol() throws RecognitionException {
        try { dbg.enterRule("symbol");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(9, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:9:8: ( OP | ID | NUMBER )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g:
            {
            dbg.location(9,8);
            if ( (input.LA(1)>=OP && input.LA(1)<=NUMBER) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_symbol0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(12, 8);

        }
        finally {
            dbg.exitRule("symbol");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end symbol


 

    public static final BitSet FOLLOW_symExpr_in_program11 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_program13 = new BitSet(new long[]{0x0000000000000872L});
    public static final BitSet FOLLOW_symbol_in_symExpr23 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_symExpr36 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_symExpr_in_symExpr39 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_12_in_symExpr43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_symbol0 = new BitSet(new long[]{0x0000000000000002L});

}