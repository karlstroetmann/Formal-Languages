import java.util.*;

public class Closure implements Producer<ExtendedRule> {
    Grammar mGrammar;

    public Closure(Grammar grammar) {
        mGrammar = grammar;
    }
    public TreeSet<ExtendedRule> produce(ExtendedRule rule) {
        TreeSet<ExtendedRule> result   = new TreeSet<ExtendedRule>();
        Variable            firstVar = rule.getFirstVar();    
        if (firstVar == null) {
            return result;
        }
        List<Item>   il  = rule.getRest();
        Set<MyToken> fts = rule.getFollow().getSet();
        for (SimpleRule r: mGrammar.mSimpleRules) {
            if (r.getHead().equals(firstVar)) {
                ComparableSet<MyToken> follow = mGrammar.cmpFirst(il, fts);
                ExtendedRule mr = new ExtendedRule(r, follow);
                result.add(mr);
            }
        }
        return result;
    }
}