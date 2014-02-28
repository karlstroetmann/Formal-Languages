import java.util.*; 

/*  Diese Klasse repräsentiert die markierte Regel
        mHead -> mFirst * mSecond.
 */
public class MarkedRule implements Comparable<MarkedRule>
{
    private Variable mHead;
    private Body     mFirst;
    private Body     mSecond;

    public MarkedRule(SimpleRule rule) {
        mHead   = rule.getHead();
        mFirst  = new Body();
        mSecond = rule.getBody();
    }
    public MarkedRule(Variable head, Body first, Body second) {
        mHead   = head;
        mFirst  = first;
        mSecond = second;
    }

    /* If the body of the rule starts with a variable, then this variable is 
       returned.  Otherwise, the method returns null.
    */
    public Variable getFirstVar() {
        if (mSecond.getItemList().isEmpty()) {
            return null;
        }
        Item first = mSecond.getItemList().get(0);
        Variable result = null;
        if (first instanceof Variable) {
            result = (Variable) first;
        }
        return result;
    }

    public Variable getHead()   { return mHead;   }
    public Body     getFirst()  { return mFirst;  }
    public Body     getSecond() { return mSecond; }

    public int compareTo(MarkedRule rhs) {
        int cmpHead = mHead.compareTo(rhs.getHead());
        if (cmpHead != 0) {
            return cmpHead;
        }
    int cmpFirst = mFirst.compareTo(rhs.getFirst());
        if (cmpFirst != 0) {
            return cmpFirst;
        }
        return mSecond.compareTo(rhs.getSecond());
    }
    public boolean equals(MarkedRule rhs) {
        return mHead  .equals(rhs.getHead())    && 
               mFirst .equals(rhs.getFirst())   &&
               mSecond.equals(rhs.getSecond());
    }
    public String toString() {
        String result = "";
        result += mHead + " -> ";
        result += mFirst;
	if (mFirst.size() > 0 && mSecond.size() > 0) {
	    result += " <*> ";
	} else if (mFirst.size() == 0 && mSecond.size() >  0) {
	    result += "<*> ";
	} else if (mFirst.size() >  0 && mSecond.size() == 0) {
	    result += " <*>";
	} else if (mFirst.size() == 0 && mSecond.size() == 0) {
	    result += "<*>";
	}
        result += mSecond;
        return result;
    }
}
