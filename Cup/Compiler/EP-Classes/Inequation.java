public class Inequation extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public Inequation(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof Inequation)) {
            return false;
        }
        Inequation r = (Inequation) rhs;
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
        return "Inequation(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
