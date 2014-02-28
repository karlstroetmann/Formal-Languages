import java.util.*;
import java.io.*;

/** A simple shift reduce parser to parse arithmetical expressions according 
    to the following grammar:

    Expr    :   Expr "+" Product  
            |   Expr "-" Product  
            |   Product 
            ;
    Product :   Product "*" Factor
            |   Product "/" Factor
            |   Factor 
            ;
    Factor  :   "(" Expr ")" 
            |   NUMBER 
            ;
*/

public class ShiftReduceParser {
    private List<Symbol>  mTokenList;
    private int           mIndex;    // index of next token
    private Stack<Symbol> mSymbols;
    private Stack<State>  mStates;
    private ParseTable    mParseTable;
    
    public static void main(String args[]) throws Error, IOException {
        Scanner           scanner   = new Scanner(System.in);
        ArrayList<Symbol> tokenList = new ArrayList<Symbol>();
        Symbol            symbol;
        do {
            symbol = scanner.yylex();
            if (symbol != null) {
                tokenList.add(symbol);
            } else {
                tokenList.add(new Symbol(Symbol.EOF, null));
            }
        } while (symbol != null); // end of file 
        ShiftReduceParser parser = new ShiftReduceParser(tokenList);
        if (parser.parse()) {
            System.out.println("Parsing successful!");
        } else {
            System.out.println("Syntax error!");
        }
    }

    public ShiftReduceParser(List<Symbol> input) {
        mTokenList  = input;
        mIndex      = 0;
        mSymbols    = new Stack<Symbol>();
        mStates     = new Stack<State>();
        mParseTable = new ParseTable();
    }

    public boolean parse() {
        State start = startState();
        mStates.push(start);
        while (true) {            
            State  q = mStates.peek();
            Symbol t = peekNextToken();
            System.out.println("");
            System.out.println("current state: " + q);
            System.out.println("next token:    " + t);
            Action p = action(q,t);
            System.out.println(p);
            if (p == null) {
                System.out.println("action(" + q + ", " + t + ") undefined.");
                System.out.println("Syntax error!");
                return false;
            }
            if (p instanceof Shift) {
                mSymbols.push(t);
                mStates .push(((Shift) p).getState());
                removeNextToken();
            } else if (p instanceof Reduce) {
                Rule         rule = ((Reduce) p).getRule();
                Symbol       head = rule.getHead();
                List<Symbol> body = rule.getBody();
                for (Symbol s: body) {
                    mSymbols.pop();
                    mStates .pop();
                }
                mSymbols.push(head);
                State s = mStates.peek();
                mStates.push( gotoState(s, head) );
            } else if (p instanceof Accept) {
                return true;
            } 
        }
    }

    private Symbol peekNextToken() {
        return mTokenList.get(mIndex);
    }
    private void removeNextToken() {
        ++mIndex;
    }
    private State startState() {
        return new State(0);
    }
    private Action action(State s, Symbol t) {
        Pair<State, Symbol> p = new Pair<State, Symbol>(s, t);
        return mParseTable.mActionTable.get(p);
    }
    private State gotoState(State state, Symbol symbol) {
        Pair<State, Symbol> p = new Pair<State, Symbol>(state, symbol);
        return mParseTable.mGotoTable.get(p);
    }
}