package assembler;

public class OUT extends AssemblerCmd {
    private Integer mX;

    public OUT(Integer x) {
        mX = x;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof OUT)) {
            return false;
        }
        OUT r = (OUT) rhs;
        if(!mX.equals(r.mX)) {
            return false;
        }
        return true;
    }
    public Integer getX() {
        return mX;
    }
    public String toString() {
        return "      out    R" + mX;
    }
}
