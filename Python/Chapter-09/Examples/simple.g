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

statement
    : expr ';'
    | assignment ';'    
    | 'if'    '(' bool_expr ')' '{' statement_list '}'
    | 'while' '(' bool_expr ')' '{' statement_list '}'
    | 'for' '(' assignment ';' bool_expr ';' assignment ')' '{' statement_list '}'
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
    | bool_atom     
    ;

bool_atom 
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
    | ID    
    | ID '(' expr_list ')'        
    ;

expr_list
    :
    | expr
    | expr ',' ne_expr_list
    ;

ne_expr_list
    : expr
    | expr ',' ne_expr_list
    ;
