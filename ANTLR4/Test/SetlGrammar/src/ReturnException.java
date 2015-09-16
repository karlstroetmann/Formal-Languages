@SuppressWarnings("serial")
public class ReturnException extends RuntimeException {
    Value mResult;
    
    public ReturnException(Value result) {
        mResult = result;
    }
}