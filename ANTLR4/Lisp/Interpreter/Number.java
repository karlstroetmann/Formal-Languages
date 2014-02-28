package Interpreter;

public class Number extends SymbolicExpression {
	Double mNumber;

	public Number(String number) {
		mNumber = new Double(number);
	}
	public Number(double number) {
		mNumber = number;
	}
    public Double getNumber() { return mNumber; }
	public SymbolicExpression eval() {
		return this;
	}
	public String toString() { return mNumber + ""; }
}