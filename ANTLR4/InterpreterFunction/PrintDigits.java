public class PrintDigits extends Statement {
    Expr mArg;
    Expr mNumber;
    
    public PrintDigits(Expr arg, Expr number) {
        mArg    = arg;
        mNumber = number;
    }
    public void execute(Environment e) {
        Value   value = mArg.eval(e);
        Integer n = ((RationalValue) mNumber.eval(e)).toInteger();
        if (value instanceof RationalValue) {
            RationalValue rational = (RationalValue) value;
            System.out.println(rational.toString(n + 1));
        } else {
            System.out.println(value);
        }
    }
}