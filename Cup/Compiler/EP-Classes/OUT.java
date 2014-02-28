public class OUT extends AssemblerCmd {

    public OUT() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof OUT)) {
            return false;
        }
        OUT r = (OUT) rhs;
        return true;
    }
    public String toString() {
        return "OUT(" + ")";
    }
}
