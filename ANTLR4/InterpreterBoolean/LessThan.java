public class LessThan extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public LessThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() {
        return mLhs.eval() < mRhs.eval();
    }
    public String toString() {
        return mLhs + " < " + mRhs;
    }
}