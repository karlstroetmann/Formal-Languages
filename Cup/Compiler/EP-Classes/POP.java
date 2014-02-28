public class POP extends AssemblerCmd {

    public POP() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof POP)) {
            return false;
        }
        POP r = (POP) rhs;
        return true;
    }
    public String toString() {
        return "POP(" + ")";
    }
}
