import assembler.*;
import java.util.*;

public class MyNumber extends Expr {
    private Integer mNumber;

    static Set<Integer> sConstants = new TreeSet<Integer>();

    public MyNumber(Integer number) {
        mNumber = number;
        mErshov = 1;
    }
    public List<AssemblerCmd> compile(Integer base, Map<String, Location> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        mRegister = base + 1;
        // lets hope its not too big
        result.add(new CONST(mRegister, mNumber));
        return result;
    }
    public Integer getNumber() {
        return mNumber;
    }
    public String toString() {
        return "MyNumber(" + mNumber.toString() + ")";
    }
}
