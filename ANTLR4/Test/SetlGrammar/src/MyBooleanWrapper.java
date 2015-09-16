public class MyBooleanWrapper extends Expr{
	String mValue;
	
	public MyBooleanWrapper(String value){
		mValue = value; 
	}
	
	public MyBoolean eval(){
		Boolean bValue = new Boolean(mValue);
		return new MyBoolean(bValue);	
	}
	
	public String toString() {
		return mValue;
	}
}
