import java.util.*;

public class Grammar {
    private List<Rule> mRules;

    public Grammar(List<Rule> rules) {
        mRules = rules;
    }
    EarleyItem startItem() {
        Variable start = startVar();
        List<Item> alphaList = new ArrayList<Item>();
        List<Item> betaList  = new ArrayList<Item>();
        betaList.add(start);
        Body alpha = new Body(alphaList);
        Body beta  = new Body(betaList);
        Variable newStart = new Variable("$Start");
        return new EarleyItem(newStart, alpha, beta, 0);
    }
    EarleyItem finishItem() {
        Variable start = startVar();
        List<Item> alphaList = new ArrayList<Item>();
        List<Item> betaList  = new ArrayList<Item>();
        alphaList.add(start);
        Body alpha = new Body(alphaList);
        Body beta  = new Body(betaList);
        Variable newStart = new Variable("$Start");
        return new EarleyItem(newStart, alpha, beta, 0);
    }
    Variable startVar() {
        Rule firstRule = mRules.get(0);
        return firstRule.getVariable();
    }
    public List<Rule> getRules() {
        return mRules;
    }
    public String toString() {
        String result = "";
        for (Rule rule : mRules) {
            result += rule;
        }                  
        return result;
    }
}
