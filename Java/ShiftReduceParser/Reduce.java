public class Reduce extends Action {
    private Rule mRule;
    
    public Reduce(Rule rule) {
        mRule = rule;
    }
    Rule getRule() {
        return mRule;
    }
    public String toString() {
        return "reduce " + mRule;
    }
}