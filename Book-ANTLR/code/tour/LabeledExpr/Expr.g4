grammar Expr; 

program: stmnt+ ;

stmnt: expr ';'                  # printExpr
     | VAR ':=' expr ';'         # assign
     ;

expr: expr '+' product           # Sum
    | expr '-' product           # Difference
    | product                    # ExprProd
    ;

product: product '*' factor      # Prod
       | product '/' factor      # Quot
       | factor                  # ProdFact
       ;

factor: simple '**' factor       # Power
      | simple                   # FactSimple
      ;

simple: NUMBER                   # FPNumber
      | VAR                      # Identifier
      | '(' expr ')'             # Parenthesis
      ;


VAR    : [a-zA-Z][a-zA-Z0-9_]* ;        // match identifiers
NUMBER : '0'|[1-9][0-9]*('.'[0-9]*)? ;  // match numbers
WS     : [ \t\n\r]+ -> skip ;           // toss out whitespace
