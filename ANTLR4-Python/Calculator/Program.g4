grammar Program;

start: statement+ ; 

statement
    : IDENTIFIER ':=' expr ';' 
    | expr ';'                 
    ;

expr: expr '+' product 
    | expr '-' product 
    | product
    ;

product 
    : product '*' factor 
    | product '/' factor 
    | factor
    ;

factor
    : '(' expr ')'        
    | FLOAT               
    | IDENTIFIER          
    | 'sqrt' '(' expr ')'
    ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
FLOAT     : '0'([.][0-9]+)?
          | [1-9][0-9]*([.][0-9]+)?;
WS        : [ \t\n\r] -> skip; 
