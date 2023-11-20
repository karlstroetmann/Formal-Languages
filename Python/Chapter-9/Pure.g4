grammar Pure;

start: grmrl+;

grmrl: VARIABLE ':' body ('|' body)* ';';

body: item* ;
 
item : VARIABLE 
     | TOKEN  
     | LITERAL
     ;

VARIABLE: [a-z][a-zA-Z_]*;
TOKEN   : [A-Z][a-zA-Z_]*;
LITERAL : '\'' ~('\'')+ '\'';
        
WS      : [ \t\n\r]     -> skip;
COMMENT : '//' ~('\n')* -> skip;
