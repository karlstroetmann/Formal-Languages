public class IMUL extends AssemblerCmd {

    public IMUL() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IMUL)) {
            return false;
        }
        IMUL r = (IMUL) rhs;
        return true;
    }
    public String toString() {
        return "IMUL(" + ")";
    }
}
