%token NUMBER

%%
expression : expression '+' product  
           | expression '-' product  
           | product
           ;

product    : product '*' factor     
           | product '/' factor     
           | factor 
           ;

factor     : '(' expression ')' 
           | NUMBER 
           ;
