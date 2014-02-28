import java.util.*;

public class Closure implements Producer<MarkedRule> {
    Grammar mGrammar;

    public Closure(Grammar grammar) {
        mGrammar = grammar;
    }
    public Set<MarkedRule> produce(MarkedRule rule) {
        Set<MarkedRule> result   = new TreeSet<MarkedRule>();
        Variable        firstVar = rule.getFirstVar();    
        if (firstVar == null) {
            return result;
        }
        List<Item>   il  = rule.getRest();
        Set<MyToken> fts = rule.getFollow().getSet();
        for (SimpleRule r: mGrammar.mSimpleRules) {
            if (r.getHead().equals(firstVar)) {
                ComparableSet<MyToken> follow = mGrammar.cmpFirst(il, fts);
                MarkedRule mr = new MarkedRule(r, follow);
                result.add(mr);
            }
        }
        return result;
    }
}