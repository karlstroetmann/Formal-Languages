public class LessThan extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public LessThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof LessThan)) {
            return false;
        }
        LessThan r = (LessThan) rhs;
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
        return "LessThan(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
