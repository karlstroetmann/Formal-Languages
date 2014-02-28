import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        exprLexer lex = new exprLexer(new ANTLRFileStream("/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/__Test___input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        exprParser g = new exprParser(tokens, 49153, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}