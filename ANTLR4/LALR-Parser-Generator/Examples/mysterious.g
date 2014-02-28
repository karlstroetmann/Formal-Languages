def : param_spec return_spec ','
    ;

param_spec
    : type
    |  name_list ':' type
    ;

return_spec
    : type
    |  name ':' type
    ;

type  
    : ID
    ;

name
    : ID
    ;

name_list
    : name
    | name ',' name_list
    ;
