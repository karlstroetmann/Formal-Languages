AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}


run: Examples/expr.g EarleyParser.class
	java EarleyParser Examples/expr.g Examples/expr.txt
	java EarleyParser Examples/aiken-expr.g Examples/aiken-expr.txt

EarleyParser.class: Body.java Literal.java GrammatikLexer.java Grammar.java \
                    MyToken.java grammatikParser.java EarleyParser.java Rule.java \
                    Item.java Variable.java GrammatikParser.java EarleyItem.java
	javac *.java

GrammatikParser.java GrammatikLexer.java: Grammatik.g4
	java -jar ${AntlrPath} Grammatik.g4

test: PureParser.class
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure cfg -gui Examples/expr.g 
	java -cp ${CP} org.antlr.v4.runtime.misc.TestRig Pure cfg -gui Examples/aiken-expr.g 

PureParser.class: PureParser.java 
	javac -cp ${CP} Pure*.java

PureParser.java: Pure.g4
	java -jar ${AntlrPath} Pure.g4

clean:
	rm -f *.class
	rm -f *.tokens
	rm -f SimpleLexer.java
	rm -f SimpleListener.java
	rm -f SimpleBaseListener.java
	rm -f SimpleParser.java
	rm -f PureLexer.java
	rm -f PureListener.java	
	rm -f PureBaseListener.java
	rm -f PureParser.java


