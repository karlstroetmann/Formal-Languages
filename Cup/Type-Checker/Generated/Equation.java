public class Equation {
    private Type mLhs;
    private Type mRhs;

    public Equation(Type lhs, Type rhs) {
        mLhs = lhs;
        mRhs = rhs;
    }
    public Boolean equals(Equation rhs) {
        if (!(rhs instanceof Equation)) {
            return false;
        }
        if(!mLhs.equals(rhs.mLhs)) {
            return false;
        }
        if(!mRhs.equals(rhs.mRhs)) {
            return false;
        }
        return true;
    }
    public Type getLhs() {
        return mLhs;
    }
    public Type getRhs() {
        return mRhs;
    }
    public String toString() {
        return "Equation(" + mLhs.toString() + ", " + mRhs.toString() + ")";
    }
}
