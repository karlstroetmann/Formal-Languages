import org.antlr.runtime.*;

public class ParseLeft {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream  input  = new ANTLRInputStream(System.in);
        LeftLexer         lexer  = new LeftLexer(input);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        LeftParser        parser = new LeftParser(ts);
        parser.a();
    }
}

