package output;
public class Print extends Statement {
	Expr mArg;
	
	public Print(Expr arg) {
		mArg = arg;
	}
	public void execute() {
		System.out.println(mArg.eval());
	}
	public String toString() {
		return "print(" + mArg + ");";
	}
}