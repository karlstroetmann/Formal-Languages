import java.util.*;

public class MartelliMontanari {
    private List<Equation> mEquations;
    private Substitution   mTheta;

    public MartelliMontanari(List<Equation> equations) {
        mEquations = equations;
        List<Parameter> emptyVars  = new LinkedList<Parameter>();
        List<Type>      emptyTypes = new LinkedList<Type>();
        mTheta = new Substitution(emptyVars, emptyTypes);
    }
    public Substitution solve() {
        while (mEquations.size() != 0) {
            Equation eq = mEquations.remove(0);
            Type lhs = eq.getLhs();
            Type rhs = eq.getRhs();
            if (lhs instanceof Parameter) {
                Parameter var = (Parameter) lhs;
                List<Equation> newEquations = new LinkedList<Equation>();
                for (Equation equation: mEquations) {
                    Equation neq = equation.substitute(var, rhs);
                    newEquations.add(neq);
                }
                mEquations = newEquations;
                mTheta     = mTheta.substitute(var, rhs);
            } else if (lhs instanceof CompositeType) {
                if (!(rhs instanceof CompositeType)) {
                    System.err.println("Error processing: " + eq);
                    return null;
                }
                CompositeType compLhs = (CompositeType) lhs;
                CompositeType compRhs = (CompositeType) rhs;
                if (!compLhs.getName().equals(compRhs.getName())) {
                    // different type constructors, no solution
                    System.err.println("Error: different type constructors\n" + 
				       compLhs.getName() + " != " +compRhs.getName());
                    return null;
                }
                List<Type> lhsArgs = compLhs.getArgTypes();
                List<Type> rhsArgs = compRhs.getArgTypes();
                for (int i = 0; i < lhsArgs.size(); ++i) {
                    Type sigmaLhs = lhsArgs.get(i);
                    Type sigmaRhs = rhsArgs.get(i);
                    mEquations.add(0, new Equation(sigmaLhs, sigmaRhs));
                }
            } 
        }
        return mTheta;
    }
    public Boolean equals(MartelliMontanari rhs) {
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
        String result = "";
        for (Equation eq: mEquations) {
            result += eq + ",\n";
        }
        result += mTheta;
        result += "\n\n";
        return result;
    }
}
