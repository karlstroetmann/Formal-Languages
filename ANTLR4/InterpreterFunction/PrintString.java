import java.util.regex.*;

public class PrintString extends PrintExpr {
    private String mString;
    
    public PrintString(String string) {
        mString = string.substring(1, string.length()-1);
	    mString = mString.replaceAll(Pattern.quote("\\\""), "\"");
    }
    public void print(Environment e) {
        System.out.print(mString);
    }
}