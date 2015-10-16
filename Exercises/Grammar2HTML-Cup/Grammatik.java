import java_cup.runtime.*;
import java.io.*;

public class Grammatik {
    public static void main(String[] args) {
        try { 
	    String        inputFile  = args[0];
	    InputStream   fileStream = new FileInputStream(inputFile);
	    Reader        reader     = new InputStreamReader(fileStream);
	    Scanner       scanner    = new Yylex(reader);
            GrammarParser parser     = new GrammarParser(scanner); 
            Symbol        symbol     = parser.parse(); 
            Grammar       g          = (Grammar) symbol.value; 
            System.out.println(g);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
