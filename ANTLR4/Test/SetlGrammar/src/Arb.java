
public class Arb extends Expr{
	Expr mSetOrList;
    
    public Arb(Expr setOrList) {
    	mSetOrList = setOrList;
    }
    
    public Value eval() {
    	
    	Value value = mSetOrList.eval();
    	   	
    	if (value instanceof MySet){
			MySet set  =  (MySet) mSetOrList.eval();
			return set.arb();
		}
    	
    	System.out.println("Fehler! Funktion Arb wurde ein falsches Argument uebergeben.");

    	System.out.println(this.toString());
    	System.out.println(value.toString());
    	
    	return null;
    }
    
    public String toString() {
        return "arb(" + mSetOrList.toString() + ")";
    }
}
