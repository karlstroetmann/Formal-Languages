public class IDIV extends AssemblerCmd {

    public IDIV() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IDIV)) {
            return false;
        }
        IDIV r = (IDIV) rhs;
        return true;
    }
    public String toString() {
        return "IDIV(" + ")";
    }
}
