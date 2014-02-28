import java.util.*; 

public class SimpleRule implements Comparable<SimpleRule>
{
    private Variable mHead;
    private Body     mBody;

    public SimpleRule(Variable head, Body body) {
        mHead = head;
        mBody = body;
    }
    public Variable getHead() {
        return mHead;
    }
    public Body getBody() {
        return mBody;
    }
    public int compareTo(SimpleRule rhs) {
        int cmpHead = mHead.compareTo(rhs.getHead());
        if (cmpHead != 0) {
            return cmpHead;
        }
        return mBody.compareTo(rhs.getBody());
    }
    public String toString() {
        String result = "";
        result += mHead + " -> ";
        result += mBody;
        return result;
    }
}
