public class LessThan extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public LessThan(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval(Environment e) {
        return mLhs.eval(e).lessThan(mRhs.eval(e));
    }
}