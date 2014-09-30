AntlrPath = /usr/local/lib/antlr-4.4-complete.jar
CP        = .:${AntlrPath}

run: SLInterpreter.class
	java -cp ${CP} SLInterpreter factorial.sl
	echo "6" | java -cp ${CP} SLInterpreter sum.sl

SLInterpreter.class: SLInterpreter.java SimpleParser.java SimpleLexer.java Assignment.java  \
                     Product.java Difference.java Quotient.java Equal.java Expr.java Statement.java \
                     Sum.java IfThen.java Variable.java LessThan.java While.java MyNumber.java \
                     Print.java Read.java InputReader.java BoolExpr.java
	javac -cp ${CP} SimpleLexer.java
	javac -cp ${CP} SimpleParser.java
	javac -cp ${CP} SLInterpreter.java

SimpleParser.java: Simple.g4
	java -jar ${AntlrPath} Simple.g4

SimpleLexer.java: Simple.g4
	java -jar ${AntlrPath} Simple.g4

test: PureParser.class
	grun Pure program -gui < factorial.sl
	grun Pure program -gui < sum.sl

PureParser.class: PureParser.java 
	javac -cp ${CP} Pure*.java

PureParser.java: Pure.g4
	java -jar ${AntlrPath} Pure.g4

clean:
	rm -f *.class
	rm -f *.tokens
	rm -f SimpleLexer.java
	rm -f SimpleListener.java
	rm -f SimpleBaseListener.java
	rm -f SimpleParser.java
	rm -f PureLexer.java
	rm -f PureListener.java	
	rm -f PureBaseListener.java
	rm -f PureParser.java
