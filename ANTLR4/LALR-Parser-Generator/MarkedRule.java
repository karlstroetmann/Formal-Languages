import java.util.*; 

/*  Diese Klasse repräsentiert die erweiterte markierte Regel
    mHead -> mFirst * mSecond : mFollow.
*/
public class MarkedRule implements Comparable<MarkedRule>
{
    private Variable mHead;
    private Body     mFirst;
    private Body     mSecond;

    /* Transformiert eine Regel rule = A -> alpha und eine Menge follow von Folge-Token
       in die markierte Regel A -> * alpha : follow.
    */
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
        return mHead  .equals(rhs.getHead())  && 
               mFirst .equals(rhs.getFirst()) &&
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
