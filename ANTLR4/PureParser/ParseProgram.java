import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParseProgram {

    public static void main(String[] args) throws Exception {
	ANTLRInputStream  input  = new ANTLRInputStream(System.in);
	ProgramLexer      lexer  = new ProgramLexer(input);
	CommonTokenStream ts     = new CommonTokenStream(lexer);
	ProgramParser     parser = new ProgramParser(ts);
	parser.program();
    }
}

