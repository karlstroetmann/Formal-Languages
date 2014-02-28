package assembler;

public class LOADC extends AssemblerCmd {
    private Integer mX;
    private Integer mK;

    public LOADC(Integer x, Integer k) {
        mX = x;
        mK = k;
    }
    public Boolean equals(AssemblerCmd rhs) {
        if (!(rhs instanceof LOADC)) {
            return false;
        }
        LOADC r = (LOADC) rhs;
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
	result += "      load   R" + mX + ", R31";
	return result;
    }
}
