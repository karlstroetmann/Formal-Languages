public class ISTORE extends AssemblerCmd {
    private String mVar;

    public ISTORE(String var) {
        mVar = var;
    }
    public String getVar() {
        return mVar;
    }
    public String toString() {
		return "istore " + mVar;
    }
}
