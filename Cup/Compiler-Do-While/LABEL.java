public class LABEL extends AssemblerCmd {
    private static  Integer sLabelCount = 0;
    private         Integer mLabel;

    public LABEL() {
        mLabel = ++sLabelCount;
    }
    public Integer getLabel() {
        return mLabel;
    }
    public String toString() {
        return "l" + mLabel + ":";
    }
}
