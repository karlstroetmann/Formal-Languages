expr
    : expr '+' product
    | expr '-' product
    | product
    ;

product
    : product '*' factor 
    | product '/' factor 
    | factor
    ;

factor
    : ID
    | ID '(' expr ')'
    | '(' expr ')'
    ;
