public class GreaterOrEqual extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public GreaterOrEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof GreaterOrEqual)) {
            return false;
        }
        GreaterOrEqual r = (GreaterOrEqual) rhs;
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
        return "GreaterOrEqual(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
