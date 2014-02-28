public class GreaterThan extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public GreaterThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval(Environment e) {
        return mLhs.eval(e).greaterThan(mRhs.eval(e));
    }
}