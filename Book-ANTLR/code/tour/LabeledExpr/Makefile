AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}

run: Calc.class
	java -cp ${CP} Calc t.expr

Calc.class: Calc.java EvalVisitor.java ExprBaseVisitor.java ExprVisitor.java ExprParser.java ExprLexer.java
	javac -cp ${CP} Calc.java

ExprBaseVisitor.java ExprVisitor.java ExprParser.java ExprLexer.java: Expr.g4
	java -jar ${AntlrPath} -no-listener -visitor Expr.g4
