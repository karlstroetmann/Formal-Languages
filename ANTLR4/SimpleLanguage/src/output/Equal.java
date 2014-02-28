package output;
public class Equal extends BoolExpr {
    Expr mLhs;
    Expr mRhs;
    
    public Equal(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean eval() {
        if ((double) mLhs.eval() == (double) mRhs.eval()) {
            return true;
        }
        return false;
    }
    public String toString() {
        return mLhs + " == " + mRhs;
    }
}
        