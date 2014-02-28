public class LessOrEqual extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public LessOrEqual(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval(Environment e) {
        return mLhs.eval(e).lessOrEqual(mRhs.eval(e));
    }
}