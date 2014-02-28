
public class Modulo extends Expr {

    Expr mLhs;
    Expr mRhs;
    
    public Modulo(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Value eval() {
        return mLhs.eval().mod(mRhs.eval());
    }
    public String toString() {
        return mLhs + " % " + mRhs;
    }
}
