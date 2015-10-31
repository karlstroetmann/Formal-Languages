mengen.txt: DeTeX.class mengen.tex setl.tex
	java DeTeX mengen.tex > mengen.txt
	java DeTeX setl.tex   > setl.txt

DeTeX.class: DeTeX.java 
	javac DeTeX.java

DeTeX.java: detex.jflex
	jflex detex.jflex

clean:
	rm *.class
	rm Detex.java
	rm mengen.txt
	rm setl.txt
