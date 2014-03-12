CLASSPATH=.:/usr/local/lib/java-cup-11a-runtime.jar:/usr/local/lib/java-cup-11a.jar

all: conflict-ptb.txt no-conflict-ptb.txt

conflict-ptb.txt: lambda.cup
	java -cp /usr/local/lib/java-cup-11a.jar java_cup.Main -dump -expect 5 lambda.cup 2> conflict-ptb.txt

no-conflict-ptb.txt: lambda-generalized.cup
	java -cp /usr/local/lib/java-cup-11a.jar java_cup.Main -dump lambda-generalized.cup 2> no-conflict-ptb.txt

clean:
	rm -f *.class
	rm -f parser.java
	rm -f sym.java
	rm -f Yylex.java
