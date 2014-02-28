// $ANTLR 3.0 simpleLanguage.g 2009-03-19 17:39:47

    import output.*;
    import java.util.List;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class simpleLanguageParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "NUMBER", "WS", "COMMENT", "'='", "';'", "'++;'", "'print'", "'('", "')'", "'if'", "'{'", "'}'", "'while'", "'for'", "'||'", "'&&'", "'!'", "'=='", "'<'", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int VAR=4;
    public static final int EOF=-1;
    public static final int NUMBER=5;
    public static final int WS=6;
    public static final int COMMENT=7;

        public simpleLanguageParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[11+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "simpleLanguage.g"; }



    // $ANTLR start simpleLanguage
    // simpleLanguage.g:9:1: simpleLanguage returns [List<Statement> program] : (s= statement )+ ;
    public final List<Statement> simpleLanguage() throws RecognitionException {
        List<Statement> program = null;

        Statement s = null;


        try {
            // simpleLanguage.g:10:7: ( (s= statement )+ )
            // simpleLanguage.g:10:7: (s= statement )+
            {
            if ( backtracking==0 ) {
               program = new ArrayList<Statement>(); 
            }
            // simpleLanguage.g:11:7: (s= statement )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==VAR||LA1_0==11||LA1_0==14||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // simpleLanguage.g:11:8: s= statement
            	    {
            	    pushFollow(FOLLOW_statement_in_simpleLanguage37);
            	    s=statement();
            	    _fsp--;
            	    if (failed) return program;
            	    if ( backtracking==0 ) {
            	       program.add(s); 
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (backtracking>0) {failed=true; return program;}
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
        return program;
    }
    // $ANTLR end simpleLanguage


    // $ANTLR start statement
    // simpleLanguage.g:19:1: statement returns [Statement stmnt] : (v= VAR ( '=' e= expr ';' | '++;' ) | 'print' '(' r= expr ')' ';' | 'if' '(' b= boolExpr ')' '{' (l= statement )* '}' | 'while' '(' b= boolExpr ')' '{' (l= statement )* '}' | 'for' '(' init= statement ';' b= boolExpr ';' (loop= statement )* ')' '{' (l= statement )* '}' );
    public final Statement statement() throws RecognitionException {
        Statement stmnt = null;

        Token v=null;
        Expr e = null;

        Expr r = null;

        BoolExpr b = null;

        Statement l = null;

        Statement init = null;

        Statement loop = null;


        try {
            // simpleLanguage.g:20:7: (v= VAR ( '=' e= expr ';' | '++;' ) | 'print' '(' r= expr ')' ';' | 'if' '(' b= boolExpr ')' '{' (l= statement )* '}' | 'while' '(' b= boolExpr ')' '{' (l= statement )* '}' | 'for' '(' init= statement ';' b= boolExpr ';' (loop= statement )* ')' '{' (l= statement )* '}' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt7=1;
                }
                break;
            case 11:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return stmnt;}
                NoViableAltException nvae =
                    new NoViableAltException("19:1: statement returns [Statement stmnt] : (v= VAR ( '=' e= expr ';' | '++;' ) | 'print' '(' r= expr ')' ';' | 'if' '(' b= boolExpr ')' '{' (l= statement )* '}' | 'while' '(' b= boolExpr ')' '{' (l= statement )* '}' | 'for' '(' init= statement ';' b= boolExpr ';' (loop= statement )* ')' '{' (l= statement )* '}' );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // simpleLanguage.g:20:7: v= VAR ( '=' e= expr ';' | '++;' )
                    {
                    v=(Token)input.LT(1);
                    match(input,VAR,FOLLOW_VAR_in_statement71); if (failed) return stmnt;
                    // simpleLanguage.g:21:7: ( '=' e= expr ';' | '++;' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==8) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==10) ) {
                        alt2=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return stmnt;}
                        NoViableAltException nvae =
                            new NoViableAltException("21:7: ( '=' e= expr ';' | '++;' )", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // simpleLanguage.g:21:8: '=' e= expr ';'
                            {
                            match(input,8,FOLLOW_8_in_statement81); if (failed) return stmnt;
                            pushFollow(FOLLOW_expr_in_statement87);
                            e=expr();
                            _fsp--;
                            if (failed) return stmnt;
                            match(input,9,FOLLOW_9_in_statement89); if (failed) return stmnt;
                            if ( backtracking==0 ) {
                               stmnt = new Assignment(new Variable(v.getText()), e); 
                            }

                            }
                            break;
                        case 2 :
                            // simpleLanguage.g:23:10: '++;'
                            {
                            match(input,10,FOLLOW_10_in_statement115); if (failed) return stmnt;
                            if ( backtracking==0 ) {
                               stmnt = new Increment(new Variable(v.getText())); 
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // simpleLanguage.g:25:7: 'print' '(' r= expr ')' ';'
                    {
                    match(input,11,FOLLOW_11_in_statement139); if (failed) return stmnt;
                    match(input,12,FOLLOW_12_in_statement141); if (failed) return stmnt;
                    pushFollow(FOLLOW_expr_in_statement147);
                    r=expr();
                    _fsp--;
                    if (failed) return stmnt;
                    match(input,13,FOLLOW_13_in_statement149); if (failed) return stmnt;
                    match(input,9,FOLLOW_9_in_statement151); if (failed) return stmnt;
                    if ( backtracking==0 ) {
                       stmnt = new Print(r); 
                    }

                    }
                    break;
                case 3 :
                    // simpleLanguage.g:27:7: 'if' '(' b= boolExpr ')' '{' (l= statement )* '}'
                    {
                    if ( backtracking==0 ) {
                       List<Statement> stmnts = new ArrayList<Statement>(); 
                    }
                    match(input,14,FOLLOW_14_in_statement176); if (failed) return stmnt;
                    match(input,12,FOLLOW_12_in_statement178); if (failed) return stmnt;
                    pushFollow(FOLLOW_boolExpr_in_statement184);
                    b=boolExpr();
                    _fsp--;
                    if (failed) return stmnt;
                    match(input,13,FOLLOW_13_in_statement186); if (failed) return stmnt;
                    match(input,15,FOLLOW_15_in_statement188); if (failed) return stmnt;
                    // simpleLanguage.g:29:7: (l= statement )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==VAR||LA3_0==11||LA3_0==14||(LA3_0>=17 && LA3_0<=18)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // simpleLanguage.g:29:8: l= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement202);
                    	    l=statement();
                    	    _fsp--;
                    	    if (failed) return stmnt;
                    	    if ( backtracking==0 ) {
                    	       stmnts.add(l); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_statement208); if (failed) return stmnt;
                    if ( backtracking==0 ) {
                       stmnt = new IfThen(b, stmnts); 
                    }

                    }
                    break;
                case 4 :
                    // simpleLanguage.g:31:7: 'while' '(' b= boolExpr ')' '{' (l= statement )* '}'
                    {
                    if ( backtracking==0 ) {
                       List<Statement> stmnts = new ArrayList<Statement>(); 
                    }
                    match(input,17,FOLLOW_17_in_statement233); if (failed) return stmnt;
                    match(input,12,FOLLOW_12_in_statement235); if (failed) return stmnt;
                    pushFollow(FOLLOW_boolExpr_in_statement241);
                    b=boolExpr();
                    _fsp--;
                    if (failed) return stmnt;
                    match(input,13,FOLLOW_13_in_statement243); if (failed) return stmnt;
                    match(input,15,FOLLOW_15_in_statement245); if (failed) return stmnt;
                    // simpleLanguage.g:33:7: (l= statement )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==VAR||LA4_0==11||LA4_0==14||(LA4_0>=17 && LA4_0<=18)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // simpleLanguage.g:33:8: l= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement259);
                    	    l=statement();
                    	    _fsp--;
                    	    if (failed) return stmnt;
                    	    if ( backtracking==0 ) {
                    	       stmnts.add(l); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_statement265); if (failed) return stmnt;
                    if ( backtracking==0 ) {
                       stmnt = new While(b, stmnts); 
                    }

                    }
                    break;
                case 5 :
                    // simpleLanguage.g:35:6: 'for' '(' init= statement ';' b= boolExpr ';' (loop= statement )* ')' '{' (l= statement )* '}'
                    {
                    if ( backtracking==0 ) {
                       List<Statement> stmnts = new ArrayList<Statement>(); 
                             List<Statement> loopstmnts = new ArrayList<Statement>(); 						
                    }
                    match(input,18,FOLLOW_18_in_statement289); if (failed) return stmnt;
                    match(input,12,FOLLOW_12_in_statement291); if (failed) return stmnt;
                    pushFollow(FOLLOW_statement_in_statement297);
                    init=statement();
                    _fsp--;
                    if (failed) return stmnt;
                    match(input,9,FOLLOW_9_in_statement299); if (failed) return stmnt;
                    pushFollow(FOLLOW_boolExpr_in_statement306);
                    b=boolExpr();
                    _fsp--;
                    if (failed) return stmnt;
                    match(input,9,FOLLOW_9_in_statement308); if (failed) return stmnt;
                    // simpleLanguage.g:37:56: (loop= statement )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==VAR||LA5_0==11||LA5_0==14||(LA5_0>=17 && LA5_0<=18)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // simpleLanguage.g:37:57: loop= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement315);
                    	    loop=statement();
                    	    _fsp--;
                    	    if (failed) return stmnt;
                    	    if ( backtracking==0 ) {
                    	       loopstmnts.add(loop); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match(input,13,FOLLOW_13_in_statement321); if (failed) return stmnt;
                    match(input,15,FOLLOW_15_in_statement323); if (failed) return stmnt;
                    // simpleLanguage.g:38:7: (l= statement )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==VAR||LA6_0==11||LA6_0==14||(LA6_0>=17 && LA6_0<=18)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // simpleLanguage.g:38:8: l= statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement337);
                    	    l=statement();
                    	    _fsp--;
                    	    if (failed) return stmnt;
                    	    if ( backtracking==0 ) {
                    	       stmnts.add(l); 
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,16,FOLLOW_16_in_statement343); if (failed) return stmnt;
                    if ( backtracking==0 ) {
                       stmnt = new ForLoop(init, b,  loopstmnts, stmnts); 
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
    // $ANTLR end statement


    // $ANTLR start boolExpr
    // simpleLanguage.g:46:1: boolExpr returns [BoolExpr result] : r= conj ( ( '||' q= conj ) )* ;
    public final BoolExpr boolExpr() throws RecognitionException {
        BoolExpr result = null;

        BoolExpr r = null;

        BoolExpr q = null;


        try {
            // simpleLanguage.g:47:7: (r= conj ( ( '||' q= conj ) )* )
            // simpleLanguage.g:47:7: r= conj ( ( '||' q= conj ) )*
            {
            pushFollow(FOLLOW_conj_in_boolExpr380);
            r=conj();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
               result = r; 
            }
            // simpleLanguage.g:48:5: ( ( '||' q= conj ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // simpleLanguage.g:48:9: ( '||' q= conj )
            	    {
            	    // simpleLanguage.g:48:9: ( '||' q= conj )
            	    // simpleLanguage.g:48:10: '||' q= conj
            	    {
            	    match(input,19,FOLLOW_19_in_boolExpr393); if (failed) return result;
            	    pushFollow(FOLLOW_conj_in_boolExpr399);
            	    q=conj();
            	    _fsp--;
            	    if (failed) return result;

            	    }

            	    if ( backtracking==0 ) {
            	       result = new Disjunction( result, q); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end boolExpr


    // $ANTLR start conj
    // simpleLanguage.g:56:1: conj returns [BoolExpr result] : r= neg ( ( '&&' q= neg ) )* ;
    public final BoolExpr conj() throws RecognitionException {
        BoolExpr result = null;

        BoolExpr r = null;

        BoolExpr q = null;


        try {
            // simpleLanguage.g:57:9: (r= neg ( ( '&&' q= neg ) )* )
            // simpleLanguage.g:57:9: r= neg ( ( '&&' q= neg ) )*
            {
            pushFollow(FOLLOW_neg_in_conj444);
            r=neg();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
               result = r; 
            }
            // simpleLanguage.g:58:7: ( ( '&&' q= neg ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // simpleLanguage.g:58:11: ( '&&' q= neg )
            	    {
            	    // simpleLanguage.g:58:11: ( '&&' q= neg )
            	    // simpleLanguage.g:58:12: '&&' q= neg
            	    {
            	    match(input,20,FOLLOW_20_in_conj459); if (failed) return result;
            	    pushFollow(FOLLOW_neg_in_conj465);
            	    q=neg();
            	    _fsp--;
            	    if (failed) return result;

            	    }

            	    if ( backtracking==0 ) {
            	       result = new Conjunction( result, q); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end conj


    // $ANTLR start neg
    // simpleLanguage.g:62:1: neg returns [BoolExpr result] options {backtrack=true; } : ( '!' n= neg | '(' b= boolExpr ')' | s= simpleboolExpr );
    public final BoolExpr neg() throws RecognitionException {
        BoolExpr result = null;

        BoolExpr n = null;

        BoolExpr b = null;

        BoolExpr s = null;


        try {
            // simpleLanguage.g:64:7: ( '!' n= neg | '(' b= boolExpr ')' | s= simpleboolExpr )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 12:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred2()) ) {
                    alt10=2;
                }
                else if ( (true) ) {
                    alt10=3;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("62:1: neg returns [BoolExpr result] options {backtrack=true; } : ( '!' n= neg | '(' b= boolExpr ')' | s= simpleboolExpr );", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case VAR:
            case NUMBER:
                {
                alt10=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("62:1: neg returns [BoolExpr result] options {backtrack=true; } : ( '!' n= neg | '(' b= boolExpr ')' | s= simpleboolExpr );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // simpleLanguage.g:64:7: '!' n= neg
                    {
                    match(input,21,FOLLOW_21_in_neg508); if (failed) return result;
                    pushFollow(FOLLOW_neg_in_neg515);
                    n=neg();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =new Neg(n);
                    }

                    }
                    break;
                case 2 :
                    // simpleLanguage.g:65:7: '(' b= boolExpr ')'
                    {
                    match(input,12,FOLLOW_12_in_neg525); if (failed) return result;
                    pushFollow(FOLLOW_boolExpr_in_neg531);
                    b=boolExpr();
                    _fsp--;
                    if (failed) return result;
                    match(input,13,FOLLOW_13_in_neg533); if (failed) return result;
                    if ( backtracking==0 ) {
                      result =b;
                    }

                    }
                    break;
                case 3 :
                    // simpleLanguage.g:66:7: s= simpleboolExpr
                    {
                    pushFollow(FOLLOW_simpleboolExpr_in_neg547);
                    s=simpleboolExpr();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =s;
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
    // $ANTLR end neg


    // $ANTLR start simpleboolExpr
    // simpleLanguage.g:72:1: simpleboolExpr returns [BoolExpr result] : l= expr ( '==' r= expr | '<' r= expr ) ;
    public final BoolExpr simpleboolExpr() throws RecognitionException {
        BoolExpr result = null;

        Expr l = null;

        Expr r = null;


        try {
            // simpleLanguage.g:73:7: (l= expr ( '==' r= expr | '<' r= expr ) )
            // simpleLanguage.g:73:7: l= expr ( '==' r= expr | '<' r= expr )
            {
            pushFollow(FOLLOW_expr_in_simpleboolExpr577);
            l=expr();
            _fsp--;
            if (failed) return result;
            // simpleLanguage.g:73:16: ( '==' r= expr | '<' r= expr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("73:16: ( '==' r= expr | '<' r= expr )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // simpleLanguage.g:73:18: '==' r= expr
                    {
                    match(input,22,FOLLOW_22_in_simpleboolExpr581); if (failed) return result;
                    pushFollow(FOLLOW_expr_in_simpleboolExpr587);
                    r=expr();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                       result = new Equal(   l, r); 
                    }

                    }
                    break;
                case 2 :
                    // simpleLanguage.g:74:18: '<' r= expr
                    {
                    match(input,23,FOLLOW_23_in_simpleboolExpr609); if (failed) return result;
                    pushFollow(FOLLOW_expr_in_simpleboolExpr616);
                    r=expr();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                       result = new LessThan(l, r); 
                    }

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
        return result;
    }
    // $ANTLR end simpleboolExpr


    // $ANTLR start expr
    // simpleLanguage.g:78:1: expr returns [Expr result] : p= product ( ( '+' q= product ) | ( '-' q= product ) )* ;
    public final Expr expr() throws RecognitionException {
        Expr result = null;

        Expr p = null;

        Expr q = null;


        try {
            // simpleLanguage.g:79:7: (p= product ( ( '+' q= product ) | ( '-' q= product ) )* )
            // simpleLanguage.g:79:7: p= product ( ( '+' q= product ) | ( '-' q= product ) )*
            {
            pushFollow(FOLLOW_product_in_expr660);
            p=product();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
               result = p; 
            }
            // simpleLanguage.g:80:7: ( ( '+' q= product ) | ( '-' q= product ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }
                else if ( (LA12_0==25) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // simpleLanguage.g:80:11: ( '+' q= product )
            	    {
            	    // simpleLanguage.g:80:11: ( '+' q= product )
            	    // simpleLanguage.g:80:12: '+' q= product
            	    {
            	    match(input,24,FOLLOW_24_in_expr675); if (failed) return result;
            	    pushFollow(FOLLOW_product_in_expr681);
            	    q=product();
            	    _fsp--;
            	    if (failed) return result;

            	    }

            	    if ( backtracking==0 ) {
            	       result = new Sum(       result, q); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // simpleLanguage.g:81:11: ( '-' q= product )
            	    {
            	    // simpleLanguage.g:81:11: ( '-' q= product )
            	    // simpleLanguage.g:81:12: '-' q= product
            	    {
            	    match(input,25,FOLLOW_25_in_expr697); if (failed) return result;
            	    pushFollow(FOLLOW_product_in_expr703);
            	    q=product();
            	    _fsp--;
            	    if (failed) return result;

            	    }

            	    if ( backtracking==0 ) {
            	       result = new Difference(result, q); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end expr


    // $ANTLR start product
    // simpleLanguage.g:85:1: product returns [Expr result] : f= factor ( ( '*' g= factor ) | ( '/' g= factor ) )* ;
    public final Expr product() throws RecognitionException {
        Expr result = null;

        Expr f = null;

        Expr g = null;


        try {
            // simpleLanguage.g:86:7: (f= factor ( ( '*' g= factor ) | ( '/' g= factor ) )* )
            // simpleLanguage.g:86:7: f= factor ( ( '*' g= factor ) | ( '/' g= factor ) )*
            {
            pushFollow(FOLLOW_factor_in_product740);
            f=factor();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
               result = f; 
            }
            // simpleLanguage.g:87:7: ( ( '*' g= factor ) | ( '/' g= factor ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }
                else if ( (LA13_0==27) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // simpleLanguage.g:88:11: ( '*' g= factor )
            	    {
            	    // simpleLanguage.g:88:11: ( '*' g= factor )
            	    // simpleLanguage.g:88:12: '*' g= factor
            	    {
            	    match(input,26,FOLLOW_26_in_product763); if (failed) return result;
            	    pushFollow(FOLLOW_factor_in_product769);
            	    g=factor();
            	    _fsp--;
            	    if (failed) return result;

            	    }

            	    if ( backtracking==0 ) {
            	       result = new Product( result, g); 
            	    }

            	    }
            	    break;
            	case 2 :
            	    // simpleLanguage.g:89:11: ( '/' g= factor )
            	    {
            	    // simpleLanguage.g:89:11: ( '/' g= factor )
            	    // simpleLanguage.g:89:12: '/' g= factor
            	    {
            	    match(input,27,FOLLOW_27_in_product785); if (failed) return result;
            	    pushFollow(FOLLOW_factor_in_product791);
            	    g=factor();
            	    _fsp--;
            	    if (failed) return result;

            	    }

            	    if ( backtracking==0 ) {
            	       result = new Quotient(result, g); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end product


    // $ANTLR start factor
    // simpleLanguage.g:93:1: factor returns [Expr result] : ( '(' expr ')' | v= VAR | n= NUMBER );
    public final Expr factor() throws RecognitionException {
        Expr result = null;

        Token v=null;
        Token n=null;
        Expr expr1 = null;


        try {
            // simpleLanguage.g:94:7: ( '(' expr ')' | v= VAR | n= NUMBER )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt14=1;
                }
                break;
            case VAR:
                {
                alt14=2;
                }
                break;
            case NUMBER:
                {
                alt14=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("93:1: factor returns [Expr result] : ( '(' expr ')' | v= VAR | n= NUMBER );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // simpleLanguage.g:94:7: '(' expr ')'
                    {
                    match(input,12,FOLLOW_12_in_factor825); if (failed) return result;
                    pushFollow(FOLLOW_expr_in_factor827);
                    expr1=expr();
                    _fsp--;
                    if (failed) return result;
                    match(input,13,FOLLOW_13_in_factor829); if (failed) return result;
                    if ( backtracking==0 ) {
                       result = expr1;          
                    }

                    }
                    break;
                case 2 :
                    // simpleLanguage.g:95:7: v= VAR
                    {
                    v=(Token)input.LT(1);
                    match(input,VAR,FOLLOW_VAR_in_factor843); if (failed) return result;
                    if ( backtracking==0 ) {
                       result = new Variable(v.getText()); 
                    }

                    }
                    break;
                case 3 :
                    // simpleLanguage.g:96:7: n= NUMBER
                    {
                    n=(Token)input.LT(1);
                    match(input,NUMBER,FOLLOW_NUMBER_in_factor862); if (failed) return result;
                    if ( backtracking==0 ) {
                       result = new MyNumber(n.getText()); 
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
    // $ANTLR end factor

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // simpleLanguage.g:65:7: ( '(' boolExpr ')' )
        // simpleLanguage.g:65:7: '(' boolExpr ')'
        {
        match(input,12,FOLLOW_12_in_synpred2525); if (failed) return ;
        pushFollow(FOLLOW_boolExpr_in_synpred2531);
        boolExpr();
        _fsp--;
        if (failed) return ;
        match(input,13,FOLLOW_13_in_synpred2533); if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_statement_in_simpleLanguage37 = new BitSet(new long[]{0x0000000000064812L});
    public static final BitSet FOLLOW_VAR_in_statement71 = new BitSet(new long[]{0x0000000000000500L});
    public static final BitSet FOLLOW_8_in_statement81 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_expr_in_statement87 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_statement89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_statement115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_statement139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement141 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_expr_in_statement147 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement149 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_statement151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_statement176 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement178 = new BitSet(new long[]{0x0000000000201030L});
    public static final BitSet FOLLOW_boolExpr_in_statement184 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement186 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement188 = new BitSet(new long[]{0x0000000000074810L});
    public static final BitSet FOLLOW_statement_in_statement202 = new BitSet(new long[]{0x0000000000074810L});
    public static final BitSet FOLLOW_16_in_statement208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_statement233 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement235 = new BitSet(new long[]{0x0000000000201030L});
    public static final BitSet FOLLOW_boolExpr_in_statement241 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement243 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement245 = new BitSet(new long[]{0x0000000000074810L});
    public static final BitSet FOLLOW_statement_in_statement259 = new BitSet(new long[]{0x0000000000074810L});
    public static final BitSet FOLLOW_16_in_statement265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_statement289 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_statement291 = new BitSet(new long[]{0x0000000000064810L});
    public static final BitSet FOLLOW_statement_in_statement297 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_statement299 = new BitSet(new long[]{0x0000000000201030L});
    public static final BitSet FOLLOW_boolExpr_in_statement306 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_statement308 = new BitSet(new long[]{0x0000000000066810L});
    public static final BitSet FOLLOW_statement_in_statement315 = new BitSet(new long[]{0x0000000000066810L});
    public static final BitSet FOLLOW_13_in_statement321 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement323 = new BitSet(new long[]{0x0000000000074810L});
    public static final BitSet FOLLOW_statement_in_statement337 = new BitSet(new long[]{0x0000000000074810L});
    public static final BitSet FOLLOW_16_in_statement343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conj_in_boolExpr380 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_boolExpr393 = new BitSet(new long[]{0x0000000000201030L});
    public static final BitSet FOLLOW_conj_in_boolExpr399 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_neg_in_conj444 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_conj459 = new BitSet(new long[]{0x0000000000201030L});
    public static final BitSet FOLLOW_neg_in_conj465 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21_in_neg508 = new BitSet(new long[]{0x0000000000201030L});
    public static final BitSet FOLLOW_neg_in_neg515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_neg525 = new BitSet(new long[]{0x0000000000201030L});
    public static final BitSet FOLLOW_boolExpr_in_neg531 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_neg533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleboolExpr_in_neg547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_simpleboolExpr577 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_simpleboolExpr581 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_expr_in_simpleboolExpr587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_simpleboolExpr609 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_expr_in_simpleboolExpr616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_expr660 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_24_in_expr675 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_product_in_expr681 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_25_in_expr697 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_product_in_expr703 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_factor_in_product740 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_product763 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_factor_in_product769 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_27_in_product785 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_factor_in_product791 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_12_in_factor825 = new BitSet(new long[]{0x0000000000001030L});
    public static final BitSet FOLLOW_expr_in_factor827 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_factor829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_synpred2525 = new BitSet(new long[]{0x0000000000201030L});
    public static final BitSet FOLLOW_boolExpr_in_synpred2531 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_synpred2533 = new BitSet(new long[]{0x0000000000000002L});

}