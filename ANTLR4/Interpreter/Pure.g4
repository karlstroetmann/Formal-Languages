grammar Pure;

program  : statement+
         ;

statement: VAR ':=' expr ';'
         | VAR ':=' 'read' '(' ')' ';'
         | 'print' '(' expr ')' ';'
         | 'if'    '(' boolExpr ')' '{' statement* '}'
         | 'while' '(' boolExpr ')' '{' statement* '}'
         ;

boolExpr : expr '==' expr
         | expr '<'  expr
         ;

expr     : expr '+' product
         | expr '-' product
         | product
         ;

product  : product '*' factor
         | product '/' factor
         | factor
         ;

factor   : '(' expr ')'
         | VAR
         | NUMBER
         ;

VAR      : [a-zA-Z][a-zA-Z_0-9]*;
NUMBER   : '0'|[1-9][0-9]*;

MULTI_COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT  : '//' ~('\n')* -> skip;
WS            : [ \t\v\n\r]   -> skip;

