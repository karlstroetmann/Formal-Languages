grammar Grammar;

start returns [g]
    : {rules = []}
      (r=grammarRule {rules.append($r.r)})+
      {$g = rules}
    ;

// we must not use the name rule here since this seems to be a keyword for ANTLR
grammarRule returns [r]
    : {body = []}
      v=VARIABLE ':' (i=item {body.append($i.atom)})+ ';' 
      {$r = ($v.text,) + tuple(body)}
    ;
 
item returns [atom]
    : v=VARIABLE {$atom = $v.text}
    | t=TOKEN    {$atom = $t.text}
    | l=LITERAL  {$atom = $l.text}
    ;

VARIABLE: [a-z]+;
TOKEN   : [A-Z]+;
LITERAL : '\'' ~('\'')+ '\'';
        
WS      : [ \t\n\r] -> skip ;
