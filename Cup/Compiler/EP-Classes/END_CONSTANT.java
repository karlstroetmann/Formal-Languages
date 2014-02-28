public class END_CONSTANT extends AssemblerCmd {

    public END_CONSTANT() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof END_CONSTANT)) {
            return false;
        }
        END_CONSTANT r = (END_CONSTANT) rhs;
        return true;
    }
    public String toString() {
        return "END_CONSTANT(" + ")";
    }
}
