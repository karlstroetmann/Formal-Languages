expr: product '+' expr
    | product
    ;

product
    : int '*' product
    | int
    | '(' expr ')'
    ;

int : '1'
    | '2'
    | '3'
    ;


