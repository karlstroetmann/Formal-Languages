grammar Pure;

program 
    : (definition | statement)+
    ;
definition 
    : 'function' VAR '(' paramList ')' '{' statement* '}'
    ;
statement 
    : assignment ';'             
    | VAR ':=' 'read' '(' ')' ';'    
    | 'print' '(' printExprList ')' ';' 
    | 'printDigits' '(' expr ',' NUMBER ')' ';' 
    | 'if' '(' boolExpr ')' '{' statement* '}' 
    | 'while' '(' boolExpr ')' '{' statement* '}'         
    | 'for' '(' assignment ';' boolExpr ';' assignment ')' '{' statement* '}'
    | 'return' expr? ';'         
    | expr ';'
    | 'quit' ';'?
    ;
printExprList 
    : printExpr (',' printExpr)*
    ; 
printExpr 
    : STRING 
    | expr   
    ;
assignment 
    : VAR ':=' expr 
    ;
paramList 
    : (VAR (',' VAR )*)?
    ;
boolExpr 
    : conjunction ('||' conjunction)*
    ;
conjunction 
    : literal ('&&' literal )*
    ;
literal 
    : '!' boolFactor 
    | boolFactor     
    ;
boolFactor 
    : '(' boolExpr ')' 
    | expr ('==' | '!=' | '<=' | '>=' | '<' | '>') expr 
    ;
expr: product (('+'|'-') product)*
    ;
product 
    : factor (('*' | '/' | '%') factor)* 
    ;
factor 
    : '(' expr ')'      
    | VAR    
    | NUMBER 
    | DOUBLE
    | VAR '(' (expr (',' expr )*)? ')'        
    ;

VAR    : [a-zA-Z][a-zA-Z_0-9]*;
NUMBER : '0'|[1-9][0-9]*;
DOUBLE : '0'|[1-9][0-9]*'.'[0-9]+([eE][+\-]?[0-9]+)?;
STRING : '"' (~('"')|'\\"')* '"';

MULTI_COMMENT : '/*' .*? '*/' -> channel(HIDDEN); // *? is the non-greedy version of *
LINE_COMMENT  : '//' ~('\n')* -> channel(HIDDEN);
WS            : [ \t\v\n\r]   -> channel(HIDDEN);


