AntlrPath = /usr/local/lib/antlr-4.1-complete.jar
CP        = .:${AntlrPath}


run: Test.class ShortToUnicodeString.class
	echo "{1, 2, {3, {4, {}}}}"  | java -cp ${CP} Test
	echo "{1, 2, {3, {4, {5}}}}" | java -cp ${CP} Translate

Translate.class: Translate.java ShortToUnicodeString.class ArrayInitParser.class \
                 ArrayInitLexer.class ArrayInitBaseListener.class
	javac -cp ${CP} Translate.java

ShortToUnicodeString.class: ShortToUnicodeString.java
	javac -cp ${CP} ShortToUnicodeString.java

Test.class: Test.java ArrayInitParser.class ArrayInitLexer.class 
	javac -cp ${CP} Test.java

ArrayInitBaseListener.class: ArrayInitBaseListener.java
	javac -cp ${CP} ArrayInitBaseListener.java

ArrayInitParser.class: ArrayInitParser.java
	javac -cp ${CP} ArrayInitParser.java

ArrayInitLexer.class: ArrayInitLexer.java
	javac -cp ${CP} ArrayInitLexer.java

ArrayInitParser.java ArrayInitLexer.java: ArrayInit.g4
	java -jar ${AntlrPath} ArrayInit.g4
