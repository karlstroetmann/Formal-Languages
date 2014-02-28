import java.math.BigInteger;

public class MyDouble extends Expr {
    Double mValue;
    
    public MyDouble(String value) {
        mValue = new Double(value);
    }    
    public DoubleValue eval(Environment e) {
        return new DoubleValue(mValue);
    }
}
