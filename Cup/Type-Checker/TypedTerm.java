public class TypedTerm {
    private Term mTerm;
    private Type mType;

    public TypedTerm(Term term, Type type) {
        mTerm = term;
        mType = type;
    }
    public Boolean equals(TypedTerm rhs) {
        if (!(rhs instanceof TypedTerm)) {
            return false;
        }
        if(!mTerm.equals(rhs.mTerm)) {
            return false;
        }
        if(!mType.equals(rhs.mType)) {
            return false;
        }
        return true;
    }
    public Term getTerm() {
        return mTerm;
    }
    public Type getType() {
        return mType;
    }
    public String myString() {
        return mTerm.myString() + ": " + mType.myString() + ";";
    }
    public String toString() {
        return "TypedTerm(" + mTerm.toString() + ", " + mType.toString() + ")";
    }
}
