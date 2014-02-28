public class Variable extends Expr 
{
	String mName;
	
	public Variable(String name) {
		mName = name;
	}	
	public Expr diff(Variable x) {
		if (mName.equals(x.mName)) {
			return new MyNumber("1");
		}
        return new MyNumber("0");
	}
	public String toString() {
		return mName;
	}
}
