AntlrPath = /usr/local/lib/antlr-4.4-complete.jar
CP        = .:${AntlrPath}

run: RunProgram.class input.txt
	java -cp ${CP} RunProgram input.txt

RunProgram.class: RunProgram.java ProgramParser.java
	javac *.java   

ProgramParser.java ProgramLexer: Program.g4
	java -jar ${AntlrPath} Program.g4

clean:
	rm *.class
	rm *.tokens
	rm ProgramBaseListener.java ProgramLexer.java ProgramListener.java 



