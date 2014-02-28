public class Symbol implements Comparable<Symbol> {
    public static final int EOF    = 0;
    public static final int PLUS   = 4;
    public static final int MINUS  = 5;
    public static final int TIMES  = 3;
    public static final int DIVIDE = 6;
    public static final int LPAREN = 1;
    public static final int RPAREN = 2;
    public static final int NUMBER = 7;

    public static final int EXPR    = -1;
    public static final int PRODUCT = -2;
    public static final int FACTOR  = -3;

    private int    mIdentifier;
    private String mName;

    public Symbol(int identifier, String name) {
        mIdentifier = identifier;
        mName       = name;
    }
    public String toString() { 
        return mName;    
    }
    public int compareTo(Symbol other) {
        return mIdentifier - other.mIdentifier;
    }

}






