public class SWAP extends AssemblerCmd {

    public SWAP() {
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof SWAP)) {
            return false;
        }
        SWAP r = (SWAP) rhs;
        return true;
    }
    public String toString() {
		return "swap";
    }
}
