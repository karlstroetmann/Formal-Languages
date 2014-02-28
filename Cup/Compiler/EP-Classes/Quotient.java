public class Quotient extends Expr {
    private Expr mLhs;
    private Expr mRhs;

    public Quotient(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(Expr rhs) {
        if (!(rhs instanceof Quotient)) {
            return false;
        }
        Quotient r = (Quotient) rhs;
        if(!mLhs.equals(r.mLhs)) {
            return false;
        }
        if(!mRhs.equals(r.mRhs)) {
            return false;
        }
        return true;
    }
    public Expr getLhs() {
        return mLhs;
    }
    public Expr getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Quotient(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
