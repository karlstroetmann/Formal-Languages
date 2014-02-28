public class VAR extends AssemblerCmd {

    public VAR() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof VAR)) {
            return false;
        }
        VAR r = (VAR) rhs;
        return true;
    }
    public String toString() {
        return "VAR(" + ")";
    }
}
