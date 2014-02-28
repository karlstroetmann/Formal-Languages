public class ISUB extends AssemblerCmd {

    public ISUB() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof ISUB)) {
            return false;
        }
        ISUB r = (ISUB) rhs;
        return true;
    }
    public String toString() {
        return "ISUB(" + ")";
    }
}
