public class Logarithm extends Expr {
    private Expr mArg;

    public Logarithm(Expr arg) {
        mArg = arg;
    }
    public Expr diff(String x) {
        return new Quotient(mArg.diff(x), mArg);
    }
    public String toString() {
        return "log(" + mArg.toString() + ")";
    }
}
