AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}

run: ExtractInterfaceTool.class ExtractInterfaceListener.class
	java -cp ${CP} ExtractInterfaceTool Demo.java

ExtractInterfaceTool.class ExtractInterfaceListener: ExtractInterfaceTool.java \
                           ExtractInterfaceListener.java JavaBaseListener.java \
                           JavaListener.java JavaParser.java JavaLexer.java
	javac -cp ${CP} ExtractInterfaceTool.java

JavaBaseListener.java JavaListener.java JavaParser.java JavaLexer.java: Java.g4
	java -jar ${AntlrPath}  Java.g4
