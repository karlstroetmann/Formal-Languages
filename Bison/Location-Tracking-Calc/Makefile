ltcalc: ltcalc.tab.o lex.yy.o
	gcc -o ltcalc ltcalc.tab.o lex.yy.o -lfl

ltcalc.tab.o: ltcalc.tab.c ltcalc.tab.h
	gcc -o ltcalc.tab.o -c ltcalc.tab.c

ltcalc.tab.c ltcalc.tab.h: ltcalc.y
	bison -d ltcalc.y

lex.yy.o: lex.yy.c
	gcc -o lex.yy.o -c lex.yy.c

lex.yy.c: ltcalc.l
	flex ltcalc.l

test: ltcalc
	ltcalc < input.txt