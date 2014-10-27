CLASSPATH = ".:/usr/local/lib/java-cup-11b-runtime.jar" 

run: Examples/MySum.class 
	cd Examples; java -cp . MySum

Examples/MySum.class: Examples/MySum.jas
	cd Examples; jasmin MySum.jas

Examples/MySum.jas: Compiler.class Examples/MySum.c
	cd Examples; java -cp ..:/usr/local/lib/java-cup-11b-runtime.jar Compiler MySum

Compiler.class: Yylex.java Compiler.java IntegerCParser.java IntegerCParserSym.java
	javac -g -Xlint:unchecked -cp $(CLASSPATH) Compiler.java

IntegerCParser.java IntegerCParserSym.java: compiler.cup
	cup -expect 1 compiler.cup

Yylex.java: compiler.jflex
	jflex compiler.jflex

clean:
	rm -f Assembler/*.class
	rm -f *.class
	rm -f IntegerCParser.java
	rm -f IntegerCParserSym.java
	rm -f Yylex.java
	rm -f Yylex.java~
	rm -f Examples/MySum.jas
	rm -f Examples/MySum.class
