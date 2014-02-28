public class Block extends Statement {
    private List<Statement> mStatementList;

    public Block(List<Statement> statementList) {
        mStatementList = statementList;
    }
    public Boolean equals(Statement rhs) {
        if (!(rhs instanceof Block)) {
            return false;
        }
        Block r = (Block) rhs;
        if(!mStatementList.equals(r.mStatementList)) {
            return false;
        }
        return true;
    }
    public List<Statement> getStatementList() {
        return mStatementList;
    }
    public String toString() {
        return "Block(" + mStatementList.toString() + ")";
    }
}
