public class Function {
    private String mName;
    private List<String> mParameterList;
    private List<Declaration> mMDeclarations;
    private List<Statement> mBody;

    public Function(String name, List<String> parameterList, List<Declaration> mDeclarations, List<Statement> body) {
        mName = name;
        mParameterList = parameterList;
        mMDeclarations = mDeclarations;
        mBody = body;
    }
    public Boolean equals(Function rhs) {
        if (!(rhs instanceof Function)) {
            return false;
        }
        if(!mName.equals(rhs.mName)) {
            return false;
        }
        if(!mParameterList.equals(rhs.mParameterList)) {
            return false;
        }
        if(!mMDeclarations.equals(rhs.mMDeclarations)) {
            return false;
        }
        if(!mBody.equals(rhs.mBody)) {
            return false;
        }
        return true;
    }
    public String getName() {
        return mName;
    }
    public List<String> getParameterList() {
        return mParameterList;
    }
    public List<Declaration> getMDeclarations() {
        return mMDeclarations;
    }
    public List<Statement> getBody() {
        return mBody;
    }
    public String toString() {
        return "Function(" + mName.toString() + ", " + mParameterList.toString() + ", " + mMDeclarations.toString() + ", " + mBody.toString() + ")";
    }
}
