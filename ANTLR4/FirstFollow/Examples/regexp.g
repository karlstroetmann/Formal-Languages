s : regExp '$' ;

regExp     : product regExpRest ;
     
regExpRest : '|' product  regExpRest 
           | /* epsilon */ 
           ;

product    : factor prodRest 
           ;

prodRest   : '.' factor prodRest 
           | /* epsilon */ 
           ;

factor     : simple stars ;
 
stars      : '*' stars
           | /* epsilon */ 
           ;

simple     : '(' regExp ')'
           | CHAR 
           | '0'
           | 'epsilon'
           ;
