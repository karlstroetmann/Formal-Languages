import java.math.BigInteger;

//wandelt den String, der dem Konstruktor uebergeben wird in eine Zahl um
public class MyNumberWrapper extends Expr {

	String mVal;
	
	public MyNumberWrapper(String val){
		mVal = val;
	}
	
	public Value eval() {
		
		BigInteger modVal = new BigInteger(mVal);
		
		return new MyNumber(modVal);
	}
	
	public String toString(){
		return mVal;
	}

}
