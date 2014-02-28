// $ANTLR 3.0 aufgabe__.g 2009-05-20 15:31:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class aufgabeLexer extends Lexer {
    public static final int T6=6;
    public static final int T7=7;
    public static final int T4=4;
    public static final int T5=5;
    public static final int Tokens=8;
    public static final int EOF=-1;
    public aufgabeLexer() {;} 
    public aufgabeLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "aufgabe__.g"; }

    // $ANTLR start T4
    public final void mT4() throws RecognitionException {
        try {
            int _type = T4;
            // aufgabe__.g:3:6: ( 'x' )
            // aufgabe__.g:3:6: 'x'
            {
            match('x'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T4

    // $ANTLR start T5
    public final void mT5() throws RecognitionException {
        try {
            int _type = T5;
            // aufgabe__.g:4:6: ( 'y' )
            // aufgabe__.g:4:6: 'y'
            {
            match('y'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T5

    // $ANTLR start T6
    public final void mT6() throws RecognitionException {
        try {
            int _type = T6;
            // aufgabe__.g:5:6: ( 'z' )
            // aufgabe__.g:5:6: 'z'
            {
            match('z'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T6

    // $ANTLR start T7
    public final void mT7() throws RecognitionException {
        try {
            int _type = T7;
            // aufgabe__.g:6:6: ( 'u' )
            // aufgabe__.g:6:6: 'u'
            {
            match('u'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T7

    public void mTokens() throws RecognitionException {
        // aufgabe__.g:1:10: ( T4 | T5 | T6 | T7 )
        int alt1=4;
        switch ( input.LA(1) ) {
        case 'x':
            {
            alt1=1;
            }
            break;
        case 'y':
            {
            alt1=2;
            }
            break;
        case 'z':
            {
            alt1=3;
            }
            break;
        case 'u':
            {
            alt1=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T4 | T5 | T6 | T7 );", 1, 0, input);

            throw nvae;
        }

        switch (alt1) {
            case 1 :
                // aufgabe__.g:1:10: T4
                {
                mT4(); 

                }
                break;
            case 2 :
                // aufgabe__.g:1:13: T5
                {
                mT5(); 

                }
                break;
            case 3 :
                // aufgabe__.g:1:16: T6
                {
                mT6(); 

                }
                break;
            case 4 :
                // aufgabe__.g:1:19: T7
                {
                mT7(); 

                }
                break;

        }

    }


 

}