##########################################################################
countPoints : countPoints.yy.o 
	gcc -g -o countPoints countPoints.yy.o -lm -lfl

countPoints.yy.o : countPoints.yy.c 
	gcc -g -c countPoints.yy.c -o countPoints.yy.o

countPoints.yy.c : countPoints.l
	flex -ocountPoints.yy.c countPoints.l 

testCountPoints : countPoints
	countPoints < /Users/stroetma/Kurse/Logik/Klausur/klausur-08.tex
##########################################################################
noten : noten.yy.o 
	gcc -g -o noten noten.yy.o -lm -lfl

noten.yy.o : noten.yy.c 
	gcc -g -c noten.yy.c -o noten.yy.o

noten.yy.c : noten.l
	flex -onoten.yy.c noten.l 

testNoten : noten
	noten 60 < ergebnis

#############################################################################
html2txt : html2txt.yy.o 
	gcc -g -o html2txt html2txt.yy.o -lm -lfl

html2txt.yy.o : html2txt.yy.c 
	gcc -g -c html2txt.yy.c -o html2txt.yy.o

html2txt.yy.c : html2txt.l
	flex -ohtml2txt.yy.c html2txt.l 

testHtml : html2txt
	html2txt < index.html
#############################################################################
decomment : decomment.yy.o 
	gcc -g -o decomment decomment.yy.o -lm -lfl

decomment.yy.o : decomment.yy.c 
	gcc -g -c decomment.yy.c -o decomment.yy.o

decomment.yy.c : decomment.l
	flex -odecomment.yy.c decomment.l 

testDecomment : decomment
	decomment < test-comment.c
#############################################################################
decomment2 : decomment2.yy.o 
	gcc -g -o decomment2 decomment2.yy.o -lm -lfl

decomment2.yy.o : decomment2.yy.c 
	gcc -g -c decomment2.yy.c -o decomment2.yy.o

decomment2.yy.c : decomment2.l
	flex -odecomment2.yy.c decomment2.l 

testDecomment2 : decomment2
	decomment2 < test-comment.c
#############################################################################
decomment3 : decomment3.yy.o 
	gcc -g -o decomment3 decomment3.yy.o -lm -lfl

decomment3.yy.o : decomment3.yy.c 
	gcc -g -c decomment3.yy.c -o decomment3.yy.o

decomment3.yy.c : decomment3.l
	flex -odecomment3.yy.c decomment3.l 

testDecomment3 : decomment3
	decomment3 < test-comment.c
#############################################################################
line-count : line-count.yy.o 
	gcc -g -o line-count line-count.yy.o -lm -lfl

line-count.yy.o : line-count.yy.c 
	gcc -g -c line-count.yy.c -o line-count.yy.o

line-count.yy.c : line-count.l
	flex -oline-count.yy.c line-count.l 

testLineCount : line-count decomment3
	decomment3 < test-comment.c | line-count
#############################################################################
change : lex.yy.o 
	gcc -g -o change lex.yy.o -lm -lfl

lex.yy.o : lex.yy.c 
	gcc -g -c lex.yy.c -o lex.yy.o

lex.yy.c : change.l
	flex  change.l

test : change
	./change < test.txt






