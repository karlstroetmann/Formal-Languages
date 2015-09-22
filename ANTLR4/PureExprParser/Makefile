#AntlrPath = /usr/local/lib/antlr-4.5.1-complete.jar
AntlrPath = C:/Users/Karl/Dropbox/Software/antlr-4.5.1-complete.jar
CP        = .:${AntlrPath}


run: ParseExpr.class 
	echo "1 + 2 * 3 - 4" | java ParseExpr
	echo "1 + 2 * 3 - 4" | java org.antlr.v4.runtime.misc.TestRig Expr start -gui

ParseExpr.class: ParseExpr.java ExprParser.java
	javac *.java  

ExprParser.java: Expr.g4
	java -jar ${AntlrPath} Expr.g4

clean:
	rm *.class
	rm *.tokens
	rm ExprBaseListener.java ExprLexer.java ExprListener.java ExprParser.java

