public class Concatenation extends Expr {
    Expr mLhs;
    Expr mRhs;

    public Concatenation(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }    

    public String toString(Boolean indent) {
        if (mLhs instanceof Epsilon) {
            return mRhs.toString(false);
        }
        if (mLhs instanceof Alternative && mRhs instanceof Alternative) {
            return "(" + mLhs.toString(false) + ") (" + mRhs.toString(false) + ")";
        } 
        if (mLhs instanceof Alternative) {
            return "(" + mLhs.toString(false) + ") " + mRhs.toString(false);
        } 
        if (mRhs instanceof Alternative) {
            return mLhs.toString(false) + " (" + mRhs.toString(false) + ")";
        } 
        return mLhs.toString(false) + " " + mRhs.toString(false);
    }	
}