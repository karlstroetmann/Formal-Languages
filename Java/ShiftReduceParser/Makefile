run: ShiftReduceParser.class
	echo "1 + 2 * 3" | java ShiftReduceParser

ShiftReduceParser.class: ShiftReduceParser.java Scanner.java
	javac *.java

Scanner.java: calc.jflex
	jflex calc.jflex

