expr: expr '+' product;
expr: product;
    
product: product '*' factor;
product: factor;
       
factor: '(' expr ')';
factor: NUMBER;


