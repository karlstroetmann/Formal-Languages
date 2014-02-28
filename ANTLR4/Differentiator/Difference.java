public class Difference extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Difference(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Expr diff(String x) {
        return new Difference(mLhs.diff(x), mRhs.diff(x));
    }
    public String toString() {
        return "(" + mLhs.toString() + " - " + mRhs.toString() + ")";
    }
}
