// $ANTLR 3.2 Sep 23, 2009 12:02:23 setl_language.g 2011-04-29 18:58:28

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class setl_languageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "BOOLEAN", "STRING", "NUMBER", "MULTI_COMMENT", "COMMENT", "WS", "':='", "'+='", "'-='", "';'", "'print'", "'('", "','", "')'", "'if'", "'then'", "'else'", "'end'", "'while'", "'loop'", "'for'", "'in'", "'return'", "'procedure'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'**'", "'['", "']'", "'+/'", "'*/'", "'#'", "'arb'", "'pow'", "'{'", "'}'", "'..'", "':'", "'|'", "'or'", "'and'", "'not'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int MULTI_COMMENT=8;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int BOOLEAN=5;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int VAR=4;
    public static final int COMMENT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=10;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=6;

    // delegates
    // delegators


        public setl_languageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public setl_languageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return setl_languageParser.tokenNames; }
    public String getGrammarFileName() { return "setl_language.g"; }



    // $ANTLR start "program"
    // setl_language.g:9:1: program returns [List<Statement> result] : (s= statement | p= procedure )+ ;
    public final List<Statement> program() throws RecognitionException {
        List<Statement> result = null;

        Statement s = null;

        Definition p = null;


         result = new ArrayList<Statement>(); 
        try {
            // setl_language.g:11:5: ( (s= statement | p= procedure )+ )
            // setl_language.g:11:8: (s= statement | p= procedure )+
            {
            // setl_language.g:11:8: (s= statement | p= procedure )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=VAR && LA1_0<=NUMBER)||(LA1_0>=15 && LA1_0<=16)||LA1_0==19||LA1_0==23||LA1_0==25||LA1_0==27||LA1_0==35||(LA1_0>=37 && LA1_0<=42)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==28) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // setl_language.g:11:10: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program36);
            	    s=statement();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	      result.add(s);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // setl_language.g:12:4: p= procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_program47);
            	    p=procedure();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       result.add(p); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return result;}
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
        return result;
    }
    // $ANTLR end "program"


    // $ANTLR start "statement"
    // setl_language.g:16:1: statement returns [Statement stmnt] : (v= VAR ( ':=' e= expr | '+=' f= expr | '-=' g= expr ) ';' | 'print' '(' (h= expr ) ( ',' i= expr )* ')' ';' | 'if' b= boolExpr 'then' (s= statement )* ( 'else' (t= statement )* )? 'end' 'if' ';' | 'while' c= boolExpr 'loop' (u= statement )* 'end' 'loop' ';' | 'for' w= VAR 'in' j= expr 'loop' (x= statement )* 'end' 'loop' ';' | 'return' (y= expr )? ';' | z= expr ';' );
    public final Statement statement() throws RecognitionException {
        Statement stmnt = null;

        Token v=null;
        Token w=null;
        Expr e = null;

        Expr f = null;

        Expr g = null;

        Expr h = null;

        Expr i = null;

        BoolExpr b = null;

        Statement s = null;

        Statement t = null;

        BoolExpr c = null;

        Statement u = null;

        Expr j = null;

        Statement x = null;

        Expr y = null;

        Expr z = null;



            List<Statement> stmntListOne = new ArrayList<Statement>();
            List<Statement> stmntListTwo = new ArrayList<Statement>();
        	List<Expr> exprList = new ArrayList<Expr>();

        try {
            // setl_language.g:22:5: (v= VAR ( ':=' e= expr | '+=' f= expr | '-=' g= expr ) ';' | 'print' '(' (h= expr ) ( ',' i= expr )* ')' ';' | 'if' b= boolExpr 'then' (s= statement )* ( 'else' (t= statement )* )? 'end' 'if' ';' | 'while' c= boolExpr 'loop' (u= statement )* 'end' 'loop' ';' | 'for' w= VAR 'in' j= expr 'loop' (x= statement )* 'end' 'loop' ';' | 'return' (y= expr )? ';' | z= expr ';' )
            int alt10=7;
            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=11 && LA10_1<=13)) ) {
                    alt10=1;
                }
                else if ( (LA10_1==14||LA10_1==16||(LA10_1>=29 && LA10_1<=35)) ) {
                    alt10=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return stmnt;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            case 27:
                {
                alt10=6;
                }
                break;
            case BOOLEAN:
            case STRING:
            case NUMBER:
            case 16:
            case 35:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt10=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return stmnt;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // setl_language.g:23:7: v= VAR ( ':=' e= expr | '+=' f= expr | '-=' g= expr ) ';'
                    {
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_statement90); if (state.failed) return stmnt;
                    // setl_language.g:23:15: ( ':=' e= expr | '+=' f= expr | '-=' g= expr )
                    int alt2=3;
                    switch ( input.LA(1) ) {
                    case 11:
                        {
                        alt2=1;
                        }
                        break;
                    case 12:
                        {
                        alt2=2;
                        }
                        break;
                    case 13:
                        {
                        alt2=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return stmnt;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // setl_language.g:23:16: ':=' e= expr
                            {
                            match(input,11,FOLLOW_11_in_statement93); if (state.failed) return stmnt;
                            pushFollow(FOLLOW_expr_in_statement99);
                            e=expr();

                            state._fsp--;
                            if (state.failed) return stmnt;
                            if ( state.backtracking==0 ) {
                              stmnt = new Assignment((v!=null?v.getText():null), e);
                            }

                            }
                            break;
                        case 2 :
                            // setl_language.g:24:8: '+=' f= expr
                            {
                            match(input,12,FOLLOW_12_in_statement111); if (state.failed) return stmnt;
                            pushFollow(FOLLOW_expr_in_statement117);
                            f=expr();

                            state._fsp--;
                            if (state.failed) return stmnt;
                            if ( state.backtracking==0 ) {
                              stmnt = new AssignmentAdd((v!=null?v.getText():null), f);
                            }

                            }
                            break;
                        case 3 :
                            // setl_language.g:25:5: '-=' g= expr
                            {
                            match(input,13,FOLLOW_13_in_statement126); if (state.failed) return stmnt;
                            pushFollow(FOLLOW_expr_in_statement132);
                            g=expr();

                            state._fsp--;
                            if (state.failed) return stmnt;
                            if ( state.backtracking==0 ) {
                              stmnt = new AssignmentSub((v!=null?v.getText():null), g);
                            }

                            }
                            break;

                    }

                    match(input,14,FOLLOW_14_in_statement141); if (state.failed) return stmnt;

                    }
                    break;
                case 2 :
                    // setl_language.g:27:7: 'print' '(' (h= expr ) ( ',' i= expr )* ')' ';'
                    {
                    match(input,15,FOLLOW_15_in_statement149); if (state.failed) return stmnt;
                    match(input,16,FOLLOW_16_in_statement151); if (state.failed) return stmnt;
                    // setl_language.g:27:19: (h= expr )
                    // setl_language.g:27:20: h= expr
                    {
                    pushFollow(FOLLOW_expr_in_statement158);
                    h=expr();

                    state._fsp--;
                    if (state.failed) return stmnt;
                    if ( state.backtracking==0 ) {
                       exprList.add(h); 
                    }

                    }

                    // setl_language.g:28:9: ( ',' i= expr )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // setl_language.g:28:10: ',' i= expr
                    	    {
                    	    match(input,17,FOLLOW_17_in_statement172); if (state.failed) return stmnt;
                    	    pushFollow(FOLLOW_expr_in_statement178);
                    	    i=expr();

                    	    state._fsp--;
                    	    if (state.failed) return stmnt;
                    	    if ( state.backtracking==0 ) {
                    	       exprList.add(i); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match(input,18,FOLLOW_18_in_statement184); if (state.failed) return stmnt;
                    match(input,14,FOLLOW_14_in_statement186); if (state.failed) return stmnt;
                    if ( state.backtracking==0 ) {
                       stmnt = new Print(exprList); 
                    }

                    }
                    break;
                case 3 :
                    // setl_language.g:30:7: 'if' b= boolExpr 'then' (s= statement )* ( 'else' (t= statement )* )? 'end' 'if' ';'
                    {
                    match(input,19,FOLLOW_19_in_statement198); if (state.failed) return stmnt;
                    pushFollow(FOLLOW_boolExpr_in_statement205);
                    b=boolExpr();

                    state._fsp--;
                    if (state.failed) return stmnt;
                    match(input,20,FOLLOW_20_in_statement207); if (state.failed) return stmnt;
                    // setl_language.g:30:33: (s= statement )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>=VAR && LA4_0<=NUMBER)||(LA4_0>=15 && LA4_0<=16)||LA4_0==19||LA4_0==23||LA4_0==25||LA4_0==27||LA4_0==35||(LA4_0>=37 && LA4_0<=42)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // setl_language.g:30:34: s= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement214);
                    	    s=statement();

                    	    state._fsp--;
                    	    if (state.failed) return stmnt;
                    	    if ( state.backtracking==0 ) {
                    	       stmntListOne.add(s); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // setl_language.g:31:6: ( 'else' (t= statement )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // setl_language.g:31:7: 'else' (t= statement )*
                            {
                            match(input,21,FOLLOW_21_in_statement227); if (state.failed) return stmnt;
                            // setl_language.g:31:14: (t= statement )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>=VAR && LA5_0<=NUMBER)||(LA5_0>=15 && LA5_0<=16)||LA5_0==19||LA5_0==23||LA5_0==25||LA5_0==27||LA5_0==35||(LA5_0>=37 && LA5_0<=42)) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // setl_language.g:31:15: t= statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_statement234);
                            	    t=statement();

                            	    state._fsp--;
                            	    if (state.failed) return stmnt;
                            	    if ( state.backtracking==0 ) {
                            	       stmntListTwo.add(t); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,22,FOLLOW_22_in_statement245); if (state.failed) return stmnt;
                    match(input,19,FOLLOW_19_in_statement247); if (state.failed) return stmnt;
                    match(input,14,FOLLOW_14_in_statement249); if (state.failed) return stmnt;
                    if ( state.backtracking==0 ) {
                       stmnt = new IfThen(b, stmntListOne, stmntListTwo); 
                    }

                    }
                    break;
                case 4 :
                    // setl_language.g:34:7: 'while' c= boolExpr 'loop' (u= statement )* 'end' 'loop' ';'
                    {
                    match(input,23,FOLLOW_23_in_statement261); if (state.failed) return stmnt;
                    pushFollow(FOLLOW_boolExpr_in_statement267);
                    c=boolExpr();

                    state._fsp--;
                    if (state.failed) return stmnt;
                    match(input,24,FOLLOW_24_in_statement269); if (state.failed) return stmnt;
                    // setl_language.g:35:6: (u= statement )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=VAR && LA7_0<=NUMBER)||(LA7_0>=15 && LA7_0<=16)||LA7_0==19||LA7_0==23||LA7_0==25||LA7_0==27||LA7_0==35||(LA7_0>=37 && LA7_0<=42)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // setl_language.g:35:7: u= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement282);
                    	    u=statement();

                    	    state._fsp--;
                    	    if (state.failed) return stmnt;
                    	    if ( state.backtracking==0 ) {
                    	       stmntListOne.add(u); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_statement293); if (state.failed) return stmnt;
                    match(input,24,FOLLOW_24_in_statement295); if (state.failed) return stmnt;
                    match(input,14,FOLLOW_14_in_statement297); if (state.failed) return stmnt;
                    if ( state.backtracking==0 ) {
                       stmnt = new While(c, stmntListOne); 
                    }

                    }
                    break;
                case 5 :
                    // setl_language.g:38:7: 'for' w= VAR 'in' j= expr 'loop' (x= statement )* 'end' 'loop' ';'
                    {
                    match(input,25,FOLLOW_25_in_statement309); if (state.failed) return stmnt;
                    w=(Token)match(input,VAR,FOLLOW_VAR_in_statement315); if (state.failed) return stmnt;
                    match(input,26,FOLLOW_26_in_statement317); if (state.failed) return stmnt;
                    pushFollow(FOLLOW_expr_in_statement323);
                    j=expr();

                    state._fsp--;
                    if (state.failed) return stmnt;
                    match(input,24,FOLLOW_24_in_statement325); if (state.failed) return stmnt;
                    // setl_language.g:39:6: (x= statement )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=VAR && LA8_0<=NUMBER)||(LA8_0>=15 && LA8_0<=16)||LA8_0==19||LA8_0==23||LA8_0==25||LA8_0==27||LA8_0==35||(LA8_0>=37 && LA8_0<=42)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // setl_language.g:39:7: x= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement338);
                    	    x=statement();

                    	    state._fsp--;
                    	    if (state.failed) return stmnt;
                    	    if ( state.backtracking==0 ) {
                    	       stmntListOne.add(x); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match(input,22,FOLLOW_22_in_statement350); if (state.failed) return stmnt;
                    match(input,24,FOLLOW_24_in_statement352); if (state.failed) return stmnt;
                    match(input,14,FOLLOW_14_in_statement354); if (state.failed) return stmnt;
                    if ( state.backtracking==0 ) {
                       stmnt = new For((w!=null?w.getText():null), j, stmntListOne); 
                    }

                    }
                    break;
                case 6 :
                    // setl_language.g:42:7: 'return' (y= expr )? ';'
                    {
                    match(input,27,FOLLOW_27_in_statement366); if (state.failed) return stmnt;
                    // setl_language.g:42:18: (y= expr )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=VAR && LA9_0<=NUMBER)||LA9_0==16||LA9_0==35||(LA9_0>=37 && LA9_0<=42)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // setl_language.g:42:18: y= expr
                            {
                            pushFollow(FOLLOW_expr_in_statement372);
                            y=expr();

                            state._fsp--;
                            if (state.failed) return stmnt;

                            }
                            break;

                    }

                    match(input,14,FOLLOW_14_in_statement375); if (state.failed) return stmnt;
                    if ( state.backtracking==0 ) {
                       stmnt = new Return(y); 
                    }

                    }
                    break;
                case 7 :
                    // setl_language.g:44:7: z= expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_statement393);
                    z=expr();

                    state._fsp--;
                    if (state.failed) return stmnt;
                    match(input,14,FOLLOW_14_in_statement395); if (state.failed) return stmnt;
                    if ( state.backtracking==0 ) {
                       stmnt = new ExprStmnt(z); 
                    }

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
        return stmnt;
    }
    // $ANTLR end "statement"


    // $ANTLR start "procedure"
    // setl_language.g:48:1: procedure returns [Definition proc] : 'procedure' p= VAR '(' (v= VAR ( ',' w= VAR )* )? ')' ';' (s= statement )+ 'end' q= VAR ';' ;
    public final Definition procedure() throws RecognitionException {
        Definition proc = null;

        Token p=null;
        Token v=null;
        Token w=null;
        Token q=null;
        Statement s = null;



            List<Statement> stmntList = new ArrayList<Statement>();
        	List<String> params = new ArrayList<String>();

        try {
            // setl_language.g:53:5: ( 'procedure' p= VAR '(' (v= VAR ( ',' w= VAR )* )? ')' ';' (s= statement )+ 'end' q= VAR ';' )
            // setl_language.g:54:5: 'procedure' p= VAR '(' (v= VAR ( ',' w= VAR )* )? ')' ';' (s= statement )+ 'end' q= VAR ';'
            {
            match(input,28,FOLLOW_28_in_procedure432); if (state.failed) return proc;
            p=(Token)match(input,VAR,FOLLOW_VAR_in_procedure438); if (state.failed) return proc;
            match(input,16,FOLLOW_16_in_procedure440); if (state.failed) return proc;
            // setl_language.g:54:29: (v= VAR ( ',' w= VAR )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==VAR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // setl_language.g:54:31: v= VAR ( ',' w= VAR )*
                    {
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_procedure448); if (state.failed) return proc;
                    if ( state.backtracking==0 ) {
                       params.add((v!=null?v.getText():null)); 
                    }
                    // setl_language.g:55:8: ( ',' w= VAR )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // setl_language.g:55:9: ',' w= VAR
                    	    {
                    	    match(input,17,FOLLOW_17_in_procedure460); if (state.failed) return proc;
                    	    w=(Token)match(input,VAR,FOLLOW_VAR_in_procedure466); if (state.failed) return proc;
                    	    if ( state.backtracking==0 ) {
                    	       params.add((w!=null?w.getText():null)); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,18,FOLLOW_18_in_procedure474); if (state.failed) return proc;
            match(input,14,FOLLOW_14_in_procedure476); if (state.failed) return proc;
            // setl_language.g:56:5: (s= statement )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=VAR && LA13_0<=NUMBER)||(LA13_0>=15 && LA13_0<=16)||LA13_0==19||LA13_0==23||LA13_0==25||LA13_0==27||LA13_0==35||(LA13_0>=37 && LA13_0<=42)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // setl_language.g:56:6: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_procedure488);
            	    s=statement();

            	    state._fsp--;
            	    if (state.failed) return proc;
            	    if ( state.backtracking==0 ) {
            	       stmntList.add(s); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return proc;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            match(input,22,FOLLOW_22_in_procedure494); if (state.failed) return proc;
            q=(Token)match(input,VAR,FOLLOW_VAR_in_procedure500); if (state.failed) return proc;
            match(input,14,FOLLOW_14_in_procedure502); if (state.failed) return proc;
            if ( state.backtracking==0 ) {
               proc = new Definition((p!=null?p.getText():null), params, stmntList, (q!=null?q.getText():null)); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return proc;
    }
    // $ANTLR end "procedure"


    // $ANTLR start "expr"
    // setl_language.g:60:1: expr returns [Expr result] : p= product ( '+' q= product | '-' q= product )* ;
    public final Expr expr() throws RecognitionException {
        Expr result = null;

        Expr p = null;

        Expr q = null;


        try {
            // setl_language.g:61:5: (p= product ( '+' q= product | '-' q= product )* )
            // setl_language.g:62:6: p= product ( '+' q= product | '-' q= product )*
            {
            pushFollow(FOLLOW_product_in_expr539);
            p=product();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               result = p; 
            }
            // setl_language.g:63:5: ( '+' q= product | '-' q= product )*
            loop14:
            do {
                int alt14=3;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }
                else if ( (LA14_0==30) ) {
                    alt14=2;
                }


                switch (alt14) {
            	case 1 :
            	    // setl_language.g:63:6: '+' q= product
            	    {
            	    match(input,29,FOLLOW_29_in_expr548); if (state.failed) return result;
            	    pushFollow(FOLLOW_product_in_expr554);
            	    q=product();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       result = new Sum( result, q); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // setl_language.g:64:6: '-' q= product
            	    {
            	    match(input,30,FOLLOW_30_in_expr563); if (state.failed) return result;
            	    pushFollow(FOLLOW_product_in_expr569);
            	    q=product();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       result = new Difference( result, q); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "expr"


    // $ANTLR start "product"
    // setl_language.g:68:1: product returns [Expr result] : p= power ( '*' q= power | '/' q= power | 'mod' q= power )* ;
    public final Expr product() throws RecognitionException {
        Expr result = null;

        Expr p = null;

        Expr q = null;


        try {
            // setl_language.g:69:5: (p= power ( '*' q= power | '/' q= power | 'mod' q= power )* )
            // setl_language.g:70:6: p= power ( '*' q= power | '/' q= power | 'mod' q= power )*
            {
            pushFollow(FOLLOW_power_in_product609);
            p=power();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               result = p; 
            }
            // setl_language.g:71:5: ( '*' q= power | '/' q= power | 'mod' q= power )*
            loop15:
            do {
                int alt15=4;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt15=1;
                    }
                    break;
                case 32:
                    {
                    alt15=2;
                    }
                    break;
                case 33:
                    {
                    alt15=3;
                    }
                    break;

                }

                switch (alt15) {
            	case 1 :
            	    // setl_language.g:71:6: '*' q= power
            	    {
            	    match(input,31,FOLLOW_31_in_product618); if (state.failed) return result;
            	    pushFollow(FOLLOW_power_in_product624);
            	    q=power();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       result = new Product( result, q); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // setl_language.g:72:6: '/' q= power
            	    {
            	    match(input,32,FOLLOW_32_in_product633); if (state.failed) return result;
            	    pushFollow(FOLLOW_power_in_product639);
            	    q=power();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       result = new Quotient( result, q); 
            	    }

            	    }
            	    break;
            	case 3 :
            	    // setl_language.g:73:6: 'mod' q= power
            	    {
            	    match(input,33,FOLLOW_33_in_product648); if (state.failed) return result;
            	    pushFollow(FOLLOW_power_in_product654);
            	    q=power();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       result = new Modulo( result, q); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "product"


    // $ANTLR start "power"
    // setl_language.g:77:1: power returns [Expr result] : f= factor ( '**' g= power )? ;
    public final Expr power() throws RecognitionException {
        Expr result = null;

        Expr f = null;

        Expr g = null;



             Expr e = null;

        try {
            // setl_language.g:81:6: (f= factor ( '**' g= power )? )
            // setl_language.g:82:6: f= factor ( '**' g= power )?
            {
            pushFollow(FOLLOW_factor_in_power700);
            f=factor();

            state._fsp--;
            if (state.failed) return result;
            // setl_language.g:83:8: ( '**' g= power )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // setl_language.g:83:9: '**' g= power
                    {
                    match(input,34,FOLLOW_34_in_power710); if (state.failed) return result;
                    pushFollow(FOLLOW_power_in_power716);
                    g=power();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       e = g; 
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               result = new Power(f, e); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "power"


    // $ANTLR start "factor"
    // setl_language.g:87:1: factor returns [Expr result] : ( '(' e= expr ')' | v= VAR ( '(' (p= paramList )? ')' | '[' q= expr ']' | ) | '+/' s= factor | '*/' t= factor | '#' u= factor | 'arb' x= factor | 'pow' ps= factor | w= setOrList | m= BOOLEAN | y= STRING | n= NUMBER );
    public final Expr factor() throws RecognitionException {
        Expr result = null;

        Token v=null;
        Token m=null;
        Token y=null;
        Token n=null;
        Expr e = null;

        List<Expr> p = null;

        Expr q = null;

        Expr s = null;

        Expr t = null;

        Expr u = null;

        Expr x = null;

        Expr ps = null;

        Expr w = null;



            List<Expr> exprList = new ArrayList<Expr>();

        try {
            // setl_language.g:91:5: ( '(' e= expr ')' | v= VAR ( '(' (p= paramList )? ')' | '[' q= expr ']' | ) | '+/' s= factor | '*/' t= factor | '#' u= factor | 'arb' x= factor | 'pow' ps= factor | w= setOrList | m= BOOLEAN | y= STRING | n= NUMBER )
            int alt19=11;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt19=1;
                }
                break;
            case VAR:
                {
                alt19=2;
                }
                break;
            case 37:
                {
                alt19=3;
                }
                break;
            case 38:
                {
                alt19=4;
                }
                break;
            case 39:
                {
                alt19=5;
                }
                break;
            case 40:
                {
                alt19=6;
                }
                break;
            case 41:
                {
                alt19=7;
                }
                break;
            case 35:
            case 42:
                {
                alt19=8;
                }
                break;
            case BOOLEAN:
                {
                alt19=9;
                }
                break;
            case STRING:
                {
                alt19=10;
                }
                break;
            case NUMBER:
                {
                alt19=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // setl_language.g:92:5: '(' e= expr ')'
                    {
                    match(input,16,FOLLOW_16_in_factor757); if (state.failed) return result;
                    pushFollow(FOLLOW_expr_in_factor763);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;
                    match(input,18,FOLLOW_18_in_factor765); if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = e; 
                    }

                    }
                    break;
                case 2 :
                    // setl_language.g:93:7: v= VAR ( '(' (p= paramList )? ')' | '[' q= expr ']' | )
                    {
                    v=(Token)match(input,VAR,FOLLOW_VAR_in_factor779); if (state.failed) return result;
                    // setl_language.g:94:7: ( '(' (p= paramList )? ')' | '[' q= expr ']' | )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case 16:
                        {
                        alt18=1;
                        }
                        break;
                    case 35:
                        {
                        alt18=2;
                        }
                        break;
                    case 14:
                    case 17:
                    case 18:
                    case 20:
                    case 24:
                    case 26:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 36:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // setl_language.g:94:9: '(' (p= paramList )? ')'
                            {
                            match(input,16,FOLLOW_16_in_factor790); if (state.failed) return result;
                            // setl_language.g:94:12: (p= paramList )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( ((LA17_0>=VAR && LA17_0<=NUMBER)||LA17_0==16||LA17_0==35||(LA17_0>=37 && LA17_0<=42)) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // setl_language.g:94:14: p= paramList
                                    {
                                    pushFollow(FOLLOW_paramList_in_factor797);
                                    p=paramList();

                                    state._fsp--;
                                    if (state.failed) return result;
                                    if ( state.backtracking==0 ) {
                                       exprList.addAll(p); 
                                    }

                                    }
                                    break;

                            }

                            match(input,18,FOLLOW_18_in_factor803); if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new FunctionCall((v!=null?v.getText():null), exprList); 
                            }

                            }
                            break;
                        case 2 :
                            // setl_language.g:96:9: '[' q= expr ']'
                            {
                            match(input,35,FOLLOW_35_in_factor826); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_factor832);
                            q=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            match(input,36,FOLLOW_36_in_factor834); if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new ListCall((v!=null?v.getText():null), q); 
                            }

                            }
                            break;
                        case 3 :
                            // setl_language.g:97:6: 
                            {
                            if ( state.backtracking==0 ) {
                               result = new Variable((v!=null?v.getText():null)); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // setl_language.g:99:7: '+/' s= factor
                    {
                    match(input,37,FOLLOW_37_in_factor856); if (state.failed) return result;
                    pushFollow(FOLLOW_factor_in_factor862);
                    s=factor();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new MyCrossSum(s); 
                    }

                    }
                    break;
                case 4 :
                    // setl_language.g:100:4: '*/' t= factor
                    {
                    match(input,38,FOLLOW_38_in_factor869); if (state.failed) return result;
                    pushFollow(FOLLOW_factor_in_factor875);
                    t=factor();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new MyCrossMul(t); 
                    }

                    }
                    break;
                case 5 :
                    // setl_language.g:101:4: '#' u= factor
                    {
                    match(input,39,FOLLOW_39_in_factor882); if (state.failed) return result;
                    pushFollow(FOLLOW_factor_in_factor888);
                    u=factor();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new Count(u); 
                    }

                    }
                    break;
                case 6 :
                    // setl_language.g:102:4: 'arb' x= factor
                    {
                    match(input,40,FOLLOW_40_in_factor895); if (state.failed) return result;
                    pushFollow(FOLLOW_factor_in_factor901);
                    x=factor();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new Arb(x); 
                    }

                    }
                    break;
                case 7 :
                    // setl_language.g:103:4: 'pow' ps= factor
                    {
                    match(input,41,FOLLOW_41_in_factor908); if (state.failed) return result;
                    pushFollow(FOLLOW_factor_in_factor914);
                    ps=factor();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new PowSet(ps);
                    }

                    }
                    break;
                case 8 :
                    // setl_language.g:104:7: w= setOrList
                    {
                    pushFollow(FOLLOW_setOrList_in_factor928);
                    w=setOrList();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = w; 
                    }

                    }
                    break;
                case 9 :
                    // setl_language.g:105:4: m= BOOLEAN
                    {
                    m=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_factor939); if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new MyBooleanWrapper((m!=null?m.getText():null)); 
                    }

                    }
                    break;
                case 10 :
                    // setl_language.g:106:7: y= STRING
                    {
                    y=(Token)match(input,STRING,FOLLOW_STRING_in_factor953); if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new MyStringWrapper((y!=null?y.getText():null)); 
                    }

                    }
                    break;
                case 11 :
                    // setl_language.g:107:7: n= NUMBER
                    {
                    n=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_factor967); if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new MyNumberWrapper((n!=null?n.getText():null)); 
                    }

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
        return result;
    }
    // $ANTLR end "factor"


    // $ANTLR start "paramList"
    // setl_language.g:110:1: paramList returns [List<Expr> params] : (e= expr ( ',' f= expr )* ) ;
    public final List<Expr> paramList() throws RecognitionException {
        List<Expr> params = null;

        Expr e = null;

        Expr f = null;



            List<Expr> result = new ArrayList<Expr>();

        try {
            // setl_language.g:114:5: ( (e= expr ( ',' f= expr )* ) )
            // setl_language.g:115:5: (e= expr ( ',' f= expr )* )
            {
            // setl_language.g:115:5: (e= expr ( ',' f= expr )* )
            // setl_language.g:115:7: e= expr ( ',' f= expr )*
            {
            pushFollow(FOLLOW_expr_in_paramList1004);
            e=expr();

            state._fsp--;
            if (state.failed) return params;
            if ( state.backtracking==0 ) {
               result.add(e); 
            }
            // setl_language.g:116:4: ( ',' f= expr )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==17) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // setl_language.g:116:5: ',' f= expr
            	    {
            	    match(input,17,FOLLOW_17_in_paramList1012); if (state.failed) return params;
            	    pushFollow(FOLLOW_expr_in_paramList1018);
            	    f=expr();

            	    state._fsp--;
            	    if (state.failed) return params;
            	    if ( state.backtracking==0 ) {
            	       result.add(f); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               params = result; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return params;
    }
    // $ANTLR end "paramList"


    // $ANTLR start "setOrList"
    // setl_language.g:120:1: setOrList returns [Expr result] : ( '[' (s= sExpr )? ']' | '{' (t= sExpr )? '}' );
    public final Expr setOrList() throws RecognitionException {
        Expr result = null;

        SExpr s = null;

        SExpr t = null;


        try {
            // setl_language.g:121:5: ( '[' (s= sExpr )? ']' | '{' (t= sExpr )? '}' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            else if ( (LA23_0==42) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // setl_language.g:122:5: '[' (s= sExpr )? ']'
                    {
                    match(input,35,FOLLOW_35_in_setOrList1055); if (state.failed) return result;
                    // setl_language.g:122:9: (s= sExpr )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=VAR && LA21_0<=NUMBER)||LA21_0==16||LA21_0==35||(LA21_0>=37 && LA21_0<=42)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // setl_language.g:122:10: s= sExpr
                            {
                            pushFollow(FOLLOW_sExpr_in_setOrList1062);
                            s=sExpr();

                            state._fsp--;
                            if (state.failed) return result;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       result =  new MyListWrapper(s); 
                    }
                    match(input,36,FOLLOW_36_in_setOrList1068); if (state.failed) return result;

                    }
                    break;
                case 2 :
                    // setl_language.g:123:7: '{' (t= sExpr )? '}'
                    {
                    match(input,42,FOLLOW_42_in_setOrList1076); if (state.failed) return result;
                    // setl_language.g:123:11: (t= sExpr )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=VAR && LA22_0<=NUMBER)||LA22_0==16||LA22_0==35||(LA22_0>=37 && LA22_0<=42)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // setl_language.g:123:12: t= sExpr
                            {
                            pushFollow(FOLLOW_sExpr_in_setOrList1083);
                            t=sExpr();

                            state._fsp--;
                            if (state.failed) return result;

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       result =  new MySetWrapper(t); 
                    }
                    match(input,43,FOLLOW_43_in_setOrList1089); if (state.failed) return result;

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
        return result;
    }
    // $ANTLR end "setOrList"


    // $ANTLR start "sExpr"
    // setl_language.g:126:1: sExpr returns [SExpr result] : (e= expr ( '..' f= expr | ( ',' g= expr )* | ':' h= iterator ( ',' i= iterator )* ( '|' j= boolExpr )? ) | k= iterator ( '|' b= boolExpr )? );
    public final SExpr sExpr() throws RecognitionException {
        SExpr result = null;

        Expr e = null;

        Expr f = null;

        Expr g = null;

        MyIterator h = null;

        MyIterator i = null;

        BoolExpr j = null;

        MyIterator k = null;

        BoolExpr b = null;



            ArrayList<Expr> exprList = new ArrayList<Expr>();
        	ArrayList<MyIterator> iteratorList = new ArrayList<MyIterator>();

        try {
            // setl_language.g:131:5: (e= expr ( '..' f= expr | ( ',' g= expr )* | ':' h= iterator ( ',' i= iterator )* ( '|' j= boolExpr )? ) | k= iterator ( '|' b= boolExpr )? )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=BOOLEAN && LA29_0<=NUMBER)||LA29_0==16||LA29_0==35||(LA29_0>=37 && LA29_0<=42)) ) {
                alt29=1;
            }
            else if ( (LA29_0==VAR) ) {
                int LA29_2 = input.LA(2);

                if ( (LA29_2==26) ) {
                    alt29=2;
                }
                else if ( ((LA29_2>=16 && LA29_2<=17)||(LA29_2>=29 && LA29_2<=36)||(LA29_2>=43 && LA29_2<=45)) ) {
                    alt29=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // setl_language.g:132:6: e= expr ( '..' f= expr | ( ',' g= expr )* | ':' h= iterator ( ',' i= iterator )* ( '|' j= boolExpr )? )
                    {
                    pushFollow(FOLLOW_expr_in_sExpr1125);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;
                    // setl_language.g:132:15: ( '..' f= expr | ( ',' g= expr )* | ':' h= iterator ( ',' i= iterator )* ( '|' j= boolExpr )? )
                    int alt27=3;
                    switch ( input.LA(1) ) {
                    case 44:
                        {
                        alt27=1;
                        }
                        break;
                    case 17:
                    case 36:
                    case 43:
                        {
                        alt27=2;
                        }
                        break;
                    case 45:
                        {
                        alt27=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }

                    switch (alt27) {
                        case 1 :
                            // setl_language.g:132:17: '..' f= expr
                            {
                            match(input,44,FOLLOW_44_in_sExpr1129); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_sExpr1135);
                            f=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new Range(e, f); 
                            }

                            }
                            break;
                        case 2 :
                            // setl_language.g:133:8: ( ',' g= expr )*
                            {
                            if ( state.backtracking==0 ) {
                               exprList.add(e); 
                            }
                            // setl_language.g:133:37: ( ',' g= expr )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==17) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // setl_language.g:133:38: ',' g= expr
                            	    {
                            	    match(input,17,FOLLOW_17_in_sExpr1149); if (state.failed) return result;
                            	    pushFollow(FOLLOW_expr_in_sExpr1155);
                            	    g=expr();

                            	    state._fsp--;
                            	    if (state.failed) return result;
                            	    if ( state.backtracking==0 ) {
                            	      exprList.add(g);
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);

                            if ( state.backtracking==0 ) {
                               result = new ExprList(exprList); 
                            }

                            }
                            break;
                        case 3 :
                            // setl_language.g:135:5: ':' h= iterator ( ',' i= iterator )* ( '|' j= boolExpr )?
                            {
                            match(input,45,FOLLOW_45_in_sExpr1174); if (state.failed) return result;
                            pushFollow(FOLLOW_iterator_in_sExpr1180);
                            h=iterator();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               iteratorList.add(h); 
                            }
                            // setl_language.g:135:55: ( ',' i= iterator )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==17) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // setl_language.g:135:56: ',' i= iterator
                            	    {
                            	    match(input,17,FOLLOW_17_in_sExpr1185); if (state.failed) return result;
                            	    pushFollow(FOLLOW_iterator_in_sExpr1191);
                            	    i=iterator();

                            	    state._fsp--;
                            	    if (state.failed) return result;
                            	    if ( state.backtracking==0 ) {
                            	       iteratorList.add(i); 
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);

                            // setl_language.g:135:108: ( '|' j= boolExpr )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==46) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // setl_language.g:135:109: '|' j= boolExpr
                                    {
                                    match(input,46,FOLLOW_46_in_sExpr1198); if (state.failed) return result;
                                    pushFollow(FOLLOW_boolExpr_in_sExpr1204);
                                    j=boolExpr();

                                    state._fsp--;
                                    if (state.failed) return result;

                                    }
                                    break;

                            }

                            if ( state.backtracking==0 ) {
                               result = new IteratorList(e, iteratorList, j); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // setl_language.g:138:7: k= iterator ( '|' b= boolExpr )?
                    {
                    pushFollow(FOLLOW_iterator_in_sExpr1229);
                    k=iterator();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       iteratorList.add(k); 
                    }
                    if ( state.backtracking==0 ) {
                       result = new IteratorAndBool(iteratorList, null); 
                    }
                    // setl_language.g:140:3: ( '|' b= boolExpr )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==46) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // setl_language.g:140:4: '|' b= boolExpr
                            {
                            match(input,46,FOLLOW_46_in_sExpr1242); if (state.failed) return result;
                            pushFollow(FOLLOW_boolExpr_in_sExpr1248);
                            b=boolExpr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new IteratorAndBool(iteratorList, b); 
                            }

                            }
                            break;

                    }


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
        return result;
    }
    // $ANTLR end "sExpr"


    // $ANTLR start "iterator"
    // setl_language.g:143:1: iterator returns [MyIterator result] : v= VAR 'in' e= expr ;
    public final MyIterator iterator() throws RecognitionException {
        MyIterator result = null;

        Token v=null;
        Expr e = null;


        try {
            // setl_language.g:144:5: (v= VAR 'in' e= expr )
            // setl_language.g:145:5: v= VAR 'in' e= expr
            {
            v=(Token)match(input,VAR,FOLLOW_VAR_in_iterator1281); if (state.failed) return result;
            match(input,26,FOLLOW_26_in_iterator1283); if (state.failed) return result;
            pushFollow(FOLLOW_expr_in_iterator1289);
            e=expr();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               result = new MyIterator((v!=null?v.getText():null), e); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "iterator"


    // $ANTLR start "boolExpr"
    // setl_language.g:148:1: boolExpr returns [BoolExpr result] : c= conjunction ( 'or' d= conjunction )* ;
    public final BoolExpr boolExpr() throws RecognitionException {
        BoolExpr result = null;

        BoolExpr c = null;

        BoolExpr d = null;



            ArrayList<BoolExpr> bExprList = new ArrayList<BoolExpr>();

        try {
            // setl_language.g:152:5: (c= conjunction ( 'or' d= conjunction )* )
            // setl_language.g:153:2: c= conjunction ( 'or' d= conjunction )*
            {
            pushFollow(FOLLOW_conjunction_in_boolExpr1323);
            c=conjunction();

            state._fsp--;
            if (state.failed) return result;
            // setl_language.g:153:18: ( 'or' d= conjunction )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // setl_language.g:153:19: 'or' d= conjunction
            	    {
            	    match(input,47,FOLLOW_47_in_boolExpr1326); if (state.failed) return result;
            	    pushFollow(FOLLOW_conjunction_in_boolExpr1332);
            	    d=conjunction();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       bExprList.add(d); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               result = new Disjunction(c, bExprList); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "boolExpr"


    // $ANTLR start "conjunction"
    // setl_language.g:157:1: conjunction returns [BoolExpr result] : l= literal ( 'and' k= literal )* ;
    public final BoolExpr conjunction() throws RecognitionException {
        BoolExpr result = null;

        BoolExpr l = null;

        BoolExpr k = null;



            ArrayList<BoolExpr> boolList = new ArrayList<BoolExpr>();

        try {
            // setl_language.g:161:5: (l= literal ( 'and' k= literal )* )
            // setl_language.g:162:5: l= literal ( 'and' k= literal )*
            {
            pushFollow(FOLLOW_literal_in_conjunction1376);
            l=literal();

            state._fsp--;
            if (state.failed) return result;
            if ( state.backtracking==0 ) {
               boolList.add(l); 
            }
            // setl_language.g:163:4: ( 'and' k= literal )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==48) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // setl_language.g:163:5: 'and' k= literal
            	    {
            	    match(input,48,FOLLOW_48_in_conjunction1385); if (state.failed) return result;
            	    pushFollow(FOLLOW_literal_in_conjunction1391);
            	    k=literal();

            	    state._fsp--;
            	    if (state.failed) return result;
            	    if ( state.backtracking==0 ) {
            	       boolList.add(k); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               result = new Conjunction(l, boolList); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return result;
    }
    // $ANTLR end "conjunction"


    // $ANTLR start "literal"
    // setl_language.g:167:1: literal returns [BoolExpr result] : ( 'not' b= boolFactor | b= boolFactor );
    public final BoolExpr literal() throws RecognitionException {
        BoolExpr result = null;

        BoolExpr b = null;


        try {
            // setl_language.g:168:5: ( 'not' b= boolFactor | b= boolFactor )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=VAR && LA32_0<=NUMBER)||LA32_0==16||LA32_0==35||(LA32_0>=37 && LA32_0<=42)) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // setl_language.g:169:5: 'not' b= boolFactor
                    {
                    match(input,49,FOLLOW_49_in_literal1427); if (state.failed) return result;
                    pushFollow(FOLLOW_boolFactor_in_literal1433);
                    b=boolFactor();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = new Negation(b); 
                    }

                    }
                    break;
                case 2 :
                    // setl_language.g:170:7: b= boolFactor
                    {
                    pushFollow(FOLLOW_boolFactor_in_literal1447);
                    b=boolFactor();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = b; 
                    }

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
        return result;
    }
    // $ANTLR end "literal"


    // $ANTLR start "boolFactor"
    // setl_language.g:173:1: boolFactor returns [BoolExpr result] : ( ( '(' boolExpr ')' )=> '(' b= boolExpr ')' | e= expr ( '==' f= expr | '!=' g= expr | '<=' h= expr | '>=' i= expr | '<' j= expr | '>' k= expr | 'in' l= expr ) );
    public final BoolExpr boolFactor() throws RecognitionException {
        BoolExpr result = null;

        BoolExpr b = null;

        Expr e = null;

        Expr f = null;

        Expr g = null;

        Expr h = null;

        Expr i = null;

        Expr j = null;

        Expr k = null;

        Expr l = null;


        try {
            // setl_language.g:174:5: ( ( '(' boolExpr ')' )=> '(' b= boolExpr ')' | e= expr ( '==' f= expr | '!=' g= expr | '<=' h= expr | '>=' i= expr | '<' j= expr | '>' k= expr | 'in' l= expr ) )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // setl_language.g:175:5: ( '(' boolExpr ')' )=> '(' b= boolExpr ')'
                    {
                    match(input,16,FOLLOW_16_in_boolFactor1486); if (state.failed) return result;
                    pushFollow(FOLLOW_boolExpr_in_boolFactor1492);
                    b=boolExpr();

                    state._fsp--;
                    if (state.failed) return result;
                    if ( state.backtracking==0 ) {
                       result = b; 
                    }
                    match(input,18,FOLLOW_18_in_boolFactor1496); if (state.failed) return result;

                    }
                    break;
                case 2 :
                    // setl_language.g:176:7: e= expr ( '==' f= expr | '!=' g= expr | '<=' h= expr | '>=' i= expr | '<' j= expr | '>' k= expr | 'in' l= expr )
                    {
                    pushFollow(FOLLOW_expr_in_boolFactor1508);
                    e=expr();

                    state._fsp--;
                    if (state.failed) return result;
                    // setl_language.g:176:16: ( '==' f= expr | '!=' g= expr | '<=' h= expr | '>=' i= expr | '<' j= expr | '>' k= expr | 'in' l= expr )
                    int alt33=7;
                    switch ( input.LA(1) ) {
                    case 50:
                        {
                        alt33=1;
                        }
                        break;
                    case 51:
                        {
                        alt33=2;
                        }
                        break;
                    case 52:
                        {
                        alt33=3;
                        }
                        break;
                    case 53:
                        {
                        alt33=4;
                        }
                        break;
                    case 54:
                        {
                        alt33=5;
                        }
                        break;
                    case 55:
                        {
                        alt33=6;
                        }
                        break;
                    case 26:
                        {
                        alt33=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }

                    switch (alt33) {
                        case 1 :
                            // setl_language.g:176:18: '==' f= expr
                            {
                            match(input,50,FOLLOW_50_in_boolFactor1512); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_boolFactor1518);
                            f=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new Equal( e, f); 
                            }

                            }
                            break;
                        case 2 :
                            // setl_language.g:177:7: '!=' g= expr
                            {
                            match(input,51,FOLLOW_51_in_boolFactor1528); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_boolFactor1534);
                            g=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new NotEqual(      e, g); 
                            }

                            }
                            break;
                        case 3 :
                            // setl_language.g:178:7: '<=' h= expr
                            {
                            match(input,52,FOLLOW_52_in_boolFactor1544); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_boolFactor1550);
                            h=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new LessOrEqual(   e, h); 
                            }

                            }
                            break;
                        case 4 :
                            // setl_language.g:179:7: '>=' i= expr
                            {
                            match(input,53,FOLLOW_53_in_boolFactor1560); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_boolFactor1566);
                            i=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new GreaterOrEqual(e, i); 
                            }

                            }
                            break;
                        case 5 :
                            // setl_language.g:180:7: '<' j= expr
                            {
                            match(input,54,FOLLOW_54_in_boolFactor1576); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_boolFactor1582);
                            j=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new LessThan(      e, j); 
                            }

                            }
                            break;
                        case 6 :
                            // setl_language.g:181:7: '>' k= expr
                            {
                            match(input,55,FOLLOW_55_in_boolFactor1593); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_boolFactor1599);
                            k=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new GreaterThan(   e, k); 
                            }

                            }
                            break;
                        case 7 :
                            // setl_language.g:182:7: 'in' l= expr
                            {
                            match(input,26,FOLLOW_26_in_boolFactor1610); if (state.failed) return result;
                            pushFollow(FOLLOW_expr_in_boolFactor1616);
                            l=expr();

                            state._fsp--;
                            if (state.failed) return result;
                            if ( state.backtracking==0 ) {
                               result = new InSet(    l, e); 
                            }

                            }
                            break;

                    }


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
        return result;
    }
    // $ANTLR end "boolFactor"

    // $ANTLR start synpred1_setl_language
    public final void synpred1_setl_language_fragment() throws RecognitionException {   
        // setl_language.g:175:5: ( '(' boolExpr ')' )
        // setl_language.g:175:6: '(' boolExpr ')'
        {
        match(input,16,FOLLOW_16_in_synpred1_setl_language1477); if (state.failed) return ;
        pushFollow(FOLLOW_boolExpr_in_synpred1_setl_language1479);
        boolExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,18,FOLLOW_18_in_synpred1_setl_language1481); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_setl_language

    // Delegated rules

    public final boolean synpred1_setl_language() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_setl_language_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA34_eotS =
        "\16\uffff";
    static final String DFA34_eofS =
        "\16\uffff";
    static final String DFA34_minS =
        "\1\4\1\0\14\uffff";
    static final String DFA34_maxS =
        "\1\52\1\0\14\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\14\uffff}>";
    static final String[] DFA34_transitionS = {
            "\4\2\10\uffff\1\1\22\uffff\1\2\1\uffff\6\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "173:1: boolFactor returns [BoolExpr result] : ( ( '(' boolExpr ')' )=> '(' b= boolExpr ')' | e= expr ( '==' f= expr | '!=' g= expr | '<=' h= expr | '>=' i= expr | '<' j= expr | '>' k= expr | 'in' l= expr ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_setl_language()) ) {s = 13;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_statement_in_program36 = new BitSet(new long[]{0x000007E81A8980F2L});
    public static final BitSet FOLLOW_procedure_in_program47 = new BitSet(new long[]{0x000007E81A8980F2L});
    public static final BitSet FOLLOW_VAR_in_statement90 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_11_in_statement93 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_statement99 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_12_in_statement111 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_statement117 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13_in_statement126 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_statement132 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_statement149 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_statement151 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_statement158 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_statement172 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_statement178 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_statement184 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_statement198 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_boolExpr_in_statement205 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_statement207 = new BitSet(new long[]{0x000007E80AE980F0L});
    public static final BitSet FOLLOW_statement_in_statement214 = new BitSet(new long[]{0x000007E80AE980F0L});
    public static final BitSet FOLLOW_21_in_statement227 = new BitSet(new long[]{0x000007E80AC980F0L});
    public static final BitSet FOLLOW_statement_in_statement234 = new BitSet(new long[]{0x000007E80AC980F0L});
    public static final BitSet FOLLOW_22_in_statement245 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_statement247 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_statement261 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_boolExpr_in_statement267 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement269 = new BitSet(new long[]{0x000007E80AC980F0L});
    public static final BitSet FOLLOW_statement_in_statement282 = new BitSet(new long[]{0x000007E80AC980F0L});
    public static final BitSet FOLLOW_22_in_statement293 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement295 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_statement309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_statement315 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement317 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_statement323 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement325 = new BitSet(new long[]{0x000007E80AC980F0L});
    public static final BitSet FOLLOW_statement_in_statement338 = new BitSet(new long[]{0x000007E80AC980F0L});
    public static final BitSet FOLLOW_22_in_statement350 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_statement352 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_statement366 = new BitSet(new long[]{0x000007E80A89C0F0L});
    public static final BitSet FOLLOW_expr_in_statement372 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement393 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_statement395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_procedure432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_procedure438 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_procedure440 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_VAR_in_procedure448 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_procedure460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_procedure466 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_procedure474 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_procedure476 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_statement_in_procedure488 = new BitSet(new long[]{0x000007E80AC980F0L});
    public static final BitSet FOLLOW_22_in_procedure494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_procedure500 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_procedure502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_expr539 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_expr548 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_product_in_expr554 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_30_in_expr563 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_product_in_expr569 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_power_in_product609 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_31_in_product618 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_power_in_product624 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_32_in_product633 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_power_in_product639 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_33_in_product648 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_power_in_product654 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_factor_in_power700 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_power710 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_power_in_power716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_factor757 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_factor763 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_factor765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor779 = new BitSet(new long[]{0x0000000800010002L});
    public static final BitSet FOLLOW_16_in_factor790 = new BitSet(new long[]{0x000007E80A8D80F0L});
    public static final BitSet FOLLOW_paramList_in_factor797 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_factor803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_factor826 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_factor832 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_factor834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_factor856 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_factor_in_factor862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_factor869 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_factor_in_factor875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_factor882 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_factor_in_factor888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_factor895 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_factor_in_factor901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_factor908 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_factor_in_factor914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setOrList_in_factor928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_factor939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_paramList1004 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_paramList1012 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_paramList1018 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_35_in_setOrList1055 = new BitSet(new long[]{0x000007F80A8980F0L});
    public static final BitSet FOLLOW_sExpr_in_setOrList1062 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_setOrList1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_setOrList1076 = new BitSet(new long[]{0x00000FE80A8980F0L});
    public static final BitSet FOLLOW_sExpr_in_setOrList1083 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_setOrList1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_sExpr1125 = new BitSet(new long[]{0x0000300000020002L});
    public static final BitSet FOLLOW_44_in_sExpr1129 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_sExpr1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_sExpr1149 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_sExpr1155 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_45_in_sExpr1174 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_iterator_in_sExpr1180 = new BitSet(new long[]{0x0000400000020002L});
    public static final BitSet FOLLOW_17_in_sExpr1185 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_iterator_in_sExpr1191 = new BitSet(new long[]{0x0000400000020002L});
    public static final BitSet FOLLOW_46_in_sExpr1198 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_boolExpr_in_sExpr1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterator_in_sExpr1229 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_sExpr1242 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_boolExpr_in_sExpr1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_iterator1281 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_iterator1283 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_iterator1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_boolExpr1323 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_boolExpr1326 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_conjunction_in_boolExpr1332 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_literal_in_conjunction1376 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_conjunction1385 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_literal_in_conjunction1391 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_49_in_literal1427 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_boolFactor_in_literal1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolFactor_in_literal1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_boolFactor1486 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_boolExpr_in_boolFactor1492 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_boolFactor1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_boolFactor1508 = new BitSet(new long[]{0x00FC000004000000L});
    public static final BitSet FOLLOW_50_in_boolFactor1512 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_boolFactor1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_boolFactor1528 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_boolFactor1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_boolFactor1544 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_boolFactor1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_boolFactor1560 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_boolFactor1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_boolFactor1576 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_boolFactor1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_boolFactor1593 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_boolFactor1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_boolFactor1610 = new BitSet(new long[]{0x000007E80A8980F0L});
    public static final BitSet FOLLOW_expr_in_boolFactor1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred1_setl_language1477 = new BitSet(new long[]{0x000207E80A8980F0L});
    public static final BitSet FOLLOW_boolExpr_in_synpred1_setl_language1479 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_synpred1_setl_language1481 = new BitSet(new long[]{0x0000000000000002L});

}