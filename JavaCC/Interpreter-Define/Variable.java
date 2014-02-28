public class Variable extends Expr {
	String mName;
	
	public Variable(String name) {
		mName = name;
	}	
	public Double eval(Environment e) throws ReturnException {
		return e.findValue(mName);
	}
	public String toString() {
		return mName;
	}
}
