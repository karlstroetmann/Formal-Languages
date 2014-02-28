public class Postfix extends Expr {
    Expr   mArg;
    String mOperator;

    public Postfix(Expr arg, String operator) {
        mArg      = arg;
        mOperator = operator;
		
    }	
    public String toString(Boolean indent) {
        // syntactical lookahead has to be included in parentheses
        if (mOperator.equals("=>")) {
            return "(" + mArg.toString(false) + ")=>";
        }
        if (mArg instanceof Variable || mArg instanceof MyToken) {
            return mArg.toString(false) + mOperator;
        }
        return "(" + mArg.toString(false) + ")" + mOperator;
    }	
}
