grammar Grammar;

start: grmrl+;

grmrl: VARIABLE ':' body ('|' body)* ';';

body: item* ;
 
item : VARIABLE 
     | TOKEN  
     | LITERAL
     ;

VARIABLE: [a-z][a-z_]*;
TOKEN   : [A-Z][A_Z_]*;
LITERAL : '\'' ~('\'')+ '\'';
        
WS      : [ \t\n\r]     -> skip ;
COMMENT : '//' ~('\n')* -> skip ;
