import java.util.*;

public class Read extends Statement {
    Variable mLhs;
    
    public Read(Variable lhs) {
        mLhs = lhs;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> "); // write prompt
        System.out.flush();
        Double value = scanner.nextDouble();
        Expr.sValueTable.put(mLhs.mName, value);
    }

    public String toString(int l) {
        return nBlanks(l * 4) + mLhs + "= read();";
    }    
}