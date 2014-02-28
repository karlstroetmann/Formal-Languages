public class Variable extends Expr {
    private String mName;

    public Variable(String name) {
        mName = name;
    }
    public String toString(Boolean indent) {
        return mName;
    }
}
