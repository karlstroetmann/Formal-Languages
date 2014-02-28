public class NEWLINE extends AssemblerCmd {

    public NEWLINE() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof NEWLINE)) {
            return false;
        }
        NEWLINE r = (NEWLINE) rhs;
        return true;
    }
    public String toString() {
        return "NEWLINE(" + ")";
    }
}
