package assembler;

public class SUB extends AssemblerCmd {
    private Integer mX;
    private Integer mY;
    private Integer mZ;

    public SUB(Integer x, Integer y, Integer z) {
        mX = x;
        mY = y;
        mZ = z;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof SUB)) {
            return false;
        }
        SUB r = (SUB) rhs;
        if(!mX.equals(r.mX)) {
            return false;
        }
        if(!mY.equals(r.mY)) {
            return false;
        }
        if(!mZ.equals(r.mZ)) {
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
    public Integer getZ() {
        return mZ;
    }
    public String toString() {
        return "      sub    R" + mX + ", R" + mY + ", R" + mZ;
    }
}
