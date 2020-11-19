grammar Grammar;

start: grmrl+;

grmrl: VARIABLE ':' body ('|' body)* ';';

body: item* ;
 
item : VARIABLE 
     | TOKEN  
     | LITERAL
     ;

VARIABLE: [a-z]+;
TOKEN   : [A-Z]+;
LITERAL : '\'' ~('\'')+ '\'';
        
WS      : [ \t\n\r] -> skip ;
