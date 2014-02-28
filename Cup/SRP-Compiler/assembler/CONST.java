package assembler;

public class CONST extends AssemblerCmd {
    private Integer mX;
    private Integer mC;

    public CONST(Integer x, Integer c) {
        mX = x;
        mC = c;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof CONST)) {
            return false;
        }
        CONST r = (CONST) rhs;
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
        return "      const  R" + mX + ", " + mC;
    }
}
