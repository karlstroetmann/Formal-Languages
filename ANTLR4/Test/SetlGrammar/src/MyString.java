
public class MyString extends Value{

	String mValue;
	
	public MyString(String value){
		mValue = value;
	}

	public Value add(Value rhs) {
		
		String myRhs = rhs.toString();
		String con = mValue.concat(myRhs);
		
		return new MyString(con);
	}
	
	//methode gibt es nicht fuer strings, 
	//muss aber implementiert werden weil es eine abstr. methode von value ist
	public Value sub(Value rhs) {
		return null;
	}

	//methode gibt es nicht fuer strings, 
	//muss aber implementiert werden weil es eine abstr. methode von value ist
	public Value mul(Value rhs) {
		return null;
	}

	//methode gibt es nicht fuer strings, 
	//muss aber implementiert werden weil es eine abstr. methode von value ist
	public Value div(Value rhs) {
		return null;
	}

	public Boolean eq(Value rhs) {
		
		String myRhs = rhs.toString();
		
		if(mValue.equals(myRhs))
			return true;
		return false;
	}

	//methode gibt es nicht fuer strings, 
	//muss aber implementiert werden weil es eine abstr. methode von value ist
	public Boolean lt(Value rhs) {
		return null;
	}
	
	//Vergleicht die laengen der strings
	//gibt 0 zurueck wenn gleich lang,
	//wert groesser 0 wenn der vergleichsstring groesser, wert kleiner 0 wenn vergleichsstring kleiner
	public int compareTo(Value rhs) {
		
		String myRhs = rhs.toString();
		
		return mValue.compareTo(myRhs);
	}
	
	public Value power(Value rhs) {
		  return null;
	}

	//methode gibt es nicht fuer strings, 
	//muss aber implementiert werden weil es eine abstr. methode von value ist
	public Value mod(Value rhs) {
		return null;
	}

	public Value eval(){
		return new MyString(mValue);
	}
	
	public String toString(){
		return mValue.toString();
	}
}
