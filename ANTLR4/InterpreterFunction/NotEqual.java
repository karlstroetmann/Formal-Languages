public class NotEqual extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public NotEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval(Environment e) {
        return mLhs.eval(e).notEquals(mRhs.eval(e));
    }
}
        