public class END_MAIN extends AssemblerCmd {

    public END_MAIN() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof END_MAIN)) {
            return false;
        }
        END_MAIN r = (END_MAIN) rhs;
        return true;
    }
    public String toString() {
        return "END_MAIN(" + ")";
    }
}
