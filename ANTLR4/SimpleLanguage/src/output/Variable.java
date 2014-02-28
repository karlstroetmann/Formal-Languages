package output;
public class Variable extends Expr {
    String mName;
    
    public Variable(String name) {
        mName = name;
    }    
    public Double eval() {
        return sValueTable.get(mName);
    }
    public String toString() {
        return mName;
    }
}
