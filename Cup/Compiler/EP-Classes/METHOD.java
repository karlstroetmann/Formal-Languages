public class METHOD extends AssemblerCmd {
    private String mName;
    private List<String> mArgList;

    public METHOD(String name, List<String> argList) {
        mName = name;
        mArgList = argList;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof METHOD)) {
            return false;
        }
        METHOD r = (METHOD) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        if(!mArgList.equals(r.mArgList)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<String> getArgList() {
        return mArgList;
    }
    public String toString() {
        return "METHOD(" + mName.toString() + ", " + mArgList.toString() + ")";
    }
}
