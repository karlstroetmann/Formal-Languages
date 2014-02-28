program 
    : program defOrStmnt
    | defOrStmnt
    ;

defOrStmnt
    : 'function' ID '(' paramList ')' '{' stmntList '}'
    | statement
    ;

stmntList
    : stmntList statement
    | 
    ;

statement 
    : 'if' '(' boolExpr ')' '{' stmntList '}' 
    | 'while' '(' boolExpr ')' '{' stmntList '}'         
    | 'for' '(' assignment ';' boolExpr ';' assignment ')' '{' stmntList '}'
    | 'return' optExpr ';'         
    | assignment ';'             
    | expr ';'
    ;

optExpr
    : expr
    |
    ;

assignment 
    : ID ':=' expr 
    ;

paramList 
    : neParamList 
    | 
    ;

neParamList
    : neParamList ',' ID
    | ID
    ;

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
    | ID '(' exprList ')'
    | '(' expr ')'
    ;

exprList
    : neExprList 
    |
    ;

neExprList
    : neExprList ',' expr
    | expr
    ;

