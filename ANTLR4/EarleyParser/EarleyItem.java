import java.util.*;

/* This object represents an earley item of the form
   < variable -> alpha * beta, index >.
*/
public class EarleyItem implements Comparable {
    Variable mVariable;
    Body     mAlpha;
    Body     mBeta;
    Integer  mIndex;

    public EarleyItem(Variable variable, Body alpha, Body beta, Integer index) {
        mVariable = variable;
        mAlpha    = alpha;
        mBeta     = beta;
        mIndex    = index;
    }

    public int compareTo(Object rhs) {
        EarleyItem rhsItem = (EarleyItem) rhs;
        int result = mVariable.compareTo(rhsItem.getVariable());
        if (result != 0) {
            return result;
        }
        result = mAlpha.compareTo(rhsItem.mAlpha);
        if (result != 0) {
            return result;
        }
        result = mBeta.compareTo(rhsItem.mBeta);
        if (result != 0) {
            return result;
        }
        return mIndex.compareTo(rhsItem.getIndex());
    }

    public Boolean isComplete() {
        return mBeta.getItemList().size() == 0;
    }
    // check, whether the item following the dot is the same as the variable 
    // given as argument.
    public Boolean sameVar(Variable C) {
        if (mBeta.getItemList().size() > 0) {
            Item first = mBeta.getItemList().get(0);
            if (first instanceof Variable) {
                Variable v = (Variable) first;
                return v.equals(C);
            }
        }
        return false;
    }
    // check, whether the item following the dot is the same as the character 
    // given as argument.
    public Boolean scan(char a) {
        if (mBeta.getItemList().size() > 0) {
            Item first = mBeta.getItemList().get(0);
            if (first instanceof Literal) {
                Literal v = (Literal) first;
                return a == v.getChar();
            }
        }
        return false;
    }
    // Return the variable following the dot.  If there is no variable following
    // the dot, return null.
    public Variable nextVar() {
        if (mBeta.getItemList().size() > 0) {
            Item first = mBeta.getItemList().get(0);
            if (first instanceof Variable) {
                return (Variable) first;
            }
        }
        return null;
    }

    public EarleyItem moveDot() {
        List<Item> alphaList = new ArrayList<Item>();
        List<Item> betaList  = new ArrayList<Item>();
        alphaList.addAll(mAlpha.getItemList());
        betaList .addAll(mBeta .getItemList());
        Item next = betaList.get(0);
        alphaList.add(next);
        betaList.remove(0);
        Body alpha = new Body(alphaList);
        Body beta  = new Body(betaList);
        return new EarleyItem(mVariable, alpha, beta, mIndex);    
    }
    public Variable getVariable() {
        return mVariable;
    }
    public Integer getIndex() {
        return mIndex;
    }
    public String toString() {
        return "<" + mVariable + " -> " + mAlpha + "(*)" + mBeta + ", " + mIndex + ">";
    }
}
