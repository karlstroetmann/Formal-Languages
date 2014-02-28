public class IINC extends AssemblerCmd {
    private String mVar;
    private Integer mNumber;

    public IINC(String var, Integer number) {
        mVar = var;
        mNumber = number;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IINC)) {
            return false;
        }
        IINC r = (IINC) rhs;
        if(!mVar.equals(r.mVar)) {
            return false;
        }
        if(!mNumber.equals(r.mNumber)) {
            return false;
        }
        return true;
    }
    public String getVar() {
        return mVar;
    }
    public Integer getNumber() {
        return mNumber;
    }
    public String toString() {
        return "IINC(" + mVar.toString() + ", " + mNumber.toString() + ")";
    }
}
