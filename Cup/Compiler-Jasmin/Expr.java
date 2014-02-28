import Assembler.*;
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
    public abstract List<AssemblerCmd> compile(Map<String, Integer> symbolTable);
    public abstract Integer stackSize();  // maximum size of stack needed
}
