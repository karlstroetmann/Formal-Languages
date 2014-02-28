public class GreaterOrEqual extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public GreaterOrEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() throws ReturnException {
        return mLhs.eval().bieq(mRhs.eval());
    }
    public String toString() {
        return mLhs + " >= " + mRhs;
    }
}