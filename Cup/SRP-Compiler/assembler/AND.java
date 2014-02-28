package assembler;

public class AND extends AssemblerCmd {
    private Integer mX;
    private Integer mY;
    private Integer mZ;

    public AND(Integer x, Integer y, Integer z) {
        mX = x;
        mY = y;
        mZ = z;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof AND)) {
            return false;
        }
        AND r = (AND) rhs;
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
        return "      and    R" + mX + ", R" + mY + ", R" + mZ;
    }
}
