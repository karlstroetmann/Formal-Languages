import java.util.*;

public class Closure implements Producer<MarkedRule> {
    Grammar mGrammar;

    public Closure(Grammar grammar) {
    mGrammar = grammar;
    }
    public Set<MarkedRule> produce(MarkedRule rule) {
        Set<MarkedRule> result = new TreeSet<MarkedRule>();
        Variable firstVar = rule.getFirstVar();    
        if (firstVar == null) {
            return result;
        }
        for (SimpleRule r: mGrammar.mSimpleRules) {
            if (r.getHead().equals(firstVar)) {
                MarkedRule mr = new MarkedRule(r);
                result.add(mr);
            }
        }
        return result;
    }
}