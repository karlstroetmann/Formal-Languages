import java.util.*;

public class Substitution {
    private List<Parameter> mParameters;
    private List<Type>     mTypes;

    public Substitution(List<Parameter> variables, List<Type> types) {
        mParameters = variables;
        mTypes = types;
    }
    public Substitution substitute(Parameter var, Type tau) {
        List<Type> newTypes = new LinkedList<Type>();
        for (Type sigma: mTypes) {
            newTypes.add(sigma.substitute(var, tau));
        }
        mParameters.add(var);
        newTypes.add(tau);
        return new Substitution(mParameters, newTypes);
    }
    public Boolean equals(Substitution rhs) {
        if (!(rhs instanceof Substitution)) {
            return false;
        }
        if(!mParameters.equals(rhs.mParameters)) {
            return false;
        }
        if(!mTypes.equals(rhs.mTypes)) {
            return false;
        }
        return true;
    }
    public List<Parameter> getParameters() {
        return mParameters;
    }
    public List<Type> getTypes() {
        return mTypes;
    }
    public String toString() {
        return "Substitution(" + mParameters.toString() + ", " + mTypes.toString() + ")";
    }
}
