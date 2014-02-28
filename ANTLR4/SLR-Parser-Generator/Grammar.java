import java.util.*;
import java.io.PrintStream;

public class Grammar {
    protected Set<SimpleRule> mSimpleRules;
    private List<Rule>    mRules;
    private Set<MyToken>  mTokenSet;
    private Set<Variable> mVariableSet;
    private Set<Variable> mNullable;
    private Map<Variable, Set<MyToken>> mFirst;
    private Map<Variable, Set<MyToken>> mFollow;
    // die Menge aller Zustände des Parsers
    private Set<ComparableSet<MarkedRule>> mStates;  
    private ComparableSet<MarkedRule> mStartState;
    private SimpleRule    mStartRule;
    private MarkedRule    mAcceptRule;
    // Kodierung der Zustände als Zahlen. Jedem Zustand ist eine eindeutige
    // Zahl >= 0 zugeordnet.
    private Map<ComparableSet<MarkedRule>, Integer> mStateNumbers;
    private Integer mCount;  // Anzahl aller Zustände
    // Diese Abbildung ordnet jedem Zustand eine eindeutige Zahl zu,
    // mit deren Hilfe wir später den Zuständen Namen wie "s0", "s1", ...
    // zuordnen können.
    private Map<ComparableSet<MarkedRule>, Map<MyToken, Action>> mActionTable;
    // In dieser Tabelle werden die Zustände durch die Zahlen aus der Tabelle
    // mStateNumbers kodiert.
    private Map<Integer, Map<Variable, Integer>> mGotoTable;
    // Diese Abbildung ordnet jedem Token eine eindeutige Zahl zu,
    // mit deren Hilfe wir später den Token Namen wie "t0", "t1", ...
    // zuordnen können.
    private Map<MyToken, Integer> mTokenNumbers;
    // Diese Abbildung ordnet jeder Regel eine eindeutige Zahl zu,
    // mit deren Hilfe wir später den Regeln Namen wie "rule1", "rule2", ...
    // zuordnen können.
    private Map<SimpleRule, Integer> mRuleMap;

