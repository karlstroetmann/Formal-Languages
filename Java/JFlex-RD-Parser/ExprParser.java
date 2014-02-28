import java.util.*;

public class ExprParser {
    private List<Token> mTokenList; // list of all tokens
    private int         mIndex;     // index to the next token
    
    public ExprParser(List<Token> tokenList) {
        mTokenList = tokenList;
        mIndex     = 0;
    }

    // expr : product exprRest;
    public Integer parseExpr() throws ParseError {
        Integer product = parseProduct();
        Integer result  = parseExprRest(product); 
        if (mIndex == mTokenList.size()) {
            return result;
        }
        if (mTokenList.get(mIndex).getImage().equals(")")) {
            return result;
        }
        if (mIndex < mTokenList.size()) {
            throw new ParseError("Parse Error");
        }
        //    Return result;
		return 0;
    }

    // exprRest : '+' product exprRest
    //          | '-' product exprRest
    //          | /* epsilon */
    //          ;
    private Integer parseExprRest(Integer sum) throws ParseError {
        if (check("+")) {
            Integer product = parseProduct();
            return parseExprRest(sum + product);
        }
        if (check("-")) {
            Integer product = parseProduct();
            return parseExprRest(sum - product);
        }
        // epsilon
        return sum;
    }
    // product : factor productRest ;
    private Integer parseProduct() throws ParseError {
        Integer factor = parseFactor();
        return parseProductRest(factor);
    }
    // productRest : '*' factor productRest
    //             | '/' factor productRest
    //             | /* epsilon */
    //             ;    
    private Integer parseProductRest(Integer product) throws ParseError {
        if (check("*")) {
            Integer factor = parseFactor();
            return parseProductRest(product * factor);
        }
        if (check("/")) {
            Integer factor = parseFactor();
            return parseProductRest(product / factor);
        }
        // epsilon
        return product;
    }
    // factor : '(' expr ')'
    //        | NUMBER
    //        ;
    private Integer parseFactor() throws ParseError {
        if (check("(")) {
            Integer expr = parseExpr();
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
        if (mTokenList.get(mIndex).getImage().equals(token)) {
            ++mIndex;
            return true;
        }
        return false;
    }

    private Integer parseNumber() throws ParseError {
        if (mIndex == mTokenList.size()) {
            throw new ParseError("Parse Error, number expected");
        }
        Token token = mTokenList.get(mIndex);
        if (!(token instanceof NumberToken)) {
            throw new ParseError("Parse Error, number expected");
        }
        ++mIndex;
        NumberToken numberToken = (NumberToken) token;
        return numberToken.getNumber();
    }
}