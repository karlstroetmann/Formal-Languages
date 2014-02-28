/**
 * This class represents a parameterized type definition like, e.g.
 * type list(X) := nil + cons(X, list(X));
 */

import java.util.*;

public class ParamTypeDef extends TypeDef {
    private String         mName;
    private List<Parameter> mParameters;
    private List<Type>     mTypeSum;

    public ParamTypeDef(String name, List<Parameter> parameters, List<Type> typeSum) {
        mName       = name;
        mParameters = parameters;
        mTypeSum    = typeSum;
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
    public List<Parameter> getParameters() {
        return mParameters;
    }
    public List<Type> getTypeSum() {
        return mTypeSum;
    }
    public String myString() {
		String result;
		result = mName + "(" + mParameters.get(0);
		for (int i = 1; i < mParameters.size(); ++i) {
			result += ", " + mParameters.get(i);
		}
		result += ") = " + mTypeSum.get(0).myString();
		for (int i = 1; i < mTypeSum.size(); ++i) {
			result += " + " + mTypeSum.get(i).myString();
		}
		result += ";";
		return result;
    }
    public String toString() {
        return "ParamTypeDef(" + mName + ", " + mParameters.toString() + 
			   ", " + mTypeSum.toString() + ")";
    }
}
