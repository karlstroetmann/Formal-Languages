public class MyToken extends Expr {
    private String mName;

    public MyToken(String name) {
        mName = name;
    }
    public String toString(Boolean indent) {
        return mName;
    }
}
