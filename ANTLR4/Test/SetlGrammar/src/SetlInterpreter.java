import org.antlr.runtime.*;
import java.util.List;
import java.io.*;

public class SetlInterpreter {

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
            ANTLRStringStream ss = new ANTLRFileStream(fileName);
            parseAndExecute((ss));
        } catch (IOException e) {
            System.err.println("File " + fileName + " could not be read.");
        }
    }

    private static void parseInteractive() throws Exception {
        while (true) {
            InputStream stream = MyReader.getStream();
            ANTLRInputStream input = new ANTLRInputStream(stream);
            parseAndExecute(input);
        }
    }

    private static void parseAndExecute(ANTLRStringStream stream) throws Exception {
        setl_languageLexer lexer  = new setl_languageLexer(stream);
        CommonTokenStream ts     = new CommonTokenStream(lexer);
        setl_languageParser parser = new setl_languageParser(ts);
        List<Statement>   stmnts = parser.program();
        for (Statement s: stmnts) {
            s.execute();
        }
    }
}