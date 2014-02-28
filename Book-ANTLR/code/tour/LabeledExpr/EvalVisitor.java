import java.util.TreeMap;
import java.util.Map;

public class EvalVisitor extends ExprBaseVisitor<Double> {
    // "memory" for our calculator; variable/value pairs go here 
    Map<String, Double> memory = new TreeMap<String, Double>();

    // stmnt: VAR ':=' expr ';'
    @Override
    public Double visitAssign(ExprParser.AssignContext ctx) {
        String id    = ctx.VAR().getText(); // id is left-hand side of '='
        double value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);              // store it in our memory
        return value;
    }

    // stmnt: expr ';'
    @Override
    public Double visitPrintExpr(ExprParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr());  // evaluate the expr child
        System.out.println(value);         // print the result
        return 0.0;                        // return dummy value
    }

    // expr: expr '+' product
    @Override 
    public Double visitSum(ExprParser.SumContext ctx) { 
	Double lhs = visit(ctx.expr());
        Double rhs = visit(ctx.product());
	return lhs + rhs; 
    }

    // expr: expr '-' product
    @Override 
    public Double visitDifference(ExprParser.DifferenceContext ctx) { 
	Double lhs = visit(ctx.expr());
        Double rhs = visit(ctx.product());
	return lhs - rhs; 
    }

    // expr: product
    @Override 
    public Double visitExprProd(ExprParser.ExprProdContext ctx) { 
	return visit(ctx.product()); 
    }

    // product: product '*' factor
    @Override 
    public Double visitProd(ExprParser.ProdContext ctx) { 
	Double lhs = visit(ctx.product());
        Double rhs = visit(ctx.factor());
	return lhs * rhs; 
    }

    // product: product '/' factor
    @Override 
    public Double visitQuot(ExprParser.QuotContext ctx) { 
	Double lhs = visit(ctx.product());
        Double rhs = visit(ctx.factor());
	return lhs / rhs; 
    }

    // product: factor
    @Override 
    public Double visitProdFact(ExprParser.ProdFactContext ctx) { 
	return visit(ctx.factor()); 
    }

    // factor: simple '**' factor
    @Override 
    public Double visitPower(ExprParser.PowerContext ctx) { 
        double left  = visit(ctx.simple()); // get value of base
        double right = visit(ctx.factor()); // get value of exponent
        return java.lang.Math.pow(left, right); 
    }

    // factor: simple
    @Override 
    public Double visitFactSimple(ExprParser.FactSimpleContext ctx) { 
	return visit(ctx.simple()); 
    }

    // simple: NUMBER
    @Override
    public Double visitFPNumber(ExprParser.FPNumberContext ctx) {
        return Double.valueOf(ctx.NUMBER().getText());
    }

    // simple: VAR
    @Override
    public Double visitIdentifier(ExprParser.IdentifierContext ctx) {
        String id = ctx.VAR().getText();
	if (memory.containsKey(id)) {
	    return memory.get(id);
	}
	return 0.0;
    }

    // '(' expr ')' 
    @Override
    public Double visitParenthesis(ExprParser.ParenthesisContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
}
