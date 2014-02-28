grammar DeclOrDef;

// options {
//    k = 8;
// }

decl_or_def
    : type ID '(' args ')' ';'    
    | type ID '(' args ')' '{' body '}'
    ;

type: 'void' 
    | 'int'
    ;

args: arg (',' arg)* ;

arg : 'int' ID ;

body: 'return' INT;

ID : ('A'..'Z'|'a'..'z')+;
INT: '0' | ('1'..'9') ('0'..'9')*;

