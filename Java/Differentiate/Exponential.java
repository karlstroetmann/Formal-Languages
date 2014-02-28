public class Exponential extends Expr {
    private Expr mArg;

    public Exponential(Expr arg) {
        mArg = arg;
    }
    public Expr diff(String x) {
        return new Product(mArg.diff(x), this);
    }
    public String toString() {
        return "exp(" + mArg.toString() + ")";
    }
}
