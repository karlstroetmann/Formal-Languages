public class MyNumber extends Expr {
	Double mValue;
	
	public MyNumber(String value) {
		mValue = new Double(value);
	}	
	public Double eval(Environment e) throws ReturnException {
		return mValue;
	}
	public String toString() {
		return mValue.toString();
	}
}
