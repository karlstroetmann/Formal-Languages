import java.util.Set;
import java.util.Map;
import java.util.TreeSet;
import java.util.TreeMap;

// This class represents the right hand side of a grammar rule.
// It has the following subclasses:
//      Alternative
//      Concatenation
//      PostfixStar
//      PostfixPlus
//      PostfixQuestion
//      Variable
//      MyToken
//      Epsilon
public abstract class Expr {
    public abstract String toString(Boolean indent);
}
