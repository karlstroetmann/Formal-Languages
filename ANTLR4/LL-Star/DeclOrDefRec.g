grammar DeclOrDefRec;

decl_or_def_recursive
    : type ID '(' args ')' ';'    
    | type ID '(' args ')' '{' body '}'
    ;

type: 'void' 
    | 'int'
    ;

args: arg (',' arg)* 
    ;

arg : 'int' ID ;

body: 'return' INT
    | '{' body '}'
    ;

ID : ('A'..'Z'|'a'..'z')+;
INT: '0' | ('1'..'9') ('0'..'9')*;

