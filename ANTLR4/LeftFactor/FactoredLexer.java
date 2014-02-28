// $ANTLR 3.2 Sep 23, 2009 12:02:23 Factored.g 2010-10-25 13:03:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FactoredLexer extends Lexer {
    public static final int T__7=7;
    public static final int EOF=-1;
    public static final int WS=4;
    public static final int T__5=5;
    public static final int T__6=6;

    // delegates
    // delegators

    public FactoredLexer() {;} 
    public FactoredLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FactoredLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Factored.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Factored.g:3:6: ( 'x' )
            // Factored.g:3:8: 'x'
            {
            match('x'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Factored.g:4:6: ( 'y' )
            // Factored.g:4:8: 'y'
            {
            match('y'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Factored.g:5:6: ( 'z' )
            // Factored.g:5:8: 'z'
            {
            match('z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Factored.g:14:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // Factored.g:14:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // Factored.g:14:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Factored.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // Factored.g:1:8: ( T__5 | T__6 | T__7 | WS )
        int alt2=4;
        switch ( input.LA(1) ) {
        case 'x':
            {
            alt2=1;
            }
            break;
        case 'y':
            {
            alt2=2;
            }
            break;
        case 'z':
            {
            alt2=3;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;
        }

        switch (alt2) {
            case 1 :
                // Factored.g:1:10: T__5
                {
                mT__5(); 

                }
                break;
            case 2 :
                // Factored.g:1:15: T__6
                {
                mT__6(); 

                }
                break;
            case 3 :
                // Factored.g:1:20: T__7
                {
                mT__7(); 

                }
                break;
            case 4 :
                // Factored.g:1:25: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}