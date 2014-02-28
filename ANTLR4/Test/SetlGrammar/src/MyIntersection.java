
public class MyIntersection extends Expr{

	MySet mSet;
	
	
	public MyIntersection(Expr set)
	{
		if(set.eval() instanceof MySet){
			mSet = (MySet)set.eval();
		}else{
			System.err.println("Fehler bei dem Versuch MyIntersection(" + set.toString() + ") auszufuehren! MyIntersection erwartet eine Menge!");
			System.exit(1);
		}
		
	}
	
	public Value eval()
	{
		return new MySet(mSet.mSet.intersection(mSet.mSet));
	}
	
	public String toString()
	{
		return " */ " + mSet.toString();
	}
}
