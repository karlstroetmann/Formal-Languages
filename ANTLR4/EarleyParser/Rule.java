import java.util.*; 

public class Rule {
    private Variable   mHead;
    private List<Body> mBodyList;

    public Rule(String head, List<Body> bodyList) {
        mHead     = new Variable(head);
        mBodyList = bodyList;
    }
    // Generate all Earley items of the form <mHead -> * body, i>, where
    // body is any element of the list mBodyList.
    public Set<EarleyItem> generateRules(int i) {
	Set<EarleyItem> result = new TreeSet<EarleyItem>();
	for (Body beta: mBodyList) {
	    Body alpha = new Body(new ArrayList<Item>());
	    result.add(new EarleyItem(mHead, alpha, beta, i));
	}
	return result;
    }
    public Variable getVariable() {
        return mHead;
    }
    public List<Body> getBodyList() {
        return mBodyList;
    }
    public String toString() {
        String result = "";
        result += mHead + "\n";
		result += "    : " + mBodyList.get(0) + "\n";
        for (int i = 1; i < mBodyList.size(); ++i) {
            result += "    | " + mBodyList.get(i) + "\n";
        }
		result += "    ;\n\n";
        return result;
    }
}
