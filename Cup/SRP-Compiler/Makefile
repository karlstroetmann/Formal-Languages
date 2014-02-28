#CLASSPATH = "/Users/stroetma/Software/JavaCup/java-cup-11a.jar:/Users/stroetma/Software/JavaCup/java-cup-11a-runtime.jar:." 
CLASSPATH = "/Users/macbook/Software/JavaCup/java-cup-11a.jar:/Users/macbook/Software/JavaCup/java-cup-11a-runtime.jar:." 

run: Compiler.class
	java -cp $(CLASSPATH) Compiler Examples/factorial

Compiler.class: GreaterThan.java Negation.java  Assign.java \
                Block.java Product.java BoolExpr.java Program.java \
                IfThen.java Quotient.java IfThenElse.java Compiler.java \
                Inequation.java Register.java Conjunction.java ReturnStmnt.java \
                Declaration.java LessOrEqual.java Difference.java LessThan.java \
                Disjunction.java Location.java Statement.java \
                Equation.java Sum.java Expr.java Variable.java \
                Function.java Memory.java While.java \
                FunctionCall.java MyNumber.java Yylex.java \
                parser.java GreaterOrEqual.java sym.java 
	javac -g -Xlint:unchecked -cp $(CLASSPATH) assembler/*.java
	javac -g -cp $(CLASSPATH) parser.java
	javac -g -Xlint:unchecked -cp $(CLASSPATH) Compiler.java

parser.java sym.java: compiler.cup
	cup -expect 1 compiler.cup 

Yylex.java: compiler.jflex
	jflex compiler.jflex

