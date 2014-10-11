CLASSPATH=.:/usr/local/lib/java-cup-11b-runtime.jar

run: Calculator.class
	cat input.txt
	java -cp $(CLASSPATH) Calculator input.txt

Calculator.class: Calculator.java Yylex.java ExprParser.java ExprParserSym.java
	javac -cp $(CLASSPATH) Calculator.java

ExprParser.java ExprParserSym.java: calc.cup calc.jflex
	cup calc.cup 

Yylex.java: calc.jflex
	jflex calc.jflex

clean:
	rm -f *.class
	rm -f ExprParser.java
	rm -f ExprParserSym.java
	rm -f Yylex.java
	rm -f Yylex.java~
