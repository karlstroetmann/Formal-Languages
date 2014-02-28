public class MyToken extends Item {
    private String mName;

    public MyToken(String name) {
        mName = name;
    }
    public int compareTo(Object rhs) {
        if (rhs instanceof Literal) {
            return 1;
        }
        if (rhs instanceof MyToken) {
            MyToken tokenRhs = (MyToken) rhs;
            return mName.compareTo(rhs.toString());
        }
        if (rhs instanceof Variable) {
            return -1;
        }
        assert(false);
        return 1;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return mName;
    }
}
