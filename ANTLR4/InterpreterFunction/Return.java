public class Return extends Statement {
    Expr mResult;
    
    public Return(Expr result) {
        mResult = result;
    }
    public void execute(Environment e) throws ReturnException {
        if (mResult != null) {
            throw new ReturnException(mResult.eval(e));
        } else {
            throw new ReturnException(null);
        }
    }
}