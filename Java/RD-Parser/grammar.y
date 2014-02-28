%token NUMBER

%%
expr        : product exprRest;

exprRest    : '+' product exprRest
            | '-' product exprRest
            | /* epsilon */
            ;

product     : factor productRest;

productRest : '*' factor productRest
            | '/' factor productRest
            | /* epsilon */
            ;
    
factor      : '(' expr ')'
            | NUMBER
            ;
