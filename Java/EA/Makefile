all: DFA.class

DFA.class: DFA.java Pair.java Triple.java 
	javac -Xlint DFA.java

DFA.java: DFA.jpre 
	cpp -P DFA.jpre DFA.java

test: DFA.class
	java DFA
