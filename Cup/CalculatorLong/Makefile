CLASSPATH=.:/usr/local/lib/java-cup-11b-runtime.jar:/usr/local/lib/java-cup-11b.jar

run: Calculator.class
	echo "1 + 2 * 3 - 4 * 1;" | java -cp $(CLASSPATH) Calculator

Calculator.class: Calculator.java Yylex.java parser.java sym.java
	javac -cp $(CLASSPATH) Calculator.java

parser.java sym.java: calc.cup calc.jflex
	cup -dump calc.cup 2> parse-table.txt

Yylex.class: Yylex.java sym.java
	javac -cp $(CLASSPATH) Yylex.java

Yylex.java: calc.jflex
	jflex calc.jflex

clean:
	rm -f *.class
	rm -f parser.java
	rm -f sym.java
	rm -f Yylex.java
