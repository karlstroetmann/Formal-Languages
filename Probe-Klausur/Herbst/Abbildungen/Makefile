all: graph-a.eps graph-c.eps graph-d.eps graph-e.eps


aufgabe2a.ps: aufgabe2a.dot
	dot -Tps -o aufgabe2a.ps aufgabe2a.dot

aufgabe2a.pdf: aufgabe2a.ps
	ps2pdf aufgabe2a.ps

graph-a.ps: aufgabe2a.pdf
	pdf2ps aufgabe2a.pdf graph-a.ps

graph-a.eps: graph-a.ps
	ps2eps -f graph-a.ps


aufgabe2c.ps: aufgabe2c.dot
	dot -Tps -o aufgabe2c.ps aufgabe2c.dot

aufgabe2c.pdf: aufgabe2c.ps
	ps2pdf aufgabe2c.ps

graph-c.ps: aufgabe2c.pdf
	pdf2ps aufgabe2c.pdf graph-c.ps

graph-c.eps: graph-c.ps
	ps2eps -f graph-c.ps


aufgabe2d.ps: aufgabe2d.dot
	dot -Tps -o aufgabe2d.ps aufgabe2d.dot

aufgabe2d.pdf: aufgabe2d.ps
	ps2pdf aufgabe2d.ps

graph-d.ps: aufgabe2d.pdf
	pdf2ps aufgabe2d.pdf graph-d.ps

graph-d.eps: graph-d.ps
	ps2eps -f graph-d.ps


aufgabe2e.ps: aufgabe2e.dot
	dot -Tps -o aufgabe2e.ps aufgabe2e.dot

aufgabe2e.pdf: aufgabe2e.ps
	ps2pdf aufgabe2e.ps

graph-e.ps: aufgabe2e.pdf
	pdf2ps aufgabe2e.pdf graph-e.ps

graph-e.eps: graph-e.ps
	ps2eps -f graph-e.ps
