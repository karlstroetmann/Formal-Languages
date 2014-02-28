CLASSPATH=.:/home/stroetma/Software/JavaCUP-New/java-cup-11a.jar
#CLASSPATH=.:/Users/stroetma/Software/JavaCUP-New/java-cup-11a.jar

run: TypeChecker.class types.ttl
	cat types.ttl | java -cp $(CLASSPATH) TypeChecker

TypeChecker.class:  CompositeType.java Equation.java MartelliMontanari.java ParamTypeDef.java Program.java Signature.java SimpleTypeDef.java Substitution.java Term.java Type.java TypeChecker.java TypeDef.java TypedTerm.java Parameter.java Yylex.java parser.java
	javac -g -cp $(CLASSPATH) TypeChecker.java

parser.java: typeChecker.cup
	java -cp $(CLASSPATH) java_cup.Main -dump typeChecker.cup 2> parse-table.txt

Yylex.class: Yylex.java sym.java
	javac Yylex.java

Yylex.java: typeChecker.jflex
	jflex typeChecker.jflex

