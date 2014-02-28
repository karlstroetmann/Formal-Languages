package assembler;

public class MUL extends AssemblerCmd {
    private Integer mX;
    private Integer mY;
    private Integer mZ;

    public MUL(Integer x, Integer y, Integer z) {
        mX = x;
        mY = y;
        mZ = z;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof MUL)) {
            return false;
        }
        MUL r = (MUL) rhs;
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
        return "      mul    R" + mX + ", R" + mY + ", R" + mZ;
    }
}
