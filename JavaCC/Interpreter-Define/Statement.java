import java.util.*;

public abstract class Statement {
    // map containing all function definitions
    public static HashMap<String, Definition> sFunctionTable = new HashMap<String, Definition>();

    public abstract void execute(Environment e) throws ReturnException;
}
