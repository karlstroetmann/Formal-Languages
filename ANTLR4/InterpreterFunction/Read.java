import java.util.*;

public class Read extends Statement {
    Variable mLhs;
    
    public Read(Variable lhs) {
        mLhs = lhs;
    }
    public void execute(Environment e) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> "); // write prompt
        System.out.flush();
        Double value = scanner.nextDouble();
        e.putValue(mLhs.mName, new DoubleValue(value));
    }
}