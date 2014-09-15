AntlrPath = /usr/local/lib/antlr-4.4-complete.jar
CP        = .:${AntlrPath}

run: ParseProgram.class 
	echo "a := 2; x := 3; z := a * b;" | java -cp ${CP} ParseProgram

ParseProgram.class: ParseProgram.java ProgramParser.java
	javac -cp ${CP} ParseProgram.java  

ProgramParser.java: Program.g4
	java -jar ${AntlrPath} Program.g4

clean:
	rm *.class
	rm *.tokens
	rm ProgramBaseListener.java ProgramLexer.java ProgramListener.java ProgramParser.java



