RDParser.class: RDParser.java ExprParser.java
	javac RDParser.java

ExprParser.class: ExprParser.java
	javac ExprParser.java

RDParser.java: RDParser.jj
	javacc RDParser.jj

test: RDParser.class ExprParser.class
	echo "(2 + 3) * 4 + 2 * 3" | java RDParser