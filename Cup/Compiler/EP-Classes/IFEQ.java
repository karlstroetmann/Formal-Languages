public class IFEQ extends AssemblerCmd {
    private Integer mLabel;

    public IFEQ(Integer label) {
        mLabel = label;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IFEQ)) {
            return false;
        }
        IFEQ r = (IFEQ) rhs;
        if(!mLabel.equals(r.mLabel)) {
            return false;
        }
        return true;
    }
    public Integer getLabel() {
        return mLabel;
    }
    public String toString() {
        return "IFEQ(" + mLabel.toString() + ")";
    }
}
