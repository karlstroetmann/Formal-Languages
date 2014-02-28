grammar Expr;

/** The start rule; begin parsing here. */
prog:   stat+ ; 

stat:   expr ';'
    |   ID '=' expr ';'
    |   ';'            
    ;

expr:   expr ('*'|'/') expr   
    |   expr ('+'|'-') expr   
    |   INT                    
    |   ID                    
    |   '(' expr ')'         
    ;

ID  :   [a-zA-Z]+ ;          // match identifiers 
INT :   '0'|[1-9][0-9]* ;    // match integers
WS  :   [ \t\r\n]+ -> skip ; // toss out whitespace
