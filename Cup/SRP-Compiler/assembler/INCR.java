package assembler;

public class INCR extends AssemblerCmd {
    private Integer mX;
    private Integer mC;

    public INCR(Integer x, Integer c) {
        mX = x;
        mC = c;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof INCR)) {
            return false;
        }
        INCR r = (INCR) rhs;
        if(!mX.equals(r.mX)) {
            return false;
        }
        if(!mC.equals(r.mC)) {
            return false;
        }
        return true;
    }
    public Integer getX() {
        return mX;
    }
    public Integer getC() {
        return mC;
    }
    public String toString() {
        return "      incr  R" + mX + ", " + mC;
    }
}
