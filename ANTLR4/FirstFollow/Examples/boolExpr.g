s : boolExpr '$' ;


boolExpr 
    : expr boolExprRest
    ; 

boolExprRest
    : '==' expr
    | '<'  expr
    ;

expr
	: product exprRest
	;

exprRest
    : '+' product exprRest
    | '-' product exprRest
    | 
    ; 

product
	: factor productRest
	;

productRest
    : '*' factor productRest
    | '/' factor productRest
    |
    ;

factor
	: NUMBER
	| '(' expr ')'
	;

