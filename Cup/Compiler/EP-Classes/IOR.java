public class IOR extends AssemblerCmd {

    public IOR() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IOR)) {
            return false;
        }
        IOR r = (IOR) rhs;
        return true;
    }
    public String toString() {
        return "IOR(" + ")";
    }
}
