import java.util.*;

public class Grammar {
    private List<Rule> mRules;

    public Grammar(List<Rule> rules) {
        mRules = rules;
    }
    public String toString() {
        String result = "";
        result += "<HTML>\n";
        result += "<HEAD>\n";
        result += "<TITLE>Grammar</TITLE>\n";
        result += "</HEAD>\n";
        result += "<BODY>\n";
        result += "<TABLE>\n";
        for (Rule rule : mRules) {
            result += rule;
        }          
        result += "</TABLE>\n";
        result += "</BODY>\n";
        result += "</HTML>\n";    
        
        return result;
    }
}
