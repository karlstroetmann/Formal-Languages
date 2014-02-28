public class Print extends Statement {
	Expr mArg;
	
	public Print(Expr arg) {
		mArg = arg;
	}
	public void execute(Environment e) throws ReturnException {
		System.out.println(mArg.eval(e));
	}
	public String toString() {
		return "print(" + mArg + ");";
	}
}