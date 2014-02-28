public class Disjunction extends BoolExpr {
    private BoolExpr mLhs;
    private BoolExpr mRhs;

    public Disjunction(BoolExpr lhs, BoolExpr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof Disjunction)) {
            return false;
        }
        Disjunction r = (Disjunction) rhs;
        if(!mLhs.equals(r.mLhs)) {
            return false;
        }
        if(!mRhs.equals(r.mRhs)) {
            return false;
        }
        return true;
    }
    public BoolExpr getLhs() {
        return mLhs;
    }
    public BoolExpr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Disjunction(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
