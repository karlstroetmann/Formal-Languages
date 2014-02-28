public class Signature {
    private String mName;
    private List<Type> mArgList;
    private Type mResult;

    public Signature(String name, List<Type> argList, Type result) {
        mName = name;
        mArgList = argList;
        mResult = result;
    }
    public Boolean equals(Signature rhs) {
        if (!(rhs instanceof Signature)) {
            return false;
        }
        if(!mName.equals(rhs.mName)) {
            return false;
        }
        if(!mArgList.equals(rhs.mArgList)) {
            return false;
        }
        if(!mResult.equals(rhs.mResult)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<Type> getArgList() {
        return mArgList;
    }
    public Type getResult() {
        return mResult;
    }
    public String toString() {
        return "Signature(" + mName.toString() + ", " + mArgList.toString() + ", " + mResult.toString() + ")";
    }
}
