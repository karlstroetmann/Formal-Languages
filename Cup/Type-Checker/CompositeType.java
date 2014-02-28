/**
 * This class represents a composite type like map(string, list(int)).
 */
import java.util.*;

public class CompositeType extends Type {
    private String     mName;
    private List<Type> mArgTypes;

    public CompositeType(String name, List<Type> argTypes) {
        mName     = name;
        mArgTypes = argTypes;
    }
    public CompositeType(String name) {
        mName     = name;
        mArgTypes = new LinkedList<Type>();
    }
	public Type substitute(Parameter var, Type tau) {
		List<Type> newArgTypes = new LinkedList<Type>();
		for (Type sigma: mArgTypes) {
			newArgTypes.add( sigma.substitute(var, tau) );
		}
		CompositeType ct = new CompositeType(mName, newArgTypes);
		return ct;
	}
    public Boolean equals(Type rhs) {
        if (!(rhs instanceof CompositeType)) {
            return false;
        }
        CompositeType r = (CompositeType) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        if(!mArgTypes.equals(r.mArgTypes)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<Type> getArgTypes() {
        return mArgTypes;
    }
    public String myString() {
		if (mArgTypes.size() == 0) {
			return mName;
		}
		String result;
		result = mName + "(";
		result += mArgTypes.get(0).myString();
		for (int i = 1; i < mArgTypes.size(); ++i) {
			result += ", " + mArgTypes.get(i).myString();
		}
		result += ")";
		return result;
    }
    public String toString() {
        return "CompositeType(" + mName + ", " + mArgTypes.toString() + ")";
    }
}
