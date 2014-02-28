public class IN extends AssemblerCmd {

    public IN() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IN)) {
            return false;
        }
        IN r = (IN) rhs;
        return true;
    }
    public String toString() {
        return "IN(" + ")";
    }
}
