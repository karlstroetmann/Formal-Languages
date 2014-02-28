public class MAIN extends AssemblerCmd {

    public MAIN() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof MAIN)) {
            return false;
        }
        MAIN r = (MAIN) rhs;
        return true;
    }
    public String toString() {
        return "MAIN(" + ")";
    }
}
