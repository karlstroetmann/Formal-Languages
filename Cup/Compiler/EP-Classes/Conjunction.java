public class Conjunction extends BoolExpr {
    private BoolExpr mLhs;
    private BoolExpr mRhs;

    public Conjunction(BoolExpr lhs, BoolExpr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof Conjunction)) {
            return false;
        }
        Conjunction r = (Conjunction) rhs;
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
        return "Conjunction(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
