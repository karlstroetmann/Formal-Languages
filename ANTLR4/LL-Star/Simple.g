grammar Simple;

simple
    : ID '(' args ')' ';'    
    | ID '(' args ')' '{' '}'
    ;

args: ID (',' ID)*
    ;

ID : ('A'..'Z'|'a'..'z')+;

