grammar ttl;

program   : typeDef* signature* typedTerm*
          ;

typeDef   : 'type' FCT ':=' type ('+' type)* ';'
          | 'type' FCT '(' PARAM (',' PARAM)* ')' ':=' type ('+' type)* ';' 
          ;

type      : FCT '(' type (',' type)* ')'
          | FCT                               
          | PARAM                              
          ;

signature : 'signature' FCT ':' type ('*' type)* '->' type ';'                
          | 'signature' FCT ':' type ';'
          ;

term      : FCT '(' term (',' term)* ')'
          | FCT    
          ;

typedTerm : term ':' type ';' 
          ;


PARAM   : ('A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
FCT     : ('a'..'z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

WS      : (' '|'\t'|'\n'|'\r') { skip(); };
COMMENT : '/*' ~('*/')+ '*/'   { skip(); };
LINECMNT: '//' ~('\n')*        { skip(); };
