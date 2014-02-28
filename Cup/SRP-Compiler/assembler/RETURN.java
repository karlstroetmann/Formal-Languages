package assembler;

public class RETURN extends AssemblerCmd {

    public RETURN() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof RETURN)) {
            return false;
        }
        RETURN r = (RETURN) rhs;
        return true;
    }
    public String toString() {
        return "      return";
    }
}
