AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}

run: Differentiate.class Difference.class Exponential.class Expr.class Logarithm.class \
     Number.class Product.class Quotient.class Sum.class Variable.class input.txt
	java -cp ${CP} Differentiate input.txt

Difference.class: Difference.java
	javac -cp ${CP} Difference.java

Exponential.class: Exponential.java
	javac -cp ${CP} Exponential.java

Expr.class: Expr.java
	javac -cp ${CP} Expr.java

Logarithm.class: Logarithm.java
	javac -cp ${CP} Logarithm.java

Number.class: Number.java
	javac -cp ${CP} Number.java

Product.class: Product.java
	javac -cp ${CP} Product.java

Quotient.class: Quotient.java
	javac -cp ${CP} Quotient.java

Sum.class: Sum.java
	javac -cp ${CP} Sum.java

Variable.class: Variable.java
	javac -cp ${CP} Variable.java

Differentiate.class: Differentiate.java ExprParser.java
	javac -cp ${CP} Differentiate.java

ExprParser.java: Expr.g4
	java -jar ${AntlrPath} Expr.g4

clean:
	rm *.class
	rm *.tokens
	rm ExprBaseListener.java ExprLexer.java ExprListener.java ExprParser.java


