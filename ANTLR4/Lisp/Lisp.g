grammar Lisp;

program : (symExpr '\n')+;

symExpr : symbol 
        | '(' (symExpr)* ')' 
        ;

symbol : OP     
       | ID     
       | NUMBER 
       ;

// lexer
OP : ('+'|'-'|'*'|'%'|'/'|'&'|'|'|'<'|'>'|'='|'?'|'!')+;
ID : LETTER (LETTER | DIGIT | '_')*;
NUMBER : DIGIT+;

fragment DIGIT : '0'..'9';
fragment LETTER: 'a'..'z'|'A'..'Z';

WS : (' '|'\t'|'\r')+ { skip(); };
