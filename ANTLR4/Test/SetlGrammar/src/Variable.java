public class Variable extends Expr {
    String mName;

    public Variable(String name) {
        mName = name;
    }
    
    //gibt den wert der variablen zurueck
    public Value eval() {
    	//System.out.println(mName);
        return Environment.findValue(mName);
    }
    
    public String toString() {
        return mName;
    }
}