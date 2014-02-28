public class GOTO extends AssemblerCmd {
    private Integer mLabel;

    public GOTO(Integer label) {
        mLabel = label;
    }
    public Integer getLabel() {
        return mLabel;
    }
    public String toString() {
		return "goto l" + mLabel;
    }
}
