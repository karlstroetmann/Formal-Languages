public class GreaterThan extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public GreaterThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() {
        return mLhs.eval() > mRhs.eval();
    }
    public String toString() {
        return mLhs + " > " + mRhs;
    }
}