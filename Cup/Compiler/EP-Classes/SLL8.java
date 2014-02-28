public class SLL8 extends AssemblerCmd {

    public SLL8() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof SLL8)) {
            return false;
        }
        SLL8 r = (SLL8) rhs;
        return true;
    }
    public String toString() {
        return "SLL8(" + ")";
    }
}
