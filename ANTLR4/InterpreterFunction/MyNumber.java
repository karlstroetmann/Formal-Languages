import java.math.BigInteger;

public class MyNumber extends Expr {
    BigInteger mValue;
    
    public MyNumber(String value) {
        mValue = new BigInteger(value);
    }    
    public RationalValue eval(Environment e) {
        return new RationalValue(mValue, new BigInteger("1"));
    }
}
