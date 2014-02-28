lexer grammar simpleLanguage;

T8 : '=' ;
T9 : ';' ;
T10 : '++;' ;
T11 : 'print' ;
T12 : '(' ;
T13 : ')' ;
T14 : 'if' ;
T15 : '{' ;
T16 : '}' ;
T17 : 'while' ;
T18 : 'for' ;
T19 : '||' ;
T20 : '&&' ;
T21 : '!' ;
T22 : '==' ;
T23 : '<' ;
T24 : '+' ;
T25 : '-' ;
T26 : '*' ;
T27 : '/' ;

// $ANTLR src "simpleLanguage.g" 99
VAR     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
// $ANTLR src "simpleLanguage.g" 100
NUMBER  : '0'..'9' | ('1'..'9')('0'..'9')+;
// $ANTLR src "simpleLanguage.g" 101
WS      : (' '|'\t'|'\n'|'\r') { skip(); };
// $ANTLR src "simpleLanguage.g" 102
COMMENT : '/*' ~('*/')+ '*/'   { skip(); };
