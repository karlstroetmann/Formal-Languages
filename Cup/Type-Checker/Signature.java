/**
 * This class represents a signature of a function, like, e.g.
 * signature concat: T * list(T) -> list(T);
 */

import java.util.*;

public class Signature {
    private String     mName;    // function name
    private List<Type> mArgList; // list of argument types
    private Type       mResult;  // type of result

    public Signature(String name, List<Type> argList, Type result) {
        mName    = name;
        mArgList = argList;
        mResult  = result;
    }
    public Boolean equals(Signature rhs) {
        if (!(rhs instanceof Signature)) {
            return false;
        }
        if(!mName.equals(rhs.mName)) {
            return false;
        }
        if(!mArgList.equals(rhs.mArgList)) {
            return false;
        }
        if(!mResult.equals(rhs.mResult)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<Type> getArgList() {
        return mArgList;
    }
    public Type getResult() {
        return mResult;
    }
    public String myString() {
        String result = mName + ": ";
		if (mArgList.size() > 0) {
			result += mArgList.get(0).myString();
		}
		for (int i = 1; i < mArgList.size(); ++i) {
			result += " * " + mArgList.get(i).myString();
		}
		if (mArgList.size() > 0) {
			result += " -> " + mResult.myString() + ";";
		} else {
			result += mResult.myString() + ";";
		}
		return result;
    }
    public String toString() {
        return   "Signature(" + mName + ", " + mArgList.toString() + ", " 
			   + mResult.toString() + ")";
    }
}
