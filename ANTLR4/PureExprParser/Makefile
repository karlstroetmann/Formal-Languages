AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}

run: ParseExpr.class 
	echo "1 + 2 * 3 - 4" | java -cp ${CP} ParseExpr
	echo "1 + 2 * 3 - 4" | java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Expr start -gui

ParseExpr.class: ParseExpr.java ExprParser.java
	javac -cp ${CP} ParseExpr.java  

ExprParser.java: Expr.g4
	java -jar ${AntlrPath} Expr.g4

clean:
	rm *.class
	rm *.tokens
	rm ExprBaseListener.java ExprLexer.java ExprListener.java ExprParser.java

