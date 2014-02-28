import java.util.*;

public abstract class Expr {
	public static HashMap<String, Double> sValueTable = new HashMap<String, Double>();
	
	public abstract Double eval();
}


