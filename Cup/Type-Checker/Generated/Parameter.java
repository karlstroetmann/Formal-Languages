public class Parameter extends Type {
    private String mName;

    public Parameter(String name) {
        mName = name;
    }
    public Boolean equals(Type rhs) {
        if (!(rhs instanceof Parameter)) {
            return false;
        }
        Parameter r = (Parameter) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public String toString() {
        return "Parameter(" + mName.toString() + ")";
    }
}
