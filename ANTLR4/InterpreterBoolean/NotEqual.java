public class NotEqual extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public NotEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() {
        return ((double) mLhs.eval() != (double) mRhs.eval());
    }
    public String toString() {
        return mLhs + " != " + mRhs;
    }
}
        