// $ANTLR 3.0 /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g 2007-09-01 22:49:50

  package Interpreter;
  import java.util.LinkedList;


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
    public String getGrammarFileName() { return "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g"; }



    // $ANTLR start program
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:8:1: program : ( symExpr '\\n' )+ ;
    public final void program() throws RecognitionException {
        SymbolicExpression symExpr1 = null;


        try { dbg.enterRule("program");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(8, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:8:9: ( ( symExpr '\\n' )+ )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:8:11: ( symExpr '\\n' )+
            {
            dbg.location(8,11);
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:8:11: ( symExpr '\\n' )+
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

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:8:12: symExpr '\\n'
            	    {
            	    dbg.location(8,12);
            	    pushFollow(FOLLOW_symExpr_in_program17);
            	    symExpr1=symExpr();
            	    _fsp--;

            	    dbg.location(8,20);
            	     System.out.println(symExpr1); 
            	    dbg.location(8,61);
            	    match(input,10,FOLLOW_10_in_program21); 

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
        dbg.location(8, 67);

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
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:10:1: symExpr returns [SymbolicExpression symExp] : ( symbol | '(' (se= symExpr )* ')' );
    public final SymbolicExpression symExpr() throws RecognitionException {
        SymbolicExpression symExp = null;

        SymbolicExpression se = null;

        SymbolicExpression symbol2 = null;


        try { dbg.enterRule("symExpr");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(10, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:11:5: ( symbol | '(' (se= symExpr )* ')' )
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
                    new NoViableAltException("10:1: symExpr returns [SymbolicExpression symExp] : ( symbol | '(' (se= symExpr )* ')' );", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:11:7: symbol
                    {
                    dbg.location(11,7);
                    pushFollow(FOLLOW_symbol_in_symExpr39);
                    symbol2=symbol();
                    _fsp--;

                    dbg.location(11,14);
                     symExp = symbol2; 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:12:7: '(' (se= symExpr )* ')'
                    {
                    dbg.location(12,7);
                    match(input,11,FOLLOW_11_in_symExpr49); 
                    dbg.location(12,11);
                     List<SymbolicExpression> l = new LinkedList<SymbolicExpression>(); 
                    dbg.location(13,7);
                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:13:7: (se= symExpr )*
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

                    	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:13:8: se= symExpr
                    	    {
                    	    dbg.location(13,11);
                    	    pushFollow(FOLLOW_symExpr_in_symExpr65);
                    	    se=symExpr();
                    	    _fsp--;

                    	    dbg.location(13,21);
                    	     l.add(se); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(2);}

                    dbg.location(14,7);
                    match(input,12,FOLLOW_12_in_symExpr78); 
                    dbg.location(14,11);
                     SymbolicExpression s = new LispList(l);
                                symExp = s.eval();
                              

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
        dbg.location(17, 5);

        }
        finally {
            dbg.exitRule("symExpr");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return symExp;
    }
    // $ANTLR end symExpr


    // $ANTLR start symbol
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:19:1: symbol returns [SymbolicExpression symExp] : ( OP | ID | NUMBER );
    public final SymbolicExpression symbol() throws RecognitionException {
        SymbolicExpression symExp = null;

        Token OP3=null;
        Token ID4=null;
        Token NUMBER5=null;

        try { dbg.enterRule("symbol");
        if ( ruleLevel==0 ) {dbg.commence();}
        ruleLevel++;
        dbg.location(19, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:20:5: ( OP | ID | NUMBER )
            int alt4=3;
            try { dbg.enterDecision(4);

            switch ( input.LA(1) ) {
            case OP:
                {
                alt4=1;
                }
                break;
            case ID:
                {
                alt4=2;
                }
                break;
            case NUMBER:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("19:1: symbol returns [SymbolicExpression symExp] : ( OP | ID | NUMBER );", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:20:7: OP
                    {
                    dbg.location(20,7);
                    OP3=(Token)input.LT(1);
                    match(input,OP,FOLLOW_OP_in_symbol126); 
                    dbg.location(20,14);
                     symExp = new Atom(OP3.getText()); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:21:7: ID
                    {
                    dbg.location(21,7);
                    ID4=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_symbol140); 
                    dbg.location(21,14);
                     symExp = new Atom(ID4.getText()); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:22:7: NUMBER
                    {
                    dbg.location(22,7);
                    NUMBER5=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_symbol154); 
                    dbg.location(22,14);
                     symExp = new Number(NUMBER5.getText()); 

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
        dbg.location(23, 5);

        }
        finally {
            dbg.exitRule("symbol");
            ruleLevel--;
            if ( ruleLevel==0 ) {dbg.terminate();}
        }

        return symExp;
    }
    // $ANTLR end symbol


 

    public static final BitSet FOLLOW_symExpr_in_program17 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_program21 = new BitSet(new long[]{0x0000000000000872L});
    public static final BitSet FOLLOW_symbol_in_symExpr39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_symExpr49 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_symExpr_in_symExpr65 = new BitSet(new long[]{0x0000000000001870L});
    public static final BitSet FOLLOW_12_in_symExpr78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_in_symbol126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_symbol140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_symbol154 = new BitSet(new long[]{0x0000000000000002L});

}