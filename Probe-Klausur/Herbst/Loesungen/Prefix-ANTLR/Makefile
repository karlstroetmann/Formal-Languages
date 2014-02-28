run: ParseExpr.class 
	java ParseExpr < input.txt

ParseExpr.class: ParseExpr.java PrefixParser.java
	javac ParseExpr.java

PrefixParser.java PrefixLexer.java: Prefix.g
	java org.antlr.Tool Prefix.g



