public class Equal extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public Equal(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval(Environment e) {
        return mLhs.eval(e).equals(mRhs.eval(e));
    }
}
        