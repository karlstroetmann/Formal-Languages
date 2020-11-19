program 
    : program definition
    | program statement
    | definition
    | statement
    ;

definition 
    : 'function' ID '(' param_list ')' '{' statement_list '}'
    ;

param_list
    :
    | ID
    | ID ',' ne_param_list
    ;

ne_param_list
    : ID
    | ID ',' ne_param_list
    ;

statement_list
    :
    | statement_list statement
    ;

statement: ID ':=' expr ';'
         | ID ':=' 'read' '(' ')' ';'
         | 'print' '(' expr ')' ';'
         | 'if'    '(' boolExpr ')' '{' statement_list '}'
         | 'while' '(' boolExpr ')' '{' statement_list '}'
         | 'for' '(' ID ':=' expr ';' boolExpr ';' ID ':=' expr ')' '{' statement_list '}'
         | 'return' expr ';'
         ;

assignment 
    : ID ':=' expr 
    ;

bool_expr 
    : bool_expr '∨' conjunction
    | conjunction
    ;

conjunction 
    : conjunction '∧' literal
    | negation
    ;

negation
    : '¬' negation
    | boool_atom     
    ;

boool_atom 
    : '(' bool_expr ')' 
    | expr '=' expr
    | expr '≠' expr
    | expr '≤' expr
    | expr '≥' expr
    | expr '<' expr
    | expr '>' expr 
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
    | NUMBER 
    | DOUBLE
    | STRING    
    | ID    
    | ID '(' expr_list ')'        
    ;

expr_list
    :
    | ID
    | ID ',' ne_expr_list
    ;

ne_expr_list
    : ID
    | ID ',' ne_expr_list
    ;




