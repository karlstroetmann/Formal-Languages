boolExpr 
    : boolExpr '||' conjunction
    | conjunction
    ;

conjunction 
    : conjunction '&&' literal 
    | literal
    ;

literal   
    : '!' boolFactor
    | boolFactor 
    ;

boolFactor 
    : '(' boolExpr ')'
    | expr '==' expr
    | expr '<=' expr
    ;

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
    : NUMBER 
    | ID
    | '(' expr ')'
    ;
