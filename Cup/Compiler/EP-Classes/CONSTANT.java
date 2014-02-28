public class CONSTANT extends AssemblerCmd {

    public CONSTANT() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof CONSTANT)) {
            return false;
        }
        CONSTANT r = (CONSTANT) rhs;
        return true;
    }
    public String toString() {
        return "CONSTANT(" + ")";
    }
}
