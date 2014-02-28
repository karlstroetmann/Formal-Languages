// This class collects all variable bindings.
import java.util.*;

public class Environment {
    List<HashMap<String, Double>> mVarBindings;

    public Environment() {
        mVarBindings = new ArrayList<HashMap<String, Double>>();
        HashMap<String, Double> map = new HashMap<String, Double>();
        mVarBindings.add(map);
    }
    // copy constructor
    public Environment(Environment e) {
        mVarBindings = new ArrayList<HashMap<String, Double>>();
        for (HashMap<String, Double> m: e.mVarBindings) {
            mVarBindings.add(m);
        }
    }
    public Environment add(HashMap<String, Double> map) {
        Environment result = new Environment(this);
        result.mVarBindings.add(map);
        return result;
    }

    public Double findValue(String var) {
        for (int i = mVarBindings.size() - 1; i >= 0; --i) {
            HashMap<String, Double> map = mVarBindings.get(i);
            Double result = map.get(var);
            if (result != null) {
                return result;
            }
        }
        return null;
    }
    public void putValue(String var, Double value) {
        for (int i = mVarBindings.size() - 1; i >= 0; --i) {
            HashMap<String, Double> map = mVarBindings.get(i);
            Double result = map.get(var);
            if (result != null) {
                map.put(var, value);
                return;
            }
        }
        System.err.println("Variable " + var + " not found!");
    }
    public void addVar(String var) {
        int top = mVarBindings.size() - 1;
        HashMap<String, Double> map = mVarBindings.get(top);
        map.put(var, 0.0);
    }
}