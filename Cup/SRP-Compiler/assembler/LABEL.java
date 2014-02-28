package assembler;

public class LABEL extends AssemblerCmd {
    private static  Integer sLabelCount = 0;
    private         Integer mLabel;

    public LABEL() {
        mLabel = ++sLabelCount;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof LABEL)) {
            return false;
        }
        LABEL r = (LABEL) rhs;
        if(!mLabel.equals(r.mLabel)) {
            return false;
        }
        return true;
    }
    public Integer getLabel() {
        return mLabel;
    }
    public String toString() {
        return "label l" + mLabel;
    }
}
