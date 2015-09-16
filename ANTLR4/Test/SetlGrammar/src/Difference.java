public class Difference extends Expr {
    Expr mLhs;
    Expr mRhs;
    
    public Difference(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    
    public Value eval() {
        return mLhs.eval().sub(mRhs.eval());
    }
    
    public String toString() {
        return mLhs.toString() + " - (" + mRhs.toString() + ")";
    }
}
