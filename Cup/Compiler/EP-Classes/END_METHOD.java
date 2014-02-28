public class END_METHOD extends AssemblerCmd {

    public END_METHOD() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof END_METHOD)) {
            return false;
        }
        END_METHOD r = (END_METHOD) rhs;
        return true;
    }
    public String toString() {
        return "END_METHOD(" + ")";
    }
}
