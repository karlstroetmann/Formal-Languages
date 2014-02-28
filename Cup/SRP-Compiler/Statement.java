import assembler.*;
import java.util.*;

/**
 * This class implements various forms of statements.  It is the superclass
 * following classes.
 *    Assign
 *    Block
 *    Declaration
 *    ExprStatement
 *    IfThen
 *    IfThenElse
 *    Return
 *    While
 */
public abstract class Statement {
    /**
       @param numSaved  number of registers saved on the stack
       @param numVars   number of ocal variables placed on the stack
     */
    public  abstract List<AssemblerCmd> compile(Map<String, Location> symbolTable);
    /** compute the maximum number of registers necessary to translate all
    expressions occuring in the statement.
    */
    protected abstract int maxErshov();
}
