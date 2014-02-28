public class Sum extends Expr {
    Expr mLhs;
    Expr mRhs;
    
    public Sum(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Value eval(Environment e) {
        return mLhs.eval(e).add(mRhs.eval(e));
    }
}
