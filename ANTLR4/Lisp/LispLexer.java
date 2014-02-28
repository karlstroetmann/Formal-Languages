// $ANTLR 3.0 /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g 2007-09-01 22:49:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LispLexer extends Lexer {
    public static final int WS=9;
    public static final int LETTER=7;
    public static final int OP=4;
    public static final int NUMBER=6;
    public static final int T10=10;
    public static final int T11=11;
    public static final int T12=12;
    public static final int DIGIT=8;
    public static final int ID=5;
    public static final int Tokens=13;
    public static final int EOF=-1;
    public LispLexer() {;} 
    public LispLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g"; }

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:3:5: ( '\\n' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:3:7: '\\n'
            {
            match('\n'); 

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
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:4:5: ( '(' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:4:7: '('
            {
            match('('); 

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
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:5:5: ( ')' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:5:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start OP
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:26:4: ( ( '+' | '-' | '*' | '%' | '/' | '&' | '|' | '<' | '>' | '=' | '?' | '!' )+ )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:26:6: ( '+' | '-' | '*' | '%' | '/' | '&' | '|' | '<' | '>' | '=' | '?' | '!' )+
            {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:26:6: ( '+' | '-' | '*' | '%' | '/' | '&' | '|' | '<' | '>' | '=' | '?' | '!' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='!'||(LA1_0>='%' && LA1_0<='&')||(LA1_0>='*' && LA1_0<='+')||LA1_0=='-'||LA1_0=='/'||(LA1_0>='<' && LA1_0<='?')||LA1_0=='|') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1)>='%' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1)>='<' && input.LA(1)<='?')||input.LA(1)=='|' ) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OP

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:27:4: ( LETTER ( LETTER | DIGIT | '_' )* )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:27:6: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:27:13: ( LETTER | DIGIT | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:
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
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:28:8: ( ( DIGIT )+ )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:28:10: ( DIGIT )+
            {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:28:10: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:28:10: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start DIGIT
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:30:16: ( '0' .. '9' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:30:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end DIGIT

    // $ANTLR start LETTER
    public final void mLETTER() throws RecognitionException {
        try {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:31:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:33:4: ( ( ' ' | '\\t' | '\\r' )+ )
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:33:6: ( ' ' | '\\t' | '\\r' )+
            {
            // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:33:6: ( ' ' | '\\t' | '\\r' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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

            skip();

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    public void mTokens() throws RecognitionException {
        // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:1:8: ( T10 | T11 | T12 | OP | ID | NUMBER | WS )
        int alt5=7;
        switch ( input.LA(1) ) {
        case '\n':
            {
            alt5=1;
            }
            break;
        case '(':
            {
            alt5=2;
            }
            break;
        case ')':
            {
            alt5=3;
            }
            break;
        case '!':
        case '%':
        case '&':
        case '*':
        case '+':
        case '-':
        case '/':
        case '<':
        case '=':
        case '>':
        case '?':
        case '|':
            {
            alt5=4;
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
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=5;
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
            alt5=6;
            }
            break;
        case '\t':
        case '\r':
        case ' ':
            {
            alt5=7;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | OP | ID | NUMBER | WS );", 5, 0, input);

            throw nvae;
        }

        switch (alt5) {
            case 1 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:1:22: OP
                {
                mOP(); 

                }
                break;
            case 5 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:1:25: ID
                {
                mID(); 

                }
                break;
            case 6 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:1:28: NUMBER
                {
                mNUMBER(); 

                }
                break;
            case 7 :
                // /Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g:1:35: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}