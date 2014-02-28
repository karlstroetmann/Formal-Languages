grammar cGrammar;

declOrType
    : decl
    | typeDef
    | stmnt
    ;

decl: type identifier ';'
    | type '(' identifier ')' ';'
    ;

typeDef: 'typedef' type identifier ';';

stmnt: identifier '(' identifier ')' ';' ;

type: 'unsigned'
    | 'int'
    | 'unsigned' 'int'
    | typeid
    ;

typeid: ID;

identifier: ID;


ID      : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

WS      : (' '|'\t'|'\n'|'\r') { skip(); };
