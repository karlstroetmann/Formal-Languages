import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParseExpr {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream  input  = new ANTLRInputStream(System.in);
        ExprLexer         lexer  = new ExprLexer(input);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        ExprParser        parser = new ExprParser(ts);
        ParseTree         tree   = parser.start();
        System.out.println(tree.toStringTree(parser)); 
    }
}

