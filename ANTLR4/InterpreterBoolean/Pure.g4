grammar Pure;

program 
    : statement+
    ;

statement 
    : assignment ';' 
    | VAR ':=' 'read' '(' ')' ';'    
    | 'print' '(' expr ')' ';' 
    | 'if' '(' boolExpr ')' '{' statement* '}' 
    | 'while' '(' boolExpr ')' '{' statement* '}' 
    | 'for' '(' assignment ';' boolExpr ';' assignment ')' '{' statement* '}'
    ;

assignment
    : VAR ':=' expr 
    ;

boolExpr 
    : conjunction ('||' conjunction)*
    ;

conjunction 
    : literal ('&&' literal)*
    ;

literal   
    : '!' boolFactor
    | boolFactor 
    ;

boolFactor 
    : '(' boolExpr ')'
    | expr ( '==' | '!=' | '<=' | '>=' | '<' | '>' ) expr
    ;

expr: product (('+'|'-') product)*
    ;

product 
    : factor (('*'|'/') factor)* 
    ;

factor 
    : '(' expr ')'   
    | VAR 
    | NUMBER     
    ;

VAR    : [a-zA-Z][a-zA-Z_0-9]*;
NUMBER : '0'|[1-9][0-9]*;

MULTI_COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT  : '//' ~('\n')* -> channel(HIDDEN);
WS            : [ \t\v\n\r]   -> channel(HIDDEN);




