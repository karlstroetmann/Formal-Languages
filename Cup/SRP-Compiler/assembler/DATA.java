package assembler;

public class DATA extends AssemblerCmd {
    private Integer mB0;
    private Integer mB1;
    private Integer mB2;
    private Integer mB3;

    public DATA(Integer b0, Integer b1, Integer b2, Integer b3) {
        mB0 = b0;
        mB1 = b1;
        mB2 = b2;
        mB3 = b3;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof DATA)) {
            return false;
        }
        DATA r = (DATA) rhs;
        if(!mB0.equals(r.mB0)) {
            return false;
        }
        if(!mB1.equals(r.mB1)) {
            return false;
        }
        if(!mB2.equals(r.mB2)) {
            return false;
        }
        if(!mB3.equals(r.mB3)) {
            return false;
        }
        return true;
    }
    public Integer getB0() {
        return mB0;
    }
    public Integer getB1() {
        return mB1;
    }
    public Integer getB2() {
        return mB2;
    }
    public Integer getB3() {
        return mB3;
    }
    public String toString() {
        return "data " + mB0 + ", " + mB1 + ", " + mB2 + ", " + mB3;
    }
}
