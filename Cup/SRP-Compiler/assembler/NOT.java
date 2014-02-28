package assembler;

public class NOT extends AssemblerCmd {
    private Integer mX;
    private Integer mY;

    public NOT(Integer x, Integer y) {
        mX = x;
        mY = y;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof NOT)) {
            return false;
        }
        NOT r = (NOT) rhs;
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
        return "      not    R" + mX + ", R" + mY;
    }
}
