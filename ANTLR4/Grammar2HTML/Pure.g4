grammar Pure;

cfg : grammarRule+ 
    ;

grammarRule 
     : VAR ':' body ('|' body )* ';' 
     ;
 
body : item*
     ; 

item : VAR     
     | TOKEN   
     | LITERAL 
     ;

VAR     : [a-z][a-zA-Z_0-9]*;
TOKEN   : [A-Z][a-zA-Z_0-9]*;
LITERAL : '\'' ~('\'')+ '\'';

WS      : [ \t\v\n\r] -> channel(HIDDEN);
