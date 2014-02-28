import java.util.*;

public class ExprParser {
    private List<Token> mTokenList; // list of all tokens
    private int         mIndex;     // index to the next token
    
    public ExprParser(List<Token> tokenList) {
        mTokenList = tokenList;
        mIndex     = mTokenList.size() - 1; 
    }

    // expression : expression '+' product  
    //            | expression '-' product  
    //            | product
    //            ;
    public Expr parseExpr() throws ParseError {
        Expr product = parseProduct();
        if (check("+")) {
			Expr expression = parseExpr();
            return new Sum(expression, product);
        }
        if (check("-")) {
            Expr expression = parseExpr();
            return new Difference(expression, product);
        }
        return product;
    }

    // product : product '*' factor     
    //         | product '/' factor     
    //         | factor 
    //         ;
    private Expr parseProduct() throws ParseError {
        Expr factor = parseFactor();
        if (check("*")) {
            Expr product = parseProduct();
            return new Product(product, factor);
        }
        if (check("/")) {
            Expr product = parseProduct();
            return new Quotient(product, factor);
        }
        return factor;
    }

    // factor : '(' expression ')'
    //        | 'exp' '(' expression ')'
    //        | 'ln' '(' expression ')'
    //        | NUMBER
    //        | VARIABLE
    //        ;
    private Expr parseFactor() throws ParseError {
        if (check(")")) {
            Expr expression = parseExpr();
            if (!check("(")) {
                throw new ParseError("Parse Error, '(' expected");
            }
			if (check("exp")) {
				return new Exponential(expression);
			}
			if (check("ln")) {
				return new Logarithm(expression);
			}
            return expression;    
        }
		if (checkNumber()) {
			return parseNumber();
		}
		return parseVariable();
    }

    private Expr parseNumber() {
        Token token = mTokenList.get(mIndex);
        --mIndex;
        NumberToken numberToken = (NumberToken) token;
        return new Number(numberToken.getNumber());
    }

    private Expr parseVariable() {
        Token token = mTokenList.get(mIndex);
        --mIndex;
        VariableToken varToken = (VariableToken) token;
        return new Variable(varToken.getImage());
    }
    private boolean check(String token) {
        if (mIndex < 0) {
            return false;  // all tokens consumed
        }
        if (mTokenList.get(mIndex).getImage().equals(token)) {
            --mIndex;
            return true;
        }
        return false;
    }

    private boolean checkNumber() {
        if (mIndex < 0) {
            return false;  // all tokens consumed
        }
        if (mTokenList.get(mIndex) instanceof NumberToken) {
            return true;
        }
        return false;
    }
}