calc: calc.tab.o lex.yy.o
	gcc -g -o calc calc.tab.o lex.yy.o -lfl -lm

calc.tab.o: calc.tab.c 
	gcc -g -Wall -o calc.tab.o -c calc.tab.c

lex.yy.o: lex.yy.c calc.tab.h
	gcc -g -Wall -o lex.yy.o -c lex.yy.c

calc.tab.c calc.tab.h: calc.y
	bison -v -t -d calc.y

lex.yy.c: calc.l
	flex calc.l

test: calc
	./calc < input.txt
