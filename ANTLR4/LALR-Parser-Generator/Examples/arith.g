expr: product
    | expr '+' product
    | expr '-' product
    ;

product
    : product '*' factor
    | product '/' factor
    | factor
    ;

factor
    : '(' expr ')'
    | NUMBER
    ;

