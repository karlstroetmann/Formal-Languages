public class IADD extends AssemblerCmd {

    public IADD() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IADD)) {
            return false;
        }
        IADD r = (IADD) rhs;
        return true;
    }
    public String toString() {
        return "IADD(" + ")";
    }
}
