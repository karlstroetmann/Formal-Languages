public class GreaterOrEqual extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public GreaterOrEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval(Environment e) {
        return mLhs.eval(e).greaterOrEqual(mRhs.eval(e));
    }
}