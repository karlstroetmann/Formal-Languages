expr 
    : expr '+' product
    | product
    ;

product
    : product '*' factor
    | factor
    ;

factor 
    : '1'
    | '2'
    | '3'
    ;


