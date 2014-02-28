import java.util.*;

public abstract class Expr {
	public abstract Double eval(Environment e) throws ReturnException;
}


