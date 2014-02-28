package Assembler;

public class CONSTANT_DEF extends AssemblerCmd {
    private String  mName;
    private Integer mValue;

    public CONSTANT_DEF(String name, Integer value) {
        mName = name;
        mValue = value;
    }
    public String getName() {
        return mName;
    }
    public Integer getValue() {
        return mValue;
    }
    public String toString() {
        return mName + "  " + mValue;
    }
}
