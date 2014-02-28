run: GrammarAnalysis.class
#	java GrammarAnalysis Examples/lalr-but-not-slr.g
#	java GrammarAnalysis Examples/lr-but-not-lalr.g
#	java GrammarAnalysis Examples/mysterious.g
	java -cp .:/Users/stroetma/Software/ANTLR/antlr-3.4-complete.jar GrammarAnalysis Examples/exam-12.g

GrammarAnalysis.class: Accept.java GrammarAnalysis.java	Reduce.java \
                       Action.java Item.java Rule.java Body.java \
                       Literal.java Shift.java Closure.java MarkedRule.java \
                       ExtendedRule.java \
                       SimpleRule.java ComparableSet.java MyToken.java \
                       Variable.java Grammar.java Producer.java Conflict.java \
                       grammatikLexer.java grammatikParser.java Grammar.java
	javac -cp .:/Users/stroetma/Software/ANTLR/antlr-3.4-complete.jar *.java

grammatikParser.java grammatikLexer.java: grammatik.g
	java -cp .:/Users/stroetma/Software/ANTLR/antlr-3.4-complete.jar org.antlr.Tool grammatik.g




