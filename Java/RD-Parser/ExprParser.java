import java.util.*;

public class ExprParser {
    private ArrayList<Token> mTokenList; // list of all tokens
    private int              mIndex;     // index to the next token
    
    public ExprParser(ArrayList<Token> tokenList) {
        mTokenList = tokenList;
        mIndex     = 0;
    }

    // expr : product exprRest;
    public double parseExpr() throws ParseError {
        double product = parseProduct();
        double result  = parseExprRest(product); 
        if (mTokenList.get(mIndex).image.equals(")")) {
            return result;
        }
        if (mTokenList.get(mIndex).kind != RDParserConstants.EOF) {
            throw new ParseError("Parse Error");
        }
        return result;
    }
    // exprRest : '+' product exprRest
    //          | '-' product exprRest
    //          | /* epsilon */
    //          ;
    private double parseExprRest(double sum) throws ParseError {
        if (check("+")) {
            double product = parseProduct();
            return parseExprRest(sum + product);
        }
        if (check("-")) {
            double product = parseProduct();
            return parseExprRest(sum - product);
        }
        // epsilon
        return sum;
    }
    // product : factor productRest ;
    private double parseProduct() throws ParseError {
        double factor = parseFactor();
        return parseProductRest(factor);
    }
    // productRest : '*' factor productRest
    //             | '/' factor productRest
    //             | /* epsilon */
    //             ;    
    private double parseProductRest(double product) throws ParseError {
        if (check("*")) {
            double factor = parseFactor();
            return parseProductRest(product * factor);
        }
        if (check("/")) {
            double factor = parseFactor();
            return parseProductRest(product / factor);
        }
        // epsilon
        return product;
    }
    // factor : '(' expr ')'
    //        | NUMBER
    //        ;
    private double parseFactor() throws ParseError {
        if (check("(")) {
            double expr = parseExpr();
            if (!check(")")) {
                throw new ParseError("Parse Error, ')' expected");
            }
            return expr;    
        }
        return parseNumber();
    }

    // Check whether the string given as argument is the next token.
    // If it is, consume this token and proceed to the next token.
    private boolean check(String token) {
        // no tokens left
        if (mIndex == mTokenList.size()) {
            return false;
        }
        if (mTokenList.get(mIndex).image.equals(token)) {
            ++mIndex;
            return true;
        }
        return false;
    }

    private double parseNumber() throws ParseError {
        Token token = mTokenList.get(mIndex);
        if (token.kind != RDParserConstants.NUMBER) {
            throw new ParseError("Parse Error, number expected");
        }
        ++mIndex;
        return new Double(token.image);
    }
}