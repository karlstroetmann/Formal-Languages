CLASSPATH=.:/usr/local/lib/java-cup-11a-runtime.jar:/usr/local/lib/java-cup-11a.jar
#CLASSPATH=.:/Users/stroetma/Software/JavaCup/java-cup-11a.jar

conflicts.txt: calc.cup
	java -cp $(CLASSPATH) java_cup.Main -dump calc.cup 2> conflicts.txt

clean:
	rm -f *.class
	rm -f parser.java
	rm -f sym.java
	rm -f Yylex.java