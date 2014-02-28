// $ANTLR 3.1.2 /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g 2009-10-22 15:00:43

    import java.util.TreeMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
public class programParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS", "'='", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int T__7=7;
    public static final int T__12=12;
    public static final int INT=5;
    public static final int T__8=8;
    public static final int WS=6;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__14=14;
    public static final int T__9=9;
    public static final int T__11=11;
    public static final int ID=4;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "factor", "stmnt", "product", "expr", "program"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public programParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public programParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this, port, null);
            setDebugListener(proxy);
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
        }
    public programParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg, new RecognizerSharedState());

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }


    public String[] getTokenNames() { return programParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g"; }


        TreeMap<String, Integer> varTable = new TreeMap<String, Integer>();



    // $ANTLR start "program"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:11:1: program : ( stmnt )+ ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:11:11: ( ( stmnt )+ )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:11:13: ( stmnt )+
            {
            dbg.location(11,13);
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:11:13: ( stmnt )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=ID && LA1_0<=INT)||LA1_0==13) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:11:13: stmnt
            	    {
            	    dbg.location(11,13);
            	    pushFollow(FOLLOW_stmnt_in_program24);
            	    stmnt();

            	    state._fsp--;


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
        dbg.location(11, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "stmnt"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:13:1: stmnt : ( ID '=' expr ';' | expr ';' );
    public final void stmnt() throws RecognitionException {
        Token ID1=null;
        int expr2 = 0;

        int expr3 = 0;


        try { dbg.enterRule(getGrammarFileName(), "stmnt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:13:7: ( ID '=' expr ';' | expr ';' )
            int alt2=2;
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==7) ) {
                    alt2=1;
                }
                else if ( ((LA2_1>=8 && LA2_1<=12)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA2_0==INT||LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:13:9: ID '=' expr ';'
                    {
                    dbg.location(13,9);
                    ID1=(Token)match(input,ID,FOLLOW_ID_in_stmnt34); 
                    dbg.location(13,12);
                    match(input,7,FOLLOW_7_in_stmnt36); 
                    dbg.location(13,16);
                    pushFollow(FOLLOW_expr_in_stmnt38);
                    expr2=expr();

                    state._fsp--;

                    dbg.location(13,21);
                    match(input,8,FOLLOW_8_in_stmnt40); 
                    dbg.location(13,25);
                     varTable.put((ID1!=null?ID1.getText():null), expr2); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:14:16: expr ';'
                    {
                    dbg.location(14,16);
                    pushFollow(FOLLOW_expr_in_stmnt59);
                    expr3=expr();

                    state._fsp--;

                    dbg.location(14,21);
                    match(input,8,FOLLOW_8_in_stmnt61); 
                    dbg.location(14,25);
                     System.out.println(expr3);     

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
        dbg.location(15, 7);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmnt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stmnt"


    // $ANTLR start "expr"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:17:1: expr returns [int result] : p= product ( ( '+' q= product ) | ( '-' q= product ) )* ;
    public final int expr() throws RecognitionException {
        int result = 0;

        int p = 0;

        int q = 0;


        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:18:5: (p= product ( ( '+' q= product ) | ( '-' q= product ) )* )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:18:7: p= product ( ( '+' q= product ) | ( '-' q= product ) )*
            {
            dbg.location(18,9);
            pushFollow(FOLLOW_product_in_expr94);
            p=product();

            state._fsp--;

            dbg.location(18,19);
             result = p; 
            dbg.location(19,7);
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:19:7: ( ( '+' q= product ) | ( '-' q= product ) )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=3;
                try { dbg.enterDecision(3);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==9) ) {
                    alt3=1;
                }
                else if ( (LA3_0==10) ) {
                    alt3=2;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:19:11: ( '+' q= product )
            	    {
            	    dbg.location(19,11);
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:19:11: ( '+' q= product )
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:19:12: '+' q= product
            	    {
            	    dbg.location(19,12);
            	    match(input,9,FOLLOW_9_in_expr109); 
            	    dbg.location(19,18);
            	    pushFollow(FOLLOW_product_in_expr115);
            	    q=product();

            	    state._fsp--;


            	    }

            	    dbg.location(19,29);
            	     result += q; 

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:20:11: ( '-' q= product )
            	    {
            	    dbg.location(20,11);
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:20:11: ( '-' q= product )
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:20:12: '-' q= product
            	    {
            	    dbg.location(20,12);
            	    match(input,10,FOLLOW_10_in_expr131); 
            	    dbg.location(20,18);
            	    pushFollow(FOLLOW_product_in_expr137);
            	    q=product();

            	    state._fsp--;


            	    }

            	    dbg.location(20,29);
            	     result -= q; 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(22, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return result;
    }
    // $ANTLR end "expr"


    // $ANTLR start "product"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:24:1: product returns [int result] : f= factor ( ( '*' g= factor ) | ( '/' g= factor ) )* ;
    public final int product() throws RecognitionException {
        int result = 0;

        int f = 0;

        int g = 0;


        try { dbg.enterRule(getGrammarFileName(), "product");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:25:5: (f= factor ( ( '*' g= factor ) | ( '/' g= factor ) )* )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:25:7: f= factor ( ( '*' g= factor ) | ( '/' g= factor ) )*
            {
            dbg.location(25,9);
            pushFollow(FOLLOW_factor_in_product174);
            f=factor();

            state._fsp--;

            dbg.location(25,18);
             result = f; 
            dbg.location(26,7);
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:26:7: ( ( '*' g= factor ) | ( '/' g= factor ) )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=3;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }
                else if ( (LA4_0==12) ) {
                    alt4=2;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:27:11: ( '*' g= factor )
            	    {
            	    dbg.location(27,11);
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:27:11: ( '*' g= factor )
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:27:12: '*' g= factor
            	    {
            	    dbg.location(27,12);
            	    match(input,11,FOLLOW_11_in_product197); 
            	    dbg.location(27,18);
            	    pushFollow(FOLLOW_factor_in_product203);
            	    g=factor();

            	    state._fsp--;


            	    }

            	    dbg.location(27,28);
            	     result *= g; 

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:28:11: ( '/' g= factor )
            	    {
            	    dbg.location(28,11);
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:28:11: ( '/' g= factor )
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:28:12: '/' g= factor
            	    {
            	    dbg.location(28,12);
            	    match(input,12,FOLLOW_12_in_product219); 
            	    dbg.location(28,18);
            	    pushFollow(FOLLOW_factor_in_product225);
            	    g=factor();

            	    state._fsp--;


            	    }

            	    dbg.location(28,28);
            	     result /= g; 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        dbg.location(30, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "product");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return result;
    }
    // $ANTLR end "product"


    // $ANTLR start "factor"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:32:1: factor returns [int result] : ( '(' expr ')' | ID | INT );
    public final int factor() throws RecognitionException {
        int result = 0;

        Token ID5=null;
        Token INT6=null;
        int expr4 = 0;


        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:33:5: ( '(' expr ')' | ID | INT )
            int alt5=3;
            try { dbg.enterDecision(5);

            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case INT:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:33:7: '(' expr ')'
                    {
                    dbg.location(33,7);
                    match(input,13,FOLLOW_13_in_factor259); 
                    dbg.location(33,11);
                    pushFollow(FOLLOW_expr_in_factor261);
                    expr4=expr();

                    state._fsp--;

                    dbg.location(33,16);
                    match(input,14,FOLLOW_14_in_factor263); 
                    dbg.location(33,20);
                     result = expr4;           

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:34:7: ID
                    {
                    dbg.location(34,7);
                    ID5=(Token)match(input,ID,FOLLOW_ID_in_factor273); 
                    dbg.location(34,20);
                     result = varTable.get((ID5!=null?ID5.getText():null)); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/SimpleInterpreter/program.g:35:7: INT
                    {
                    dbg.location(35,7);
                    INT6=(Token)match(input,INT,FOLLOW_INT_in_factor293); 
                    dbg.location(35,20);
                     result = new Integer((INT6!=null?INT6.getText():null)); 

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
        dbg.location(36, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return result;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmnt_in_program24 = new BitSet(new long[]{0x0000000000002032L});
    public static final BitSet FOLLOW_ID_in_stmnt34 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_stmnt36 = new BitSet(new long[]{0x0000000000002130L});
    public static final BitSet FOLLOW_expr_in_stmnt38 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stmnt40 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmnt59 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stmnt61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_expr94 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_9_in_expr109 = new BitSet(new long[]{0x0000000000002630L});
    public static final BitSet FOLLOW_product_in_expr115 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_10_in_expr131 = new BitSet(new long[]{0x0000000000002630L});
    public static final BitSet FOLLOW_product_in_expr137 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_factor_in_product174 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11_in_product197 = new BitSet(new long[]{0x0000000000003830L});
    public static final BitSet FOLLOW_factor_in_product203 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_12_in_product219 = new BitSet(new long[]{0x0000000000003830L});
    public static final BitSet FOLLOW_factor_in_product225 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_13_in_factor259 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_expr_in_factor261 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_factor263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor293 = new BitSet(new long[]{0x0000000000000002L});

}