public class MyNumber extends Expr {
	Double mValue;
	
	public MyNumber(String value) {
		mValue = new Double(value);
	}	
	public Expr diff(Variable x) {
		return new MyNumber("0");
	}
	public String toString() {
		return mValue.toString();
	}
}
