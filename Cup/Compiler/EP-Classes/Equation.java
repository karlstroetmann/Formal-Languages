public class Equation extends BoolExpr {
    private Expr mLhs;
    private Expr mRhs;

    public Equation(Expr lhs, Expr rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(BoolExpr rhs) {
        if (!(rhs instanceof Equation)) {
            return false;
        }
        Equation r = (Equation) rhs;
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
        return "Equation(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
