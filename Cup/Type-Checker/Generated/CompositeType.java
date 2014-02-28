public class CompositeType extends Type {
    private String mName;
    private List<Type> mArgTypes;

    public CompositeType(String name, List<Type> argTypes) {
        mName = name;
        mArgTypes = argTypes;
    }
    public Boolean equals(Type rhs) {
        if (!(rhs instanceof CompositeType)) {
            return false;
        }
        CompositeType r = (CompositeType) rhs;
        if(!mName.equals(r.mName)) {
            return false;
        }
        if(!mArgTypes.equals(r.mArgTypes)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<Type> getArgTypes() {
        return mArgTypes;
    }
    public String toString() {
        return "CompositeType(" + mName.toString() + ", " + mArgTypes.toString() + ")";
    }
}
