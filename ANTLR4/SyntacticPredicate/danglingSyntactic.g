grammar danglingSyntactic;

prog  : stmnt+;

stmnt : ('if' '(' boolExp ')' stmnt 'else' )=> 
        'if' '(' boolExp ')' stmnt 'else' stmnt
      | 'if' '(' boolExp ')' stmnt 
      | 'while' '(' boolExp ')' stmnt 
      | '{' stmnt* '}'
      | ID '=' expr ';'
      ;

expr  : ID
      | NUMBER
      ;

boolExp 
      : expr '==' expr
      | expr '<'  expr
      ;

ID     : ('a'..'z'|'A'..'Z')+;
NUMBER : ('0'..'9')+;
WS     : (' '|'\t'|'\n'|'\r') { skip(); };
