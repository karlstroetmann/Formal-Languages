grammar Expr;

start: expr ';' ;

expr: expr (op = MUL | op = DIV) expr    // MUL is '*', DIV is '/'
    | expr (op = ADD | op = SUB) expr    // ADD is '+', SUB is '-'
    | NUMBER
    ;

MUL: '*' ;
DIV: '/' ;
ADD: '+' ;
SUB: '-' ;

NUMBER: '0'|[1-9][0-9]*('.'[0-9]+)? ;
WS    : [ \t\n\r]+ -> skip ;
