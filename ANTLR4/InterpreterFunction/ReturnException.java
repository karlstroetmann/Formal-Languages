public class ReturnException extends Exception {
    Value mResult;
    
    public ReturnException(Value result) {
        mResult = result;
    }
}