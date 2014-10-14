expr : expr '+' prod
     | prod
     ;

prod : prod '*' fact
     | fact
     ;

fact : '(' expr ')'
     | '1'
     | '2'
     | '3'
     ;


