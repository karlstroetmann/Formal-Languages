//abstrakte Klasse fuer MyNumber, MyString, SetOrList
public abstract class Value implements Comparable<Value>{
	
	//dient dem Addieren von zwei Values
	public abstract Value add(Value rhs);

	//zum Subtrahieren von zwei Values
	public abstract Value sub(Value rhs);
	
	//zum Multiplizieren von zwei Values
	public abstract Value mul(Value rhs);
	
	//zum Dividieren von zwei Values
	public abstract Value div(Value rhs);
	
	//vergleicht zwei Values und gibt einen Boolean zurueck
	public abstract Boolean eq(Value rhs);
	
	//vergleicht ob !=
	public Boolean neq(Value rhs){
		return !(eq(rhs));
	}
	
	//vergleicht zwei values auf <
	public abstract Boolean lt(Value rhs);
	
	//vergleicht auf >
	public Boolean bi(Value rhs){
		return (!(lt(rhs)))&&(!(eq(rhs)));
	}
	
	//vergleicht zwei Values auf >=
	public Boolean bieq(Value rhs){
		return !(lt(rhs));
	}

	//vergleicht auf <=
	public Boolean ltoeq(Value rhs){
		return (lt(rhs)) || (eq(rhs));
	}

	 //gibt lhs ** rhs zurueck
	 public abstract Value power(Value rhs);
	
	//vergleicht zwei Values
	public abstract int compareTo(Value rhs);

	//gibt den Rest einer Division zurueck
	public abstract Value mod(Value rhs);
}
