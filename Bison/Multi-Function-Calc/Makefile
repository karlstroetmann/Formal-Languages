mfcalc: mfcalc.tab.o lex.yy.o my-calc.o
	gcc -Wall -o mfcalc my-calc.o mfcalc.tab.o lex.yy.o -lm -lfl

mfcalc.tab.o: mfcalc.tab.c mfcalc.tab.h mfcalc.h
	gcc -Wall -o mfcalc.tab.o -c mfcalc.tab.c

mfcalc.tab.h mfcalc.tab.c: mfcalc.y
	bison -v -t -d mfcalc.y

lex.yy.c: mfcalc.l
	flex mfcalc.l

my-calc.o: my-calc.c mfcalc.h
	gcc -Wall -o my-calc.o -c my-calc.c

lex.yy.o: lex.yy.c mfcalc.tab.h mfcalc.h
	gcc -Wall -o lex.yy.o -c lex.yy.c

test: mfcalc
	./mfcalc < input.txt