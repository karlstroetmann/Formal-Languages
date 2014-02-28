package Assembler;

public class BIPUSH extends AssemblerCmd {
    private Integer mNumber;

    public BIPUSH(Integer number) {
        mNumber = number;
    }
    public Integer getNumber() {
        return mNumber;
    }
    public String toString() {
        return "bipush " + mNumber;
    }
}
