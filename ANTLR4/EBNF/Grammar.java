import java.util.*;

public class Grammar {
    private List<Rule> mRules;
    private List<Rule> mRegexpRules;

    public Grammar(List<Rule> rules, List<Rule> regexpRules) {
        mRules = rules;
        mRegexpRules = regexpRules;
    }
    public List<Rule> getRules() {
        return mRules;
    }
    public String toString() {
        String result = "";
        for (Rule rule : mRules) {
            result += rule.toString(true);
        }
        result += "\n\n";
        for (Rule rule : mRegexpRules) {
            result += rule.toString(false);
        }          
        return result;
    }
}
