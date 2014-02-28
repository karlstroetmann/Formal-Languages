import java.math.BigInteger;

public class MyNumber extends Value {
    BigInteger mValue;
    
    public MyNumber(BigInteger value) {
        mValue = value;
    }    

    public Value add(Value rhs){
        
        MyNumber myRhs = (MyNumber)rhs;
        BigInteger sum = mValue.add(myRhs.mValue);
        
        return new MyNumber(sum);
    }
    
    public Value sub(Value rhs){
        
        MyNumber myRhs = (MyNumber)rhs;
        BigInteger diff = mValue.subtract(myRhs.mValue);
        
        return new MyNumber(diff);
    }
    
    public Value mul(Value rhs){
        
        MyNumber myRhs = (MyNumber)rhs;
        BigInteger prod = mValue.multiply(myRhs.mValue);
        
        return new MyNumber(prod);
    }
    
    public Value div(Value rhs){
        
        MyNumber myRhs = (MyNumber)rhs;
        BigInteger quo = mValue.divide(myRhs.mValue);
        
        return new MyNumber(quo);
    }
    
    public Value power(Value rhs){
        MyNumber myRhs = (MyNumber)rhs;
        BigInteger pow = mValue.pow(myRhs.mValue.intValue());
        
        return new MyNumber(pow);
    }
    
    public String toString() {
        return mValue.toString();
    }

    public Boolean eq(Value rhs) {
        
        MyNumber myRhs = (MyNumber) rhs;
        
        return mValue.equals(myRhs.mValue);
    }

    public Boolean lt(Value rhs) {

        MyNumber myRhs = (MyNumber) rhs;
        int cmp = mValue.compareTo(myRhs.mValue);
        
        if(cmp < 0)
            return true;
            
        return false;
    }
    
    public int compareTo(Value rhs) {

        MyNumber myRhs = (MyNumber) rhs;
        int cmp = mValue.compareTo(myRhs.mValue);
        
        return cmp;
    }
    
    public Value mod(Value rhs) {
        MyNumber myRhs = (MyNumber)rhs;
        BigInteger mod = mValue.mod(myRhs.mValue);
        
        return new MyNumber(mod);
    }
    
    public BigInteger getValue() {
        return mValue;
    }

    public Value eval() {
        return new MyNumber(mValue);
    }
}
