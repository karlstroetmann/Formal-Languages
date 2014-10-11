CLASSPATH = "/usr/local/lib/java-cup-11a.jar:/usr/local/lib/java-cup-11b-runtime.jar:.:.." 

run: Examples/MySum.class 
	cd Examples; java -cp . MySum

Examples/MySum.class: Examples/MySum.jas
	cd Examples; jasmin MySum.jas

Examples/MySum.jas: Compiler.class Examples/MySum.c
	cd Examples; java -cp $(CLASSPATH) Compiler MySum

Compiler.class: Yylex.java Compiler.java parser.java sym.java
	javac -g -Xlint:unchecked Assembler/*.java
	javac -g -cp $(CLASSPATH) parser.java
	javac -g -Xlint:unchecked -cp $(CLASSPATH) Compiler.java

parser.java sym.java: compiler.cup
	java -cp $(CLASSPATH) java_cup.Main -expect 1 compiler.cup

Yylex.java: compiler.jflex
	jflex compiler.jflex

clean:
	rm -f Assembler/*.class
	rm -f *.class
	rm -f parser.java
	rm -f Yylex.java
	rm -f Yylex.java~
