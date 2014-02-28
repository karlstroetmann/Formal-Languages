public class Program {
    private List<Function> mFunctionList;

    public Program(List<Function> functionList) {
        mFunctionList = functionList;
    }
    public Boolean equals(Program rhs) {
        if (!(rhs instanceof Program)) {
            return false;
        }
        if(!mFunctionList.equals(rhs.mFunctionList)) {
            return false;
        }
        return true;
    }
    public List<Function> getFunctionList() {
        return mFunctionList;
    }
    public String toString() {
        return "Program(" + mFunctionList.toString() + ")";
    }
}
