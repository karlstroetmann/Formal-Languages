run1: ParseLeft.class 
	echo "xy" | java ParseLeft

ParseLeft.class: ParseLeft.java LeftParser.java LeftScanner.java
	javac ParseLeft.java

LeftParser.java LeftScanner.java: Left.g
	java org.antlr.Tool Left.g

run2: ParseFactored.class 
	echo "xy" | java ParseFactored

ParseFactored.class: ParseFactored.java FactoredParser.java FactoredScanner.java
	javac ParseFactored.java

FactoredParser.java FactoredScanner.java: Factored.g
	java org.antlr.Tool Factored.g



