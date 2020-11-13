grammar Grammar;

start returns [g]
    : {Rules = []}
      (r=grmrl {Rules.append($r.r)})+
      {$g = Rules}
    ;

grmrl returns [r]
    : {Body = []}
      v=VARIABLE ':' (i=item {Body.append($i.atom)})+ ';' 
      {$r = ($v.text,) + tuple(Body)}
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
