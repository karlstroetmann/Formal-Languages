import java.util.*;

// This class collects the variable bindings and the function definitions.
public class Environment {
    // this maps variable names to the corresponding values
    private HashMap<String, Value> mVarBindings;

    // this map contains all function definitions
    private static HashMap<String, Definition> sFunctionTable = 
        new HashMap<String, Definition>();

    public Environment() {
        mVarBindings = new HashMap<String, Value>();
    }
    public Value findValue(String var) {
        return mVarBindings.get(var);
    }
    public void putValue(String var, Value value) {
        mVarBindings.put(var, value);
    }
    public static Definition getFunction(String fctName) {
        return sFunctionTable.get(fctName);
    }
    public static Definition putFunction(String fctName, Definition fctDef) {
        return sFunctionTable.put(fctName, fctDef);
    }
}