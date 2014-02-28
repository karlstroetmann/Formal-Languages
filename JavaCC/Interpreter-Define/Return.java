public class Return extends Statement {
	Expr mResult;
	
	public Return(Expr result) {
		mResult = result;
	}
	public void execute(Environment e) throws ReturnException {
		Double result = mResult.eval(e);
		throw new ReturnException(result);
	}
	public String toString() {
		return "return " + mResult + ";";		
	}
}