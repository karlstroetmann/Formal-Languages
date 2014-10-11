CLASSPATH=.:/usr/local/lib/java-cup-11b-runtime.jar:/usr/local/lib/java-cup-11b.jar

run: Differentiator.class
	echo "x * x + x" | java Differentiator

Differentiator.class: Differentiator.java Yylex.class parser.class 
	javac -cp $(CLASSPATH) Differentiator.java

parser.class: parser.java Yylex.java 
	javac -cp $(CLASSPATH) parser.java

parser.java sym.java: differentiator.cup
	java java_cup.Main -dump differentiator.cup 2> parse-table.txt

Yylex.class: Yylex.java sym.java
	javac -cp $(CLASSPATH) Yylex.java

Yylex.java: differentiator.jflex
	jflex differentiator.jflex

clean:
	rm -f *.class
	rm -f parser.java
	rm -f sym.java
	rm -f Yylex.java
