import java.util.*;

public class MyNumber extends Expr {
    private Integer mNumber;
    static Set<Integer> sConstants = new TreeSet<Integer>();

    public MyNumber(Integer number) {
        mNumber = number;
    }
    public List<AssemblerCmd> compile() {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        if (-128 <= mNumber && mNumber < 128) {
            result.add(new BIPUSH(mNumber));
        } else {
            sConstants.add(mNumber);            
            AssemblerCmd ldc = new LDC_W("c" + mNumber);
            result.add(ldc);
        }
        return result;
    }
    public Integer getNumber() {
        return mNumber;
    }
    public String toString() {
        return "MyNumber(" + mNumber.toString() + ")";
    }
}
