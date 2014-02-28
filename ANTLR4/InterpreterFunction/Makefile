AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}

run: SLInterpreter.class
	java -cp ${CP} SLInterpreter Examples/sum-for.sl
	java -cp ${CP} SLInterpreter Examples/solve.sl
	java -cp ${CP} SLInterpreter Examples/factorial.sl 
	echo "36" | java -cp ${CP} SLInterpreter Examples/read-test.sl
	java -cp ${CP} SLInterpreter Examples/euler.sl
	java -cp ${CP} SLInterpreter Examples/pi.sl

SLInterpreter.class: Assignment.java Negation.java BoolExpr.java NotEqual.java \
                     Conjunction.java Print.java Definition.java PrintExpr.java \
                     Difference.java PrintString.java Disjunction.java Product.java \
                     Environment.java Quit.java Equal.java Quotient.java \
                     Expr.java Read.java ExprStmnt.java Return.java \
                     For.java ReturnException.java FunctionCall.java SLInterpreter.java \
                     GreaterOrEqual.java GreaterThan.java IfThen.java Statement.java \
                     LessOrEqual.java Sum.java LessThan.java Variable.java \
                     MyNumber.java While.java InputReader.java \
                     SimpleParser.java SimpleLexer.java Simple.tokens
	javac -cp ${CP} SimpleLexer.java
	javac -cp ${CP} SimpleParser.java
	javac -cp ${CP} SLInterpreter.java

SimpleParser.java SimpleLexer.java Simple.tokens: Simple.g4
	java -jar ${AntlrPath} Simple.g4

test: PureParser.class
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure program -gui Examples/sum-for.sl
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure program -gui Examples/solve.sl
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure program -gui Examples/factorial.sl
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure program -gui Examples/read-test.sl
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure program -gui Examples/euler.sl
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure program -gui Examples/pi.sl

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

