AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}

run: c-grammar.html
	open c-grammar.html

c-grammar.html: Grammatik2HTML.class c-grammar.g
	java -cp ${CP} Grammatik2HTML c-grammar.g > c-grammar.html

Grammatik2HTML.class: Body.java Literal.java GrammatikLexer.java Grammar.java \
                      MyToken.java GrammatikParser.java Grammatik2HTML.java Rule.java \
                      Item.java Variable.java
	javac -cp ${CP} *.java

GrammatikParser.java GrammatikLexer.java: Grammatik.g4
	java -jar ${AntlrPath} Grammatik.g4

test: PureParser.class
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure cfg -gui c-grammar.g

PureParser.class: PureParser.java 
	javac -cp ${CP} Pure*.java

PureParser.java: Pure.g4
	java -jar ${AntlrPath} Pure.g4

clean:
	rm -f *.class
	rm -f *.tokens
	rm -f GrammatikLexer.java
	rm -f GrammatikListener.java
	rm -f GrammatikBaseListener.java
	rm -f GrammatikParser.java
	rm -f PureLexer.java
	rm -f PureListener.java	
	rm -f PureBaseListener.java
	rm -f PureParser.java



