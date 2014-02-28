lexer grammar Lisp;

T10 : '\n' ;
T11 : '(' ;
T12 : ')' ;

// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g" 15
OP : ('+'|'-'|'*'|'%'|'/'|'&'|'|'|'<'|'>'|'='|'?'|'!')+;
// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g" 16
ID : LETTER (LETTER | DIGIT | '_')*;
// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g" 17
NUMBER : DIGIT+;

// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g" 19
fragment DIGIT : '0'..'9';
// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g" 20
fragment LETTER: 'a'..'z'|'A'..'Z';

// $ANTLR src "/Users/stroetma/Kurse/FormaleSprachen/ANTLR/Lisp/Lisp.g" 22
WS : (' '|'\t'|'\r')+ { skip(); };
