import java.util.*;
import java.io.PrintStream;

public class Grammar {
    protected Set<SimpleRule> mSimpleRules;
    private List<Rule>    mRules;
    private Set<MyToken>  mTokenSet;
    private Set<Variable> mVariableSet;
    private Set<Variable> mNullable;
    private SimpleRule    mStartRule;
    private ExtendedRule  mAcceptRule;
    private Map<Variable, Set<MyToken>> mFirst;
    private Map<Variable, Set<MyToken>> mFollow;
    // die Menge aller Zustände des LR-Parsers
    private Set<ComparableSet<ExtendedRule>> mLRStates;  
    private Set<ComparableSet<ExtendedRule>> mStates;  
    private ComparableSet<ExtendedRule>      mStartState;
    // Kodierung der Zustände als Zahlen. Jedem Zustand ist eine eindeutige
    // Zahl >= 0 zugeordnet.
    private Map<ComparableSet<MarkedRule>, Integer> mStateNumbers;
    private Integer mCount;  // Anzahl aller Zustände
    // Diese Abbildung ordnet jedem Zustand eine eindeutige Zahl zu,
    // mit deren Hilfe wir später den Zuständen Namen wie "s0", "s1", ...
    // zuordnen können.
    private Map<ComparableSet<ExtendedRule>, Map<MyToken, Action>> mActionTable;
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
        MyToken dollar = new MyToken("$");
        ComparableSet<MyToken> follow = new ComparableSet<MyToken>();
        follow.add(dollar);
        ExtendedRule start = new ExtendedRule(mStartRule, follow);
        TreeSet<ExtendedRule> startSet = new TreeSet<ExtendedRule>();
        startSet.add(start);
        mStartState = new ComparableSet<ExtendedRule>(closure(startSet));
        // compute set of LR-items
        mLRStates = lrStates(mStartState);
        System.out.println("");
        System.out.println("number of LR states: " + mLRStates.size());
        mStates   = lalrStates();
        System.out.println("number of LALR states: " + mStates.size());
        System.out.println("");
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
        int offset = (int) Math.floor(5 + Math.log10(Math.max(mCount, 1)));
        for (ComparableSet<ExtendedRule> state: mStates) {
            ComparableSet<MarkedRule> stripped = ExtendedRule.stripSet(state);
            mStateNumbers.put(stripped, mCount);
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
        mActionTable = new TreeMap<ComparableSet<ExtendedRule>, Map<MyToken, Action>>();
        for (ComparableSet<ExtendedRule> state: mStates) {
            ComparableSet<MarkedRule> stripped = ExtendedRule.stripSet(state);
            Integer stateNumber = mStateNumbers.get(stripped);
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
        mGotoTable = new TreeMap<Integer, Map<Variable, Integer>>();
        for (ComparableSet<ExtendedRule> state: mStates) {
            ComparableSet<MarkedRule> stripped = ExtendedRule.stripSet(state);
            Integer argNumber = mStateNumbers.get(stripped);
            Map<Variable, Integer> map = new TreeMap<Variable, Integer>();
            for (Variable v: mVariableSet) {
                TreeSet<ExtendedRule> ruleSet = gotoFct(state.getSet(), v);
                if (!ruleSet.isEmpty()) {
                    ComparableSet<ExtendedRule> cs = new ComparableSet<ExtendedRule>(ruleSet);
                    ComparableSet<MarkedRule> csStripped = ExtendedRule.stripSet(cs);
                    Integer resultNumber = mStateNumbers.get(csStripped);
                    map.put(v, resultNumber);
                    System.out.println("goto(s" + argNumber + ", " + v + 
                                       ") = s" + resultNumber);
                }
            }
            mGotoTable.put(argNumber, map);
            // print state transitions on terminals also
            for (MyToken t: mTokenSet) {
                TreeSet<ExtendedRule> ruleSet = gotoFct(state.getSet(), t);
                if (!ruleSet.isEmpty()) {
                    ComparableSet<ExtendedRule> cs = new ComparableSet<ExtendedRule>(ruleSet);
                    ComparableSet<MarkedRule> csStripped = ExtendedRule.stripSet(cs);
                    Integer resultNumber = mStateNumbers.get(csStripped);
                    System.out.println("goto(s" + argNumber + ", " + t + 
                                       ") = s" + resultNumber);
                }
            }
        }
    }

    // Diese Funktion berechnet alle vom Start-Zustand aus erreichbaren Folge-Zustände.
    // Der Start-Zustand wird als Argument übergeben.
    Set<ComparableSet<ExtendedRule>> lrStates(ComparableSet<ExtendedRule> start) {
        // result ist die Menge aller vom Start-Zustand aus erreichbaren Folge-Zustände.
        Set<ComparableSet<ExtendedRule>> result = new TreeSet<ComparableSet<ExtendedRule>>();
        result.add(start);
        // recentStates ist die Menge der Zustände, die bei der letzten Iteration neu hinzu
        // gekommen sind.
        Set<ComparableSet<ExtendedRule>> recentStates = result;
        // newStates sammelt die Zustände auf, die bei der laufenden Iteration neu hinzu kommen.
        Set<ComparableSet<ExtendedRule>> newStates    = new TreeSet<ComparableSet<ExtendedRule>>();
        while (!recentStates.isEmpty()) {
            for (ComparableSet<ExtendedRule> state: recentStates) {
                for (MyToken t: mTokenSet) {
                    if (t.getName().equals("$")) {
                        continue;
                    }
                    TreeSet<ExtendedRule> rs = gotoFct(state.getSet(), t);
                    if (rs.isEmpty()) {
                        continue;
                    }
                    ComparableSet<ExtendedRule> crs = new ComparableSet<ExtendedRule>(rs);
                    if (result.add(crs)) {
                        newStates.add(crs);
                    }
                }
                for (Variable v: mVariableSet) {
                    TreeSet<ExtendedRule> rs = gotoFct(state.getSet(), v);
                    if (rs.isEmpty()) {
                        continue;
                    }
                    ComparableSet<ExtendedRule> crs = new ComparableSet<ExtendedRule>(rs);
                    if (result.add(crs)) {
                        newStates.add(crs);
                    }
                }
            }
            recentStates = newStates;
            newStates    = new TreeSet<ComparableSet<ExtendedRule>>();
        }
        return result;
    }

    Set<ComparableSet<ExtendedRule>> lalrStates() {
        Set<ComparableSet<ExtendedRule>> result = new TreeSet<ComparableSet<ExtendedRule>>();
        for (ComparableSet<ExtendedRule> state: mLRStates) {
            boolean added = false;
            Set<ComparableSet<ExtendedRule>> resultNew = new TreeSet<ComparableSet<ExtendedRule>>();
            for (ComparableSet<ExtendedRule> known: result) {
                if (isEquivalent(state, known)) {
                    ComparableSet<ExtendedRule> both = extendedUnion(state, known);
                    resultNew.add(both);
                    added = true;
                } else {
                    resultNew.add(known);
                }    
            }
            if (!added) {
                resultNew.add(state);
            } 
            result = resultNew;    
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
        ComparableSet<MyToken> fts = new ComparableSet<MyToken>();
        MyToken dollar = new MyToken("$");
        fts.add(dollar);
        mAcceptRule = new ExtendedRule(start, body2, body3, fts);
        mSimpleRules.add(mStartRule);
        mVariableSet.add(start);
    }
    
    //  Diese Funktion berechnet den Abschluss einer markierten Regel.
    TreeSet<ExtendedRule> closure(TreeSet<ExtendedRule> rules) {
        Closure cl = new Closure(this);
        return combine(ComparableSet.fixpoint(cl, rules));
    }

    // Diese Funktion fasst markierte Regeln zusammen, die sich nur in der Follow-Menge
    // unterscheiden.  Dabei wird ausgenutzt, dass die markierten Regeln in der als
    // Argument übergebenen Menge immer in solchen Blöcken auftreten, bei denen
    // sich nur die Follow-Mengen unterscheiden.  Das liegt daran, dass die Methode
    // compareTo die Follow-Mengen zweier markierten Regeln erst dann vergleicht,
    // wenn alle anderen Vergleiche keinen Unterschied ergeben haben.
    TreeSet<ExtendedRule> combine(TreeSet<ExtendedRule> rules) {
        if (rules.isEmpty()) {
            return rules;
        }
        TreeSet<ExtendedRule> result = new TreeSet<ExtendedRule>();
        ExtendedRule pr = null;   // previous rule
        ComparableSet<MyToken> follow = null;
        for (ExtendedRule r: rules) {
            if (pr == null) {
                pr = r;
                follow = r.getFollow();
                continue;
            }
            if (pr.similar(r)) {
                follow = follow.union(r.getFollow());
            } else {
                ExtendedRule nr = 
                    new ExtendedRule(pr.getHead(), pr.getFirst(), pr.getSecond(), follow);
                result.add(nr);
                follow = r.getFollow();
                pr = r;
            }
        }
        result.add(new ExtendedRule(pr.getHead(), pr.getFirst(), pr.getSecond(), follow));
        return result;
    }

    // Berechnet die Funktion goto(r, t)
    TreeSet<ExtendedRule> gotoFct(ExtendedRule rule, Item t) {
        TreeSet<ExtendedRule> result = new TreeSet<ExtendedRule>();
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
            Body         newSecond = new Body(newSecondList);
            Variable     head      = rule.getHead();
            ExtendedRule newRule   = 
                new ExtendedRule(head, newFirst, newSecond, rule.getFollow());
            result.add(newRule);
        }
        return result;
    }

    TreeSet<ExtendedRule> gotoFct(Set<ExtendedRule> rules, Item t) {
        TreeSet<ExtendedRule> result = new TreeSet<ExtendedRule>();
        for (ExtendedRule r: rules) {
            result.addAll(gotoFct(r, t));
        }
        result = closure(result);
        return result;
    }

    Action action(TreeSet<ExtendedRule> ruleSet, MyToken t) {
        Action result = null;
        for (ExtendedRule r: ruleSet) {
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
                ComparableSet<MyToken> follow = r.getFollow();
                if (follow.member(t) && !r.equals(mAcceptRule)) {
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
    TreeSet<MyToken> computeFirst(List<Item> items) {
        TreeSet<MyToken> result = new TreeSet<MyToken>();
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

    // compute the set of tokens that can start a string w that has the form
    // 
    //    w = li t
    //
    // where t is a token from fts.
    ComparableSet<MyToken> cmpFirst(List<Item> li, Set<MyToken> fts) {
        TreeSet<MyToken> result = computeFirst(li);
        if (allNullable(li, 0, li.size() - 1)) {
            result.addAll(fts);
        }
        return new ComparableSet<MyToken>(result);
    }

    ComparableSet<ExtendedRule> 
        extendedUnion(ComparableSet<ExtendedRule> lhs, ComparableSet<ExtendedRule> rhs)
    {
        TreeSet<ExtendedRule>  lhsSet  = lhs.getSet();
        TreeSet<ExtendedRule>  rhsSet  = rhs.getSet();
        Iterator<ExtendedRule> iterLhs = lhsSet.iterator();
        Iterator<ExtendedRule> iterRhs = rhsSet.iterator();
        TreeSet<ExtendedRule>  result  = new TreeSet<ExtendedRule>();
        while (iterLhs.hasNext() && iterRhs.hasNext()) {
            ExtendedRule lhsNext = iterLhs.next();
            ExtendedRule rhsNext = iterRhs.next();
            Variable   head    = lhsNext.getHead();
            Body       first   = lhsNext.getFirst();
            Body       second  = lhsNext.getSecond();
            ComparableSet<MyToken> follow = 
                lhsNext.getFollow().union(rhsNext.getFollow());
            result.add(new ExtendedRule(head, first, second, follow));
        }
        return new ComparableSet<ExtendedRule>(result);        
    }

    // Check whether every marked rule in lhs can be paired up with an equivalent
    // marked rule in rhs.  This method assumes the two sets are ordered lexicographically
    // and that in this ordering the rule is checked before the set of follow tokens.
    boolean isEquivalent(ComparableSet<ExtendedRule> lhs, ComparableSet<ExtendedRule> rhs) {
        TreeSet<ExtendedRule>  lhsSet  = lhs.getSet();
        TreeSet<ExtendedRule>  rhsSet  = rhs.getSet();
        Iterator<ExtendedRule> iterLhs = lhsSet.iterator();
        Iterator<ExtendedRule> iterRhs = rhsSet.iterator();
        while (iterLhs.hasNext() && iterRhs.hasNext()) {
            ExtendedRule lhsNext = iterLhs.next();
            ExtendedRule rhsNext = iterRhs.next();
            if (!lhsNext.similar(rhsNext)) {
                return false;
            }
        }
        if (iterLhs.hasNext() || iterRhs.hasNext()) {
            return false;
        }
        return true;
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

        for (ComparableSet<ExtendedRule> state: mStates) {
            ComparableSet<MarkedRule> stripped = ExtendedRule.stripSet(state);
            Integer sn = mStateNumbers.get(stripped);
            for (MyToken t: mTokenSet) {
                int tn = mTokenNumbers.get(t);
                Action a  = action(state.getSet(), t);
                if (a != null) {
                    stream.print("mActionTable.put(new Pair<State, Symbol>(s" + 
                                 sn + ", t" + tn + "), new ");
                }
                if (a instanceof Shift) {
                    Shift sa = (Shift) a;
                    ComparableSet<MarkedRule> saStripped = ExtendedRule.stripSet(sa.getState());
                    stream.println("Shift(s" + mStateNumbers.get(saStripped) + "));");
                } else if (a instanceof Reduce) {
                    Reduce ra = (Reduce) a;
                    stream.println("Reduce(rule" + mRuleMap.get(ra.getRule()) + "));");
                } else if (a instanceof Accept) {
                    stream.println("Accept());");
                }
            }
        }

        stream.println("mGotoTable = new TreeMap<Pair<State, Symbol>, State>();");
        for (ComparableSet<ExtendedRule> state: mStates) {
            ComparableSet<MarkedRule> stripped = ExtendedRule.stripSet(state);
            Integer sn = mStateNumbers.get(stripped);
            for (Variable v: mVariableSet) {
                TreeSet<ExtendedRule> ruleSet = gotoFct(state.getSet(), v);
                if (!ruleSet.isEmpty()) {
                    ComparableSet<ExtendedRule> cs = new ComparableSet<ExtendedRule>(ruleSet);
                    ComparableSet<MarkedRule>   csStripped = ExtendedRule.stripSet(cs);
                    Integer rn = mStateNumbers.get(csStripped);
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
