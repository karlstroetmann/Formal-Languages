lexer grammar Lisp;

T10 : '\n' ;
T11 : '(' ;
T12 : ')' ;

// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g" 26
OP : ('+'|'-'|'*'|'%'|'/'|'&'|'|'|'<'|'>'|'='|'?'|'!')+;
// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g" 27
ID : LETTER (LETTER | DIGIT | '_')*;
// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g" 28
NUMBER : DIGIT+;

// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g" 30
fragment DIGIT : '0'..'9';
// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g" 31
fragment LETTER: 'a'..'z'|'A'..'Z';

// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Interpreter/Lisp.g" 33
WS : (' '|'\t'|'\r')+ {skip();};
