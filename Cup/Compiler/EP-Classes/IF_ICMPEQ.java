public class IF_ICMPEQ extends AssemblerCmd {
    private Integer mLabel;

    public IF_ICMPEQ(Integer label) {
        mLabel = label;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IF_ICMPEQ)) {
            return false;
        }
        IF_ICMPEQ r = (IF_ICMPEQ) rhs;
        if(!mLabel.equals(r.mLabel)) {
            return false;
        }
        return true;
    }
    public Integer getLabel() {
        return mLabel;
    }
    public String toString() {
        return "IF_ICMPEQ(" + mLabel.toString() + ")";
    }
}
