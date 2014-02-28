public class Variable extends Expr {
    String mName;
    
    public Variable(String name) {
        mName = name;
    }    
    public Value eval(Environment e) {
        return e.findValue(mName);
    }
}
