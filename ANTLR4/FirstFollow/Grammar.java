import java.util.*;

// This class represents a set of grammar rules.  Furthermore, the
// constructor of this class checks, whether the grammar is LL(1).
public class Grammar {
    // The list of all rules as they are provided by the parser.
    // A single rule may have several alternatives, for example
    // the following is regarded as one rule:
    //    exprRest -> "+" product exprRest
    //             |  "-" product exprRest
    //             |  /* epsilon */
    private List<Rule> mRules;
    // The list of all simple rules. A simple rule has only one alternative.
    // For example, the rule given above for exprRest is translated into
    // the following simple rules:
    //    exprRest -> "+" product exprRest
    //    exprRest -> "-" product exprRest
    //    exprRest -> /* epsilon */
    private Set<SimpleRule> mSimpleRules;
    // The set of all tokens used by the grammar.
    private Set<MyToken> mTokenSet;
    // The set of all syntactical variables used by the grammar.
    private Set<Variable> mVariableSet;
    // the set of all Variable that derive the empty string
    private Set<Variable> mNullable;
    // This map codes the function First() which is defined as
    // First(A) := { t \in T | \exists \gamma \in (V \cup T)^*: A \Rightarrow^* t\gamma }
    private Map<Variable, Set<MyToken>> mFirst;
    // This map codes the function Follow() which is defined as
    // Follow(A) := 
    // { t \in T | \exists \beta,\gamma \in (V \cup \widehat{T})^*: 
    //             S \Rightarrow^* \beta A t \gamma                 }
    private Map<Variable, Set<MyToken>> mFollow;
    // This table defines a mapping p such that for every syntactical variable V
    // and every token t the value p(V, t) gives the set of rules that can be
    // applied to parse V.   If this set contains at most one rule for every 
    // variable V and every token t, then the grammar is LL(1).
    private Map<Variable, Map<MyToken, Set<SimpleRule>>> mParseTable;

    // The constructor builds the parse table and thereby checks, whether the 
    // grammar is LL(1).
    public Grammar(List<Rule> rules) {
        mRules       = rules;
        mVariableSet = new TreeSet<Variable>();
        mTokenSet    = new TreeSet<MyToken>();
        mSimpleRules = new TreeSet<SimpleRule>();
        for (Rule r: mRules) {
            Variable head = new Variable(r.getHead());
            mVariableSet.add(head);
            List<Body> bodyList = r.getBodyList();
            for(Body b: bodyList) {
                SimpleRule sr = new SimpleRule(head, b);
                mSimpleRules.add(sr);
            }
        }
        for (SimpleRule s: mSimpleRules) {
            Body b = s.getBody();
            for (Item i: b.getItemList()) {
                if (i instanceof MyToken) {
                    MyToken t = (MyToken) i;
                    mTokenSet.add(t);
                } else {
                    Variable v = (Variable) i;
                    mVariableSet.add(v);
                }
            }
        }
        System.out.println("\n");
        System.out.println("Tokens:    " + mTokenSet    + "\n");
        System.out.println("Variables: " + mVariableSet + "\n");
        System.out.println("Grammar Rules: \n");
        for (SimpleRule s: mSimpleRules) {
            System.out.println(s);
        }
        mNullable = new TreeSet<Variable>();
        mFirst    = new TreeMap<Variable, Set<MyToken>>();
        mFollow   = new TreeMap<Variable, Set<MyToken>>();
		System.out.println("\n");
        for (Variable v: mVariableSet) {
            Set<MyToken> emptyFirst = new TreeSet<MyToken>();
            mFirst.put(v, emptyFirst);
            Set<MyToken> emptyFollow = new TreeSet<MyToken>();
            mFollow.put(v, emptyFollow);
        }
        computeNullable();
        computeFirst();
        computeFollow();
		System.out.println("\n");
        for (Variable v : mVariableSet) {
            System.out.println("nullable(" + v + ") = " + mNullable.contains(v));
            System.out.println("First(" + v + ") = " + mFirst.get(v));
            System.out.println("Follow(" + v + ") = " + mFollow.get(v) + "\n");
        }
        // initialize the parse table
        mParseTable = new TreeMap<Variable, Map<MyToken, Set<SimpleRule>>>();
        computeParseTable();
        printParseTable();
    }

    void printParseTable() {
        System.out.println("\n\nParse Table\n");
        boolean isLL1 = true;
        for (Variable v: mVariableSet) {
            for (MyToken t: mTokenSet) {
                Set<SimpleRule> rules = mParseTable.get(v).get(t);
		        System.out.println( "parse(" + v + ", " + t + ") = " + rules );
                if (rules.size() > 1) {
                    isLL1 = false;
                }
            }
            System.out.println("");
        }
        System.out.println("The grammar " + (isLL1 ? "is" : "is not") + " LL(1).");
    }

