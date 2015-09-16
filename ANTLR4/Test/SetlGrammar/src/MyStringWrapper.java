
public class MyStringWrapper extends Expr{
		
	String mVal;
	
	public MyStringWrapper(String val){
		mVal = val;
	}
	
	public MyString eval(){
		return new MyString(mVal);
	}
	
	public String toString(){
		return mVal;
	}
}
