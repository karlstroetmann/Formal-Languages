import Assembler.*;
import java.util.*;

public class Declaration {
    private String mVar;

    public Declaration(String var) {
        mVar = var;
    }
    public String getVar() {
        return mVar;
    }
    public String toString() {
        return "Declaration(" + mVar.toString() + ")";
    }
}
