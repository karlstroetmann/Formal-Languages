import Assembler.*;
import java.util.*;

public abstract class BoolExpr {
    public abstract List<AssemblerCmd> compile(Map<String, Integer> symbolTable);
    public abstract Integer stackSize();  // maximum size of stack needed
}
