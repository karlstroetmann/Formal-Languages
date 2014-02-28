public class MartelliMontanari {
    private List<Equation> mEquations;
    private Substitution mTheta;

    public MartelliMontanari(List<Equation> equations, Substitution theta) {
        mEquations = equations;
        mTheta = theta;
    }
    public Boolean equals(MartelliMontanari rhs) {
        if (!(rhs instanceof MartelliMontanari)) {
            return false;
        }
        if(!mEquations.equals(rhs.mEquations)) {
            return false;
        }
        if(!mTheta.equals(rhs.mTheta)) {
            return false;
        }
        return true;
    }
    public List<Equation> getEquations() {
        return mEquations;
    }
    public Substitution getTheta() {
        return mTheta;
    }
    public String toString() {
        return "MartelliMontanari(" + mEquations.toString() + ", " + mTheta.toString() + ")";
    }
}
