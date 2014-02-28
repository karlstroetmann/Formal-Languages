CLASSPATH=.:/Users/stroetma/Software/JavaCUP-New/java-cup-11a-runtime.jar:/Users/stroetma/Software/JavaCUP-New/java-cup-11a.jar
#CLASSPATH=.:/home/stroetma/Software/JavaCUP-New/java-cup-11a-runtime.jar:/home/stroetma/Software/JavaCUP-New/java-cup-11a.jar

run: Program.class
	cat Examples/factorial.sl | java Program
	cat Examples/solve.sl     | java Program
	cat Examples/sum-for.sl   | java Program
	cat Examples/test-neg.sl  | java Program
	cat Examples/sum.sl       | java Program

Program.class sym.java: Program.java Yylex.class parser.class
	javac -cp $(CLASSPATH) Program.java

parser.class: parser.java Yylex.java
	javac -cp $(CLASSPATH) parser.java

parser.java: program.cup
	cup -dump program.cup 2> parse-table.txt

Yylex.class: Yylex.java sym.java
	javac -cp $(CLASSPATH) Yylex.java

Yylex.java: program.jflex
	jflex program.jflex