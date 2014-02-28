test: Scanner.class ExprParser.class test.txt
	java Scanner test.txt

Scanner.class: Scanner.java ExprParser.java
	javac Scanner.java

Scanner.java: scanner.jflex
	jflex scanner.jflex

