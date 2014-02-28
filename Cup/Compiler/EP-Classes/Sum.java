public class Sum extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Sum(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(Expr rhs) {
        if (!(rhs instanceof Sum)) {
            return false;
        }
        Sum r = (Sum) rhs;
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
        return "Sum(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
