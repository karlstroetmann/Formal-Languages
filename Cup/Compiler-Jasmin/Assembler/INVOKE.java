package Assembler;

public class INVOKE extends AssemblerCmd {
    private String mName;

    public INVOKE(String name) {
        mName = name;
    }
    public String toString() {
        return "invokestatic " + mName;
    }
}
