import java.util.*;

public abstract class Statement {
    static boolean isInteractive = false;

    public abstract void execute(Environment e) throws ReturnException;

    static void prompt() {
        if (isInteractive) {
            System.out.print("SL> ");
	    	System.out.flush();
	}
    }
}
