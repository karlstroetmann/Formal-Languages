public class BIPUSH extends AssemblerCmd {
    private Integer mNumber;

    public BIPUSH(Integer number) {
        mNumber = number;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof BIPUSH)) {
            return false;
        }
        BIPUSH r = (BIPUSH) rhs;
        if(!mNumber.equals(r.mNumber)) {
            return false;
        }
        return true;
    }
    public Integer getNumber() {
        return mNumber;
    }
    public String toString() {
        return "BIPUSH(" + mNumber.toString() + ")";
    }
}
