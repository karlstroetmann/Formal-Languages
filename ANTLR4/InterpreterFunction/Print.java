import java.util.List;

public class Print extends Statement {
    List<PrintExpr> mArgs;
    
    public Print(List<PrintExpr> args) {
        mArgs = args;
    }
    public void execute(Environment e) {
        for (PrintExpr arg: mArgs) {
            arg.print(e);
        }
        System.out.println();
    }
}