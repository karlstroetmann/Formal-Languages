public class Logarithm extends Expr
{
	Expr mArg;
	
	public Logarithm(Expr arg)
	{
		mArg = arg;
	}
	
	public Quotient diff(Variable x)
	{
		return new Quotient(mArg.diff(x), mArg);
	}
	
	public String toString()
	{
		return "ln(" + mArg + ")";
	}
}
