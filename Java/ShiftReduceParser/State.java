public class State implements Comparable<State> {
    int mId;
    
    public State(int id) {
        mId = id;
    }
    public int getId() {
        return mId;
    }
    public int compareTo(State s) {
        return mId - s.getId();
    }
    public String toString() {
        return "s" + mId;
    }
}