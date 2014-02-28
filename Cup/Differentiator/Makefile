run: Differentiator.class
	echo "x * x + x" | java Differentiator

Differentiator.class: Differentiator.java Yylex.class parser.class 
	javac Differentiator.java

parser.class: parser.java Yylex.java
	javac parser.java

parser.java: differentiator.cup
	java java_cup.Main -dump differentiator.cup 2> parse-table.txt

Yylex.class: Yylex.java
	javac Yylex.java

Yylex.java: differentiator.jflex
	jflex differentiator.jflex