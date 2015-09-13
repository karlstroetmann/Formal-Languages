run: index.txt
	type index.txt

index.txt: Converter/Html2Txt.class index.html
	java Converter/Html2Txt index.html > index.txt

Converter/Html2Txt.class: Html2Txt.java
	javac Converter/Html2Txt.java

Html2Txt.java: html2txt.jflex
	jflex -d Converter html2txt.jflex
