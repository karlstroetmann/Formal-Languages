

ExprParser.class: ExprParser.java
	javac ExprParser.java

ExprParser.java: ExprParser.jj
	javacc ExprParser.jj

test: ExprParser.class Difference.class Expr.class ExprParser.class ExprParserConstants.class \
      ExprParserTokenManager.class MyNumber.class ParseException.class Product.class Quotient.class \
      SimpleCharStream.class Sum.class Token.class TokenMgrError.class Variable.class
	echo "(x * 1) * (x - 1) / x" | java ExprParser

%.class : %.java
	javac -g $< 


