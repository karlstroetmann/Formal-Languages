probe-klausur: probe-klausur.pdf
	open probe-klausur.pdf

probe-klausur.pdf: probe-klausur.ps
	ps2pdf probe-klausur.ps

probe-klausur.ps: probe-klausur.dvi
	dvips -o probe-klausur.ps probe-klausur.dvi

probe-klausur.dvi: probe-klausur.tex
	latex probe-klausur.tex


loesung: loesung.pdf
	open loesung.pdf

loesung.pdf: loesung.ps
	ps2pdf loesung.ps

loesung.ps: loesung.dvi
	dvips -o loesung.ps loesung.dvi

loesung.dvi: loesung.tex 
	latex loesung.tex


Abildungen/aufgabe2c.ps: Abildungen/aufgabe2c.dot
	dot -Tps -o Abildungen/aufgabe2c.ps Abildungen/aufgabe2c.dot

Abildungen/aufgabe2c.pdf: Abildungen/aufgabe2c.ps
	ps2pdf Abildungen/aufgabe2c.ps

Abildungen/graph.ps: Abildungen/aufgabe2c.pdf
	Abildungen/pdf2ps graph.ps
