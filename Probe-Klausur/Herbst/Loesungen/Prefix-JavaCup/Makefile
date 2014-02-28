CLASSPATH=.:/Users/stroetma/Software/JavaCup/java-cup-11a-runtime.jar:/Users/stroetma/Software/JavaCup/java-cup-11a.jar
#CLASSPATH=.:/Users/karlstroetmann/Software/JavaCup/java-cup-11a-runtime.jar:/Users/macbook/stroetma/Software/JavaCup/java-cup-11a.jar

run: Calculator.class
	echo "- + 1 * 2 3 * 4 1" | java Calculator

Calculator.class: Calculator.java Yylex.java parser.java sym.java
	javac -cp $(CLASSPATH) Calculator.java

parser.java sym.java: calc.cup calc.jflex
	cup -dump calc.cup 2> parse-table.txt

Yylex.class: Yylex.java sym.java
	javac -cp $(CLASSPATH) Yylex.java

Yylex.java: calc.jflex
	jflex calc.jflex