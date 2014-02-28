public class Term {
    private String mFunction;
    private List<Term> mTermList;

    public Term(String function, List<Term> termList) {
        mFunction = function;
        mTermList = termList;
    }
    public Boolean equals(Term rhs) {
        if (!(rhs instanceof Term)) {
            return false;
        }
        if(!mFunction.equals(rhs.mFunction)) {
            return false;
        }
        if(!mTermList.equals(rhs.mTermList)) {
            return false;
        }
        return true;
    }
    public String getFunction() {
        return mFunction;
    }
    public List<Term> getTermList() {
        return mTermList;
    }
    public String toString() {
        return "Term(" + mFunction.toString() + ", " + mTermList.toString() + ")";
    }
}
