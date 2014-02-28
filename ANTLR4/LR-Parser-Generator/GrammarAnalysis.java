import org.antlr.v4.runtime.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class GrammarAnalysis {

    public static void main(String[] args) throws Exception {
	FileInputStream   stream = new FileInputStream(args[0]);
	ANTLRInputStream  input  = new ANTLRInputStream(stream);
	GrammatikLexer    lexer  = new GrammatikLexer(input);
	CommonTokenStream ts     = new CommonTokenStream(lexer);
	GrammatikParser   parser = new GrammatikParser(ts);
	Grammar           g      = parser.grammatik().g;
    }
}



