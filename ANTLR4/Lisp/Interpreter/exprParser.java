// $ANTLR 3.1.2 /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g 2009-10-22 15:40:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

import org.antlr.runtime.tree.*;

public class exprParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "WS", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int T__7=7;
    public static final int T__12=12;
    public static final int INT=5;
    public static final int T__8=8;
    public static final int WS=6;
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__11=11;
    public static final int ID=4;

    // delegates
    // delegators

    public static final String[] ruleNames = new String[] {
        "invalidRule", "stmnt", "prog", "factor", "expr", "product"
    };
     
        public int ruleLevel = 0;
        public int getRuleLevel() { return ruleLevel; }
        public void incRuleLevel() { ruleLevel++; }
        public void decRuleLevel() { ruleLevel--; }
        public exprParser(TokenStream input) {
            this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
        }
        public exprParser(TokenStream input, int port, RecognizerSharedState state) {
            super(input, state);
            DebugEventSocketProxy proxy =
                new DebugEventSocketProxy(this,port,adaptor);
            setDebugListener(proxy);
            setTokenStream(new DebugTokenStream(input,proxy));
            try {
                proxy.handshake();
            }
            catch (IOException ioe) {
                reportError(ioe);
            }
            TreeAdaptor adap = new CommonTreeAdaptor();
            setTreeAdaptor(adap);
            proxy.setTreeAdaptor(adap);
        }
    public exprParser(TokenStream input, DebugEventListener dbg) {
        super(input, dbg);

         
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);

    }
    protected boolean evalPredicate(boolean result, String predicate) {
        dbg.semanticPredicate(result, predicate);
        return result;
    }

    protected DebugTreeAdaptor adaptor;
    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = new DebugTreeAdaptor(dbg,adaptor);

    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }


    public String[] getTokenNames() { return exprParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:8:1: prog : ( stmnt )+ ;
    public final exprParser.prog_return prog() throws RecognitionException {
        exprParser.prog_return retval = new exprParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        exprParser.stmnt_return stmnt1 = null;



        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(8, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:8:9: ( ( stmnt )+ )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:8:11: ( stmnt )+
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(8,11);
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:8:11: ( stmnt )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1);

                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=ID && LA1_0<=INT)||LA1_0==12) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:8:12: stmnt
            	    {
            	    dbg.location(8,12);
            	    pushFollow(FOLLOW_stmnt_in_prog47);
            	    stmnt1=stmnt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmnt1.getTree());
            	    dbg.location(8,18);
            	     System.out.println((stmnt1!=null?((CommonTree)stmnt1.tree):null).toStringTree()); 

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

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(8, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    public static class stmnt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stmnt"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:10:1: stmnt : ( ID '=' expr -> ^( '=' ID expr ) | expr -> expr );
    public final exprParser.stmnt_return stmnt() throws RecognitionException {
        exprParser.stmnt_return retval = new exprParser.stmnt_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ID2=null;
        Token char_literal3=null;
        exprParser.expr_return expr4 = null;

        exprParser.expr_return expr5 = null;


        CommonTree ID2_tree=null;
        CommonTree char_literal3_tree=null;
        RewriteRuleTokenStream stream_7=new RewriteRuleTokenStream(adaptor,"token 7");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "stmnt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:10:9: ( ID '=' expr -> ^( '=' ID expr ) | expr -> expr )
            int alt2=2;
            try { dbg.enterDecision(2);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==7) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||(LA2_1>=ID && LA2_1<=INT)||(LA2_1>=8 && LA2_1<=12)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;
                }
            }
            else if ( (LA2_0==INT||LA2_0==12) ) {
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

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:10:11: ID '=' expr
                    {
                    dbg.location(10,11);
                    ID2=(Token)match(input,ID,FOLLOW_ID_in_stmnt62);  
                    stream_ID.add(ID2);

                    dbg.location(10,14);
                    char_literal3=(Token)match(input,7,FOLLOW_7_in_stmnt64);  
                    stream_7.add(char_literal3);

                    dbg.location(10,18);
                    pushFollow(FOLLOW_expr_in_stmnt66);
                    expr4=expr();

                    state._fsp--;

                    stream_expr.add(expr4.getTree());


                    // AST REWRITE
                    // elements: 7, ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 10:24: -> ^( '=' ID expr )
                    {
                        dbg.location(10,28);
                        // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:10:28: ^( '=' ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(10,30);
                        root_1 = (CommonTree)adaptor.becomeRoot(stream_7.nextNode(), root_1);

                        dbg.location(10,34);
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        dbg.location(10,37);
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:11:11: expr
                    {
                    dbg.location(11,11);
                    pushFollow(FOLLOW_expr_in_stmnt90);
                    expr5=expr();

                    state._fsp--;

                    stream_expr.add(expr5.getTree());


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 11:24: -> expr
                    {
                        dbg.location(11,28);
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(12, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmnt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmnt"

    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:14:1: expr : product ( ( '+' | '-' ) product )* ;
    public final exprParser.expr_return expr() throws RecognitionException {
        exprParser.expr_return retval = new exprParser.expr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal7=null;
        Token char_literal8=null;
        exprParser.product_return product6 = null;

        exprParser.product_return product9 = null;


        CommonTree char_literal7_tree=null;
        CommonTree char_literal8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:14:9: ( product ( ( '+' | '-' ) product )* )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:14:11: product ( ( '+' | '-' ) product )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(14,11);
            pushFollow(FOLLOW_product_in_expr123);
            product6=product();

            state._fsp--;

            adaptor.addChild(root_0, product6.getTree());
            dbg.location(14,19);
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:14:19: ( ( '+' | '-' ) product )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4);

                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=8 && LA4_0<=9)) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:14:20: ( '+' | '-' ) product
            	    {
            	    dbg.location(14,20);
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:14:20: ( '+' | '-' )
            	    int alt3=2;
            	    try { dbg.enterSubRule(3);
            	    try { dbg.enterDecision(3);

            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==8) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==9) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(3);}

            	    switch (alt3) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:14:21: '+'
            	            {
            	            dbg.location(14,24);
            	            char_literal7=(Token)match(input,8,FOLLOW_8_in_expr127); 
            	            char_literal7_tree = (CommonTree)adaptor.create(char_literal7);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal7_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:14:28: '-'
            	            {
            	            dbg.location(14,31);
            	            char_literal8=(Token)match(input,9,FOLLOW_9_in_expr132); 
            	            char_literal8_tree = (CommonTree)adaptor.create(char_literal8);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal8_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(3);}

            	    dbg.location(14,34);
            	    pushFollow(FOLLOW_product_in_expr136);
            	    product9=product();

            	    state._fsp--;

            	    adaptor.addChild(root_0, product9.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(14, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"

    public static class product_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "product"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:16:1: product : factor ( ( '*' | '/' ) factor )* ;
    public final exprParser.product_return product() throws RecognitionException {
        exprParser.product_return retval = new exprParser.product_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal11=null;
        Token char_literal12=null;
        exprParser.factor_return factor10 = null;

        exprParser.factor_return factor13 = null;


        CommonTree char_literal11_tree=null;
        CommonTree char_literal12_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "product");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:16:9: ( factor ( ( '*' | '/' ) factor )* )
            dbg.enterAlt(1);

            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:16:11: factor ( ( '*' | '/' ) factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            dbg.location(16,11);
            pushFollow(FOLLOW_factor_in_product147);
            factor10=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor10.getTree());
            dbg.location(16,19);
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:16:19: ( ( '*' | '/' ) factor )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6);

                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=10 && LA6_0<=11)) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:16:20: ( '*' | '/' ) factor
            	    {
            	    dbg.location(16,20);
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:16:20: ( '*' | '/' )
            	    int alt5=2;
            	    try { dbg.enterSubRule(5);
            	    try { dbg.enterDecision(5);

            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==10) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==11) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;
            	    }
            	    } finally {dbg.exitDecision(5);}

            	    switch (alt5) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:16:21: '*'
            	            {
            	            dbg.location(16,24);
            	            char_literal11=(Token)match(input,10,FOLLOW_10_in_product152); 
            	            char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:16:28: '/'
            	            {
            	            dbg.location(16,31);
            	            char_literal12=(Token)match(input,11,FOLLOW_11_in_product157); 
            	            char_literal12_tree = (CommonTree)adaptor.create(char_literal12);
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal12_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(5);}

            	    dbg.location(16,34);
            	    pushFollow(FOLLOW_factor_in_product161);
            	    factor13=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor13.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(16, 43);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "product");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "product"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:18:1: factor : ( INT | ID | '(' expr ')' );
    public final exprParser.factor_return factor() throws RecognitionException {
        exprParser.factor_return retval = new exprParser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INT14=null;
        Token ID15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        exprParser.expr_return expr17 = null;


        CommonTree INT14_tree=null;
        CommonTree ID15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 1);

        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:18:9: ( INT | ID | '(' expr ')' )
            int alt7=3;
            try { dbg.enterDecision(7);

            switch ( input.LA(1) ) {
            case INT:
                {
                alt7=1;
                }
                break;
            case ID:
                {
                alt7=2;
                }
                break;
            case 12:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;
            }

            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:18:11: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(18,11);
                    INT14=(Token)match(input,INT,FOLLOW_INT_in_factor173); 
                    INT14_tree = (CommonTree)adaptor.create(INT14);
                    adaptor.addChild(root_0, INT14_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:19:11: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(19,11);
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_factor185); 
                    ID15_tree = (CommonTree)adaptor.create(ID15);
                    adaptor.addChild(root_0, ID15_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/ASTExprParser/expr.g:20:11: '(' expr ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    dbg.location(20,14);
                    char_literal16=(Token)match(input,12,FOLLOW_12_in_factor197); 
                    dbg.location(20,16);
                    pushFollow(FOLLOW_expr_in_factor200);
                    expr17=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr17.getTree());
                    dbg.location(20,24);
                    char_literal18=(Token)match(input,13,FOLLOW_13_in_factor202); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        dbg.location(21, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"

    // Delegated rules


 

    public static final BitSet FOLLOW_stmnt_in_prog47 = new BitSet(new long[]{0x0000000000001032L});
    public static final BitSet FOLLOW_ID_in_stmnt62 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_stmnt64 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_expr_in_stmnt66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmnt90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_expr123 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_8_in_expr127 = new BitSet(new long[]{0x0000000000001330L});
    public static final BitSet FOLLOW_9_in_expr132 = new BitSet(new long[]{0x0000000000001330L});
    public static final BitSet FOLLOW_product_in_expr136 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_factor_in_product147 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_10_in_product152 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_11_in_product157 = new BitSet(new long[]{0x0000000000001C30L});
    public static final BitSet FOLLOW_factor_in_product161 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_INT_in_factor173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_factor197 = new BitSet(new long[]{0x0000000000003030L});
    public static final BitSet FOLLOW_expr_in_factor200 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_factor202 = new BitSet(new long[]{0x0000000000000002L});

}