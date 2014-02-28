SLParser.class: SLParser.java
	javac SLParser.java

SLParser.java: SLParser.jj
	javacc SLParser.jj

test: Assignment.class Quotient.class BoolExpr.class SLParser.class \
      Difference.class SLParserConstants.class Equal.class \
      SLParserTokenManager.class Expr.class SimpleCharStream.class \
      IfThen.class Statement.class LessThan.class Sum.class MyNumber.class \
      Token.class ParseException.class TokenMgrError.class Print.class \
      Variable.class Product.class While.class For.class
	cat sum.sl | java SLParser

%.class : %.java
	javac -g $< 


