expr : expr '+' prod
     | prod
     ;

prod : prod '*' fact
     | fact
     ;

fact : '(' expr ')'
     | NUMBER
     ;


