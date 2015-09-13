input.html: LaTeX2HTML.class HtmlWriter.class input.tex
	java LaTeX2HTML input.tex > input.html

LaTeX2HTML.class: LaTeX2HTML.java HtmlWriter.java
	javac LaTeX2HTML.java

HtmlWriter.class: HtmlWriter.java
	javac HtmlWriter.java

LaTeX2HTML.java: latex2html.jflex
	jflex latex2html.jflex
