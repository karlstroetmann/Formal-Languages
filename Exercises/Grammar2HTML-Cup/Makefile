CLASSPATH=.:/usr/local/lib/java-cup-11b-runtime.jar

run: Grammatik.class
	java -cp $(CLASSPATH)  Grammatik calc.cup      > calc.html;      open calc.html
	java -cp $(CLASSPATH)  Grammatik grammar.cup   > grammar.html;   open grammar.html
	java -cp $(CLASSPATH)  Grammatik c-grammar.cup > c-grammar.html; open c-grammar.html
	java -cp $(CLASSPATH)  Grammatik compiler.cup  > compiler.html;  open compiler.html


Grammatik.class: Grammatik.java GrammarParser.java GrammarParserSym.java Yylex.java
	javac -cp $(CLASSPATH) Grammatik.java

GrammarParser.java GrammarParserSym.java: grammar.cup 
	cup grammar.cup 

Yylex.java: grammar.jflex
	jflex grammar.jflex

clean:
	rm -f *.class
	rm -f GrammarParserSym.java
	rm -f GrammarParser.java
	rm -f Yylex.java
	rm -f Yylex.java~
	rm -f grammar.html
	rm -f calc.html
	rm -f c-grammar.html
