// $ANTLR 3.2 Sep 23, 2009 12:02:23 grammatik.g 2012-10-19 10:33:19

    import java.util.List;
    import java.util.LinkedList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class grammatikParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "VAR", "TOKEN", "LITERAL", "WS", "COMMENT", "':'", "'|'", "';'"
    };
    public static final int WS=7;
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int LITERAL=6;
    public static final int VAR=4;
    public static final int COMMENT=8;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int TOKEN=5;

    // delegates
    // delegators


        public grammatikParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public grammatikParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return grammatikParser.tokenNames; }
    public String getGrammarFileName() { return "grammatik.g"; }



    // $ANTLR start "grammatik"
    // grammatik.g:8:1: grammatik returns [Grammar g] : (r= rule )+ ;
    public final Grammar grammatik() throws RecognitionException {
        Grammar g = null;

        Rule r = null;


        try {
            // grammatik.g:9:5: ( (r= rule )+ )
            // grammatik.g:9:7: (r= rule )+
            {
             List<Rule> rules = new LinkedList<Rule>(); 
            // grammatik.g:10:7: (r= rule )+
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
            	    // grammatik.g:10:8: r= rule
            	    {
            	    pushFollow(FOLLOW_rule_in_grammatik37);
            	    r=rule();

            	    state._fsp--;

            	     rules.add(r); 

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

             g = new Grammar(rules); 

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
    // $ANTLR end "grammatik"


    // $ANTLR start "rule"
    // grammatik.g:13:1: rule returns [Rule regel] : v= VAR ':' b= body ( '|' c= body )* ';' ;
    public final Rule rule() throws RecognitionException {
        Rule regel = null;

        Token v=null;
        Body b = null;

        Body c = null;


        try {
            // grammatik.g:14:5: (v= VAR ':' b= body ( '|' c= body )* ';' )
            // grammatik.g:14:7: v= VAR ':' b= body ( '|' c= body )* ';'
            {
             List<Body> bodyList = new LinkedList<Body>(); 
            v=(Token)match(input,VAR,FOLLOW_VAR_in_rule76); 
            match(input,9,FOLLOW_9_in_rule78); 
            pushFollow(FOLLOW_body_in_rule84);
            b=body();

            state._fsp--;

             bodyList.add(b); 
            // grammatik.g:16:14: ( '|' c= body )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // grammatik.g:16:15: '|' c= body
            	    {
            	    match(input,10,FOLLOW_10_in_rule103); 
            	    pushFollow(FOLLOW_body_in_rule109);
            	    c=body();

            	    state._fsp--;

            	     bodyList.add(c); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_rule115); 
             regel = new Rule((v!=null?v.getText():null), bodyList); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return regel;
    }
    // $ANTLR end "rule"


    // $ANTLR start "body"
    // grammatik.g:20:1: body returns [Body b] : ( item )* ;
    public final Body body() throws RecognitionException {
        Body b = null;

        Item item1 = null;


        try {
            // grammatik.g:21:5: ( ( item )* )
            // grammatik.g:21:7: ( item )*
            {
             List<Item> l = new LinkedList<Item>(); 
            // grammatik.g:22:7: ( item )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=VAR && LA3_0<=LITERAL)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // grammatik.g:22:8: item
            	    {
            	    pushFollow(FOLLOW_item_in_body155);
            	    item1=item();

            	    state._fsp--;

            	     l.add(item1); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             b = new Body(l); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return b;
    }
    // $ANTLR end "body"


    // $ANTLR start "item"
    // grammatik.g:26:1: item returns [Item element] : ( VAR | TOKEN | LITERAL );
    public final Item item() throws RecognitionException {
        Item element = null;

        Token VAR2=null;
        Token TOKEN3=null;
        Token LITERAL4=null;

        try {
            // grammatik.g:27:5: ( VAR | TOKEN | LITERAL )
            int alt4=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt4=1;
                }
                break;
            case TOKEN:
                {
                alt4=2;
                }
                break;
            case LITERAL:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // grammatik.g:27:7: VAR
                    {
                    VAR2=(Token)match(input,VAR,FOLLOW_VAR_in_item189); 
                     element = new Variable((VAR2!=null?VAR2.getText():null)    ); 

                    }
                    break;
                case 2 :
                    // grammatik.g:28:7: TOKEN
                    {
                    TOKEN3=(Token)match(input,TOKEN,FOLLOW_TOKEN_in_item203); 
                     element = new MyToken( (TOKEN3!=null?TOKEN3.getText():null)  ); 

                    }
                    break;
                case 3 :
                    // grammatik.g:29:7: LITERAL
                    {
                    LITERAL4=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_item215); 
                     element = new MyToken( (LITERAL4!=null?LITERAL4.getText():null)); 

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
        return element;
    }
    // $ANTLR end "item"

    // Delegated rules


 

    public static final BitSet FOLLOW_rule_in_grammatik37 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_VAR_in_rule76 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_rule78 = new BitSet(new long[]{0x0000000000000C70L});
    public static final BitSet FOLLOW_body_in_rule84 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_10_in_rule103 = new BitSet(new long[]{0x0000000000000C70L});
    public static final BitSet FOLLOW_body_in_rule109 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_11_in_rule115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_item_in_body155 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_VAR_in_item189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_in_item203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LITERAL_in_item215 = new BitSet(new long[]{0x0000000000000002L});

}