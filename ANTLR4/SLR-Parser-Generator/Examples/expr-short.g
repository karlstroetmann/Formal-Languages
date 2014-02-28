expr: product
    | expr '+' product
    ;

product
    : product '*' factor
    | factor
    ;

factor
    : '(' expr ')'
    | NUMBER
    ;

