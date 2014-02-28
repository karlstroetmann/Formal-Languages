public class GOTO extends AssemblerCmd {
    private Integer mLabel;

    public GOTO(Integer label) {
        mLabel = label;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof GOTO)) {
            return false;
        }
        GOTO r = (GOTO) rhs;
        if(!mLabel.equals(r.mLabel)) {
            return false;
        }
        return true;
    }
    public Integer getLabel() {
        return mLabel;
    }
    public String toString() {
        return "GOTO(" + mLabel.toString() + ")";
    }
}
