import Assembler.*;
import java.util.*;

public class MyNumber extends Expr {
    private Integer mNumber;

    public MyNumber(Integer number) {
        mNumber = number;
    }
    public List<AssemblerCmd> compile(Map<String, Integer> symbolTable) {
        List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
        AssemblerCmd ldc = new LDC(mNumber);
        result.add(ldc);
        return result;
    }
    public Integer stackSize() {
        return 1;
    }    
    public String toString() {
        return "MyNumber(" + mNumber.toString() + ")";
    }
}
