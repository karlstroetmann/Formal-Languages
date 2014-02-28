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
    public Integer parseExpr() throws ParseError {
        Integer product = parseProduct();
        if (check("+")) {
            Integer expression = parseExpr();
            return expression + product;
        }
        if (check("-")) {
            Integer expression = parseExpr();
            return expression - product;
        }
        return product;
    }

    // product : product '*' factor     
    //         | product '/' factor     
    //         | factor 
    //         ;
    private Integer parseProduct() throws ParseError {
        Integer factor = parseFactor();
        if (check("*")) {
            Integer product = parseProduct();
            return product * factor;
        }
        if (check("/")) {
            Integer product = parseProduct();
            return product / factor;
        }
        return factor;
    }

    // factor : '(' expression ')'
    //        | NUMBER
    //        ;
    private Integer parseFactor() throws ParseError {
        if (check(")")) {
            Integer expression = parseExpr();
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
        if (mTokenList.get(mIndex).getImage().equals(token)) {
            --mIndex;
            return true;
        }
        return false;
    }

    private Integer parseNumber() throws ParseError {
        Token token = mTokenList.get(mIndex);
        if (!(token instanceof NumberToken)) {
            throw new ParseError("Parse Error, number expected");
        }
        --mIndex;
        NumberToken numberToken = (NumberToken) token;
        return numberToken.getNumber();
    }
}