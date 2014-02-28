package assembler;

public class STORE extends AssemblerCmd {
    private Integer mX;
    private Integer mY;

    public STORE(Integer x, Integer y) {
        mX = x;
        mY = y;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof STORE)) {
            return false;
        }
        STORE r = (STORE) rhs;
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
        return "      store  R" + mX + ", R" + mY;
    }
}
