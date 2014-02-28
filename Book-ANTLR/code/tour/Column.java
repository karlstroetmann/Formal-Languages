/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.io.FileInputStream;
import java.io.InputStream;

public class Column {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream  input  = new ANTLRInputStream(System.in);
        RowsLexer         lexer  = new RowsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        int               column = Integer.valueOf(args[0]);
        RowsParser        parser = new RowsParser(tokens, column);
        parser.file();
    }
}
