// $ANTLR 3.2 Sep 23, 2009 12:02:23 setl_grammar.g 2011-04-28 18:00:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class setl_grammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "STRING", "NUMBER", "MULTI_COMMENT", "COMMENT", "WS", "':='", "'+:='", "'-:='", "';'", "'print'", "'('", "','", "')'", "'if'", "'then'", "'else'", "'end'", "'while'", "'loop'", "'for'", "'in'", "'return'", "'procedure'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'**'", "'+/'", "'*/'", "'#'", "'arb'", "'['", "']'", "'{'", "'}'", "'.'", "':'", "'|'", "'or'", "'and'", "'not'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'"
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
    public static final int MULTI_COMMENT=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int VAR=4;
    public static final int COMMENT=8;
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
    public static final int NUMBER=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int STRING=5;

    // delegates
    // delegators


        public setl_grammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public setl_grammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return setl_grammarParser.tokenNames; }
    public String getGrammarFileName() { return "setl_grammar.g"; }



    // $ANTLR start "program"
    // setl_grammar.g:3:1: program : ( statement | procedure )+ ;
    public final void program() throws RecognitionException {
        try {
            // setl_grammar.g:3:8: ( ( statement | procedure )+ )
            // setl_grammar.g:4:5: ( statement | procedure )+
            {
            // setl_grammar.g:4:5: ( statement | procedure )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=VAR && LA1_0<=NUMBER)||(LA1_0>=14 && LA1_0<=15)||LA1_0==18||LA1_0==22||LA1_0==24||LA1_0==26||(LA1_0>=34 && LA1_0<=38)||LA1_0==40) ) {
                    alt1=1;
                }
                else if ( (LA1_0==27) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // setl_grammar.g:4:6: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program14);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // setl_grammar.g:4:16: procedure
            	    {
            	    pushFollow(FOLLOW_procedure_in_program16);
            	    procedure();

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
    // $ANTLR end "program"


    // $ANTLR start "statement"
    // setl_grammar.g:7:1: statement : ( VAR ( ':=' | '+:=' | '-:=' ) expr ';' | 'print' '(' expr ( ',' expr )* ')' ';' | 'if' boolExpr 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if' ';' | 'while' boolExpr 'loop' ( statement )* 'end' 'loop' ';' | 'for' VAR 'in' expr 'loop' ( statement )* 'end' 'loop' ';' | 'return' ( expr )? ';' | expr ';' );
    public final void statement() throws RecognitionException {
        try {
            // setl_grammar.g:7:10: ( VAR ( ':=' | '+:=' | '-:=' ) expr ';' | 'print' '(' expr ( ',' expr )* ')' ';' | 'if' boolExpr 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if' ';' | 'while' boolExpr 'loop' ( statement )* 'end' 'loop' ';' | 'for' VAR 'in' expr 'loop' ( statement )* 'end' 'loop' ';' | 'return' ( expr )? ';' | expr ';' )
            int alt9=7;
            switch ( input.LA(1) ) {
            case VAR:
                {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=10 && LA9_1<=12)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==13||LA9_1==15||(LA9_1>=28 && LA9_1<=33)||LA9_1==38) ) {
                    alt9=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            case 26:
                {
                alt9=6;
                }
                break;
            case STRING:
            case NUMBER:
            case 15:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 40:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // setl_grammar.g:8:7: VAR ( ':=' | '+:=' | '-:=' ) expr ';'
                    {
                    match(input,VAR,FOLLOW_VAR_in_statement36); if (state.failed) return ;
                    if ( (input.LA(1)>=10 && input.LA(1)<=12) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expr_in_statement50);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,13,FOLLOW_13_in_statement52); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // setl_grammar.g:9:7: 'print' '(' expr ( ',' expr )* ')' ';'
                    {
                    match(input,14,FOLLOW_14_in_statement60); if (state.failed) return ;
                    match(input,15,FOLLOW_15_in_statement62); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_statement64);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // setl_grammar.g:9:24: ( ',' expr )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // setl_grammar.g:9:25: ',' expr
                    	    {
                    	    match(input,16,FOLLOW_16_in_statement67); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expr_in_statement69);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match(input,17,FOLLOW_17_in_statement73); if (state.failed) return ;
                    match(input,13,FOLLOW_13_in_statement75); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // setl_grammar.g:10:7: 'if' boolExpr 'then' ( statement )* ( 'else' ( statement )* )? 'end' 'if' ';'
                    {
                    match(input,18,FOLLOW_18_in_statement83); if (state.failed) return ;
                    pushFollow(FOLLOW_boolExpr_in_statement86);
                    boolExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,19,FOLLOW_19_in_statement88); if (state.failed) return ;
                    // setl_grammar.g:10:29: ( statement )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=VAR && LA3_0<=NUMBER)||(LA3_0>=14 && LA3_0<=15)||LA3_0==18||LA3_0==22||LA3_0==24||LA3_0==26||(LA3_0>=34 && LA3_0<=38)||LA3_0==40) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // setl_grammar.g:10:29: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement90);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // setl_grammar.g:10:40: ( 'else' ( statement )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==20) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // setl_grammar.g:10:41: 'else' ( statement )*
                            {
                            match(input,20,FOLLOW_20_in_statement94); if (state.failed) return ;
                            // setl_grammar.g:10:48: ( statement )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>=VAR && LA4_0<=NUMBER)||(LA4_0>=14 && LA4_0<=15)||LA4_0==18||LA4_0==22||LA4_0==24||LA4_0==26||(LA4_0>=34 && LA4_0<=38)||LA4_0==40) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // setl_grammar.g:10:48: statement
                            	    {
                            	    pushFollow(FOLLOW_statement_in_statement96);
                            	    statement();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,21,FOLLOW_21_in_statement101); if (state.failed) return ;
                    match(input,18,FOLLOW_18_in_statement103); if (state.failed) return ;
                    match(input,13,FOLLOW_13_in_statement105); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // setl_grammar.g:11:7: 'while' boolExpr 'loop' ( statement )* 'end' 'loop' ';'
                    {
                    match(input,22,FOLLOW_22_in_statement113); if (state.failed) return ;
                    pushFollow(FOLLOW_boolExpr_in_statement115);
                    boolExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,23,FOLLOW_23_in_statement117); if (state.failed) return ;
                    // setl_grammar.g:11:31: ( statement )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=VAR && LA6_0<=NUMBER)||(LA6_0>=14 && LA6_0<=15)||LA6_0==18||LA6_0==22||LA6_0==24||LA6_0==26||(LA6_0>=34 && LA6_0<=38)||LA6_0==40) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // setl_grammar.g:11:31: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement119);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_statement122); if (state.failed) return ;
                    match(input,23,FOLLOW_23_in_statement124); if (state.failed) return ;
                    match(input,13,FOLLOW_13_in_statement126); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // setl_grammar.g:12:7: 'for' VAR 'in' expr 'loop' ( statement )* 'end' 'loop' ';'
                    {
                    match(input,24,FOLLOW_24_in_statement134); if (state.failed) return ;
                    match(input,VAR,FOLLOW_VAR_in_statement136); if (state.failed) return ;
                    match(input,25,FOLLOW_25_in_statement138); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_statement140);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,23,FOLLOW_23_in_statement142); if (state.failed) return ;
                    // setl_grammar.g:12:34: ( statement )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=VAR && LA7_0<=NUMBER)||(LA7_0>=14 && LA7_0<=15)||LA7_0==18||LA7_0==22||LA7_0==24||LA7_0==26||(LA7_0>=34 && LA7_0<=38)||LA7_0==40) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // setl_grammar.g:12:34: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_statement144);
                    	    statement();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match(input,21,FOLLOW_21_in_statement147); if (state.failed) return ;
                    match(input,23,FOLLOW_23_in_statement149); if (state.failed) return ;
                    match(input,13,FOLLOW_13_in_statement151); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // setl_grammar.g:13:7: 'return' ( expr )? ';'
                    {
                    match(input,26,FOLLOW_26_in_statement159); if (state.failed) return ;
                    // setl_grammar.g:13:16: ( expr )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=VAR && LA8_0<=NUMBER)||LA8_0==15||(LA8_0>=34 && LA8_0<=38)||LA8_0==40) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // setl_grammar.g:13:16: expr
                            {
                            pushFollow(FOLLOW_expr_in_statement161);
                            expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,13,FOLLOW_13_in_statement164); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // setl_grammar.g:14:7: expr ';'
                    {
                    pushFollow(FOLLOW_expr_in_statement172);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,13,FOLLOW_13_in_statement174); if (state.failed) return ;

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
    // $ANTLR end "statement"


    // $ANTLR start "procedure"
    // setl_grammar.g:17:1: procedure : 'procedure' VAR '(' ( VAR ( ',' VAR )* )? ')' ';' ( statement )+ 'end' VAR ';' ;
    public final void procedure() throws RecognitionException {
        try {
            // setl_grammar.g:17:10: ( 'procedure' VAR '(' ( VAR ( ',' VAR )* )? ')' ';' ( statement )+ 'end' VAR ';' )
            // setl_grammar.g:18:5: 'procedure' VAR '(' ( VAR ( ',' VAR )* )? ')' ';' ( statement )+ 'end' VAR ';'
            {
            match(input,27,FOLLOW_27_in_procedure191); if (state.failed) return ;
            match(input,VAR,FOLLOW_VAR_in_procedure193); if (state.failed) return ;
            match(input,15,FOLLOW_15_in_procedure195); if (state.failed) return ;
            // setl_grammar.g:18:25: ( VAR ( ',' VAR )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==VAR) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // setl_grammar.g:18:26: VAR ( ',' VAR )*
                    {
                    match(input,VAR,FOLLOW_VAR_in_procedure198); if (state.failed) return ;
                    // setl_grammar.g:18:30: ( ',' VAR )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==16) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // setl_grammar.g:18:31: ',' VAR
                    	    {
                    	    match(input,16,FOLLOW_16_in_procedure201); if (state.failed) return ;
                    	    match(input,VAR,FOLLOW_VAR_in_procedure203); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,17,FOLLOW_17_in_procedure209); if (state.failed) return ;
            match(input,13,FOLLOW_13_in_procedure211); if (state.failed) return ;
            // setl_grammar.g:18:51: ( statement )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=VAR && LA12_0<=NUMBER)||(LA12_0>=14 && LA12_0<=15)||LA12_0==18||LA12_0==22||LA12_0==24||LA12_0==26||(LA12_0>=34 && LA12_0<=38)||LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // setl_grammar.g:18:51: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_procedure213);
            	    statement();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match(input,21,FOLLOW_21_in_procedure216); if (state.failed) return ;
            match(input,VAR,FOLLOW_VAR_in_procedure218); if (state.failed) return ;
            match(input,13,FOLLOW_13_in_procedure220); if (state.failed) return ;

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
    // $ANTLR end "procedure"


    // $ANTLR start "expr"
    // setl_grammar.g:21:1: expr : product ( ( '+' product ) | ( '-' product ) )* ;
    public final void expr() throws RecognitionException {
        try {
            // setl_grammar.g:21:5: ( product ( ( '+' product ) | ( '-' product ) )* )
            // setl_grammar.g:22:6: product ( ( '+' product ) | ( '-' product ) )*
            {
            pushFollow(FOLLOW_product_in_expr238);
            product();

            state._fsp--;
            if (state.failed) return ;
            // setl_grammar.g:22:14: ( ( '+' product ) | ( '-' product ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }
                else if ( (LA13_0==29) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // setl_grammar.g:22:15: ( '+' product )
            	    {
            	    // setl_grammar.g:22:15: ( '+' product )
            	    // setl_grammar.g:22:16: '+' product
            	    {
            	    match(input,28,FOLLOW_28_in_expr242); if (state.failed) return ;
            	    pushFollow(FOLLOW_product_in_expr244);
            	    product();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // setl_grammar.g:22:29: ( '-' product )
            	    {
            	    // setl_grammar.g:22:29: ( '-' product )
            	    // setl_grammar.g:22:30: '-' product
            	    {
            	    match(input,29,FOLLOW_29_in_expr248); if (state.failed) return ;
            	    pushFollow(FOLLOW_product_in_expr250);
            	    product();

            	    state._fsp--;
            	    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "product"
    // setl_grammar.g:25:1: product : power ( ( '*' power ) | ( '/' power ) | ( 'mod' power ) )* ;
    public final void product() throws RecognitionException {
        try {
            // setl_grammar.g:25:8: ( power ( ( '*' power ) | ( '/' power ) | ( 'mod' power ) )* )
            // setl_grammar.g:26:6: power ( ( '*' power ) | ( '/' power ) | ( 'mod' power ) )*
            {
            pushFollow(FOLLOW_power_in_product271);
            power();

            state._fsp--;
            if (state.failed) return ;
            // setl_grammar.g:26:12: ( ( '*' power ) | ( '/' power ) | ( 'mod' power ) )*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    alt14=1;
                    }
                    break;
                case 31:
                    {
                    alt14=2;
                    }
                    break;
                case 32:
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // setl_grammar.g:26:13: ( '*' power )
            	    {
            	    // setl_grammar.g:26:13: ( '*' power )
            	    // setl_grammar.g:26:14: '*' power
            	    {
            	    match(input,30,FOLLOW_30_in_product275); if (state.failed) return ;
            	    pushFollow(FOLLOW_power_in_product277);
            	    power();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // setl_grammar.g:26:26: ( '/' power )
            	    {
            	    // setl_grammar.g:26:26: ( '/' power )
            	    // setl_grammar.g:26:27: '/' power
            	    {
            	    match(input,31,FOLLOW_31_in_product282); if (state.failed) return ;
            	    pushFollow(FOLLOW_power_in_product284);
            	    power();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // setl_grammar.g:26:39: ( 'mod' power )
            	    {
            	    // setl_grammar.g:26:39: ( 'mod' power )
            	    // setl_grammar.g:26:40: 'mod' power
            	    {
            	    match(input,32,FOLLOW_32_in_product289); if (state.failed) return ;
            	    pushFollow(FOLLOW_power_in_product291);
            	    power();

            	    state._fsp--;
            	    if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "product"


    // $ANTLR start "power"
    // setl_grammar.g:29:1: power : factor ( '**' power )? ;
    public final void power() throws RecognitionException {
        try {
            // setl_grammar.g:29:6: ( factor ( '**' power )? )
            // setl_grammar.g:30:6: factor ( '**' power )?
            {
            pushFollow(FOLLOW_factor_in_power317);
            factor();

            state._fsp--;
            if (state.failed) return ;
            // setl_grammar.g:30:13: ( '**' power )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // setl_grammar.g:30:14: '**' power
                    {
                    match(input,33,FOLLOW_33_in_power320); if (state.failed) return ;
                    pushFollow(FOLLOW_power_in_power322);
                    power();

                    state._fsp--;
                    if (state.failed) return ;

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
    // $ANTLR end "power"


    // $ANTLR start "factor"
    // setl_grammar.g:33:1: factor : ( '(' expr ')' | ( VAR factorRest )=> VAR factorRest | VAR | ( '+/' | '*/' | '#' | 'arb' ) factor | setOrList | STRING | NUMBER );
    public final void factor() throws RecognitionException {
        try {
            // setl_grammar.g:33:7: ( '(' expr ')' | ( VAR factorRest )=> VAR factorRest | VAR | ( '+/' | '*/' | '#' | 'arb' ) factor | setOrList | STRING | NUMBER )
            int alt16=7;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // setl_grammar.g:34:5: '(' expr ')'
                    {
                    match(input,15,FOLLOW_15_in_factor341); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_factor343);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,17,FOLLOW_17_in_factor345); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // setl_grammar.g:35:7: ( VAR factorRest )=> VAR factorRest
                    {
                    match(input,VAR,FOLLOW_VAR_in_factor360); if (state.failed) return ;
                    pushFollow(FOLLOW_factorRest_in_factor362);
                    factorRest();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // setl_grammar.g:36:7: VAR
                    {
                    match(input,VAR,FOLLOW_VAR_in_factor370); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // setl_grammar.g:37:7: ( '+/' | '*/' | '#' | 'arb' ) factor
                    {
                    if ( (input.LA(1)>=34 && input.LA(1)<=37) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_factor_in_factor394);
                    factor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // setl_grammar.g:38:7: setOrList
                    {
                    pushFollow(FOLLOW_setOrList_in_factor402);
                    setOrList();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // setl_grammar.g:39:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_factor410); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // setl_grammar.g:40:7: NUMBER
                    {
                    match(input,NUMBER,FOLLOW_NUMBER_in_factor418); if (state.failed) return ;

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
    // $ANTLR end "factor"


    // $ANTLR start "factorRest"
    // setl_grammar.g:43:1: factorRest : ( '(' ( params )? ')' | '[' expr ']' );
    public final void factorRest() throws RecognitionException {
        try {
            // setl_grammar.g:43:11: ( '(' ( params )? ')' | '[' expr ']' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            else if ( (LA18_0==38) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // setl_grammar.g:44:5: '(' ( params )? ')'
                    {
                    match(input,15,FOLLOW_15_in_factorRest436); if (state.failed) return ;
                    // setl_grammar.g:44:9: ( params )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=VAR && LA17_0<=NUMBER)||LA17_0==15||(LA17_0>=34 && LA17_0<=38)||LA17_0==40) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // setl_grammar.g:44:9: params
                            {
                            pushFollow(FOLLOW_params_in_factorRest438);
                            params();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,17,FOLLOW_17_in_factorRest441); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // setl_grammar.g:45:6: '[' expr ']'
                    {
                    match(input,38,FOLLOW_38_in_factorRest448); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_factorRest450);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,39,FOLLOW_39_in_factorRest452); if (state.failed) return ;

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
    // $ANTLR end "factorRest"


    // $ANTLR start "params"
    // setl_grammar.g:48:1: params : ( expr ( ',' expr )* ) ;
    public final void params() throws RecognitionException {
        try {
            // setl_grammar.g:48:7: ( ( expr ( ',' expr )* ) )
            // setl_grammar.g:49:5: ( expr ( ',' expr )* )
            {
            // setl_grammar.g:49:5: ( expr ( ',' expr )* )
            // setl_grammar.g:49:7: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_params472);
            expr();

            state._fsp--;
            if (state.failed) return ;
            // setl_grammar.g:49:12: ( ',' expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // setl_grammar.g:49:13: ',' expr
            	    {
            	    match(input,16,FOLLOW_16_in_params475); if (state.failed) return ;
            	    pushFollow(FOLLOW_expr_in_params477);
            	    expr();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "params"


    // $ANTLR start "setOrList"
    // setl_grammar.g:52:1: setOrList : ( '[' ( sExpr )? ']' | '{' ( sExpr )? '}' );
    public final void setOrList() throws RecognitionException {
        try {
            // setl_grammar.g:52:10: ( '[' ( sExpr )? ']' | '{' ( sExpr )? '}' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            else if ( (LA22_0==40) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // setl_grammar.g:53:5: '[' ( sExpr )? ']'
                    {
                    match(input,38,FOLLOW_38_in_setOrList498); if (state.failed) return ;
                    // setl_grammar.g:53:9: ( sExpr )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=VAR && LA20_0<=NUMBER)||LA20_0==15||(LA20_0>=34 && LA20_0<=38)||LA20_0==40) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // setl_grammar.g:53:9: sExpr
                            {
                            pushFollow(FOLLOW_sExpr_in_setOrList500);
                            sExpr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,39,FOLLOW_39_in_setOrList503); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // setl_grammar.g:54:7: '{' ( sExpr )? '}'
                    {
                    match(input,40,FOLLOW_40_in_setOrList511); if (state.failed) return ;
                    // setl_grammar.g:54:11: ( sExpr )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=VAR && LA21_0<=NUMBER)||LA21_0==15||(LA21_0>=34 && LA21_0<=38)||LA21_0==40) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // setl_grammar.g:54:11: sExpr
                            {
                            pushFollow(FOLLOW_sExpr_in_setOrList513);
                            sExpr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }

                    match(input,41,FOLLOW_41_in_setOrList516); if (state.failed) return ;

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
    // $ANTLR end "setOrList"


    // $ANTLR start "sExpr"
    // setl_grammar.g:57:1: sExpr : ( expr ( '.' '.' expr | ( ',' expr )* | ':' iterator ( ',' iterator )* ( '|' boolExpr )? ) | iterator '|' boolExpr );
    public final void sExpr() throws RecognitionException {
        try {
            // setl_grammar.g:57:6: ( expr ( '.' '.' expr | ( ',' expr )* | ':' iterator ( ',' iterator )* ( '|' boolExpr )? ) | iterator '|' boolExpr )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=STRING && LA27_0<=NUMBER)||LA27_0==15||(LA27_0>=34 && LA27_0<=38)||LA27_0==40) ) {
                alt27=1;
            }
            else if ( (LA27_0==VAR) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==25) ) {
                    alt27=2;
                }
                else if ( ((LA27_2>=15 && LA27_2<=16)||(LA27_2>=28 && LA27_2<=33)||(LA27_2>=38 && LA27_2<=39)||(LA27_2>=41 && LA27_2<=43)) ) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // setl_grammar.g:58:5: expr ( '.' '.' expr | ( ',' expr )* | ':' iterator ( ',' iterator )* ( '|' boolExpr )? )
                    {
                    pushFollow(FOLLOW_expr_in_sExpr534);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    // setl_grammar.g:58:10: ( '.' '.' expr | ( ',' expr )* | ':' iterator ( ',' iterator )* ( '|' boolExpr )? )
                    int alt26=3;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        alt26=1;
                        }
                        break;
                    case 16:
                    case 39:
                    case 41:
                        {
                        alt26=2;
                        }
                        break;
                    case 43:
                        {
                        alt26=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }

                    switch (alt26) {
                        case 1 :
                            // setl_grammar.g:58:11: '.' '.' expr
                            {
                            match(input,42,FOLLOW_42_in_sExpr537); if (state.failed) return ;
                            match(input,42,FOLLOW_42_in_sExpr538); if (state.failed) return ;
                            pushFollow(FOLLOW_expr_in_sExpr540);
                            expr();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // setl_grammar.g:59:5: ( ',' expr )*
                            {
                            // setl_grammar.g:59:5: ( ',' expr )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==16) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // setl_grammar.g:59:6: ',' expr
                            	    {
                            	    match(input,16,FOLLOW_16_in_sExpr547); if (state.failed) return ;
                            	    pushFollow(FOLLOW_expr_in_sExpr549);
                            	    expr();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;
                        case 3 :
                            // setl_grammar.g:60:5: ':' iterator ( ',' iterator )* ( '|' boolExpr )?
                            {
                            match(input,43,FOLLOW_43_in_sExpr557); if (state.failed) return ;
                            pushFollow(FOLLOW_iterator_in_sExpr559);
                            iterator();

                            state._fsp--;
                            if (state.failed) return ;
                            // setl_grammar.g:60:18: ( ',' iterator )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==16) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // setl_grammar.g:60:19: ',' iterator
                            	    {
                            	    match(input,16,FOLLOW_16_in_sExpr562); if (state.failed) return ;
                            	    pushFollow(FOLLOW_iterator_in_sExpr564);
                            	    iterator();

                            	    state._fsp--;
                            	    if (state.failed) return ;

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);

                            // setl_grammar.g:60:34: ( '|' boolExpr )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==44) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // setl_grammar.g:60:35: '|' boolExpr
                                    {
                                    match(input,44,FOLLOW_44_in_sExpr569); if (state.failed) return ;
                                    pushFollow(FOLLOW_boolExpr_in_sExpr571);
                                    boolExpr();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // setl_grammar.g:62:7: iterator '|' boolExpr
                    {
                    pushFollow(FOLLOW_iterator_in_sExpr584);
                    iterator();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,44,FOLLOW_44_in_sExpr586); if (state.failed) return ;
                    pushFollow(FOLLOW_boolExpr_in_sExpr588);
                    boolExpr();

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
    // $ANTLR end "sExpr"


    // $ANTLR start "sExprRest"
    // setl_grammar.g:65:1: sExprRest : ( '.' '.' expr | ( ',' expr )* | ':' iterator ( ',' iterator )* ( '|' boolExpr )? );
    public final void sExprRest() throws RecognitionException {
        try {
            // setl_grammar.g:65:10: ( '.' '.' expr | ( ',' expr )* | ':' iterator ( ',' iterator )* ( '|' boolExpr )? )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt31=1;
                }
                break;
            case EOF:
            case 16:
                {
                alt31=2;
                }
                break;
            case 43:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // setl_grammar.g:66:6: '.' '.' expr
                    {
                    match(input,42,FOLLOW_42_in_sExprRest605); if (state.failed) return ;
                    match(input,42,FOLLOW_42_in_sExprRest606); if (state.failed) return ;
                    pushFollow(FOLLOW_expr_in_sExprRest608);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // setl_grammar.g:67:7: ( ',' expr )*
                    {
                    // setl_grammar.g:67:7: ( ',' expr )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // setl_grammar.g:67:8: ',' expr
                    	    {
                    	    match(input,16,FOLLOW_16_in_sExprRest617); if (state.failed) return ;
                    	    pushFollow(FOLLOW_expr_in_sExprRest619);
                    	    expr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // setl_grammar.g:68:7: ':' iterator ( ',' iterator )* ( '|' boolExpr )?
                    {
                    match(input,43,FOLLOW_43_in_sExprRest629); if (state.failed) return ;
                    pushFollow(FOLLOW_iterator_in_sExprRest631);
                    iterator();

                    state._fsp--;
                    if (state.failed) return ;
                    // setl_grammar.g:68:20: ( ',' iterator )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // setl_grammar.g:68:21: ',' iterator
                    	    {
                    	    match(input,16,FOLLOW_16_in_sExprRest634); if (state.failed) return ;
                    	    pushFollow(FOLLOW_iterator_in_sExprRest636);
                    	    iterator();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // setl_grammar.g:68:36: ( '|' boolExpr )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==44) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // setl_grammar.g:68:37: '|' boolExpr
                            {
                            match(input,44,FOLLOW_44_in_sExprRest641); if (state.failed) return ;
                            pushFollow(FOLLOW_boolExpr_in_sExprRest643);
                            boolExpr();

                            state._fsp--;
                            if (state.failed) return ;

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
        return ;
    }
    // $ANTLR end "sExprRest"


    // $ANTLR start "iterator"
    // setl_grammar.g:71:1: iterator : VAR 'in' expr ;
    public final void iterator() throws RecognitionException {
        try {
            // setl_grammar.g:71:9: ( VAR 'in' expr )
            // setl_grammar.g:72:5: VAR 'in' expr
            {
            match(input,VAR,FOLLOW_VAR_in_iterator661); if (state.failed) return ;
            match(input,25,FOLLOW_25_in_iterator663); if (state.failed) return ;
            pushFollow(FOLLOW_expr_in_iterator665);
            expr();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "iterator"


    // $ANTLR start "boolExpr"
    // setl_grammar.g:75:1: boolExpr : conjunction ( 'or' conjunction )* ;
    public final void boolExpr() throws RecognitionException {
        try {
            // setl_grammar.g:75:9: ( conjunction ( 'or' conjunction )* )
            // setl_grammar.g:76:5: conjunction ( 'or' conjunction )*
            {
            pushFollow(FOLLOW_conjunction_in_boolExpr683);
            conjunction();

            state._fsp--;
            if (state.failed) return ;
            // setl_grammar.g:76:17: ( 'or' conjunction )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==45) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // setl_grammar.g:76:18: 'or' conjunction
            	    {
            	    match(input,45,FOLLOW_45_in_boolExpr686); if (state.failed) return ;
            	    pushFollow(FOLLOW_conjunction_in_boolExpr688);
            	    conjunction();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
        return ;
    }
    // $ANTLR end "boolExpr"


    // $ANTLR start "conjunction"
    // setl_grammar.g:79:1: conjunction : literal ( 'and' literal )* ;
    public final void conjunction() throws RecognitionException {
        try {
            // setl_grammar.g:79:12: ( literal ( 'and' literal )* )
            // setl_grammar.g:80:5: literal ( 'and' literal )*
            {
            pushFollow(FOLLOW_literal_in_conjunction707);
            literal();

            state._fsp--;
            if (state.failed) return ;
            // setl_grammar.g:80:13: ( 'and' literal )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // setl_grammar.g:80:14: 'and' literal
            	    {
            	    match(input,46,FOLLOW_46_in_conjunction710); if (state.failed) return ;
            	    pushFollow(FOLLOW_literal_in_conjunction712);
            	    literal();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
        return ;
    }
    // $ANTLR end "conjunction"


    // $ANTLR start "literal"
    // setl_grammar.g:83:1: literal : ( 'not' boolFactor | boolFactor );
    public final void literal() throws RecognitionException {
        try {
            // setl_grammar.g:83:8: ( 'not' boolFactor | boolFactor )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            else if ( ((LA34_0>=VAR && LA34_0<=NUMBER)||LA34_0==15||(LA34_0>=34 && LA34_0<=38)||LA34_0==40) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // setl_grammar.g:84:5: 'not' boolFactor
                    {
                    match(input,47,FOLLOW_47_in_literal731); if (state.failed) return ;
                    pushFollow(FOLLOW_boolFactor_in_literal733);
                    boolFactor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // setl_grammar.g:85:7: boolFactor
                    {
                    pushFollow(FOLLOW_boolFactor_in_literal741);
                    boolFactor();

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
    // $ANTLR end "literal"


    // $ANTLR start "boolFactor"
    // setl_grammar.g:88:1: boolFactor : ( ( '(' boolExpr ')' )=> '(' boolExpr ')' | expr ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'in' ) expr );
    public final void boolFactor() throws RecognitionException {
        try {
            // setl_grammar.g:88:11: ( ( '(' boolExpr ')' )=> '(' boolExpr ')' | expr ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'in' ) expr )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==15) ) {
                int LA35_1 = input.LA(2);

                if ( (synpred2_setl_grammar()) ) {
                    alt35=1;
                }
                else if ( (true) ) {
                    alt35=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA35_0>=VAR && LA35_0<=NUMBER)||(LA35_0>=34 && LA35_0<=38)||LA35_0==40) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // setl_grammar.g:89:5: ( '(' boolExpr ')' )=> '(' boolExpr ')'
                    {
                    match(input,15,FOLLOW_15_in_boolFactor769); if (state.failed) return ;
                    pushFollow(FOLLOW_boolExpr_in_boolFactor771);
                    boolExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    match(input,17,FOLLOW_17_in_boolFactor773); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // setl_grammar.g:90:7: expr ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'in' ) expr
                    {
                    pushFollow(FOLLOW_expr_in_boolFactor781);
                    expr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( input.LA(1)==25||(input.LA(1)>=48 && input.LA(1)<=53) ) {
                        input.consume();
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_expr_in_boolFactor813);
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
    // $ANTLR end "boolFactor"

    // $ANTLR start synpred1_setl_grammar
    public final void synpred1_setl_grammar_fragment() throws RecognitionException {   
        // setl_grammar.g:35:7: ( VAR factorRest )
        // setl_grammar.g:35:8: VAR factorRest
        {
        match(input,VAR,FOLLOW_VAR_in_synpred1_setl_grammar354); if (state.failed) return ;
        pushFollow(FOLLOW_factorRest_in_synpred1_setl_grammar356);
        factorRest();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_setl_grammar

    // $ANTLR start synpred2_setl_grammar
    public final void synpred2_setl_grammar_fragment() throws RecognitionException {   
        // setl_grammar.g:89:5: ( '(' boolExpr ')' )
        // setl_grammar.g:89:6: '(' boolExpr ')'
        {
        match(input,15,FOLLOW_15_in_synpred2_setl_grammar760); if (state.failed) return ;
        pushFollow(FOLLOW_boolExpr_in_synpred2_setl_grammar762);
        boolExpr();

        state._fsp--;
        if (state.failed) return ;
        match(input,17,FOLLOW_17_in_synpred2_setl_grammar764); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_setl_grammar

    // Delegated rules

    public final boolean synpred2_setl_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_setl_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_setl_grammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_setl_grammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\2\uffff\1\11\7\uffff";
    static final String DFA16_minS =
        "\1\4\1\uffff\1\15\7\uffff";
    static final String DFA16_maxS =
        "\1\50\1\uffff\1\65\7\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\2\2\1\3";
    static final String DFA16_specialS =
        "\2\uffff\1\0\7\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\2\1\5\1\6\10\uffff\1\1\22\uffff\4\3\1\4\1\uffff\1\4",
            "",
            "\1\11\1\uffff\1\7\2\11\1\uffff\1\11\3\uffff\1\11\1\uffff\1"+
            "\11\2\uffff\6\11\4\uffff\1\10\1\11\1\uffff\6\11\1\uffff\6\11",
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
            return "33:1: factor : ( '(' expr ')' | ( VAR factorRest )=> VAR factorRest | VAR | ( '+/' | '*/' | '#' | 'arb' ) factor | setOrList | STRING | NUMBER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_2 = input.LA(1);

                         
                        int index16_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_2==15) && (synpred1_setl_grammar())) {s = 7;}

                        else if ( (LA16_2==38) && (synpred1_setl_grammar())) {s = 8;}

                        else if ( (LA16_2==EOF||LA16_2==13||(LA16_2>=16 && LA16_2<=17)||LA16_2==19||LA16_2==23||LA16_2==25||(LA16_2>=28 && LA16_2<=33)||LA16_2==39||(LA16_2>=41 && LA16_2<=46)||(LA16_2>=48 && LA16_2<=53)) ) {s = 9;}

                         
                        input.seek(index16_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_statement_in_program14 = new BitSet(new long[]{0x0000017C0D44C072L});
    public static final BitSet FOLLOW_procedure_in_program16 = new BitSet(new long[]{0x0000017C0D44C072L});
    public static final BitSet FOLLOW_VAR_in_statement36 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_set_in_statement38 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_statement50 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement52 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_statement60 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_statement62 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_statement64 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_statement67 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_statement69 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_statement73 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement75 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_statement83 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_boolExpr_in_statement86 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_statement88 = new BitSet(new long[]{0x0000017C0574C070L});
    public static final BitSet FOLLOW_statement_in_statement90 = new BitSet(new long[]{0x0000017C0574C070L});
    public static final BitSet FOLLOW_20_in_statement94 = new BitSet(new long[]{0x0000017C0564C070L});
    public static final BitSet FOLLOW_statement_in_statement96 = new BitSet(new long[]{0x0000017C0564C070L});
    public static final BitSet FOLLOW_21_in_statement101 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_statement103 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_statement113 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_boolExpr_in_statement115 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement117 = new BitSet(new long[]{0x0000017C0564C070L});
    public static final BitSet FOLLOW_statement_in_statement119 = new BitSet(new long[]{0x0000017C0564C070L});
    public static final BitSet FOLLOW_21_in_statement122 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement124 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_statement134 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_statement136 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement138 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_statement140 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement142 = new BitSet(new long[]{0x0000017C0564C070L});
    public static final BitSet FOLLOW_statement_in_statement144 = new BitSet(new long[]{0x0000017C0564C070L});
    public static final BitSet FOLLOW_21_in_statement147 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_statement149 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_statement159 = new BitSet(new long[]{0x0000017C0544E070L});
    public static final BitSet FOLLOW_expr_in_statement161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_statement172 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_procedure191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_procedure193 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_procedure195 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_VAR_in_procedure198 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_procedure201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_procedure203 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_procedure209 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_procedure211 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_statement_in_procedure213 = new BitSet(new long[]{0x0000017C0564C070L});
    public static final BitSet FOLLOW_21_in_procedure216 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_VAR_in_procedure218 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_procedure220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_product_in_expr238 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_expr242 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_product_in_expr244 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_29_in_expr248 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_product_in_expr250 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_power_in_product271 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_30_in_product275 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_power_in_product277 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_31_in_product282 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_power_in_product284 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_32_in_product289 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_power_in_product291 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_factor_in_power317 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_power320 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_power_in_power322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_factor341 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_factor343 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_factor345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor360 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_factorRest_in_factor362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_factor370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_factor378 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_factor_in_factor394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setOrList_in_factor402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_factor410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_factor418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_factorRest436 = new BitSet(new long[]{0x0000017C0546C070L});
    public static final BitSet FOLLOW_params_in_factorRest438 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_factorRest441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_factorRest448 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_factorRest450 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_factorRest452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_params472 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_params475 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_params477 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_38_in_setOrList498 = new BitSet(new long[]{0x000001FC0544C070L});
    public static final BitSet FOLLOW_sExpr_in_setOrList500 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_setOrList503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_setOrList511 = new BitSet(new long[]{0x0000037C0544C070L});
    public static final BitSet FOLLOW_sExpr_in_setOrList513 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_setOrList516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_sExpr534 = new BitSet(new long[]{0x00000C0000010002L});
    public static final BitSet FOLLOW_42_in_sExpr537 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_sExpr538 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_sExpr540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_sExpr547 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_sExpr549 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_43_in_sExpr557 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_iterator_in_sExpr559 = new BitSet(new long[]{0x0000100000010002L});
    public static final BitSet FOLLOW_16_in_sExpr562 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_iterator_in_sExpr564 = new BitSet(new long[]{0x0000100000010002L});
    public static final BitSet FOLLOW_44_in_sExpr569 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_boolExpr_in_sExpr571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterator_in_sExpr584 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_sExpr586 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_boolExpr_in_sExpr588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_sExprRest605 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_sExprRest606 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_sExprRest608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_sExprRest617 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_sExprRest619 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_43_in_sExprRest629 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_iterator_in_sExprRest631 = new BitSet(new long[]{0x0000100000010002L});
    public static final BitSet FOLLOW_16_in_sExprRest634 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_iterator_in_sExprRest636 = new BitSet(new long[]{0x0000100000010002L});
    public static final BitSet FOLLOW_44_in_sExprRest641 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_boolExpr_in_sExprRest643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_iterator661 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_iterator663 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_iterator665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conjunction_in_boolExpr683 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_boolExpr686 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_conjunction_in_boolExpr688 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_literal_in_conjunction707 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_conjunction710 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_literal_in_conjunction712 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_47_in_literal731 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_boolFactor_in_literal733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolFactor_in_literal741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_boolFactor769 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_boolExpr_in_boolFactor771 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_boolFactor773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_boolFactor781 = new BitSet(new long[]{0x003F000002000000L});
    public static final BitSet FOLLOW_set_in_boolFactor783 = new BitSet(new long[]{0x0000017C0544C070L});
    public static final BitSet FOLLOW_expr_in_boolFactor813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_synpred1_setl_grammar354 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_factorRest_in_synpred1_setl_grammar356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred2_setl_grammar760 = new BitSet(new long[]{0x0000817C0544C070L});
    public static final BitSet FOLLOW_boolExpr_in_synpred2_setl_grammar762 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_synpred2_setl_grammar764 = new BitSet(new long[]{0x0000000000000002L});

}