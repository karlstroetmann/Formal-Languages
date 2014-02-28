import org.antlr.runtime.*;

public class ParseFactored {

    public static void main(String[] args) throws Exception {
        ANTLRInputStream  input  = new ANTLRInputStream(System.in);
        FactoredLexer     lexer  = new FactoredLexer(input);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        FactoredParser    parser = new FactoredParser(ts);
        parser.a();
    }
}

