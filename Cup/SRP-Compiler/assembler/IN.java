package assembler;

public class IN extends AssemblerCmd {
    private Integer mX;

    public IN(Integer x) {
        mX = x;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof IN)) {
            return false;
        }
        IN r = (IN) rhs;
        if(!mX.equals(r.mX)) {
            return false;
        }
        return true;
    }
    public Integer getX() {
        return mX;
    }
    public String toString() {
        return "      in     R" + mX;
    }
}
