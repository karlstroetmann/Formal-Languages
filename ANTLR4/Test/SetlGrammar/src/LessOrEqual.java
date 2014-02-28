public class LessOrEqual extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public LessOrEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() throws ReturnException {
        return mLhs.eval().ltoeq(mRhs.eval());
    }
    public String toString() {
        return mLhs + " <= " + mRhs;
    }
}