    public Grammar(List<Rule> rules) {
        mRules       = rules;
        mVariableSet = new TreeSet<Variable>();
        mTokenSet    = new TreeSet<MyToken>();
        mSimpleRules = new TreeSet<SimpleRule>();
        augmentGrammar(rules);
        for (Rule r: mRules) {
            Variable head = r.getHead();
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
        mTokenSet.add(new MyToken("$"));
        System.out.println("Tokens:    " + mTokenSet    + "\n");
        System.out.println("Variables: " + mVariableSet + "\n");
        System.out.println("Grammar: ");
        for (SimpleRule s: mSimpleRules) {
            System.out.println(s);
        }
        System.out.println("\n");
        mNullable = new TreeSet<Variable>();
        mFirst    = new TreeMap<Variable, Set<MyToken>>();
        mFollow   = new TreeMap<Variable, Set<MyToken>>();
        for (Variable v: mVariableSet) {
            Set<MyToken> emptyFirst = new TreeSet<MyToken>();
            mFirst .put(v, emptyFirst);
            Set<MyToken> emptyFollow = new TreeSet<MyToken>();
            mFollow.put(v, emptyFollow);
        }
        computeNullable();
        computeFirst();
        computeFollow();
        for (Variable v : mVariableSet) {
             // System.out.println("nullable(" + v + ") = " + mNullable.contains(v));
             // System.out.println("First(   " + v + ") = " + mFirst.get(v));
             System.out.println("Follow(  " + v + ") = " + mFollow.get(v));
        }
        System.out.println("\n");
        MarkedRule start = new MarkedRule(mStartRule);
        Set<MarkedRule> startSet = new TreeSet<MarkedRule>();
        startSet.add(start);
        mStartState = new ComparableSet<MarkedRule>(closure(startSet));
        mStates     = allStates(mStartState);
        computeNumbers();
        fillActionTable();
        fillGotoTable();
        try {
            writeParseTable();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Diese Funktion ordnet jedem Zustand eine eindeutige Zahl zu,
    // mit deren Hilfe wir später den Zuständen Namen wie "s0", "s1", ...
    // zuordnen können.  Die Zuordnung wird in der Variablen mStateNumbers
    // gespeichert.
    void computeNumbers() {
        mCount = 0;
        mStateNumbers = new TreeMap<ComparableSet<MarkedRule>, Integer>();
        for (ComparableSet<MarkedRule> state: mStates) {
            mStateNumbers.put(state, mCount);
            int offset = (int) Math.floor(5 + Math.log10(Math.max(mCount, 1)));
            System.out.println("s" + mCount + " = " + state.toString(offset));
            System.out.println();
            ++mCount;
        }
    }

    // Diese Funktion ruft die Funktion action() für alle möglichen Eingaben auf
    // und speichert das Ergebnis in der Tabelle mActionTable ab.  Gleichzeitig
    // wird die Tabelle am Bildschirm ausgegeben.
    void fillActionTable() {
        System.out.println("Action Table:");
        mActionTable = new TreeMap<ComparableSet<MarkedRule>, Map<MyToken, Action>>();
        for (ComparableSet<MarkedRule> state: mStates) {
            Integer stateNumber = mStateNumbers.get(state);
            Map<MyToken, Action> stateMap = new TreeMap<MyToken, Action>();
            for (MyToken t: mTokenSet) {
                Action a = action(state.getSet(), t);
                if (a != null) {
                    stateMap.put(t, a);
                    System.out.println("action(s" + stateNumber + ", " 
                                       + t + ") = " + a.toString(mStateNumbers));
                }
            }
            mActionTable.put(state, stateMap);
        }
    }

    // Diese Funktion ruft die Funktion gotoFct(s, v) für alle möglichen Zustände
    // s und Variablen v auf und speichert das Ergebnis in der Tabelle mGotoTable ab.
    // Gleichzeitig wird die Tabelle am Bildschirm ausgegeben.
    void fillGotoTable() {
        System.out.println("\nGoto Table:");
        mGotoTable = new TreeMap<Integer, Map<Variable, Integer>>();
        for (ComparableSet<MarkedRule> state: mStates) {
            Integer argNumber = mStateNumbers.get(state);
            Map<Variable, Integer> map = new TreeMap<Variable, Integer>();
            for (Variable v: mVariableSet) {
                Set<MarkedRule> ruleSet = gotoFct(state.getSet(), v);
                if (!ruleSet.isEmpty()) {
                    ComparableSet<MarkedRule> cs = new ComparableSet<MarkedRule>(ruleSet);
                    Integer resultNumber = mStateNumbers.get(cs);
                    map.put(v, resultNumber);
                    System.out.println("goto(s" + argNumber + ", " + v + 
                                       ") = s" + resultNumber);
                }
            }
            mGotoTable.put(argNumber, map);
	    // print state transitions on terminals also
            for (MyToken t: mTokenSet) {
                Set<MarkedRule> ruleSet = gotoFct(state.getSet(), t);
                if (!ruleSet.isEmpty()) {
                    ComparableSet<MarkedRule> cs = new ComparableSet<MarkedRule>(ruleSet);
                    Integer resultNumber = mStateNumbers.get(cs);
                    System.out.println("goto(s" + argNumber + ", " + t + 
                                       ") = s" + resultNumber);
                }
            }
        }
    }

    // Diese Funktion berechnet alle vom Start-Zustand aus erreichbaren Folge-Zustände.
    // Der Start-Zustand wird als Argument übergeben.
    Set<ComparableSet<MarkedRule>> allStates(ComparableSet<MarkedRule> start) {
        // result ist die Menge aller vom Start-Zustand aus erreichbaren Folge-Zustände.
        Set<ComparableSet<MarkedRule>> result = new TreeSet<ComparableSet<MarkedRule>>();
        result.add(start);
        // recentStates ist die Menge der Zustände, die bei der letzten Iteration neu hinzu
        // gekommen sind.
        Set<ComparableSet<MarkedRule>> recentStates = result;
        // newStates sammelt die Zustände auf, die bei der laufenden Iteration neu hinzu kommen.
        Set<ComparableSet<MarkedRule>> newStates    = new TreeSet<ComparableSet<MarkedRule>>();
        while (!recentStates.isEmpty()) {
            for (ComparableSet<MarkedRule> state: recentStates) {
                for (MyToken t: mTokenSet) {
                    if (t.getName().equals("$")) {
                        continue;
                    }
                    Set<MarkedRule> rs = gotoFct(state.getSet(), t);
                    if (rs.isEmpty()) {
                        continue;
                    }
                    ComparableSet<MarkedRule> crs = new ComparableSet<MarkedRule>(rs);
                    if (result.add(crs)) {
                        newStates.add(crs);
                    }
                }
                for (Variable v: mVariableSet) {
                    Set<MarkedRule> rs = gotoFct(state.getSet(), v);
                    if (rs.isEmpty()) {
                        continue;
                    }
                    ComparableSet<MarkedRule> crs = new ComparableSet<MarkedRule>(rs);
                    if (result.add(crs)) {
                        newStates.add(crs);
                    }
                }
            }
            recentStates = newStates;
            newStates    = new TreeSet<ComparableSet<MarkedRule>>();
        }
        return result;
    }

    /* Diese Funktion führt ein neues Start-Symbol S ein und erweitert
       die Grammatik um die Regel
       S -> E $,
       wobei E das alte Start-Symbol ist.
    */
    void augmentGrammar(List<Rule> rules) {
        Rule       firstRule = rules.get(0);
        Variable   start     = new Variable("S");
        Variable   startVar  = firstRule.getHead();
        List<Item> items1    = new ArrayList<Item>();
        items1.add(startVar);
        Body       body1     = new Body(items1);
        mStartRule = new SimpleRule(start, body1);
        List<Item> items2    = new ArrayList<Item>();
        items2.add(startVar);
        Body       body2     = new Body(items2);
        List<Item> items3    = new ArrayList<Item>();
        Body       body3     = new Body(items3);
        mAcceptRule = new MarkedRule(start, body2, body3);
        mSimpleRules.add(mStartRule);
        mVariableSet.add(start);
    }
    
    //  Diese Funktion berechnet den Abschluss einer markierten Regel.
    Set<MarkedRule> closure(Set<MarkedRule> rules) {
        Closure cl = new Closure(this);
        return ComparableSet.fixpoint(cl, rules);
    }

    // Berechnet die Funktion goto(r, t)
    Set<MarkedRule> gotoFct(MarkedRule rule, Item t) {
        Set<MarkedRule> result = new TreeSet<MarkedRule>();
        Body first  = rule.getFirst();
        Body second = rule.getSecond();
        List<Item> itemsRest = second.getItemList();
        if (itemsRest.isEmpty()) {
            return result;
        }
        Item next = itemsRest.get(0);
        if (next.equals(t)) {
            List<Item> newFirstList = new ArrayList<Item>();
            newFirstList.addAll(first.getItemList());
            newFirstList.add(next);
            Body newFirst = new Body(newFirstList);
            List<Item> newSecondList = new ArrayList<Item>();
            newSecondList.addAll(itemsRest.subList(1, itemsRest.size()));
            Body       newSecond = new Body(newSecondList);
            Variable   head      = rule.getHead();
            MarkedRule newRule   = new MarkedRule(head, newFirst, newSecond);
            result.add(newRule);
        }
        return result;
    }

    Set<MarkedRule> gotoFct(Set<MarkedRule> rules, Item t) {
        Set<MarkedRule> result = new TreeSet<MarkedRule>();
        for (MarkedRule r: rules) {
            result.addAll(gotoFct(r, t));
        }
        return closure(result);
    }

    Action action(Set<MarkedRule> ruleSet, MyToken t) {
        Action result = null;
        for (MarkedRule r: ruleSet) {
            // check if we have an accept action
            if (t.getName().equals("$") && r.equals(mAcceptRule)) {
                Accept ac = new Accept();
                if (result != null) {
                    System.out.println("");
                    System.out.println("Conflict on action(" + ruleSet + ", " + t + "):");
                    System.out.println(result);
                    System.out.println(ac);
                    System.out.println("");
                    if (result instanceof Shift) {
                        result = new Conflict("shift-reduce");
					} else {
                        result = new Conflict("reduce-reduce");
                    }
                } else {
                    result = ac;
                }
            }
            List<Item> rest = r.getSecond().getItemList();
            // check if we have a reduce action
            if (rest.isEmpty()) {
                Variable h = r.getHead();
                Set<MyToken> follow = mFollow.get(h);
                if (follow.contains(t)) {
                    Reduce ra = new Reduce(new SimpleRule(r));
                    if (result != null) {
                        System.out.println("");
                        System.out.println("Conflict on action(" + ruleSet + ", " + t + "):");
                        System.out.println(result);
                        System.out.println(ra);
                        System.out.println("");
                        if (result instanceof Shift) {
                            result = new Conflict("shift-reduce");
				        } else {
                            result = new Conflict("reduce-reduce");
                        }
                    } else {
                        result = ra;
                    } 
                }    
            } else {
                if (rest.get(0).equals(t) && !t.getName().equals("$")) {
                    Shift shift = new Shift(gotoFct(ruleSet, t));
                    if (result != null && !(result instanceof Shift)) {
                        System.out.println("");
                        System.out.println("Conflict on action(" + ruleSet + ", " + t + "):");
                        System.out.println(result);
                        System.out.println(shift);
                        System.out.println("");
                        result = new Conflict("shift-reduce");                
                    } else {
                        result = shift;
                    }
                }
            }
        }
        return result;
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

    void writeParseTable() throws Exception {
        createTokenMap();
        createRuleMap();
        PrintStream stream = new PrintStream("ParseTable.out");
        stream.println("import java.util.*;\n");
        stream.println("public class ParseTable {");
        stream.println("Map<Pair<State, Symbol>, Action> mActionTable;");
        stream.println("Map<Pair<State, Symbol>, State>  mGotoTable;  ");
        stream.println("public ParseTable() {");        
        stream.println("mActionTable = new TreeMap<Pair<State, Symbol>,  Action>();");

        for (int i = 0; i < mCount; ++i) {
            stream.println("State s" + i + " = new State(" + i + ");");
        }

        stream.println("Symbol t0 = new Symbol( 0, \"EOF\");");
        for (MyToken t: mTokenSet) {
            int tn = mTokenNumbers.get(t);
            if (tn != 0) {
                String name = t.getName();
                if (name.charAt(0) == '\'') {
                    name = name.substring(1, 2);
                }
                stream.println("Symbol t" + tn + " = new Symbol( " + tn + ", \"" + name + "\");");
            }
        }

        for (Variable v: mVariableSet) {
            String upper = v.getName().toUpperCase();
            if (upper.equals("S")) {
                continue;
            }
            stream.println("Symbol " + v + " = new Symbol(Symbol." + upper + ", \"" + v + "\" );");
        }
        
        for (SimpleRule r: mSimpleRules) {
            if (r.getHead().getName().equals("S")) {
                continue;
            }
            int c = mRuleMap.get(r);
            stream.println("// " + r);
            stream.println("List<Symbol> body" + c + " = new ArrayList<Symbol>();");
            stream.println("Symbol head" + c + " = " + r.getHead() + ";");
            for (Item it: r.getBody().getItemList()) {
                stream.print("body" + c + ".add(");
                if (it instanceof MyToken) {
                    MyToken t = (MyToken) it;
                    stream.print("t" + mTokenNumbers.get(t));
                } else {
                    stream.print(it.toString());
                }
                stream.println(");");
            }
            stream.println("Rule rule" + c + " = new Rule(head" + c + ", body" + c + ");");
        }

        for (ComparableSet<MarkedRule> state: mStates) {
            Integer sn = mStateNumbers.get(state);
            for (MyToken t: mTokenSet) {
                int tn = mTokenNumbers.get(t);
                Action a  = action(state.getSet(), t);
                if (a != null) {
                    stream.print("mActionTable.put(new Pair<State, Symbol>(s" + 
                                 sn + ", t" + tn + "), new ");
                }
                if (a instanceof Shift) {
                    Shift sa = (Shift) a;
                    stream.println("Shift(s" + mStateNumbers.get(sa.getState()) + "));");
                } else if (a instanceof Reduce) {
                    Reduce ra = (Reduce) a;
                    stream.println("Reduce(rule" + mRuleMap.get(ra.getRule()) + "));");
                } else if (a instanceof Accept) {
                    stream.println("Accept());");
                }
            }
        }

        stream.println("mGotoTable = new TreeMap<Pair<State, Symbol>, State>();");
        for (ComparableSet<MarkedRule> state: mStates) {
            Integer sn = mStateNumbers.get(state);
            for (Variable v: mVariableSet) {
                Set<MarkedRule> ruleSet = gotoFct(state.getSet(), v);
                if (!ruleSet.isEmpty()) {
                    ComparableSet<MarkedRule> cs = new ComparableSet<MarkedRule>(ruleSet);
                    Integer rn = mStateNumbers.get(cs);
                    stream.println("mGotoTable.put(new Pair<State, Symbol>(s" + sn + 
                                   ", " + v + "), s" + rn + ");");
                }
            }
        }

        stream.println("}");
        stream.println("}");
        stream.close();
    }

    void createTokenMap() {
        mTokenNumbers = new TreeMap<MyToken, Integer>();
        MyToken dollarToken = new MyToken("$");
        mTokenNumbers.put(dollarToken, 0);
        int i = 1; 
        for (MyToken t: mTokenSet) {
            if (!t.equals(dollarToken)) {
                mTokenNumbers.put(t, i);
                ++i;
            }
        }
    }

    void createRuleMap() {
        mRuleMap = new TreeMap<SimpleRule, Integer>();
        int i = 1; 
        for (SimpleRule r: mSimpleRules) {
            mRuleMap.put(r, i);
            ++i;
        }
    }

}
