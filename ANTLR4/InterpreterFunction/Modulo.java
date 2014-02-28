public class Modulo extends Expr {
    Expr mLhs;
    Expr mRhs;
    
    public Modulo(Expr lhs, Expr rhs)    {
        mLhs = lhs;
        mRhs = rhs;
    }    
    public Value eval(Environment e) {
        return mLhs.eval(e).modulo(mRhs.eval(e));
    }
}
