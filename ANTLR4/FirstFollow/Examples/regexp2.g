s : regExp '$' ;

regExp     : product regExpRest ;
     
regExpRest : '|' product  regExpRest 
           | /* epsilon */ 
           ;

product    : factor prodRest 
           ;

prodRest   : factor prodRest 
           | /* epsilon */ 
           ;

factor     : simple star ;
 
star       : '*'
           | /* epsilon */ 
           ;

simple     : '(' regExp ')'
           | CHAR 
           ;
