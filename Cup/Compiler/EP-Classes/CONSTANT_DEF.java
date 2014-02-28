public class CONSTANT_DEF extends AssemblerCmd {
    private String mName;
    private Integer mValue;

    public CONSTANT_DEF(String name, Integer value) {
        mName = name;
        mValue = value;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof CONSTANT_DEF)) {
            return false;
        }
        CONSTANT_DEF r = (CONSTANT_DEF) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        if(!mValue.equals(r.mValue)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public Integer getValue() {
        return mValue;
    }
    public String toString() {
        return "CONSTANT_DEF(" + mName.toString() + ", " + mValue.toString() + ")";
    }
}
