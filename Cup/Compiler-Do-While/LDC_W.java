public class LDC_W extends AssemblerCmd {
    private String mName;

    public LDC_W(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
		return "ldc_w " + mName;
    }
}
