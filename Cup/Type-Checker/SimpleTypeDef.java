/**
 * This represents a simple type definition like, e.g.
 * expr := add(expr, expr) + sub(expr, expr) + number.
 */

import java.util.*;

public class SimpleTypeDef extends TypeDef {
    private String     mName;
    private List<Type> mTypeSum;

    public SimpleTypeDef(String name, List<Type> typeSum) {
        mName = name;
        mTypeSum = typeSum;
    }
    public Boolean equals(TypeDef rhs) {
        if (!(rhs instanceof SimpleTypeDef)) {
            return false;
        }
        SimpleTypeDef r = (SimpleTypeDef) rhs;
        if(!mName.equals(r.mName)) {
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
    public List<Type> getTypeSum() {
        return mTypeSum;
    }
    public String myString() {
        String result = mName.toString() + " = ";
		if (mTypeSum.size() > 0) {
			result += mTypeSum.get(0).myString();
		}
		for (int i = 1; i < mTypeSum.size(); ++i) {
			result += " + " + mTypeSum.get(i).myString();
		}
		result += ";";
		return result;
    }
    public String toString() {
        return "SimpleTypeDef(" + mName + ", " + mTypeSum.toString() + ")";
    }
}
