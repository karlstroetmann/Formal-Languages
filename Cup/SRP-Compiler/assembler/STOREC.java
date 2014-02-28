package assembler;

public class STOREC extends AssemblerCmd {
    private Integer mX;
    private Integer mK;

    public STOREC(Integer x, Integer k) {
        mX = x;
        mK = k;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof STOREC)) {
            return false;
        }
        STOREC r = (STOREC) rhs;
        if(!mX.equals(r.mX)) {
            return false;
        }
        if(!mK.equals(r.mK)) {
            return false;
        }
        return true;
    }
    public Integer getX() {
        return mX;
    }
    public Integer getK() {
        return mK;
    }
    public String toString() {
        String result = "";
	result += "      const  R31, " + mK + "\n";
    result += "      add    R31, R30, R31" + "\n";
	result += "      store  R" + mX + ", R31";
	return result;
    }
}
