grammar Program;

program : stmnt+ ;

stmnt   : ID ':=' expr ';'
        | expr ';'
        ;    

expr    : product (('+'|'-') product)* ;

product : factor (('*'|'/') factor)* ;

factor  : '(' expr ')'
        | ID
        | INT
        ;

ID : [a-zA-Z][a-zA-Z0-9]*;
INT: '0'|[1-9][0-9]*;
WS : [ \v\t\n\r] -> skip; 
