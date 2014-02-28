package assembler;

public class IFEQ extends AssemblerCmd {
    private Integer mLabel;
    private Integer mY;
    private Integer mZ;

    public IFEQ(Integer label, Integer y, Integer z) {
        mLabel = label;
        mY = y;
        mZ = z;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IFEQ)) {
            return false;
        }
        IFEQ r = (IFEQ) rhs;
        if(!mLabel.equals(r.mLabel)) {
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
    public Integer getLabel() {
        return mLabel;
    }
    public Integer getY() {
        return mY;
    }
    public Integer getZ() {
        return mZ;
    }
    public String toString() {
        return "      ifeq   l" + mLabel + ", R" + mY + ", R" + mZ;
    }
}
