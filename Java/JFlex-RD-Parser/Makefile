test: Scanner.class ExprParser.class test.txt
	java Scanner test.txt

ExprParser.class: ExprParser.java
	javac ExprParser.java

Scanner.class: Scanner.java ExprParser.java
	javac Scanner.java

Scanner.java: scanner.jflex
	jflex scanner.jflex

