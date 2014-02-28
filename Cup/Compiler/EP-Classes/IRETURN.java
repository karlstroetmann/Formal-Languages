public class IRETURN extends AssemblerCmd {

    public IRETURN() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IRETURN)) {
            return false;
        }
        IRETURN r = (IRETURN) rhs;
        return true;
    }
    public String toString() {
        return "IRETURN(" + ")";
    }
}
