public class GreaterThan extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public GreaterThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() throws ReturnException {
        return mLhs.eval().bi(mRhs.eval());
    }
    public String toString() {
        return mLhs + " > " + mRhs;
    }
}