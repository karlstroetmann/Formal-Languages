AntlrPath = /usr/local/lib/antlr-4.4-complete.jar
CP        = .:${AntlrPath}

run: Calculator.class input.txt
	java -cp ${CP} Calculator input.txt

Calculator.class: Calculator.java ExprParser.java
	javac *.java   

ExprParser.java ExprLexer: Expr.g4
	java -jar ${AntlrPath} Expr.g4

clean:
	rm *.class
	rm *.tokens
	rm ExprBaseListener.java ExprLexer.java ExprListener.java 



