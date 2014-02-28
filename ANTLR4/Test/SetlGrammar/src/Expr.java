import java.util.*;

public abstract class Expr {
    public abstract Value eval();
    
    public void print() {
        System.out.print(eval());
    }
    
}




