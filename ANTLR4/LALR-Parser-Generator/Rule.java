import java.util.*; 

public class Rule {
    private Variable   mHead;
    private List<Body> mBodyList;

    public Rule(Variable head, List<Body> bodyList) {
        mHead     = head;
        mBodyList = bodyList;
    }
    public Variable getHead() {
        return mHead;
    }
    public List<Body> getBodyList() {
        return mBodyList;
    }
    public String toString() {
	String result = "";
	result += mHead + " ->";
	if (mBodyList.size() > 0) {
	    result += "\n        " + mBodyList.get(0);
	}
	for (int i = 1; i < mBodyList.size(); ++i) {
	    result += "\n      | ";
	    result += mBodyList.get(i);
	}
	result += "\n      ;\n";
        return result;
    }
}
