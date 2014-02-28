/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Stack;
import java.lang.Thread;

public class TestEvaluator {
    /** Sample "calculator" (special case of collector) */
    public static class Evaluator extends ExprBaseListener {
        Stack<Double> stack = new Stack<Double>();
        public void exitExpr(ExprParser.ExprContext ctx) {
            if (ctx.getChildCount() == 3) { // operations have 3 children
                double right = stack.pop();
                double left  = stack.pop();
                if (ctx.op.getType() == ExprParser.MUL) {
                    stack.push(left * right);
                } else if (ctx.op.getType() == ExprParser.DIV) {
                    stack.push(left / right);
                } else if (ctx.op.getType() == ExprParser.ADD) {
                    stack.push(left + right);
                } else if (ctx.op.getType() == ExprParser.SUB) {
                    stack.push(left - right);
                } 
            }
        }
        public void visitTerminal(TerminalNode node) {
            Token symbol = node.getSymbol();
            if (symbol.getType() == ExprParser.NUMBER) {
                stack.push(Double.valueOf(symbol.getText()) );
            } 
        }
    }

    /** Sample "calculator" using tree properties not stack */
    public static class EvaluatorWithProps extends ExprBaseListener {
        ParseTreeProperty<Double> values = new ParseTreeProperty<Double>();

        @Override
        public void exitStart(ExprParser.StartContext ctx) {
            values.put(ctx, values.get(ctx.getChild(0)));
        }

        public void exitExpr(ExprParser.ExprContext ctx) {
            if (ctx.getChildCount() == 3) { // operations have 3 children
                double left  = values.get(ctx.expr(0));
                double right = values.get(ctx.expr(1));
                if (ctx.op.getType() == ExprParser.MUL) {
                    values.put(ctx, left * right);
		} else if (ctx.op.getType() == ExprParser.DIV) {
                    values.put(ctx, left / right);
		} else if (ctx.op.getType() == ExprParser.ADD) {
                    values.put(ctx, left + right);
		} else if (ctx.op.getType() == ExprParser.SUB) {
                    values.put(ctx, left - right);
                } 
            } else {
                values.put(ctx, values.get(ctx.getChild(0))); // a NUMBER
            }
        }

        public void visitTerminal(TerminalNode node) {
            Token symbol = node.getSymbol();
            if (symbol.getType() == ExprParser.NUMBER ) {
                values.put(node, Double.valueOf(symbol.getText()));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) {
	    inputFile = args[0];
	}
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream  input  = new ANTLRInputStream(is);
        ExprLexer         lexer  = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser        parser = new ExprParser(tokens);
        ParseTree         tree   = parser.start(); 
        // show tree in text form
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        Evaluator       eval = new Evaluator();
        walker.walk(eval, tree);
        System.out.println("result = " + eval.stack.pop());

        EvaluatorWithProps eval2 = new EvaluatorWithProps();
        walker.walk(eval2, tree);
        System.out.println("result with tree props = " + eval2.values.get(tree));
    }
}
