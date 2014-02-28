public class Sum extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Sum(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Expr diff(String x) {
        return new Sum(mLhs.diff(x), mRhs.diff(x));
    }
    public String toString() {
        return "(" + mLhs.toString() + " + " + mRhs.toString() + ")";
    }
}
