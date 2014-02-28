public class ReturnException extends Exception {
    Double mResult;
    
    public ReturnException(Double result) {
        super();
        mResult = result;
    }
}