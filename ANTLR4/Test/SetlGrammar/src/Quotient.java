public class Quotient extends Expr {
    Expr mLhs;
    Expr mRhs;
    
    public Quotient(Expr lhs, Expr rhs)    {
        mLhs = lhs;
        mRhs = rhs;
    }    
    public Value eval() {
        return mLhs.eval().div(mRhs.eval());
    }
    public String toString() {
        return "(" + mLhs.toString() + ") / (" + mRhs.toString() + ")";
    }
}
