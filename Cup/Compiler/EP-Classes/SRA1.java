public class SRA1 extends AssemblerCmd {

    public SRA1() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof SRA1)) {
            return false;
        }
        SRA1 r = (SRA1) rhs;
        return true;
    }
    public String toString() {
        return "SRA1(" + ")";
    }
}
