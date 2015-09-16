rpcalc: rpcalc.tab.o lex.yy.o
	gcc -g -o rpcalc rpcalc.tab.o lex.yy.o -lfl -lm

rpcalc.tab.o: rpcalc.tab.c 
	gcc -g -Wall -o rpcalc.tab.o -c rpcalc.tab.c

lex.yy.o: lex.yy.c rpcalc.tab.h
	gcc -g -Wall -o lex.yy.o -c lex.yy.c

rpcalc.tab.c rpcalc.tab.h: rpcalc.y
	bison -v -t -d rpcalc.y

lex.yy.c: rpcalc.l
	flex rpcalc.l

test: rpcalc
	./rpcalc < input.txt
