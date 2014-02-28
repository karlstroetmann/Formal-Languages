import java.util.*;

public class ExprParser {
    private ArrayList<Token> mTokenList; // list of all tokens
    private int              mIndex;     // index to the next token
    
    public ExprParser(ArrayList<Token> tokenList) {
		mTokenList = tokenList;
		mIndex     = mTokenList.size() - 2; 
		// above, we subtract 2 to skip the end-of-file token
    }

    // expression : expression '+' product  
    //            | expression '-' product  
    //            | product
    //            ;
    public double parseExpr() throws ParseError {
		double product = parseProduct();
        if (check("+")) {
            double expression = parseExpr();
            return expression + product;
        }
        if (check("-")) {
            double expression = parseExpr();
            return expression - product;
        }
        return product;
    }

    // product : product '*' factor     
    //         | product '/' factor     
    //         | factor 
    //         ;
    private double parseProduct() throws ParseError {
        double factor = parseFactor();
        if (check("*")) {
            double product = parseProduct();
            return product * factor;
        }
        if (check("/")) {
			double product = parseProduct();
			return product / factor;
        }
        return factor;
    }

	// factor : '(' expression ')'
    //        | NUMBER
    //        ;
    private double parseFactor() throws ParseError {
        if (check(")")) {
            double expression = parseExpr();
			if (!check("(")) {
				throw new ParseError("Parse Error, '(' expected");
			}
            return expression;    
        }
        return parseNumber();
    }

    private boolean check(String token) {
		if (mIndex < 0) {
			return false;  // all tokens consumed
		}
        if (mTokenList.get(mIndex).image.equals(token)) {
            --mIndex;
            return true;
        }
        return false;
    }

    private double parseNumber() throws ParseError {
        Token token = mTokenList.get(mIndex);
        if (token.kind != RDParserConstants.NUMBER) {
			throw new ParseError("Parse Error, number expected");
		}
		--mIndex;
        return new Double(token.image);    
    }
}