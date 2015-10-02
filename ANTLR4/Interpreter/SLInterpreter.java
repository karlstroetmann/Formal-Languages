import org.antlr.v4.runtime.*;
import java.util.List;
import java.io.*;

public class SLInterpreter {
    public static void main(String[] args) throws Exception {
        for (String file: args) {
            if (!file.equals("-")) {
                parseFile(file);
            } else {
                parseInteractive();
            }
        }
        if (args.length == 0) {
            parseInteractive();
        }
    }
    // parse and execute the given file
    private static void parseFile(String fileName) throws Exception {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            parseAndExecute(fis);
        } catch (IOException e) {
            System.err.println("File " + fileName + " could not be read.");
        }
    }
    private static void parseInteractive() throws Exception {
        Statement.isInteractive = true;
        Statement.prompt();
        while (true) {
            InputStream stream = InputReader.getStream();
            parseAndExecute(stream);
        }
    }
    private static void parseAndExecute(InputStream stream) 
        throws Exception 
    {
        ANTLRInputStream  input  = new ANTLRInputStream(stream);
        SimpleLexer       lexer  = new SimpleLexer(input);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        SimpleParser      parser = new SimpleParser(ts);
        parser.program();
    }
}
