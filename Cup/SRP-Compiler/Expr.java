import assembler.*;
import java.util.*;

/**
 *  This class represents an expression and is the parent class of the following classes:
 *    Sum
 *    Difference
 *    Product
 *    Quotient
 *    FunctionCall
 *    MyNumber
 *    Variable
 */
public abstract class Expr {
    /** number of registers used to compute this expression */
    protected Integer mErshov;   
    /** number of the register containing the result of this expression */
    protected Integer mRegister;

    /** Compile this expression into a list of assembler commands.  
        @param base        specifies the first register to be used.
        @param symbolTable specifies the location of the variable on the stack
                           relative to the frame pointer.
    */
    public abstract List<AssemblerCmd> compile(Integer              base, 
                                               Map<String, Location> symbolTable);

    public Integer getErshov() { return mErshov;   }
    public Integer getReg   () { return mRegister; }    
}
