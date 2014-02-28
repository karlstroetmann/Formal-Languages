package assembler;

public class HALT extends AssemblerCmd {

    public HALT() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof HALT)) {
            return false;
        }
        HALT r = (HALT) rhs;
        return true;
    }
    public String toString() {
        return "      halt";
    }
}
