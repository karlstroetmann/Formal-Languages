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
        result += "<TR>\n";
        result += "<TD ALIGN=RIGHT><A NAME=\"" + mHead + "\"><EM>" + mHead + "<EM></A></TD>\n";
        result += "<TD ALIGN=CENTER><TT>:</TT></TD>\n";
        result += "<TD>" +  mBodyList.get(0) + "</TD>";
        result += "</TR>\n";
        for (int i = 1; i < mBodyList.size(); ++i) {
            result += "<TR><TD></TD><TD><TT>|</TT></TD><TD>";
            result += mBodyList.get(i);
            result += "</TD></TR>\n";
        }
        result += "<TR><TD></TD><TD><TT>;</TT></TD><TR>\n\n";
        return result;
    }
}
