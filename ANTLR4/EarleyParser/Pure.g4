grammar Pure;

cfg : grammarRule+ 
    ;

grammarRule
    : VAR ':' body ('|' body)* ';' 
    ;
 
body: item*
    | comment
    ; 

item: VAR     
    | TOKEN   
    | LITERAL 
    ;

comment 
    : '/*' .*? '*/'
    ;

VAR     : [a-z][a-zA-Z_0-9]*;
TOKEN   : [A-Z][A-Z_0-9]*;
LITERAL : '\'' ~('\'')* '\'';

WS      : [ \t\v\n\r]   -> channel(HIDDEN);
