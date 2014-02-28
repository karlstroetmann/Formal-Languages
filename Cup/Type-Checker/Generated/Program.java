public class Program {
    private List<TypeDef>   mTypeDefs;
    private List<Signature> mSignatures;
    private List<TypedTerm> mTypedTerms;

    public Program(List<TypeDef> typeDefs, List<Signature> signatures, List<TypedTerm> typedTerms) {
        mTypeDefs   = typeDefs;
        mSignatures = signatures;
        mTypedTerms = typedTerms;
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
        if(!mTypeTerms.equals(rhs.mTypeTerms)) {
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
    public String toString() {
        return "Program(" + mTypeDefs.toString() + ", " + mSignatures.toString() + ", " + mTypeTerms.toString() + ")";
    }
}
