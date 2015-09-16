grammar setl_grammar;

program:
    (statement|procedure)+
    ;

statement:
      VAR (':=' | '+:=' | '-:=') expr ';'
    | 'print' '(' expr (',' expr)* ')' ';'
    | 'if'  boolExpr 'then' statement* ('else' statement*)? 'end' 'if' ';'
    | 'while' boolExpr 'loop' statement* 'end' 'loop' ';'
    | 'for' VAR 'in' expr 'loop' statement* 'end' 'loop' ';'
    | 'return' expr? ';'
    | expr ';'
    ;
	
procedure:
    'procedure' VAR '(' (VAR (',' VAR)*)? ')' ';' statement+ 'end' VAR ';'
    ;
	
expr:
     product (('+' product)|('-' product))*
    ;
	
product:
     power (('*' power) |('/' power) |('mod' power))*
     ;
    
power: 
     factor ('**' power)?
    ;
	
factor:
    '(' expr ')'
    | (VAR factorRest)=> VAR factorRest
    | VAR
    | ('+/' | '*/' | '#' | 'arb') factor
    | setOrList
    | STRING
    | NUMBER
    ;
	
factorRest:	
    '(' params? ')'
    |'[' expr ']'
    ;
		
params:
    ( expr (',' expr)* )
    ;
	
setOrList:
    '[' sExpr? ']'
    | '{' sExpr? '}'
    ;
	
sExpr:	
    expr ('.''.' expr
		| (',' expr)*
		| ':' iterator (',' iterator)* ('|' boolExpr)?
	)
    | iterator '|' boolExpr
    ;

sExprRest:
     '.''.' expr
    | (',' expr)*
    | ':' iterator (',' iterator)* ('|' boolExpr)?
    ;

iterator:
    VAR 'in' expr 
    ;
	
boolExpr:
    conjunction ('or' conjunction)*
    ;
	
conjunction:
    literal ('and' literal)*
    ;
	
literal:
    'not' boolFactor
    | boolFactor
    ;	
	
boolFactor:
    ('(' boolExpr ')') => '(' boolExpr ')'
    | expr ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'in' ) expr
    ;
	
	
VAR     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
NUMBER  : '0'..'9' | ('1'..'9')('0'..'9')+;
STRING  : '"' ~('"')* '"';

MULTI_COMMENT : '/*' (~('*') | '*'+ ~('*'|'/'))* '*'+ '/' { skip(); };
COMMENT	      : '--' ~('\n')*                             { skip(); };
WS            : (' '|'\t'|'\n'|'\r') { skip(); };

