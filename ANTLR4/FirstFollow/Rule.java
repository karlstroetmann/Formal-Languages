import java.util.*; 

public class Rule {
    private String     mHead;
    private List<Body> mBodyList;

    public Rule(String head, List<Body> bodyList) {
        mHead     = head;
        mBodyList = bodyList;
    }
    public String getHead() {
        return mHead;
    }
    public List<Body> getBodyList() {
        return mBodyList;
    }
    public String toString() {
	String result = "";
	result += mHead + " ->";
	result += "\n        " + mBodyList.get(0);
	for (int i = 1; i < mBodyList.size(); ++i) {
	    result += "\n      | ";
	    result += mBodyList.get(i);
	}
	result += "\n      ;\n";
        return result;
    }
}
