program
    : function
    | function program
    ;
function 
    : INT ID '(' param_list ')' '{' decl_list stmnt_list '}'
    ;
param_list 
    : 
    | INT ID 
    | INT ID ',' ne_param_list
    ;
ne_param_list
    : INT ID
    | INT ID ',' ne_param_list
    ;   
decl_list
    : INT ID ';'
    | INT ID ';' decl_list
    ;
stmnt_list
    : stmnt ';'
    | stmnt ';' stmnt_list
    ;
stmnt 
    : '{' stmnt_list '}' 
    | ID '=' expr    
    | IF '(' bool_expr ')' stmnt                 
    | IF '(' bool_expr ')' stmnt ELSE stmnt
    | WHILE '(' bool_expr ')' stmnt
    | RETURN expr    
    | expr           
    ;
expr: expr '+'  expr                 
    | expr '-' expr               
    | expr '*' expr               
    | expr '/' expr               
    | '(' expr ')' 
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
bool_expr 
    : expr '==' expr     
    | expr '!=' expr     
    | expr '<=' expr     
    | expr '>=' expr     
    | expr '<'  expr      
    | expr '>'  expr     
    | '!' bool_expr            
    | bool_expr '&&' bool_expr 
    | bool_expr '||' bool_expr
    ;
