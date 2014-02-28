#CLASSPATH = "/Users/stroetma/Software/JavaCup/java-cup-11a.jar:." 
CLASSPATH = "/Users/karlstroetmann/Software/JavaCup/java-cup-11a.jar:." 

run: Examples/sum.ijvm
	echo "3" | ijvm-sim Examples/sum.ijvm

Examples/sum.ijvm: Examples/sum.jas
#	cd Examples; java -cp /Users/karlstroetmann/Software/Mic-1/Mic1/source/ ijvmasm sum.jas
	cd Examples; java -cp /Users/stroetma/Software/Mic-1/Mic1/source/ ijvmasm sum.jas

Examples/sum.jas: Compiler.class 
	java -cp $(CLASSPATH) Compiler Examples/sum

Compiler.class: Assign.java Block.java BoolExpr.java Compiler.java Conjunction.java \
                Declaration.java Difference.java Disjunction.java Equation.java Expr.java \
                ExprStatement.java Function.java FunctionCall.java GreaterOrEqual.java \
                GreaterThan.java IfThen.java IfThenElse.java Inequation.java LessOrEqual.java \
                LessThan.java MyNumber.java Negation.java Product.java Program.java Quotient.java \
                Return.java Statement.java Sum.java Variable.java While.java Yylex.java sym.java
	javac -g -Xlint:unchecked Assembler/*.java
	javac -g -cp $(CLASSPATH) parser.java
	javac -g -Xlint:unchecked -cp $(CLASSPATH) Compiler.java

parser.java sym.java: compiler.cup
	java -cp $(CLASSPATH) java_cup.Main -expect 1 compiler.cup

Yylex.java: compiler.jflex
	jflex compiler.jflex

