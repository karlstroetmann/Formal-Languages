public class Variable extends Expr {
    private String mName;

    public Variable(String name) {
        mName = name;
    }
    public Expr diff(String x) {
        if (mName.equals(x)) {
            return new Number(1);
        }
        return new Number(0);
    }
    public String toString() {
        return mName;
    }
}
