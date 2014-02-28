// $ANTLR 3.2 Sep 23, 2009 12:02:23 EBNF_Grammar.g 2011-11-04 10:12:36

    import java.util.List;
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class EBNF_GrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "TOKEN", "LITERAL", "ACTION", "WS", "LINE_COMMENT", "MULTI_COMMENT", "'grammar'", "';'", "'options'", "'@header'", "'@lexer::header'", "'returns'", "'@init'", "'@after'", "':'", "'['", "','", "']'", "'<'", "'>'", "'|'", "'*'", "'+'", "'?'", "'=>'", "'('", "')'", "'='", "'~'", "'..'"
    };
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int WS=8;
    public static final int T__13=13;
    public static final int T__21=21;
    public static final int ACTION=7;
    public static final int T__19=19;
    public static final int MULTI_COMMENT=10;
    public static final int T__33=33;
    public static final int T__14=14;
    public static final int LINE_COMMENT=9;
    public static final int T__11=11;
    public static final int T__22=22;
    public static final int T__29=29;
    public static final int VAR=4;
    public static final int T__30=30;
    public static final int LITERAL=6;
    public static final int TOKEN=5;
    public static final int T__17=17;
    public static final int T__31=31;
    public static final int EOF=-1;
    public static final int T__27=27;
    public static final int T__32=32;
    public static final int T__16=16;
    public static final int T__24=24;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__15=15;

    // delegates
    // delegators


        public EBNF_GrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public EBNF_GrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return EBNF_GrammarParser.tokenNames; }
    public String getGrammarFileName() { return "EBNF_Grammar.g"; }



    // $ANTLR start "ebnf_grammar"
    // EBNF_Grammar.g:12:1: ebnf_grammar returns [Grammar g] : prolog ( rule )+ ( regexpDef )* ;
    public final Grammar ebnf_grammar() throws RecognitionException {
        Grammar g = null;

        Rule rule1 = null;

        Rule regexpDef2 = null;


        try {
            // EBNF_Grammar.g:13:5: ( prolog ( rule )+ ( regexpDef )* )
            // EBNF_Grammar.g:13:7: prolog ( rule )+ ( regexpDef )*
            {
            pushFollow(FOLLOW_prolog_in_ebnf_grammar40);
            prolog();

            state._fsp--;

             List<Rule> rules = new ArrayList<Rule>(); 
            // EBNF_Grammar.g:15:7: ( rule )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==VAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // EBNF_Grammar.g:15:8: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_ebnf_grammar57);
            	    rule1=rule();

            	    state._fsp--;

            	     rules.add(rule1); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

             List<Rule> regexpRules = new ArrayList<Rule>(); 
            // EBNF_Grammar.g:17:7: ( regexpDef )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TOKEN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // EBNF_Grammar.g:17:8: regexpDef
            	    {
            	    pushFollow(FOLLOW_regexpDef_in_ebnf_grammar79);
            	    regexpDef2=regexpDef();

            	    state._fsp--;

            	     regexpRules.add(regexpDef2); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             g = new Grammar(rules, regexpRules); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return g;
    }
    // $ANTLR end "ebnf_grammar"


    // $ANTLR start "prolog"
    // EBNF_Grammar.g:21:1: prolog : 'grammar' name ';' ( 'options' )? ( '@header' )? ( '@lexer::header' )? ;
    public final void prolog() throws RecognitionException {
        try {
            // EBNF_Grammar.g:22:5: ( 'grammar' name ';' ( 'options' )? ( '@header' )? ( '@lexer::header' )? )
            // EBNF_Grammar.g:22:7: 'grammar' name ';' ( 'options' )? ( '@header' )? ( '@lexer::header' )?
            {
            match(input,11,FOLLOW_11_in_prolog108); 
            pushFollow(FOLLOW_name_in_prolog110);
            name();

            state._fsp--;

            match(input,12,FOLLOW_12_in_prolog112); 
            // EBNF_Grammar.g:22:26: ( 'options' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // EBNF_Grammar.g:22:26: 'options'
                    {
                    match(input,13,FOLLOW_13_in_prolog114); 

                    }
                    break;

            }

            // EBNF_Grammar.g:22:37: ( '@header' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // EBNF_Grammar.g:22:37: '@header'
                    {
                    match(input,14,FOLLOW_14_in_prolog117); 

                    }
                    break;

            }

            // EBNF_Grammar.g:22:48: ( '@lexer::header' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // EBNF_Grammar.g:22:48: '@lexer::header'
                    {
                    match(input,15,FOLLOW_15_in_prolog120); 

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
    // $ANTLR end "prolog"


    // $ANTLR start "rule"
    // EBNF_Grammar.g:25:1: rule returns [Rule rule] : VAR ( type )? ( 'returns' type )? ( '@init' )? ( '@after' )? ':' expr ';' ;
    public final Rule rule() throws RecognitionException {
        Rule rule = null;

        Token VAR3=null;
        Expr expr4 = null;


        try {
            // EBNF_Grammar.g:26:5: ( VAR ( type )? ( 'returns' type )? ( '@init' )? ( '@after' )? ':' expr ';' )
            // EBNF_Grammar.g:26:7: VAR ( type )? ( 'returns' type )? ( '@init' )? ( '@after' )? ':' expr ';'
            {
            VAR3=(Token)match(input,VAR,FOLLOW_VAR_in_rule142); 
            // EBNF_Grammar.g:26:11: ( type )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // EBNF_Grammar.g:26:11: type
                    {
                    pushFollow(FOLLOW_type_in_rule144);
                    type();

                    state._fsp--;


                    }
                    break;

            }

            // EBNF_Grammar.g:26:17: ( 'returns' type )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // EBNF_Grammar.g:26:18: 'returns' type
                    {
                    match(input,16,FOLLOW_16_in_rule148); 
                    pushFollow(FOLLOW_type_in_rule150);
                    type();

                    state._fsp--;


                    }
                    break;

            }

            // EBNF_Grammar.g:26:35: ( '@init' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // EBNF_Grammar.g:26:35: '@init'
                    {
                    match(input,17,FOLLOW_17_in_rule154); 

                    }
                    break;

            }

            // EBNF_Grammar.g:26:44: ( '@after' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // EBNF_Grammar.g:26:44: '@after'
                    {
                    match(input,18,FOLLOW_18_in_rule157); 

                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_rule160); 
            pushFollow(FOLLOW_expr_in_rule162);
            expr4=expr();

            state._fsp--;

            match(input,12,FOLLOW_12_in_rule164); 
             rule = new Rule((VAR3!=null?VAR3.getText():null), expr4); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return rule;
    }
    // $ANTLR end "rule"


    // $ANTLR start "type"
    // EBNF_Grammar.g:30:1: type : '[' typeSpec name ( ',' typeSpec name )* ']' ;
    public final void type() throws RecognitionException {
        try {
            // EBNF_Grammar.g:31:5: ( '[' typeSpec name ( ',' typeSpec name )* ']' )
            // EBNF_Grammar.g:31:7: '[' typeSpec name ( ',' typeSpec name )* ']'
            {
            match(input,20,FOLLOW_20_in_type189); 
            pushFollow(FOLLOW_typeSpec_in_type191);
            typeSpec();

            state._fsp--;

            pushFollow(FOLLOW_name_in_type193);
            name();

            state._fsp--;

            // EBNF_Grammar.g:31:25: ( ',' typeSpec name )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // EBNF_Grammar.g:31:26: ',' typeSpec name
            	    {
            	    match(input,21,FOLLOW_21_in_type196); 
            	    pushFollow(FOLLOW_typeSpec_in_type198);
            	    typeSpec();

            	    state._fsp--;

            	    pushFollow(FOLLOW_name_in_type200);
            	    name();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match(input,22,FOLLOW_22_in_type204); 

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
    // $ANTLR end "type"


    // $ANTLR start "typeSpec"
    // EBNF_Grammar.g:34:1: typeSpec : name ( '<' typeSpec ( ',' typeSpec )* '>' )? ;
    public final void typeSpec() throws RecognitionException {
        try {
            // EBNF_Grammar.g:35:5: ( name ( '<' typeSpec ( ',' typeSpec )* '>' )? )
            // EBNF_Grammar.g:35:7: name ( '<' typeSpec ( ',' typeSpec )* '>' )?
            {
            pushFollow(FOLLOW_name_in_typeSpec221);
            name();

            state._fsp--;

            // EBNF_Grammar.g:35:12: ( '<' typeSpec ( ',' typeSpec )* '>' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // EBNF_Grammar.g:35:13: '<' typeSpec ( ',' typeSpec )* '>'
                    {
                    match(input,23,FOLLOW_23_in_typeSpec224); 
                    pushFollow(FOLLOW_typeSpec_in_typeSpec226);
                    typeSpec();

                    state._fsp--;

                    // EBNF_Grammar.g:35:26: ( ',' typeSpec )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // EBNF_Grammar.g:35:27: ',' typeSpec
                    	    {
                    	    match(input,21,FOLLOW_21_in_typeSpec229); 
                    	    pushFollow(FOLLOW_typeSpec_in_typeSpec231);
                    	    typeSpec();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,24,FOLLOW_24_in_typeSpec235); 

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
    // $ANTLR end "typeSpec"


    // $ANTLR start "name"
    // EBNF_Grammar.g:38:1: name : ( VAR | TOKEN );
    public final void name() throws RecognitionException {
        try {
            // EBNF_Grammar.g:39:5: ( VAR | TOKEN )
            // EBNF_Grammar.g:
            {
            if ( (input.LA(1)>=VAR && input.LA(1)<=TOKEN) ) {
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
    // $ANTLR end "name"


    // $ANTLR start "expr"
    // EBNF_Grammar.g:43:1: expr returns [Expr expr] : p= product ( '|' q= product )* ;
    public final Expr expr() throws RecognitionException {
        Expr expr = null;

        Expr p = null;

        Expr q = null;


        try {
            // EBNF_Grammar.g:44:5: (p= product ( '|' q= product )* )
            // EBNF_Grammar.g:44:7: p= product ( '|' q= product )*
            {
            pushFollow(FOLLOW_product_in_expr287);
            p=product();

            state._fsp--;

             expr = p; 
            // EBNF_Grammar.g:45:7: ( '|' q= product )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // EBNF_Grammar.g:45:8: '|' q= product
            	    {
            	    match(input,25,FOLLOW_25_in_expr298); 
            	    pushFollow(FOLLOW_product_in_expr304);
            	    q=product();

            	    state._fsp--;

            	     expr = new Alternative(expr, q); 

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
        return expr;
    }
    // $ANTLR end "expr"


    // $ANTLR start "product"
    // EBNF_Grammar.g:48:1: product returns [Expr expr] : ( factor )* ;
    public final Expr product() throws RecognitionException {
        Expr expr = null;

        Expr factor5 = null;


        try {
            // EBNF_Grammar.g:49:5: ( ( factor )* )
            // EBNF_Grammar.g:49:7: ( factor )*
            {
             expr = new Epsilon(); 
            // EBNF_Grammar.g:50:7: ( factor )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=VAR && LA14_0<=LITERAL)||LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // EBNF_Grammar.g:50:8: factor
            	    {
            	    pushFollow(FOLLOW_factor_in_product338);
            	    factor5=factor();

            	    state._fsp--;

            	     if (expr instanceof Epsilon) {
            	                        expr = factor5;
            	                    } else {
            	                        expr = new Concatenation(expr, factor5); 
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
        return expr;
    }
    // $ANTLR end "product"


    // $ANTLR start "factor"
    // EBNF_Grammar.g:59:1: factor returns [Expr expr] : element ( '*' | '+' | '?' | '=>' )? ;
    public final Expr factor() throws RecognitionException {
        Expr expr = null;

        Expr element6 = null;


        try {
            // EBNF_Grammar.g:60:5: ( element ( '*' | '+' | '?' | '=>' )? )
            // EBNF_Grammar.g:60:7: element ( '*' | '+' | '?' | '=>' )?
            {
            pushFollow(FOLLOW_element_in_factor370);
            element6=element();

            state._fsp--;

             expr = element6; 
            // EBNF_Grammar.g:61:7: ( '*' | '+' | '?' | '=>' )?
            int alt15=5;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // EBNF_Grammar.g:61:9: '*'
                    {
                    match(input,26,FOLLOW_26_in_factor382); 
                     expr = new Postfix(expr, "*" ); 

                    }
                    break;
                case 2 :
                    // EBNF_Grammar.g:62:9: '+'
                    {
                    match(input,27,FOLLOW_27_in_factor395); 
                     expr = new Postfix(expr, "+" ); 

                    }
                    break;
                case 3 :
                    // EBNF_Grammar.g:63:9: '?'
                    {
                    match(input,28,FOLLOW_28_in_factor408); 
                     expr = new Postfix(expr, "?" ); 

                    }
                    break;
                case 4 :
                    // EBNF_Grammar.g:64:9: '=>'
                    {
                    match(input,29,FOLLOW_29_in_factor421); 
                     expr = new Postfix(expr, "=>"); 

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
        return expr;
    }
    // $ANTLR end "factor"


    // $ANTLR start "element"
    // EBNF_Grammar.g:68:1: element returns [Expr expr] : ( '(' expr ')' | ( name '=' )? ( VAR | TOKEN | LITERAL ) );
    public final Expr element() throws RecognitionException {
        Expr expr = null;

        Token VAR8=null;
        Token TOKEN9=null;
        Token LITERAL10=null;
        Expr expr7 = null;


        try {
            // EBNF_Grammar.g:69:5: ( '(' expr ')' | ( name '=' )? ( VAR | TOKEN | LITERAL ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=VAR && LA18_0<=LITERAL)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // EBNF_Grammar.g:69:7: '(' expr ')'
                    {
                    match(input,30,FOLLOW_30_in_element453); 
                    pushFollow(FOLLOW_expr_in_element455);
                    expr7=expr();

                    state._fsp--;

                     expr = expr7; 
                    match(input,31,FOLLOW_31_in_element459); 

                    }
                    break;
                case 2 :
                    // EBNF_Grammar.g:70:7: ( name '=' )? ( VAR | TOKEN | LITERAL )
                    {
                    // EBNF_Grammar.g:70:7: ( name '=' )?
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // EBNF_Grammar.g:70:8: name '='
                            {
                            pushFollow(FOLLOW_name_in_element468);
                            name();

                            state._fsp--;

                            match(input,32,FOLLOW_32_in_element470); 

                            }
                            break;

                    }

                    // EBNF_Grammar.g:70:19: ( VAR | TOKEN | LITERAL )
                    int alt17=3;
                    switch ( input.LA(1) ) {
                    case VAR:
                        {
                        alt17=1;
                        }
                        break;
                    case TOKEN:
                        {
                        alt17=2;
                        }
                        break;
                    case LITERAL:
                        {
                        alt17=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }

                    switch (alt17) {
                        case 1 :
                            // EBNF_Grammar.g:70:21: VAR
                            {
                            VAR8=(Token)match(input,VAR,FOLLOW_VAR_in_element476); 
                             expr = new Variable((VAR8!=null?VAR8.getText():null)  );   

                            }
                            break;
                        case 2 :
                            // EBNF_Grammar.g:71:21: TOKEN
                            {
                            TOKEN9=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_element505); 
                             expr = new MyToken( (TOKEN9!=null?TOKEN9.getText():null));   

                            }
                            break;
                        case 3 :
                            // EBNF_Grammar.g:72:21: LITERAL
                            {
                            LITERAL10=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_element531); 
                             expr = new MyToken( (LITERAL10!=null?LITERAL10.getText():null)); 

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
        return expr;
    }
    // $ANTLR end "element"


    // $ANTLR start "regexpDef"
    // EBNF_Grammar.g:78:1: regexpDef returns [Rule rule] : TOKEN ':' regexp ';' ;
    public final Rule regexpDef() throws RecognitionException {
        Rule rule = null;

        Token TOKEN11=null;
        Expr regexp12 = null;


        try {
            // EBNF_Grammar.g:79:5: ( TOKEN ':' regexp ';' )
            // EBNF_Grammar.g:79:7: TOKEN ':' regexp ';'
            {
            TOKEN11=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_regexpDef576); 
            match(input,19,FOLLOW_19_in_regexpDef578); 
            pushFollow(FOLLOW_regexp_in_regexpDef580);
            regexp12=regexp();

            state._fsp--;

             rule = new Rule((TOKEN11!=null?TOKEN11.getText():null), regexp12); 
            match(input,12,FOLLOW_12_in_regexpDef584); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return rule;
    }
    // $ANTLR end "regexpDef"


    // $ANTLR start "regexp"
    // EBNF_Grammar.g:82:1: regexp returns [Expr expr] : p= regexpProduct ( '|' q= regexpProduct )* ;
    public final Expr regexp() throws RecognitionException {
        Expr expr = null;

        Expr p = null;

        Expr q = null;


        try {
            // EBNF_Grammar.g:83:5: (p= regexpProduct ( '|' q= regexpProduct )* )
            // EBNF_Grammar.g:83:7: p= regexpProduct ( '|' q= regexpProduct )*
            {
            pushFollow(FOLLOW_regexpProduct_in_regexp609);
            p=regexpProduct();

            state._fsp--;

             expr = p; 
            // EBNF_Grammar.g:84:7: ( '|' q= regexpProduct )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // EBNF_Grammar.g:84:8: '|' q= regexpProduct
            	    {
            	    match(input,25,FOLLOW_25_in_regexp620); 
            	    pushFollow(FOLLOW_regexpProduct_in_regexp626);
            	    q=regexpProduct();

            	    state._fsp--;

            	     expr = new Alternative(expr, q); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
        return expr;
    }
    // $ANTLR end "regexp"


    // $ANTLR start "regexpProduct"
    // EBNF_Grammar.g:87:1: regexpProduct returns [Expr expr] : ( regexpFactor )+ ;
    public final Expr regexpProduct() throws RecognitionException {
        Expr expr = null;

        Expr regexpFactor13 = null;


        try {
            // EBNF_Grammar.g:88:5: ( ( regexpFactor )+ )
            // EBNF_Grammar.g:88:7: ( regexpFactor )+
            {
             expr = new Epsilon(); 
            // EBNF_Grammar.g:89:7: ( regexpFactor )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=TOKEN && LA20_0<=LITERAL)||LA20_0==30||LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // EBNF_Grammar.g:89:8: regexpFactor
            	    {
            	    pushFollow(FOLLOW_regexpFactor_in_regexpProduct660);
            	    regexpFactor13=regexpFactor();

            	    state._fsp--;

            	     if (expr instanceof Epsilon) {
            	                              expr = regexpFactor13;
            	                          } else {
            	                              expr = new Concatenation(expr, regexpFactor13);
            	                          }
            	                        

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "regexpProduct"


    // $ANTLR start "regexpFactor"
    // EBNF_Grammar.g:98:1: regexpFactor returns [Expr expr] : prefix ( '*' | '+' | '?' )? ;
    public final Expr regexpFactor() throws RecognitionException {
        Expr expr = null;

        Expr prefix14 = null;


        try {
            // EBNF_Grammar.g:99:5: ( prefix ( '*' | '+' | '?' )? )
            // EBNF_Grammar.g:99:7: prefix ( '*' | '+' | '?' )?
            {
            pushFollow(FOLLOW_prefix_in_regexpFactor692);
            prefix14=prefix();

            state._fsp--;

             expr = prefix14; 
            // EBNF_Grammar.g:100:7: ( '*' | '+' | '?' )?
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // EBNF_Grammar.g:100:9: '*'
                    {
                    match(input,26,FOLLOW_26_in_regexpFactor704); 
                     expr = new Postfix(prefix14, "*" ); 

                    }
                    break;
                case 2 :
                    // EBNF_Grammar.g:101:9: '+'
                    {
                    match(input,27,FOLLOW_27_in_regexpFactor717); 
                     expr = new Postfix(prefix14, "+" ); 

                    }
                    break;
                case 3 :
                    // EBNF_Grammar.g:102:9: '?'
                    {
                    match(input,28,FOLLOW_28_in_regexpFactor730); 
                     expr = new Postfix(prefix14, "?" ); 

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
        return expr;
    }
    // $ANTLR end "regexpFactor"


    // $ANTLR start "prefix"
    // EBNF_Grammar.g:106:1: prefix returns [Expr expr] : ( '~' atom | atom );
    public final Expr prefix() throws RecognitionException {
        Expr expr = null;

        Expr atom15 = null;

        Expr atom16 = null;


        try {
            // EBNF_Grammar.g:107:5: ( '~' atom | atom )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=TOKEN && LA22_0<=LITERAL)||LA22_0==30) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // EBNF_Grammar.g:107:7: '~' atom
                    {
                    match(input,33,FOLLOW_33_in_prefix763); 
                    pushFollow(FOLLOW_atom_in_prefix765);
                    atom15=atom();

                    state._fsp--;

                     expr = new Negation(atom15); 

                    }
                    break;
                case 2 :
                    // EBNF_Grammar.g:108:7: atom
                    {
                    pushFollow(FOLLOW_atom_in_prefix776);
                    atom16=atom();

                    state._fsp--;

                     expr = atom16;               

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
        return expr;
    }
    // $ANTLR end "prefix"


    // $ANTLR start "atom"
    // EBNF_Grammar.g:111:1: atom returns [Expr expr] : ( '(' regexp ')' | l= LITERAL ( '..' r= LITERAL )? | TOKEN );
    public final Expr atom() throws RecognitionException {
        Expr expr = null;

        Token l=null;
        Token r=null;
        Token TOKEN18=null;
        Expr regexp17 = null;


        try {
            // EBNF_Grammar.g:112:5: ( '(' regexp ')' | l= LITERAL ( '..' r= LITERAL )? | TOKEN )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt24=1;
                }
                break;
            case LITERAL:
                {
                alt24=2;
                }
                break;
            case TOKEN:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // EBNF_Grammar.g:112:7: '(' regexp ')'
                    {
                    match(input,30,FOLLOW_30_in_atom805); 
                    pushFollow(FOLLOW_regexp_in_atom807);
                    regexp17=regexp();

                    state._fsp--;

                    match(input,31,FOLLOW_31_in_atom809); 
                     expr = regexp17; 

                    }
                    break;
                case 2 :
                    // EBNF_Grammar.g:113:7: l= LITERAL ( '..' r= LITERAL )?
                    {
                    l=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_atom823); 
                     expr = new MyToken((l!=null?l.getText():null)); 
                    // EBNF_Grammar.g:114:7: ( '..' r= LITERAL )?
                    int alt23=2;
                    alt23 = dfa23.predict(input);
                    switch (alt23) {
                        case 1 :
                            // EBNF_Grammar.g:114:8: '..' r= LITERAL
                            {
                            match(input,34,FOLLOW_34_in_atom834); 
                            r=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_atom840); 
                             expr = new Range((l!=null?l.getText():null), (r!=null?r.getText():null)); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // EBNF_Grammar.g:115:7: TOKEN
                    {
                    TOKEN18=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_atom852); 
                     expr = new MyToken((TOKEN18!=null?TOKEN18.getText():null)); 

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
        return expr;
    }
    // $ANTLR end "atom"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\4\13\uffff";
    static final String DFA15_maxS =
        "\1\37\13\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\6\uffff";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\3\5\5\uffff\1\5\14\uffff\1\5\1\1\1\2\1\3\1\4\2\5",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "61:7: ( '*' | '+' | '?' | '=>' )?";
        }
    }
    static final String DFA16_eotS =
        "\34\uffff";
    static final String DFA16_eofS =
        "\34\uffff";
    static final String DFA16_minS =
        "\3\4\31\uffff";
    static final String DFA16_maxS =
        "\1\6\2\40\31\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\2\1\1\27\uffff";
    static final String DFA16_specialS =
        "\34\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\2\1\3",
            "\3\3\5\uffff\1\3\14\uffff\7\3\1\4",
            "\3\3\5\uffff\1\3\14\uffff\7\3\1\4",
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
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "70:7: ( name '=' )?";
        }
    }
    static final String DFA21_eotS =
        "\13\uffff";
    static final String DFA21_eofS =
        "\13\uffff";
    static final String DFA21_minS =
        "\1\5\12\uffff";
    static final String DFA21_maxS =
        "\1\41\12\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\6\uffff";
    static final String DFA21_specialS =
        "\13\uffff}>";
    static final String[] DFA21_transitionS = {
            "\2\4\5\uffff\1\4\14\uffff\1\4\1\1\1\2\1\3\1\uffff\2\4\1\uffff"+
            "\1\4",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "100:7: ( '*' | '+' | '?' )?";
        }
    }
    static final String DFA23_eotS =
        "\14\uffff";
    static final String DFA23_eofS =
        "\14\uffff";
    static final String DFA23_minS =
        "\1\5\13\uffff";
    static final String DFA23_maxS =
        "\1\42\13\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\11\uffff";
    static final String DFA23_specialS =
        "\14\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\2\5\uffff\1\2\14\uffff\4\2\1\uffff\2\2\1\uffff\1\2\1\1",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "114:7: ( '..' r= LITERAL )?";
        }
    }
 

    public static final BitSet FOLLOW_prolog_in_ebnf_grammar40 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule_in_ebnf_grammar57 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_regexpDef_in_ebnf_grammar79 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_11_in_prolog108 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_name_in_prolog110 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_prolog112 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_13_in_prolog114 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_prolog117 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_prolog120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_rule142 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_type_in_rule144 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_16_in_rule148 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_type_in_rule150 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_rule154 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_rule157 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rule160 = new BitSet(new long[]{0x0000000042000070L});
    public static final BitSet FOLLOW_expr_in_rule162 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rule164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_type189 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_typeSpec_in_type191 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_name_in_type193 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_type196 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_typeSpec_in_type198 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_name_in_type200 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_type204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_typeSpec221 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_typeSpec224 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_typeSpec_in_typeSpec226 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_21_in_typeSpec229 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_typeSpec_in_typeSpec231 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_24_in_typeSpec235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_expr287 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_expr298 = new BitSet(new long[]{0x0000000042000070L});
    public static final BitSet FOLLOW_product_in_expr304 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_factor_in_product338 = new BitSet(new long[]{0x0000000040000072L});
    public static final BitSet FOLLOW_element_in_factor370 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_26_in_factor382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_factor395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_factor408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_factor421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_element453 = new BitSet(new long[]{0x0000000042000070L});
    public static final BitSet FOLLOW_expr_in_element455 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_element459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_element468 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_element470 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_VAR_in_element476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_element505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_element531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_regexpDef576 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_regexpDef578 = new BitSet(new long[]{0x0000000240000060L});
    public static final BitSet FOLLOW_regexp_in_regexpDef580 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_regexpDef584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexpProduct_in_regexp609 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_regexp620 = new BitSet(new long[]{0x0000000240000060L});
    public static final BitSet FOLLOW_regexpProduct_in_regexp626 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_regexpFactor_in_regexpProduct660 = new BitSet(new long[]{0x0000000240000062L});
    public static final BitSet FOLLOW_prefix_in_regexpFactor692 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_26_in_regexpFactor704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_regexpFactor717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_regexpFactor730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_prefix763 = new BitSet(new long[]{0x0000000240000060L});
    public static final BitSet FOLLOW_atom_in_prefix765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_prefix776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_atom805 = new BitSet(new long[]{0x0000000240000060L});
    public static final BitSet FOLLOW_regexp_in_atom807 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_atom809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_atom823 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_atom834 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_LITERAL_in_atom840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_atom852 = new BitSet(new long[]{0x0000000000000002L});

}