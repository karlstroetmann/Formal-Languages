grammar Expr;

start   : expr
        ;

expr    : expr ('+'|'-') product 
        | product        
        ;

product : product ('*'|'/') factor 
        | factor
        ;

factor  : '(' expr ')'
        | NUMBER
        ;

NUMBER: '0'|[1-9][0-9]*;
WS    : [ \v\t\n\r] -> skip;
