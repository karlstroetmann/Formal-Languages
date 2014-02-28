public class Conjunction extends BoolExpr {
    BoolExpr mLhs;
    BoolExpr mRhs;

    public Conjunction(BoolExpr lhs, BoolExpr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() {
        return mLhs.eval() && mRhs.eval();
    }
    public String toString() {
        return "(" + mLhs + ") && (" + mRhs + ")";
    }
}