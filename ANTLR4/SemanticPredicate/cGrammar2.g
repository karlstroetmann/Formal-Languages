grammar cGrammar2;

@header {
    import java.util.Set;
    import java.util.TreeSet;
}

@members {
    Set<String> mTypeNames = new TreeSet<String>();
}

declOrType
    : decl
    | typeDef
    | stmnt
    ;

decl: type identifier ';'
    | type '(' identifier ')' ';'
    ;

typeDef: 'typedef' type identifier { mTypeNames.add($identifier.text); } ';'
       ;

stmnt: identifier '(' identifier ')' ';'
     ;

type: 'unsigned'
    | 'int'
    | 'unsigned' 'int'
    | typeid
    ;

typeid: { mTypeNames.contains(input.LT(1).getText()); }? ID;

identifier: ID;

ID      : ('a'..'z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
WS      : (' '|'\t'|'\n'|'\r') { skip(); };
