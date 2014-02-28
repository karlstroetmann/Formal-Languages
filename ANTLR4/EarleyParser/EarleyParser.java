import org.antlr.v4.runtime.*;
import java.util.*;
import java.io.*;

public class EarleyParser {

    private Grammar mGrammar; // grammar to use when parsing
    private String  mString;  // string to parse
    private int     mLength;  // length of string to parse

    private List<Set<EarleyItem>> mStateList;  // list of the Qi

    // Given a grammar and a string to parse, this constructor applies
    // the algorithm of early to parse the string with the given grammar.
    public EarleyParser(Grammar grammar, String string) {
        mGrammar = grammar;
        mString  = string;
        mLength  = mString.length();
        System.out.println("Grammar:\n");
        System.out.println(mGrammar);
        System.out.println("Input:\n");
        System.out.println(mString);
        mStateList = new ArrayList<Set<EarleyItem>>(mLength + 1);
        for (int i = 0; i <= mLength; ++i) {
            Set<EarleyItem> qi = new TreeSet<EarleyItem>();
            if (i == 0) {
                EarleyItem start = mGrammar.startItem();
                qi.add(start);
            }
            mStateList.add(qi);
        }
        parse();
    }

    // This method implements Earley's algorithm.  For all states Qi we 
    // apply the completion operation followed by the prediction operation.
    // This is done until no more no states are added to Qi.  The inner do-while
    // loop is not necessary in the case that the grammar contains not epsilon 
    // rules.  Finally, the scanning operation is applied to Qi.
    void parse() {
        // run Earley's algorithm
        for (int i = 0; i <= mLength; ++i) {
            System.out.println("i = " + i + ":\n");
            boolean change = false;
            do {
                change = complete(i);
                change = change || predict(i);
            } while (change);
            scan(i);
        }
        // print states
        for (int i = 0; i <= mLength; ++i) {
            System.out.println("\nQ" + i + ":");
            Set<EarleyItem> Qi = mStateList.get(i);
            for (EarleyItem item: Qi) {
                System.out.println(item);
            }
            if (i == mLength) {
                if (Qi.contains(mGrammar.finishItem())) {
                        System.out.println("Parsing successful!");
                } else {
                        System.out.println("Parsing failed!");
                }        
            }    
        }
    }

    // Apply the completion operation on the state Qi.  The parameter i
    // is the index of the state.
    boolean complete(int i) {
        boolean change = false;
        Set<EarleyItem> Qi = mStateList.get(i);
        boolean added = false;
        do {
            Set<EarleyItem> newQi = new TreeSet<EarleyItem>();
            for (EarleyItem item: Qi) {
                if (item.isComplete()) {
                    Variable C = item.getVariable();
                    int      j = item.getIndex();
                    Set<EarleyItem> Qj = mStateList.get(j);
                    for (EarleyItem cItem: Qj) {
                        if (cItem.sameVar(C)) {
                            EarleyItem moved = cItem.moveDot();
                            newQi.add(moved);
                        }
                    } 
                }
            }
            added = Qi.addAll(newQi);
            change = change || added;
            if (added) {
                System.out.println("completion:");
                System.out.println(newQi);
            }
        } while (added);
        return change;
    }

    // Apply the prediction operation on the state Qi.  The parameter i
    // is the index of the state.
    boolean predict(int i) {
        boolean change = false;
        Set<EarleyItem> Qi = mStateList.get(i);
        boolean added = false;
        do {
            Set<EarleyItem> newQi = new TreeSet<EarleyItem>();
            for (EarleyItem item: Qi) {
                Variable C = item.nextVar();
                if (C != null) {
                    for (Rule rule: mGrammar.getRules()) {
                        if (C.equals(rule.getVariable())) {
                            Set<EarleyItem> items = rule.generateRules(i);
                            newQi.addAll(items);
                        }
                    }
                }
            }
            added = Qi.addAll(newQi);
            change = change || added;
            if (added) {
                System.out.println("prediction:");
                System.out.println(newQi);
            }
        } while (added);
        return change;
    }
        
    // Apply the scanning operation on the state Qi.
    void scan(int i) {
        Set<EarleyItem> Qi = mStateList.get(i);
        if (i < mLength) {
            char a = mString.charAt(i);
            for (EarleyItem item: Qi) {
                if (item.scan(a)) {
                    EarleyItem next = item.moveDot();
                    Set<EarleyItem> Qiplus1 = mStateList.get(i + 1);
                    boolean added = Qiplus1.add(next);
                    if (added) {
                        System.out.println("scanning:");
                        System.out.println(next);
                    }
                }
            }
        }
    } 

    // Inititialize all streams, start ANTLR, and run Earley's algorithm.
    public static void main(String[] args) throws Exception {
        FileInputStream   fis     = new FileInputStream(args[0]);
        ANTLRInputStream  ais     = new ANTLRInputStream(fis);
        GrammatikLexer    lexer   = new GrammatikLexer(ais);
        CommonTokenStream ts      = new CommonTokenStream(lexer);
        GrammatikParser   parser  = new GrammatikParser(ts);
        Grammar           grammar = parser.cfg().g;
        FileReader        fr      = new FileReader(args[1]);
        StringBuffer      input   = new StringBuffer();
        int c;
        do {
            c = fr.read();
            if (c != -1) {
                input.append((char) c);
            }
        } while (c != -1);
        String       string = input.toString();
        EarleyParser ep     = new EarleyParser(grammar, string);
    }
}

