public class ParamTypeDef extends TypeDef {
    private String mName;
    private List<String> mParameters;
    private List<Type> mTypeSum;

    public ParamTypeDef(String name, List<String> parameters, List<Type> typeSum) {
        mName = name;
        mParameters = parameters;
        mTypeSum = typeSum;
    }
    public Boolean equals(TypeDef rhs) {
        if (!(rhs instanceof ParamTypeDef)) {
            return false;
        }
        ParamTypeDef r = (ParamTypeDef) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        if(!mParameters.equals(r.mParameters)) {
            return false;
        }
        if(!mTypeSum.equals(r.mTypeSum)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<String> getParameters() {
        return mParameters;
    }
    public List<Type> getTypeSum() {
        return mTypeSum;
    }
    public String toString() {
        return "ParamTypeDef(" + mName.toString() + ", " + mParameters.toString() + ", " + mTypeSum.toString() + ")";
    }
}