    void computeParseTable() {
	// initialize parse(V,t) to the empty set
        for (Variable v : mVariableSet) {
            Map<MyToken, Set<SimpleRule>> tokenMap = 
    		new TreeMap<MyToken, Set<SimpleRule>>();
            for (MyToken t : mTokenSet) {
                Set<SimpleRule> ruleSet = new TreeSet<SimpleRule>();
                tokenMap.put(t, ruleSet);
            }
            mParseTable.put(v, tokenMap);
        }
        for (SimpleRule r : mSimpleRules) {
            Variable   head = r.getHead();
            List<Item> body = r.getBody().getItemList();
            Set<MyToken> first = computeFirst(body);
            enter(first, head, r);
            if (allNullable(body, 0, body.size() - 1)) {
                Set<MyToken> follow = mFollow.get(head);
                enter(follow, head, r);
            }
        }
    }

    // for all tokens t in ts, add rule r to parse(v, r)
    void enter(Set<MyToken> ts, Variable v, SimpleRule r) {
        for (MyToken t : ts) {
            Set<SimpleRule> rules = mParseTable.get(v).get(t);
            rules.add(r);
        }
    }

    void computeNullable() {
        boolean change = true;
        // computation of nullable variables
        while (change) {
            change = false;
            for (SimpleRule r : mSimpleRules) {                
                List<Item> items = r.getBody().getItemList();
                // check, whether all items are nullable
                boolean allNullable = true;
                for (Item i: items) {
                    if (i instanceof MyToken) {
                        allNullable = false;
                        break;
                    }
                    Variable v = (Variable) i;
                    if (!mNullable.contains(v)) {
                        allNullable = false;
                        break;
                    }
                }
                Variable head = r.getHead();
                if (allNullable && !mNullable.contains(head)) {
                    mNullable.add(head);
                    change = true;
                    System.out.println(r.getHead() + " is nullable");
                }
            }
        }
    }

    // computation of First sets.
    void computeFirst() {
        boolean change = true;
        while (change) {
            change = false;
            for (SimpleRule r : mSimpleRules) {                
                Variable   head  = r.getHead();
                List<Item> items = r.getBody().getItemList();
                Set<MyToken> firstSet = mFirst.get(head);
                for (Item i: items) {
                    if (i instanceof MyToken) {
                        if (!firstSet.contains(i)) { 
                            MyToken t = (MyToken) i;
                            firstSet.add(t);
                            change = true;
                        }
                        break;
                    }
                    Variable v = (Variable) i;
                    Set<MyToken> ts = mFirst.get(v);
                    if (!firstSet.containsAll(ts)) {
                        firstSet.addAll(ts);
                        change = true;
                    }
                    if (!mNullable.contains(v)) {
                        break;
                    }
                }
            }
        }
    }

    // compute the set of tokens that can start a word described
    // by the list items
    Set<MyToken> computeFirst(List<Item> items) {
        Set<MyToken> result = new TreeSet<MyToken>();
        for (Item i : items) {
            if (i instanceof MyToken) {
                MyToken t = (MyToken) i;
                result.add(t);
                return result;
            }
            Variable v = (Variable) i;
            result.addAll(mFirst.get(v));
            if (!mNullable.contains(v)) {
                return result;
            }
        }
        return result;
    }

    // computation of Follow sets
    void computeFollow() {
        boolean change = true;
        while (change) {
            change = false;
            for (SimpleRule r : mSimpleRules) {                
                Variable   head = r.getHead();
                List<Item> list = r.getBody().getItemList();
                Set<MyToken> followSetHead = mFollow.get(head);
                for (int i = 0; i < list.size(); ++i) {
                    Item item = list.get(i);
                    if (item instanceof MyToken) { 
                        continue;
                    }
                    Variable v = (Variable) item;
                    if (allNullable(list, i + 1, list.size() - 1)) {
                        Set<MyToken> followSet = mFollow.get(v);
                        if (!followSet.containsAll(followSetHead)) {
                            followSet.addAll(followSetHead);
                            change = true;
                        }
                    }
                }
                for (int i = 0; i < list.size() - 1; ++i) {
                    Item itemI = list.get(i);
                    if (itemI instanceof MyToken) { 
                        continue;
                    }
                    Variable     vi       = (Variable) itemI;
                    Set<MyToken> followVi = mFollow.get(vi);
                    for (int l = i + 1; l < list.size(); ++l) {
                        if (allNullable(list, i + 1, l - 1)) {
                            Item itemL = list.get(l);
                            if (itemL instanceof MyToken) { 
                                MyToken tokenL = (MyToken) itemL;
                                if (!followVi.contains(tokenL)) {
                                    followVi.add(tokenL);
                                    change = true;
                                }
                            } else {
                                Variable vl = (Variable) itemL;
                                Set<MyToken> firstVl = mFirst.get(vl);
                                if (!followVi.containsAll(firstVl)) {
                                    followVi.addAll(firstVl);
                                    change = true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // returns true if we have
    //    forall j in {i .. l}: nullable(list(j))
    boolean allNullable(List<Item> list, int i, int l) {
        for (int j = i; j <= l; ++j) {
            Item item = list.get(j);
            if (item instanceof MyToken) {
                return false;
            }
            Variable v = (Variable) item;
            if (!mNullable.contains(v)) {
                return false;
            }
        }
        return true;
    }

    public List<Rule> getRules() {
        return mRules;
    }
    public Set<SimpleRule> getSimpleRules() {
        return mSimpleRules;
    }
    public String toString() {
        String result = "";
        for (Rule rule : mRules) {
            result += rule + "\n";
        }               
        return result;
    }
}
