program
    : function*
    ;

function 
    : 'int' ID '(' paramList ')' '{' decl* (stmnt ';')* '}'
    ;

paramList 
    : ('int' ID (',' 'int' ID)*)?
    ;

decl: 'int' ID ';'  
    ;

stmnt 
    : '{' (stmnt ';')* '}' 
    | ID '=' expr    
    | 'if' '(' boolExpr ')' stmnt                 
    | 'if' '(' boolExpr ')' stmnt 'else' stmnt
    | 'while' '(' boolExpr ')' stmnt
    | 'return' expr    
    | expr           
    ;

expr: expr '+'  expr                 
    | expr '-' expr               
    | expr '*' expr               
    | expr '/' expr               
    | '(' expr ')' 
    | NUMBER
    | ID                      
    | ID '(' (expr (',' expr)*)? ')'       
    ;

boolExpr 
    : expr '==' expr     
    | expr '!=' expr     
    | expr '<=' expr     
    | expr '>=' expr     
    | expr '<'  expr      
    | expr '>'  expr     
    | '!' boolExpr            
    | boolExpr '&&' boolExpr 
    | boolExpr '||' boolExpr 
    ;
