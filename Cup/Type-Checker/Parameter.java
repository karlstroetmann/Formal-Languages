/**
 * This class represents a type parameter.
 */
public class Parameter extends Type {
    private String mName;

    public Parameter(String name) {
        mName = name;
    }
	public Type substitute(Parameter var, Type tau) {
		if (mName.equals(var.getName())) {
			return tau;
		}
		return this;
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
        return "Parameter(" + mName + ")";
    }
    public String myString() {
        return mName;
    }
}
