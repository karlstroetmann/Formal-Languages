#CLASSPATH = "/Users/stroetma/Software/JavaCUP-New/:." 
CLASSPATH = "/home/stroetma/Software/JavaCUP-New/:." 

run: Compiler.class 
	java -cp $(CLASSPATH) Compiler Examples/sum

Compiler.class: *.java
	javac -g -Xlint:unchecked -cp $(CLASSPATH) *.java

parser.java sym.java: compiler.cup
	java -jar /home/stroetma/Software/JavaCUP-New/java-cup-11a.jar -expect 1 -dump compiler.cup 2> parse-table.txt
#	java -jar /Users/stroetma/Software/JavaCUP-New/java-cup-11a.jar -expect 1 -dump compiler.cup 2> parse-table.txt

Yylex.java: compiler.jflex
	jflex compiler.jflex

