AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}

run: SLInterpreter.class
	java -cp ${CP} SLInterpreter sum-for.sl

SLInterpreter.class: SLInterpreter.java SimpleParser.java SimpleLexer.java \
                     Assignment.java BoolExpr.java \
                     Product.java Difference.java Quotient.java Equal.java Expr.java Statement.java \
                     For.java ForBasic.java Sum.java IfThen.java Variable.java LessThan.java \
                     While.java MyNumber.java InputReader.java \
                     Print.java LessThan.java GreaterThan.java LessOrEqual.java GreaterOrEqual.java \
                     NotEqual.java
	javac -cp ${CP} SLInterpreter.java

SimpleParser.java: Simple.g4
	java -jar ${AntlrPath} Simple.g4

test: PureParser.class
	java org.antlr.v4.runtime.misc.TestRig Pure program -gui < sum-for.sl

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

