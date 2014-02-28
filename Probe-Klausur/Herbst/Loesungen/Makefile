jflex: Kasse.class
	java Kasse kassenzettel.txt

Kasse.class: Kasse.java
	javac Kasse.java

Kasse.java: kasse.jflex
	jflex kasse.jflex


##########################################################################
kasse : kasse.yy.o 
	gcc -g -o kasse kasse.yy.o -lm -lfl

kasse.yy.o : kasse.yy.c 
	gcc -g -c kasse.yy.c -o kasse.yy.o

kasse.yy.c : kasse.l
	flex -okasse.yy.c kasse.l 

test-kasse : kasse kassenzettel.txt
	kasse < kassenzettel.txt 

#############################################################################

prefix: prefix.tab.o lex.yy.o
	gcc -g -o prefix prefix.tab.o lex.yy.o -lfl -lm

prefix.tab.o: prefix.tab.c 
	gcc -g -Wall -o prefix.tab.o -c prefix.tab.c

lex.yy.o: lex.yy.c prefix.tab.h
	gcc -g -Wall -o lex.yy.o -c lex.yy.c

prefix.tab.c prefix.tab.h: prefix.y
	bison -v -t -d prefix.y

lex.yy.c: prefix.l
	flex prefix.l

test-prefix: prefix prefix.txt
	./prefix < prefix.txt

#############################################################################

Prefix.class: Prefix.java
	javac Prefix.java

Prefix.java: Prefix.jj
	javacc Prefix.jj

test-prefix-jj: Prefix.class
	java Prefix < prefix.txt

%.class : %.java
	javac -g $< 

