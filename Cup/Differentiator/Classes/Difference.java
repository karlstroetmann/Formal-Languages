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
    public Boolean equals(Expr rhs) {
        if (!(rhs instanceof Difference)) {
            return false;
        }
        Difference r = (Difference) rhs;
        if(!mLhs.equals(r.mLhs)) {
            return false;
        }
        if(!mRhs.equals(r.mRhs)) {
            return false;
        }
        return true;
    }
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Difference(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
