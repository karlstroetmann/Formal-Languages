import java.util.*;

public class Declaration {
    private String mVar;

    public Declaration(String var) {
        mVar = var;
    }
	public List<AssemblerCmd> compile() {
		List<AssemblerCmd> result = new LinkedList<AssemblerCmd>();
		AssemblerCmd varDef = new VAR_DEF(mVar);
		result.add(varDef);
		return result;
	}
    public String getVar() {
        return mVar;
    }
    public String toString() {
        return "Declaration(" + mVar.toString() + ")";
    }
}
