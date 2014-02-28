Assembler.class: Assembler.java
	javac Assembler.java

Assembler.java: Assembler.jj
	javacc Assembler.jj

sum.srp: Assembler.class sum.asm
	java Assembler < sum.asm > sum.srp

testAssembler: sum.srp
	cat sum.srp | java -cp ~/Kurse/GRT-AI/Java/SRP SimulatorLoader 2> /dev/null

########################################################################

Klausur.class: Klausur.java
	javac Klausur.java

Klausur.java: Klausur.jj
	javacc Klausur.jj

test: Klausur.class ergebnis
	java Klausur 60 < ergebnis

########################################################################

DeComment.class: DeComment.java
	javac DeComment.java

DeComment.java: DeComment.jj
	javacc DeComment.jj

testDeComment: DeComment.class ergebnis
	java DeComment < test-comment.c

