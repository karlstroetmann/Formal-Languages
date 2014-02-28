// $ANTLR 3.0 simpleLanguage.g 2009-03-19 17:34:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class simpleLanguageLexer extends Lexer {
    public static final int T21=21;
    public static final int T14=14;
    public static final int T22=22;
    public static final int T11=11;
    public static final int T9=9;
    public static final int WS=6;
    public static final int NUMBER=5;
    public static final int T12=12;
    public static final int T23=23;
    public static final int COMMENT=7;
    public static final int T13=13;
    public static final int T20=20;
    public static final int VAR=4;
    public static final int T10=10;
    public static final int T25=25;
    public static final int T18=18;
    public static final int T26=26;
    public static final int T15=15;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=28;
    public static final int T16=16;
    public static final int T27=27;
    public static final int T8=8;
    public static final int T24=24;
    public static final int T19=19;
    public simpleLanguageLexer() {;} 
    public simpleLanguageLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "simpleLanguage.g"; }

    // $ANTLR start T8
    public final void mT8() throws RecognitionException {
        try {
            int _type = T8;
            // simpleLanguage.g:3:6: ( '=' )
            // simpleLanguage.g:3:6: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T8

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // simpleLanguage.g:4:6: ( ';' )
            // simpleLanguage.g:4:6: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T9

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // simpleLanguage.g:5:7: ( '++;' )
            // simpleLanguage.g:5:7: '++;'
            {
            match("++;"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // simpleLanguage.g:6:7: ( 'print' )
            // simpleLanguage.g:6:7: 'print'
            {
            match("print"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // simpleLanguage.g:7:7: ( '(' )
            // simpleLanguage.g:7:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // simpleLanguage.g:8:7: ( ')' )
            // simpleLanguage.g:8:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // simpleLanguage.g:9:7: ( 'if' )
            // simpleLanguage.g:9:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // simpleLanguage.g:10:7: ( '{' )
            // simpleLanguage.g:10:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // simpleLanguage.g:11:7: ( '}' )
            // simpleLanguage.g:11:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // simpleLanguage.g:12:7: ( 'while' )
            // simpleLanguage.g:12:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // simpleLanguage.g:13:7: ( 'for' )
            // simpleLanguage.g:13:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // simpleLanguage.g:14:7: ( '||' )
            // simpleLanguage.g:14:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // simpleLanguage.g:15:7: ( '&&' )
            // simpleLanguage.g:15:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // simpleLanguage.g:16:7: ( '!' )
            // simpleLanguage.g:16:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // simpleLanguage.g:17:7: ( '==' )
            // simpleLanguage.g:17:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // simpleLanguage.g:18:7: ( '<' )
            // simpleLanguage.g:18:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // simpleLanguage.g:19:7: ( '+' )
            // simpleLanguage.g:19:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // simpleLanguage.g:20:7: ( '-' )
            // simpleLanguage.g:20:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // simpleLanguage.g:21:7: ( '*' )
            // simpleLanguage.g:21:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // simpleLanguage.g:22:7: ( '/' )
            // simpleLanguage.g:22:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start VAR
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            // simpleLanguage.g:98:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // simpleLanguage.g:98:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // simpleLanguage.g:98:30: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // simpleLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end VAR

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // simpleLanguage.g:99:11: ( '0' .. '9' | ( '1' .. '9' ) ( '0' .. '9' )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>='0' && LA3_1<='9')) ) {
                    alt3=2;
                }
                else {
                    alt3=1;}
            }
            else if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("99:1: NUMBER : ( '0' .. '9' | ( '1' .. '9' ) ( '0' .. '9' )+ );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // simpleLanguage.g:99:11: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // simpleLanguage.g:99:22: ( '1' .. '9' ) ( '0' .. '9' )+
                    {
                    // simpleLanguage.g:99:22: ( '1' .. '9' )
                    // simpleLanguage.g:99:23: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // simpleLanguage.g:99:32: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // simpleLanguage.g:99:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // simpleLanguage.g:100:11: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // simpleLanguage.g:100:11: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

             skip(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // simpleLanguage.g:101:11: ( '/*' (~ ( '*/' ) )+ '*/' )
            // simpleLanguage.g:101:11: '/*' (~ ( '*/' ) )+ '*/'
            {
            match("/*"); 

            // simpleLanguage.g:101:16: (~ ( '*/' ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        int LA4_3 = input.LA(3);

                        if ( ((LA4_3>='\u0000' && LA4_3<='\uFFFE')) ) {
                            alt4=1;
                        }


                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFE')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // simpleLanguage.g:101:16: ~ ( '*/' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match("*/"); 

             skip(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    public void mTokens() throws RecognitionException {
        // simpleLanguage.g:1:10: ( T8 | T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | VAR | NUMBER | WS | COMMENT )
        int alt5=24;
        switch ( input.LA(1) ) {
        case '=':
            {
            int LA5_1 = input.LA(2);

            if ( (LA5_1=='=') ) {
                alt5=15;
            }
            else {
                alt5=1;}
            }
            break;
        case ';':
            {
            alt5=2;
            }
            break;
        case '+':
            {
            int LA5_3 = input.LA(2);

            if ( (LA5_3=='+') ) {
                alt5=3;
            }
            else {
                alt5=17;}
            }
            break;
        case 'p':
            {
            int LA5_4 = input.LA(2);

            if ( (LA5_4=='r') ) {
                int LA5_26 = input.LA(3);

                if ( (LA5_26=='i') ) {
                    int LA5_32 = input.LA(4);

                    if ( (LA5_32=='n') ) {
                        int LA5_36 = input.LA(5);

                        if ( (LA5_36=='t') ) {
                            int LA5_39 = input.LA(6);

                            if ( ((LA5_39>='0' && LA5_39<='9')||(LA5_39>='A' && LA5_39<='Z')||LA5_39=='_'||(LA5_39>='a' && LA5_39<='z')) ) {
                                alt5=21;
                            }
                            else {
                                alt5=4;}
                        }
                        else {
                            alt5=21;}
                    }
                    else {
                        alt5=21;}
                }
                else {
                    alt5=21;}
            }
            else {
                alt5=21;}
            }
            break;
        case '(':
            {
            alt5=5;
            }
            break;
        case ')':
            {
            alt5=6;
            }
            break;
        case 'i':
            {
            int LA5_7 = input.LA(2);

            if ( (LA5_7=='f') ) {
                int LA5_27 = input.LA(3);

                if ( ((LA5_27>='0' && LA5_27<='9')||(LA5_27>='A' && LA5_27<='Z')||LA5_27=='_'||(LA5_27>='a' && LA5_27<='z')) ) {
                    alt5=21;
                }
                else {
                    alt5=7;}
            }
            else {
                alt5=21;}
            }
            break;
        case '{':
            {
            alt5=8;
            }
            break;
        case '}':
            {
            alt5=9;
            }
            break;
        case 'w':
            {
            int LA5_10 = input.LA(2);

            if ( (LA5_10=='h') ) {
                int LA5_28 = input.LA(3);

                if ( (LA5_28=='i') ) {
                    int LA5_34 = input.LA(4);

                    if ( (LA5_34=='l') ) {
                        int LA5_37 = input.LA(5);

                        if ( (LA5_37=='e') ) {
                            int LA5_40 = input.LA(6);

                            if ( ((LA5_40>='0' && LA5_40<='9')||(LA5_40>='A' && LA5_40<='Z')||LA5_40=='_'||(LA5_40>='a' && LA5_40<='z')) ) {
                                alt5=21;
                            }
                            else {
                                alt5=10;}
                        }
                        else {
                            alt5=21;}
                    }
                    else {
                        alt5=21;}
                }
                else {
                    alt5=21;}
            }
            else {
                alt5=21;}
            }
            break;
        case 'f':
            {
            int LA5_11 = input.LA(2);

            if ( (LA5_11=='o') ) {
                int LA5_29 = input.LA(3);

                if ( (LA5_29=='r') ) {
                    int LA5_35 = input.LA(4);

                    if ( ((LA5_35>='0' && LA5_35<='9')||(LA5_35>='A' && LA5_35<='Z')||LA5_35=='_'||(LA5_35>='a' && LA5_35<='z')) ) {
                        alt5=21;
                    }
                    else {
                        alt5=11;}
                }
                else {
                    alt5=21;}
            }
            else {
                alt5=21;}
            }
            break;
        case '|':
            {
            alt5=12;
            }
            break;
        case '&':
            {
            alt5=13;
            }
            break;
        case '!':
            {
            alt5=14;
            }
            break;
        case '<':
            {
            alt5=16;
            }
            break;
        case '-':
            {
            alt5=18;
            }
            break;
        case '*':
            {
            alt5=19;
            }
            break;
        case '/':
            {
            int LA5_18 = input.LA(2);

            if ( (LA5_18=='*') ) {
                alt5=24;
            }
            else {
                alt5=20;}
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=21;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=22;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt5=23;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T8 | T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | VAR | NUMBER | WS | COMMENT );", 5, 0, input);

            throw nvae;
        }

        switch (alt5) {
            case 1 :
                // simpleLanguage.g:1:10: T8
                {
                mT8(); 

                }
                break;
            case 2 :
                // simpleLanguage.g:1:13: T9
                {
                mT9(); 

                }
                break;
            case 3 :
                // simpleLanguage.g:1:16: T10
                {
                mT10(); 

                }
                break;
            case 4 :
                // simpleLanguage.g:1:20: T11
                {
                mT11(); 

                }
                break;
            case 5 :
                // simpleLanguage.g:1:24: T12
                {
                mT12(); 

                }
                break;
            case 6 :
                // simpleLanguage.g:1:28: T13
                {
                mT13(); 

                }
                break;
            case 7 :
                // simpleLanguage.g:1:32: T14
                {
                mT14(); 

                }
                break;
            case 8 :
                // simpleLanguage.g:1:36: T15
                {
                mT15(); 

                }
                break;
            case 9 :
                // simpleLanguage.g:1:40: T16
                {
                mT16(); 

                }
                break;
            case 10 :
                // simpleLanguage.g:1:44: T17
                {
                mT17(); 

                }
                break;
            case 11 :
                // simpleLanguage.g:1:48: T18
                {
                mT18(); 

                }
                break;
            case 12 :
                // simpleLanguage.g:1:52: T19
                {
                mT19(); 

                }
                break;
            case 13 :
                // simpleLanguage.g:1:56: T20
                {
                mT20(); 

                }
                break;
            case 14 :
                // simpleLanguage.g:1:60: T21
                {
                mT21(); 

                }
                break;
            case 15 :
                // simpleLanguage.g:1:64: T22
                {
                mT22(); 

                }
                break;
            case 16 :
                // simpleLanguage.g:1:68: T23
                {
                mT23(); 

                }
                break;
            case 17 :
                // simpleLanguage.g:1:72: T24
                {
                mT24(); 

                }
                break;
            case 18 :
                // simpleLanguage.g:1:76: T25
                {
                mT25(); 

                }
                break;
            case 19 :
                // simpleLanguage.g:1:80: T26
                {
                mT26(); 

                }
                break;
            case 20 :
                // simpleLanguage.g:1:84: T27
                {
                mT27(); 

                }
                break;
            case 21 :
                // simpleLanguage.g:1:88: VAR
                {
                mVAR(); 

                }
                break;
            case 22 :
                // simpleLanguage.g:1:92: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 23 :
                // simpleLanguage.g:1:99: WS
                {
                mWS(); 

                }
                break;
            case 24 :
                // simpleLanguage.g:1:102: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


 

}