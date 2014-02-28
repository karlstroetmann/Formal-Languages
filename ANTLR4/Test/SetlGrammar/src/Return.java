import java.math.BigInteger;

public class Return extends Statement {
    Expr mResult;
    
    public Return(Expr result) {
        mResult = result;
    }
    public void execute() throws ReturnException {
        if (mResult != null) {
            throw new ReturnException(mResult.eval());
        } else {
            throw new ReturnException(new MyNumber(BigInteger.valueOf(0)));
        }
    }
    public String toString() {
        return "return " + mResult + ";";        
    }
}