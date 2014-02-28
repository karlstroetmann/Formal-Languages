public class LessThan extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public LessThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() throws ReturnException {
        return mLhs.eval().lt(mRhs.eval());
    }
    public String toString() {
        return mLhs + " < " + mRhs;
    }
}