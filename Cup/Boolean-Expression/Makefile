run: Calculator.class
	echo "a | b & b | !c" | java Calculator

Calculator.class: Calculator.java Lexer.class parser.class
	javac Calculator.java

parser.class: parser.java Lexer.java
	javac parser.java

parser.java: calc.cup
	java java_cup.Main -dump calc.cup

Lexer.class: Lexer.java
	javac Lexer.java

Lexer.java: calc.jflex
	jflex calc.jflex