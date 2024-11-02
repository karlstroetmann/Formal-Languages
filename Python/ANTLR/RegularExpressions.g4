grammar RegularExpressions;

regExp returns [result]
    : e=regExp '+' p=product {$result = ('+', $e.result, $p.result)}
    | p=product              {$result = $p.result                  }    
    ;

product returns [result]
    : p=product '⋅' f=factor {$result = ('⋅', $p.result, $f.result)}
    | f=factor               {$result = $f.result                  }
    ;

factor returns [result]
    : f=factor '*'           {$result = ('*', $f.result) }
    | '(' e=regExp ')'       {$result = $e.result        }
    | c=LETTER               {$result = $c.text          }
    ;

LETTER : [a-zA-Z];
WS     : [ \t\n\r] -> skip; 
