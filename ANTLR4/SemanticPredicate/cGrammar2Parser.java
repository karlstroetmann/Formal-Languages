// $ANTLR 3.2 Sep 23, 2009 12:02:23 cGrammar2.g 2012-10-19 11:55:44

    import java.util.Set;
    import java.util.TreeSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class cGrammar2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "WS", "';'", "'('", "')'", "'typedef'", "'unsigned'", "'int'"
    };
    public static final int WS=5;
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int ID=4;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__6=6;

    // delegates
    // delegators


        public cGrammar2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public cGrammar2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return cGrammar2Parser.tokenNames; }
    public String getGrammarFileName() { return "cGrammar2.g"; }


        Set<String> mTypeNames = new TreeSet<String>();



    // $ANTLR start "declOrType"
    // cGrammar2.g:12:1: declOrType : ( decl | typeDef | stmnt );
    public final void declOrType() throws RecognitionException {
        try {
            // cGrammar2.g:13:5: ( decl | typeDef | stmnt )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 10:
            case 11:
                {
                alt1=1;
                }
                break;
            case ID:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==7) ) {
                    int LA1_4 = input.LA(3);

                    if ( (LA1_4==ID) ) {
                        int LA1_5 = input.LA(4);

                        if ( (LA1_5==8) ) {
                            int LA1_6 = input.LA(5);

                            if ( (LA1_6==6) ) {
                                int LA1_7 = input.LA(6);

                                if ( (( mTypeNames.contains(input.LT(1).getText()); )) ) {
                                    alt1=1;
                                }
                                else if ( (true) ) {
                                    alt1=3;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 1, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_2==ID) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 9:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // cGrammar2.g:13:7: decl
                    {
                    pushFollow(FOLLOW_decl_in_declOrType26);
                    decl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // cGrammar2.g:14:7: typeDef
                    {
                    pushFollow(FOLLOW_typeDef_in_declOrType34);
                    typeDef();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // cGrammar2.g:15:7: stmnt
                    {
                    pushFollow(FOLLOW_stmnt_in_declOrType42);
                    stmnt();

                    state._fsp--;


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
    // $ANTLR end "declOrType"


    // $ANTLR start "decl"
    // cGrammar2.g:18:1: decl : ( type identifier ';' | type '(' identifier ')' ';' );
    public final void decl() throws RecognitionException {
        try {
            // cGrammar2.g:18:5: ( type identifier ';' | type '(' identifier ')' ';' )
            int alt2=2;
            switch ( input.LA(1) ) {
            case 10:
                {
                switch ( input.LA(2) ) {
                case 11:
                    {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==ID) ) {
                        alt2=1;
                    }
                    else if ( (LA2_4==7) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case ID:
                    {
                    alt2=1;
                    }
                    break;
                case 7:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 11:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==ID) ) {
                    alt2=1;
                }
                else if ( (LA2_2==7) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==7) ) {
                    alt2=2;
                }
                else if ( (LA2_3==ID) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // cGrammar2.g:18:7: type identifier ';'
                    {
                    pushFollow(FOLLOW_type_in_decl54);
                    type();

                    state._fsp--;

                    pushFollow(FOLLOW_identifier_in_decl56);
                    identifier();

                    state._fsp--;

                    match(input,6,FOLLOW_6_in_decl58); 

                    }
                    break;
                case 2 :
                    // cGrammar2.g:19:7: type '(' identifier ')' ';'
                    {
                    pushFollow(FOLLOW_type_in_decl66);
                    type();

                    state._fsp--;

                    match(input,7,FOLLOW_7_in_decl68); 
                    pushFollow(FOLLOW_identifier_in_decl70);
                    identifier();

                    state._fsp--;

                    match(input,8,FOLLOW_8_in_decl72); 
                    match(input,6,FOLLOW_6_in_decl74); 

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
    // $ANTLR end "decl"


    // $ANTLR start "typeDef"
    // cGrammar2.g:22:1: typeDef : 'typedef' type identifier ';' ;
    public final void typeDef() throws RecognitionException {
        cGrammar2Parser.identifier_return identifier1 = null;


        try {
            // cGrammar2.g:22:8: ( 'typedef' type identifier ';' )
            // cGrammar2.g:22:10: 'typedef' type identifier ';'
            {
            match(input,9,FOLLOW_9_in_typeDef86); 
            pushFollow(FOLLOW_type_in_typeDef88);
            type();

            state._fsp--;

            pushFollow(FOLLOW_identifier_in_typeDef90);
            identifier1=identifier();

            state._fsp--;

             mTypeNames.add((identifier1!=null?input.toString(identifier1.start,identifier1.stop):null)); 
            match(input,6,FOLLOW_6_in_typeDef94); 

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
    // $ANTLR end "typeDef"


    // $ANTLR start "stmnt"
    // cGrammar2.g:25:1: stmnt : identifier '(' identifier ')' ';' ;
    public final void stmnt() throws RecognitionException {
        try {
            // cGrammar2.g:25:6: ( identifier '(' identifier ')' ';' )
            // cGrammar2.g:25:8: identifier '(' identifier ')' ';'
            {
            pushFollow(FOLLOW_identifier_in_stmnt109);
            identifier();

            state._fsp--;

            match(input,7,FOLLOW_7_in_stmnt111); 
            pushFollow(FOLLOW_identifier_in_stmnt113);
            identifier();

            state._fsp--;

            match(input,8,FOLLOW_8_in_stmnt115); 
            match(input,6,FOLLOW_6_in_stmnt117); 

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


    // $ANTLR start "type"
    // cGrammar2.g:28:1: type : ( 'unsigned' | 'int' | 'unsigned' 'int' | typeid );
    public final void type() throws RecognitionException {
        try {
            // cGrammar2.g:28:5: ( 'unsigned' | 'int' | 'unsigned' 'int' | typeid )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 10:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==11) ) {
                    alt3=3;
                }
                else if ( (LA3_1==ID||LA3_1==7) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 11:
                {
                alt3=2;
                }
                break;
            case ID:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // cGrammar2.g:28:7: 'unsigned'
                    {
                    match(input,10,FOLLOW_10_in_type130); 

                    }
                    break;
                case 2 :
                    // cGrammar2.g:29:7: 'int'
                    {
                    match(input,11,FOLLOW_11_in_type138); 

                    }
                    break;
                case 3 :
                    // cGrammar2.g:30:7: 'unsigned' 'int'
                    {
                    match(input,10,FOLLOW_10_in_type146); 
                    match(input,11,FOLLOW_11_in_type148); 

                    }
                    break;
                case 4 :
                    // cGrammar2.g:31:7: typeid
                    {
                    pushFollow(FOLLOW_typeid_in_type156);
                    typeid();

                    state._fsp--;


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
    // $ANTLR end "type"


    // $ANTLR start "typeid"
    // cGrammar2.g:34:1: typeid : {...}? ID ;
    public final void typeid() throws RecognitionException {
        try {
            // cGrammar2.g:34:7: ({...}? ID )
            // cGrammar2.g:34:9: {...}? ID
            {
            if ( !(( mTypeNames.contains(input.LT(1).getText()); )) ) {
                throw new FailedPredicateException(input, "typeid", " mTypeNames.contains(input.LT(1).getText()); ");
            }
            match(input,ID,FOLLOW_ID_in_typeid170); 

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
    // $ANTLR end "typeid"

    public static class identifier_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "identifier"
    // cGrammar2.g:36:1: identifier : ID ;
    public final cGrammar2Parser.identifier_return identifier() throws RecognitionException {
        cGrammar2Parser.identifier_return retval = new cGrammar2Parser.identifier_return();
        retval.start = input.LT(1);

        try {
            // cGrammar2.g:36:11: ( ID )
            // cGrammar2.g:36:13: ID
            {
            match(input,ID,FOLLOW_ID_in_identifier177); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_decl_in_declOrType26 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDef_in_declOrType34 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmnt_in_declOrType42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_decl54 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_decl56 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_decl58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_decl66 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_decl68 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_decl70 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_decl72 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_decl74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_typeDef86 = new BitSet(new long[]{0x0000000000000C10L});
    public static final BitSet FOLLOW_type_in_typeDef88 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_typeDef90 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_typeDef94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_stmnt109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7_in_stmnt111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_stmnt113 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_stmnt115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_6_in_stmnt117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_type130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_type138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_type146 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_type148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeid_in_type156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeid170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier177 = new BitSet(new long[]{0x0000000000000002L});

}