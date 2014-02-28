public class INVOKE extends AssemblerCmd {
    private String mName;

    public INVOKE(String name) {
        mName = name;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
		return "invokevirtual " + mName;
    }
}
