import java_cup.runtime.*;
import java.io.*;

public class Calculator {
    public static void main(String[] args) {
        try { 
	    Reader  reader  = new InputStreamReader(System.in);
	    Scanner scanner = new Yylex(reader);
            parser  parser  = new parser(scanner); 
            parser.parse(); 
        } catch (Exception e) {}
    }
}
