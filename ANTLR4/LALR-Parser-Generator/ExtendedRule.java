import java.util.*; 

/*  Diese Klasse repräsentiert die erweiterte markierte Regel
    mHead -> mFirst * mSecond : mFollow.
*/
public class ExtendedRule implements Comparable<ExtendedRule>
{
    private Variable               mHead;
    private Body                   mFirst;
    private Body                   mSecond;
    private ComparableSet<MyToken> mFollow;

    /* Transformiert eine Regel rule = A -> alpha und eine Menge follow von Folge-Token
       in die markierte Regel A -> * alpha : follow.
    */
    public ExtendedRule(SimpleRule rule, ComparableSet<MyToken> follow) {
        mHead   = rule.getHead();
        mFirst  = new Body();
        mSecond = rule.getBody();
        mFollow = follow;
    }
    public ExtendedRule(Variable head, Body first, Body second, ComparableSet<MyToken> follow) {
        mHead   = head;
        mFirst  = first;
        mSecond = second;
        mFollow = follow;
    }

    // This method assumes that this.similar(rhs) == true.  
    public ExtendedRule extendedUnion(ExtendedRule rhs) {
        ComparableSet<MyToken> follow = mFollow.union(rhs.mFollow);
        return new ExtendedRule(mHead, mFirst, mSecond, follow);
    }    

    /* It is assumed that mFirst is empty. If mSecond starts with a variable, 
       then this variable is returned.  Otherwise, the method returns null.
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
    /* If mSecond starts with a variable, then the list of all items following 
       this variable is returned.  Otherwise, the method returns null.
    */
    public List<Item> getRest() {
        if (mSecond.getItemList().isEmpty()) {
            return null;
        }
        Item first = mSecond.getItemList().get(0);
        List<Item> result = null;
        if (first instanceof Variable) {
            result = mSecond.getItemList().subList(1, mSecond.size());
        }
        return result;
    }

    public Variable               getHead()   { return mHead;   }
    public Body                   getFirst()  { return mFirst;  }
    public Body                   getSecond() { return mSecond; }
    public ComparableSet<MyToken> getFollow() { return mFollow; }

    public int compareTo(ExtendedRule rhs) {
        int cmpHead = mHead.compareTo(rhs.getHead());
        if (cmpHead != 0) {
            return cmpHead;
        }
        int cmpFirst = mFirst.compareTo(rhs.getFirst());
        if (cmpFirst != 0) {
            return cmpFirst;
        }
        int cmpSecond = mSecond.compareTo(rhs.getSecond());
        if (cmpSecond != 0) {
            return cmpSecond;
        }
        return mFollow.compareTo(rhs.getFollow());
    }
    public boolean equals(ExtendedRule rhs) {
        return mHead  .equals(rhs.getHead())    && 
               mFirst .equals(rhs.getFirst())   &&
               mSecond.equals(rhs.getSecond())  &&
               mFollow.equals(rhs.getFollow());
    }
    // Diese Methode abstrahiert von der Menge der Folge-Token.
    public boolean similar(ExtendedRule rhs) {
        return mHead  .equals(rhs.getHead())    && 
               mFirst .equals(rhs.getFirst())   &&
               mSecond.equals(rhs.getSecond());
    }
    public MarkedRule strip() {
        return new MarkedRule(mHead, mFirst, mSecond);
    }

    public static ComparableSet<MarkedRule>
        stripSet(ComparableSet<ExtendedRule> extRules) 
    {
        ComparableSet<MarkedRule> result = new ComparableSet<MarkedRule>();
        for (ExtendedRule r: extRules) {
            result.add(r.strip());
        }    
        return result;
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
        result += ": " + mFollow;
        return result;
    }
}
