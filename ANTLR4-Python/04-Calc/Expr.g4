grammar Expr; 

prog: stat+ ;

stat: 'print' '(' expr ')' ';' # Print
    | ID '=' expr ';'          # Assign
    ;

expr: expr '+' prod            # Add
    | expr '-' prod            # Sub
    | prod                     # ExprProd
    ;

prod: prod '*' fact            # Mul
    | prod '/' fact            # Div
    | fact                     # ProdFact
    ;

fact: INT                      # int
    | ID                       # id
    | '(' expr ')'             # parens
    ;

ID  : [a-zA-Z][a-zA-Z0-9]* ; // match identifiers
INT : [0-9]|[1-9][0-9]* ;    // match integers
WS  : [ \t\n\r]+ -> skip ;   // toss out whitespace
