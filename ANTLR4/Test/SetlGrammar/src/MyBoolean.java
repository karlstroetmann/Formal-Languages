public class MyBoolean extends Value{
    Boolean mValue;            // boolscher Wert
    
    public MyBoolean(Boolean value) {
        mValue = value;
    }  
    
    public Value add(Value rhs){
        return null;
    }
    
    public Value sub(Value rhs){
        return null;
    }
    
    public Value mul(Value rhs){
        return null;
    }
    
    public Value div(Value rhs){
        return null;
    }
    
    public Boolean eq(Value rhs){
        return null;
    }
    
    public Boolean lt(Value rhs){
        return null;
    }

    public Value mod(Value rhs) {
        return null;
    }
    
     public Value power(Value rhs) {
          return null;
    }
    
    public String toString() {
        return mValue.toString();
    }

    public int compareTo(Value rhs)
    {
        return 10;
    }
}
