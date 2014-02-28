public class Quotient extends Expr {
    Expr mLhs;
    Expr mRhs;
    
    public Quotient(Expr lhs, Expr rhs)    {
        mLhs = lhs;
        mRhs = rhs;
    }    
    public Value eval(Environment e) {
        return mLhs.eval(e).divide(mRhs.eval(e));
    }
}
