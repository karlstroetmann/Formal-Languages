/**
 * This class represents a program.  A program consists of
 *   1. a list of type definitions
 *   2. a list of signatures
 *   3. a list of typed terms
 */

import java.util.*;

public class Program {
    private List<TypeDef>          mTypeDefs;
    private List<Signature>        mSignatures;
    private List<TypedTerm>        mTypedTerms;
    private Map<String, Signature> mSignatureMap;

    public Program(List<TypeDef> typeDefs,
				    List<Signature> signatures, 
                    List<TypedTerm> typedTerms) 
    {
        mTypeDefs   = typeDefs;
        mSignatures = signatures;
        mTypedTerms = typedTerms;
        mSignatureMap = new TreeMap<String, Signature>();
        for (Signature s: mSignatures) {
            mSignatureMap.put(s.getName(), s);
        }
        for (TypeDef td: mTypeDefs) {
            if (td instanceof SimpleTypeDef) {
                SimpleTypeDef std = (SimpleTypeDef) td;
                Type rho = 
					new CompositeType(std.getName(), new LinkedList<Type>());
                for (Type tau: std.getTypeSum()) {
                    CompositeType c = (CompositeType) tau;
                    String name = c.getName();
                    Signature s = 
						new Signature(name, c.getArgTypes(), rho);
                    mSignatureMap.put(name, s);
                }
            } else {
                ParamTypeDef ctd = (ParamTypeDef) td;
                List<Type> paramList = new LinkedList<Type>();
                for (Parameter v : ctd.getParameters()) {
                    paramList.add(v);
                }
                Type rho = new CompositeType(ctd.getName(), paramList);
                for (Type tau: ctd.getTypeSum()) {
                    CompositeType c = (CompositeType) tau;
                    String name = c.getName();
                    Signature s = new Signature(name, c.getArgTypes(), rho);
                    mSignatureMap.put(name, s);
                }
            }
        }
    }
    public void typeCheck() {
        for (TypedTerm tt: mTypedTerms) {
            System.out.println("\nChecking " + tt.myString());
            Term t   = tt.getTerm();
            Type tau = tt.getType();
            List<Equation> typeEquations = t.typeEqs(tau, mSignatureMap);
            MartelliMontanari mm = new MartelliMontanari(typeEquations);
            Substitution theta = mm.solve();
            if (theta != null) {
                System.out.println(tt.myString() + " has been verified!");
                System.out.println(theta);
            } else {
                System.out.println(tt.myString() + " type ERROR!!!");
            }
        }
    }
    public Boolean equals(Program rhs) {
        if (!(rhs instanceof Program)) {
            return false;
        }
        if(!mTypeDefs.equals(rhs.mTypeDefs)) {
            return false;
        }
        if(!mSignatures.equals(rhs.mSignatures)) {
            return false;
        }
        if(!mTypedTerms.equals(rhs.mTypedTerms)) {
            return false;
        }
        return true;
    }
    public List<TypeDef> getTypedDefs() {
        return mTypeDefs;
    }
    public List<Signature> getSignatures() {
        return mSignatures;
    }
    public List<TypedTerm> getTypedTerms() {
        return mTypedTerms;
    }
    public String myString() {
        String result = "";
        for (int i = 0; i < mTypeDefs.size(); ++i) {
            result += mTypeDefs.get(i).myString() + "\n";
        }
        result += "\n";
        for (int i = 0; i < mSignatures.size(); ++i) {
            result += mSignatures.get(i).myString() + "\n";
        }
        result += "\n";
        for (int i = 0; i < mTypedTerms.size(); ++i) {
            result += mTypedTerms.get(i).myString() + "\n";
        }
        return result;        
    }
    public String toString() {
        return "Program(" + mTypeDefs.toString() + ", " + mSignatures.toString() +
               ", " + mTypedTerms.toString() + ")";
    }
}
