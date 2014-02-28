package Assembler;

public class BIPUSH extends AssemblerCmd {
    private Integer mNumber;

    public BIPUSH(Integer number) {
        mNumber = number;
    }
    public String toString() {
        return "bipush " + mNumber;
    }
}
