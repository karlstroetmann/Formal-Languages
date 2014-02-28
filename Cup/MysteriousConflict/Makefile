CLASSPATH=.:/usr/local/lib/java-cup-11a-runtime.jar:/usr/local/lib/java-cup-11a.jar

all: mysterious.txt mysterious-solved.txt

mysterious.txt: mysterious.cup
	java -jar /usr/local/lib/java-cup-11a.jar -dump  mysterious.cup  2> mysterious.txt

mysterious-solved.txt: mysterious-solved.cup
	cup -dump -expect 3 mysterious-solved.cup 2> mysterious-solved.txt

clean:
	rm -f *.class
	rm -f parser.java
	rm -f sym.java
