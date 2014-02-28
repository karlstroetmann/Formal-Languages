public class Substitution {
    private List<Parameter> mVariables;
    private List<Type> mTypes;

    public Substitution(List<Parameter> variables, List<Type> types) {
        mVariables = variables;
        mTypes = types;
    }
    public Boolean equals(Substitution rhs) {
        if (!(rhs instanceof Substitution)) {
            return false;
        }
        if(!mVariables.equals(rhs.mVariables)) {
            return false;
        }
        if(!mTypes.equals(rhs.mTypes)) {
            return false;
        }
        return true;
    }
    public List<Parameter> getVariables() {
        return mVariables;
    }
    public List<Type> getTypes() {
        return mTypes;
    }
    public String toString() {
        return "Substitution(" + mVariables.toString() + ", " + mTypes.toString() + ")";
    }
}
