import java_cup.runtime.*;

public class Listen {
    public static void main(String[] args) {
        try { 
            parser p = new parser(new Yylex(System.in)); 
            Symbol s = p.parse(); 
			Element l = (Element) s.value;
            System.out.println("Ergebnis: " + l);
        } catch (Exception e) {}
    }
}
