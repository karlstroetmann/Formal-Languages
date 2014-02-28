public class Equal extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public Equal(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() {
        return (double) mLhs.eval() == (double) mRhs.eval();
    }
    public String toString() {
        return mLhs + " == " + mRhs;
    }
}
        