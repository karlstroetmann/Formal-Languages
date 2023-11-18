grammar Grammar;

start returns [g]
    : {Rules = []}
      (grmrl {Rules += $grmrl.rl})+
      {$g = Rules}
    ;

grmrl returns [rl]
    : {RuleList = []}
      v=VARIABLE ':' b1=body {RuleList.append(($v.text,) + $b1.il)}
      ('|' b2=body {RuleList.append(($v.text,) + $b2.il)})* ';' 
      {$rl = RuleList}
    ;

body returns [il]
    : {Body = []} (i=item {Body.append($i.atom)})*
      {$il = tuple(Body)}
    ;

item returns [atom]
    : v=VARIABLE {$atom = $v.text}
    | t=TOKEN    {$atom = $t.text}
    | l=LITERAL  {$atom = $l.text}
    ;

VARIABLE: [a-z][a-z_]*;
TOKEN   : [A-Z][A-Z_]*;
LITERAL : '\'' ~('\'')+ '\'';
        
WS      : [ \t\n\r]     -> skip ;
COMMENT : '//' ~('\n')* -> skip ;
