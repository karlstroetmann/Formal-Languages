import org.antlr.runtime.*;

public class ParseExpr {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream  input  = new ANTLRInputStream(System.in);
        PrefixLexer       lexer  = new PrefixLexer(input);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        PrefixParser      parser = new PrefixParser(ts);
        parser.program();
    }
}

