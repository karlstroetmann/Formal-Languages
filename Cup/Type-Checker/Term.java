/** 
 * This class represents a term like, e.g.
 * concat(cons(x, nil), cons(y, cons(z, nil))) 
 */

import java.util.*;

public class Term {
    private String    mFunction;
    private List<Term> mTermList;

    public Term(String function, List<Term> termList) {
        mFunction = function;
        mTermList = termList;
    }
    public List<Equation> typeEqs(Type tau, Map<String, Signature> map) {
        Signature sign = map.get(mFunction);
        if (sign == null) {
            System.err.println("The function " + mFunction + " has not been declared!");
            throw new Error("Undeclared function in " + myString());
        }
        List<Type> argTypes = sign.getArgList();
        if (argTypes.size() != mTermList.size()) {
            System.err.println("Wrong number of parameters for function " + mFunction);
            System.err.println("expected: " + argTypes.size());
            System.err.println("found:    " + mTermList.size());
            throw new Error("Wrong number of parameters in " + myString());
        }
        List<Equation> result = new LinkedList<Equation>();
        Equation eq = new Equation(sign.getResult(), tau);
        result.add(eq);
        for (int i = 0; i < mTermList.size(); ++i) {
            Term argI   = mTermList.get(i);
            Type sigmaI = argTypes.get(i);
            result.addAll( argI.typeEqs(sigmaI, map) );
        }
        return result;
    }

    public Boolean equals(Term rhs) {
        if (!(rhs instanceof Term)) {
            return false;
        }
        if(!mFunction.equals(rhs.mFunction)) {
            return false;
        }
        if(!mTermList.equals(rhs.mTermList)) {
            return false;
        }
        return true;
    }
    public String getFunction() {
        return mFunction;
    }
    public List<Term> getTermList() {
        return mTermList;
    }
    public String myString() { 
        String result = mFunction;
        if (mTermList.size() > 0) {
            result += "(" + mTermList.get(0).myString();
        }
        for (int i = 1; i < mTermList.size(); ++i) {
            result += ", " + mTermList.get(i).myString();
        }
        if (mTermList.size() > 0) {
            result += ")";
        }
        return result;        
    }
    public String toString() {
        return "Term(" + mFunction + ", " + mTermList.toString() + ")";
    }
}
