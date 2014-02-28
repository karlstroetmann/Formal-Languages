public class LABEL extends AssemblerCmd {
    private Integer mLabel;

    public LABEL(Integer label) {
        mLabel = label;
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
        return "LABEL(" + mLabel.toString() + ")";
    }
}
