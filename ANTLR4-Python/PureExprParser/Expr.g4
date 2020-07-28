grammar Expr;

start   : expr
        ;

expr    : expr '+' product 
        | expr '-' product
        | product        
        ;

product : product '*' factor 
        | product '/' factor 
        | factor
        ;

factor  : '(' expr ')'
        | NUMBER
        ;

NUMBER  : '0'|[1-9][0-9]*;
WS      : [ \t\n\r] -> skip;
