open: slides.pdf
	open slides.pdf

slides.pdf: slides.ps
	ps2pdf slides.ps

slides.ps: slides.dvi
	dvips -o slides.ps slides.dvi

slides.dvi: slides.tex
	latex slides.tex
