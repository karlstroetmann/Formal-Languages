public class Shift extends Action {
    private State mState;
    
    public Shift(State state) {
        mState = state;
    }
    State getState() {
        return mState;
    }
    public String toString() {
        return "shift " + mState;
    }
}