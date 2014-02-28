package assembler;

public class LOAD extends AssemblerCmd {
    private Integer mX;
    private Integer mY;

    public LOAD(Integer x, Integer y) {
        mX = x;
        mY = y;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof LOAD)) {
            return false;
        }
        LOAD r = (LOAD) rhs;
        if(!mX.equals(r.mX)) {
            return false;
        }
        if(!mY.equals(r.mY)) {
            return false;
        }
        return true;
    }
    public Integer getX() {
        return mX;
    }
    public Integer getY() {
        return mY;
    }
    public String toString() {
        return "      load   R" + mX + ", R" + mY;
    }
}
