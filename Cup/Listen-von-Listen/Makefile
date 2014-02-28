#CLASSPATH  = "/Users/stroetma/Software/JavaCUP-New/:." 
CLASSPATH  = "/home/stroetma/Software/JavaCUP-New/:." 
#JAVACUPJAR = "/Users/stroetma/Software/JavaCUP-New/java-cup-11a.jar"
JAVACUPJAR = "/home/stroetma/Software/JavaCUP-New/java-cup-11a.jar"


run: Listen.class
	echo "[ 1, [], [2, [3]]]" | java -cp $(CLASSPATH) Listen

Listen.class: Listen.java Yylex.class parser.class
	javac -cp $(CLASSPATH) Listen.java

parser.class: parser.java Yylex.java
	javac -cp $(CLASSPATH) parser.java

parser.java: listen.cup
	java -jar $(JAVACUPJAR)  -dump listen.cup 2> parse-table.txt

Yylex.class: Yylex.java
	javac -cp $(CLASSPATH) Yylex.java

Yylex.java: listen.jflex
	jflex listen.jflex