jflex: Kasse.class
	java Kasse kassenzettel.txt

Kasse.class: Kasse.java
	javac Kasse.java

Kasse.java: kasse.jflex
	/usr/bin/jflex kasse.jflex

clean:
	rm -f Kasse.java
	rm -f *.class



