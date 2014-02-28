public class DUP extends AssemblerCmd {

    public DUP() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof DUP)) {
            return false;
        }
        DUP r = (DUP) rhs;
        return true;
    }
    public String toString() {
        return "DUP(" + ")";
    }
}
