import java.util.List;

public class Print extends Statement {
    List<Expr> mArgs;
    
    public Print(List<Expr> args) {
        mArgs = args;
    }
	
    public void execute() {
        for (Expr arg: mArgs) {
            System.out.print(arg.eval());
        }
        System.out.println();
    }
	
    public String toString() {
	
		String printStmnt = "print(";
        for (int i = 0; i < mArgs.size(); ++i) {
            if (i > 0) {
                printStmnt += ", ";
			}
			printStmnt += mArgs.get(i);
        }
		
        printStmnt += ");";
        
        return printStmnt;
    }
	
}