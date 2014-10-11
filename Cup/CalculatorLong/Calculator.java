import java_cup.runtime.*;
import java.io.*;

public class Calculator {
    public static void main(String[] args) {
        try {
	    String      inputFile  = args[0];
	    InputStream fileStream = new FileInputStream(inputFile);
	    Reader      reader     = new InputStreamReader(fileStream);
	    Scanner     scanner    = new Yylex(reader);
            ExprParser  parser     = new ExprParser(scanner); 
            parser.parse(); 
        } catch (Exception e) {}
    }
}
