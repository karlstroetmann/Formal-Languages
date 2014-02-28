package Interpreter;

/***
 * Excerpted from "The Definitive ANTLR Reference"
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr for more book information.
***/
import org.antlr.runtime.*;

public class LispInterpreter {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream  input  = new ANTLRInputStream(System.in);
        LispLexer         lexer  = new LispLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LispParser        parser = new LispParser(tokens);
        parser.program();
    }
}
