public class Declaration extends Statement {
    Variable mVariable;
    
    public Declaration(Variable variable) {
        mVariable = variable;
    }
    public void execute(Environment e) throws ReturnException {
        e.addVar(mVariable.mName);
    }
    public String toString() {
        return "var " + mVariable + ";";
    }
}