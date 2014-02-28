program : dfnStmntList ;

dfnStmntList 
    : definition dfnStmntList
    | statement  dfnStmntList
    |
    ;

definition 
    : 'function' IDENTIFIER '(' paramList ')' '{' stmntList '}' 
    ;

stmntList
    : statement stmntList
    |
    ;

statement 
    : IDENTIFIER '=' expr ';'     
    | 'print' '(' printExprList ')' ';'       
    | 'if' '(' boolExpr ')' '{' stmntList '}' 
    | 'while' '(' boolExpr ')' '{' stmntList '}' 
    | 'for' '(' assignment ';' boolExpr ';' assignment ')' '{' stmntList '}'
    | 'return' expr ';' 
    | 'return' ';' 
    | expr ';'       
    | 'quit' ';'
    ;

printExprList 
    : printExpr ',' nePrintExprList 
    | printExpr
    |
    ;

nePrintExprList
    : printExpr
    | printExpr ',' nePrintExprList
    ;

printExpr 
    : STRING 
    | expr   
    ;

assignment 
    : IDENTIFIER '=' expr 
    ;

paramList 
    : IDENTIFIER ',' neIDList
    | IDENTIFIER
    |
    ;

neIDList
    : IDENTIFIER ',' neIDList
    | IDENTIFIER
    ;

boolExpr 
    : boolExpr '||' conjunction
    | conjunction
    ;

conjunction 
    : conjunction '&&' negation
    | negation 
    ;

negation 
    : '!' simpleBoolExpr 
    | simpleBoolExpr     
    ;

simpleBoolExpr 
    : '(' boolExpr ')' 
    | expr '==' expr  
    | expr '!=' expr 
    | expr '<=' expr 
    | expr '>=' expr 
    | expr '<'  expr 
    | expr '>'  expr 
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
    | IDENTIFIER    
    | NUMBER        
    | IDENTIFIER '(' exprList ')'
    ;

exprList
    : expr ',' neExprList
    | expr
    |
    ;

neExprList
    : expr ',' neExprList
    | expr
    ;

