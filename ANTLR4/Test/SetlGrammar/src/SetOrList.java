import java.util.Iterator;


public abstract class SetOrList extends Value implements Iterable<Value> {

    public abstract Iterator<Value> iterator();
    
    public abstract Value add(Value aValue);
    
    public abstract Value sub(Value val);
    
    public abstract Value mul(Value val);
    
    public abstract Value div(Value val);
    
    public abstract Value power();
    
    //gibt zufaellig ein element der menge/liste zurueck
    public abstract Value arb();
    
    //implementiert die funktion #{..}, gibt die anzahl der elemente in einer menge/liste zurueck
    public abstract Value count();

    public abstract int size();
    public abstract Value get(int i);
    
    public abstract int compareTo(Value comp);
    
    public abstract Boolean eq(SetOrList rhs);
    
    public abstract Boolean gt(SetOrList rhs);
    
    public abstract Boolean lt(SetOrList rhs);
    
    public abstract Boolean eq(Value rhs);
    
    public abstract Boolean lt(Value rhs);
    
    public abstract Boolean in(Value value);
}
