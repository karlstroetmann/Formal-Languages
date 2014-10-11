CLASSPATH=.:/usr/local/lib/java-cup-11b-runtime.jar:/usr/local/lib/java-cup-11b.jar

run: Calculator.class
	echo "2 ^ 3 ^ 4;" | java -cp $(CLASSPATH) Calculator
	echo "1 + 2 * 3;" | java -cp $(CLASSPATH) Calculator

Calculator.class: Calculator.java Yylex.class parser.class
	javac -cp $(CLASSPATH) Calculator.java

parser.class: parser.java Yylex.java
	javac -cp $(CLASSPATH) parser.java

parser.java: calc.cup
	java -cp /usr/local/lib/java-cup-11a.jar java_cup.Main  -dump calc.cup 2> parse-table.txt

Yylex.class: Yylex.java parser.java
	javac -cp $(CLASSPATH) Yylex.java

Yylex.java: calc.jflex
	jflex calc.jflex

clean:
	rm -f *.class
	rm -f parser.java
	rm -f sym.java
	rm -f Yylex.java
