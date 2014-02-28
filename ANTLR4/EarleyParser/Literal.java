public class Literal extends Item {
    private char mChar;

    public Literal(String name) {
        mChar = name.charAt(1);
    }
    public int compareTo(Object rhs) {
        if (rhs instanceof Literal) {
            Literal literalRhs = (Literal) rhs;
            return mChar - literalRhs.getChar();
        }
        if (rhs instanceof MyToken) {
            return -1;
        }
        if (rhs instanceof Variable) {
            return -1;
        }
        assert(false);
        return 1;
    }

    public char getChar() {
        return mChar;
    }
    public String toString() {
        return "'" + mChar + "'";
    }
}
