IfThenElseWorkParser.class : IfThenElseWorkParser.java
	javac IfThenElseWorkParser.java

IfThenElseWorkParser.java : IfThenElseWork.jj
	javacc IfThenElseWork.jj

IfThenElseWorkParser.html : IfThenElseWork.jj
	jjdoc IfThenElseWork.jj

IfThenElseParser.class : IfThenElseParser.java
	javac IfThenElseParser.java

IfThenElseParser.java : IfThenElse.jj
	javacc IfThenElse.jj

IfThenElseParser.html : IfThenElse.jj
	jjdoc IfThenElse.jj

IfThenElseCleanParser.class : IfThenElseCleanParser.java
	javac IfThenElseCleanParser.java

IfThenElseCleanParser.java : IfThenElseClean.jj
	javacc IfThenElseClean.jj

IfThenElseCleanParser.html : IfThenElseClean.jj
	jjdoc IfThenElseClean.jj

doc: IfThenElseParser.html IfThenElseCleanParser.html IfThenElseWorkParser.html

test: IfThenElseWorkParser.class
	cat test.txt | java IfThenElseWorkParser