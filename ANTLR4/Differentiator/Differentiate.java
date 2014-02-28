import org.antlr.v4.runtime.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class Differentiate {

    public static void main(String[] args) throws Exception {
        String inputFile = null; 
        if (args.length > 0) { 
	    inputFile = args[0];
	}
        InputStream is = System.in;
        if (inputFile != null) {
	    is = new FileInputStream(inputFile);
	}
        ANTLRInputStream  input  = new ANTLRInputStream(is);
        ExprLexer         lexer  = new ExprLexer(input);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        ExprParser        parser = new ExprParser(ts);
        Expr expr = parser.expr().result;
        Expr diff = expr.diff("x");
        System.out.println("d (" + expr + ")/dx = " + diff);
    }
}

