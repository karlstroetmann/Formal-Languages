public class Memory extends Location {
    private Integer mOffset;

    public Memory(Integer offset) {
        mOffset = offset;
    }
    public Boolean equals(Location rhs) {
        if (!(rhs instanceof Memory)) {
            return false;
        }
        Memory r = (Memory) rhs;
        if(!mOffset.equals(r.mOffset)) {
            return false;
        }
        return true;
    }
    public Integer getOffset() {
        return mOffset;
    }
    public String toString() {
        return "Memory(" + mOffset.toString() + ")";
    }
}
