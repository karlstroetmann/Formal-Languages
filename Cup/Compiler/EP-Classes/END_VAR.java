public class END_VAR extends AssemblerCmd {

    public END_VAR() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof END_VAR)) {
            return false;
        }
        END_VAR r = (END_VAR) rhs;
        return true;
    }
    public String toString() {
        return "END_VAR(" + ")";
    }
}
