yydoc: yydoc-code.o yydoc.tab.o lex.yy.o
	gcc -g -o yydoc yydoc-code.o yydoc.tab.o lex.yy.o -lfl -lm

yydoc-code.o: yydoc-code.c yydoc.h 
	gcc -g -Wall -o yydoc-code.o -c yydoc-code.c

yydoc.tab.o: yydoc.tab.c yydoc.h
	gcc -g -Wall -o yydoc.tab.o -c yydoc.tab.c

lex.yy.o: lex.yy.c yydoc.h yydoc.tab.h
	gcc -g -Wall -o lex.yy.o -c lex.yy.c

yydoc.tab.c yydoc.tab.h: yydoc.y
	bison -v -g -t -d yydoc.y

lex.yy.c: yydoc.l
	flex yydoc.l

test: yydoc
	./yydoc < yydoc.y > yydoc.html

test2: yydoc
	./yydoc < calc.y > calc.html

test-c: yydoc
	./yydoc < c-parse.y > c-parse.html

test-verilog: yydoc
	./yydoc < verilog.y > verilog.html
