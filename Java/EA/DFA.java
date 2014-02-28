







import java.util.*;

// This class represents deterministic finite automata.
public class DFA {
    private Set<Character>      mSigma;     // alphabet
    private Integer         mStart;     // start state
    private Set<Integer>      mStates;    // set of all states
    private Set<Integer>      mAccepting; // accepting states
    private Map<Pair<Integer, Character>, Integer> mDelta;     // transition function
    
    public DFA(Integer start, Map<Pair<Integer, Character>, Integer> delta, Set<Integer> accepting) {
        mStart     = start;
        mDelta     = delta;
        mAccepting = accepting;
        mStates    = new TreeSet<Integer>();
        // collect all states
        mStates.add(start);
        for (Integer s: mAccepting) {
            mStates.add(s);
        }
        for (Pair<Integer, Character> arg: mDelta.keySet()) {
            mStates.add(arg.mA);
            mStates.add(mDelta.get(arg));
        }
		// collect alphabet
		mSigma = new TreeSet<Character>();
		for (Pair<Integer, Character> arg: mDelta.keySet()) {
			mSigma.add(arg.mB);
		}
    }    
    // read string s and return true if s is accepted
    public Boolean consume(String s) {
        Integer last = consume(mStart, s);
        if (last == null) {
            return false;
        }
        return mAccepting.contains(last);
    }
    public Integer    getStart()     { return mStart;     }
    public Set<Integer> getAccepting() { return mAccepting; }

    void addTransition(Integer from, Character c, Integer to) {
        Pair<Integer, Character> p = new Pair<Integer, Character>(from, c);
        mDelta.put(p, to);
    }
	
	// check, whether the accpted langauge is empty
	boolean isEmpty() {
		Set<Integer> reachable = new TreeSet<Integer>();
		Set<Integer> newStates = new TreeSet<Integer>();
		newStates.add(mStart);
		while (!newStates.isEmpty()) {
			reachable.addAll(newStates);
			Set<Integer> nextNew = new TreeSet<Integer>();
			for (Integer s: newStates) {
				if (mAccepting.contains(s)) {
					return false;
				}
				for (Character c: mSigma) {
					Pair<Integer, Character> sc = new Pair<Integer, Character>(s, c);
					Integer     ns = mDelta.get(sc);
					if (!reachable.contains(ns)) {
						nextNew.add(ns);
					}
				}
			}
			newStates = nextNew;
		}
		return true;
	}

    // Read the string s starting from state.  Return the state reached
    // after s has been consumed or null if the fsm dies.
    Integer consume(Integer state, String s) {
        if (s.length() == 0) { // empty string
            return state;
        }
        Character firstChar  = s.charAt(0);
        String    restString = s.substring(1);
        Pair<Integer, Character> pair       = new Pair<Integer, Character>(state, firstChar);
        Integer     newState   = mDelta.get(pair);
        if (newState == null) {
            return null;
        }
        return consume(newState, restString);
    }

    public static void main(String[] args) {
        Integer    start     = 0;
        Set<Integer> accepting = new TreeSet<Integer>();
        accepting.add(start);
        Map<Pair<Integer, Character>, Integer> delta = new TreeMap<Pair<Integer, Character>, Integer>();
        DFA           fsm   = new DFA(start, delta, accepting);
        fsm.addTransition(0, 'a', 1);
        fsm.addTransition(1, 'a', 0);
        fsm.addTransition(1, 'b', 2);
        fsm.addTransition(2, 'b', 1);
        fsm.addTransition(2, 'a', 3);
        fsm.addTransition(3, 'a', 2);
        fsm.addTransition(0, 'b', 3);
        fsm.addTransition(3, 'b', 0);
        System.out.println(fsm.consume("abbaab"));
        System.out.println(fsm.consume("abbaabab"));
        System.out.println(fsm.isEmpty());
    }
}
