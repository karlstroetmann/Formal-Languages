public class LessOrEqual extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public LessOrEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof LessOrEqual)) {
            return false;
        }
        LessOrEqual r = (LessOrEqual) rhs;
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
        return "LessOrEqual(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
