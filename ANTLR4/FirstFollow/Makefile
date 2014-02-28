run: GrammarAnalysis.class
	java GrammarAnalysis < Examples/expr-left.g

GrammarAnalysis.class: *.java 
	javac *.java

grammatikParser.java: grammatik.g
	java org.antlr.Tool grammatik.g



