public class ILOAD extends AssemblerCmd {
    private String mVar;

    public ILOAD(String var) {
        mVar = var;
    }
    public String getVar() {
        return mVar;
    }
    public String toString() {
		return "iload " + mVar;
    }
}
