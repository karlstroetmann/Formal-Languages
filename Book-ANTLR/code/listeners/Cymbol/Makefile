AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}

run: t.ps
	open t.ps

t.ps: t.dot
	dot -Tps t.dot -o t.ps

t.dot: CallGraph.class 
	java -cp ${CP} CallGraph t.cymbol > t.dot

CallGraph.class: CallGraph.java CymbolBaseListener.java CymbolListener.java CymbolParser.java CymbolLexer.java
	javac -cp ${CP} CallGraph.java

CymbolBaseListener.java CymbolListener.java CymbolParser.java CymbolLexer.java: Cymbol.g4
	java -jar ${AntlrPath} Cymbol.g4

clean:
	rm Cymbol.tokens CymbolLexer.tokens
	rm *.class
	rm CymbolBaseListener.java CymbolListener.java CymbolParser.java CymbolLexer.java
	rm t.dot t.ps 
