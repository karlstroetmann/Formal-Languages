import java.util.*;

public abstract class Expr {
    public static Map<String, Double> sValueTable = new HashMap<String, Double>();
    
    public abstract Double eval();
}


