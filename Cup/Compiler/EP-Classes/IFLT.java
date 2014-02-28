public class IFLT extends AssemblerCmd {
    private Integer mLabel;

    public IFLT(Integer label) {
        mLabel = label;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IFLT)) {
            return false;
        }
        IFLT r = (IFLT) rhs;
        if(!mLabel.equals(r.mLabel)) {
            return false;
        }
        return true;
    }
    public Integer getLabel() {
        return mLabel;
    }
    public String toString() {
        return "IFLT(" + mLabel.toString() + ")";
    }
}
