lexer grammar CommonLexerRules; // note "lexer grammar"

ID  :   [a-zA-Z]+ ;          // match identifiers
INT :   '0'|[1-9][0-9]* ;    // match integers
WS  :   [ \t\r\n]+ -> skip ; // toss out whitespace
