public class IAND extends AssemblerCmd {

    public IAND() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IAND)) {
            return false;
        }
        IAND r = (IAND) rhs;
        return true;
    }
    public String toString() {
        return "IAND(" + ")";
    }
}
