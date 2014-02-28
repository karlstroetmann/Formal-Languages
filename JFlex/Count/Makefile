run: count/Count.class input.txt
	java count/Count input.txt

count/Count.class: count/Count.java
	javac count/Count.java

count/Count.java: count.jflex
	jflex -d count count.jflex
