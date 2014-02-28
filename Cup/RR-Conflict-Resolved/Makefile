run: Calculator.class
	echo "x y" | java Calculator
	echo "y x" | java Calculator

Calculator.class: Calculator.java Yylex.class parser.class
	javac Calculator.java

parser.class: parser.java Yylex.java
	javac parser.java

parser.java: grammar.cup
	java java_cup.Main -dump grammar.cup 2> parse-table.txt

Yylex.class: Yylex.java
	javac Yylex.java

Yylex.java: grammar.jflex
	jflex grammar.jflex