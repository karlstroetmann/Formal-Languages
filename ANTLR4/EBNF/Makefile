run: EBNF.class 
	java EBNF < EBNF_Grammar.g
	java EBNF < Examples/SetlXgrammar.g

EBNF.class: Alternative.java MyToken.java Concatenation.java Postfix.java \
            Epsilon.java Expr.java Rule.java Grammar.java Variable.java   \
            EBNF.java EBNF_GrammarLexer.java EBNF_GrammarParser.java      \
            Negation.java Range.java
	javac *.java

EBNF_GrammarParser.java EBNF_GrammarLexer.java: EBNF_Grammar.g
	java org.antlr.Tool EBNF_Grammar.g




