import java.util.*;

// This class collects the variable bindings and the function definitions.
public class Environment {
    private HashMap<String, Value> mVarBindings;

    // this map contains all function definitions
    private static HashMap<String, Definition> sFunctionTable = 
        new HashMap<String, Definition>();

    // this variable stores the variable assignment that is currently active
    private static Environment sEnvironment = new Environment();

    public Environment() {
        mVarBindings = new HashMap<String, Value>();
    }
    public static void setEnv(Environment newEnv) {
        sEnvironment = newEnv;
    }
    public static Environment getEnv() {
        return sEnvironment;
    }
    public static Value findValue(String var) {
        return sEnvironment.mVarBindings.get(var);
    }
    public static void putValue(String var, Value value) {
        sEnvironment.mVarBindings.put(var, value);
    }
    public static Definition getFunction(String fctName) {
        return sFunctionTable.get(fctName);
    }
    public static Definition putFunction(String fctName, Definition fctDef) {
        return sFunctionTable.put(fctName, fctDef);
    }
}