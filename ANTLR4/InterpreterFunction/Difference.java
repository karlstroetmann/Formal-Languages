public class Difference extends Expr {
    Expr mLhs;
    Expr mRhs;
    
    public Difference(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Value eval(Environment e) {
        return mLhs.eval(e).subtract(mRhs.eval(e));
    }
}
