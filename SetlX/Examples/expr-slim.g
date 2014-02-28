expr : expr '+' prod
     | prod
     ;

prod : prod '*' NUMBER
     | NUMBER
     ;


