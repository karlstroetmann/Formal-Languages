CLASSPATH=.:/usr/local/lib/antlr-4.1-complete.jar

run: GrammarAnalysis.class
	java -cp $(CLASSPATH) GrammarAnalysis Examples/c-grammar.g > Examples/c-grammar-states.txt
#	java -cp $(CLASSPATH) GrammarAnalysis Examples/exercise.g 
#	java -cp $(CLASSPATH) GrammarAnalysis Examples/expr.g 
#	java -cp $(CLASSPATH) GrammarAnalysis Examples/non-slr.g 
#	java -cp $(CLASSPATH) GrammarAnalysis Examples/lr-but-not-lalr.g 
#	java -cp $(CLASSPATH) GrammarAnalysis Examples/lr-conflict.g 
#	java -cp $(CLASSPATH) GrammarAnalysis Examples/lr-conflict-resolved.g 
#	java -cp $(CLASSPATH) GrammarAnalysis Examples/mysterious.g 


GrammarAnalysis.class: GrammatikParser.java GrammatikLexer.java *.java
	javac -cp $(CLASSPATH) -Xlint *.java

GrammatikParser.java GrammatikLexer.java: Grammatik.g
	java -jar /usr/local/lib/antlr-4.1-complete.jar Grammatik.g

clean:
	rm -f *.class
	rm -f GrammatikLexer.java
	rm -f GrammatikParser.java
	rm -f Grammatik.tokens
	rm -f GrammatikBaseListener.java
	rm -f GrammatikListener.java


