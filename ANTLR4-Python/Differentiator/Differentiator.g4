grammar Differentiator;

expr returns [result]
    : e=expr '+' p=product {$result = ('+', $e.result, $p.result)}
    | e=expr '-' p=product {$result = ('-', $e.result, $p.result)}
    | p=product            {$result = $p.result                  }    
    ;

product returns [result]
    : p=product '*' f=factor {$result = ('*', $p.result, $f.result)}
    | p=product '/' f=factor {$result = ('/', $p.result, $f.result)}
    | f=factor               {$result = $f.result                  }
    ;

factor returns [result]
    : '(' e=expr ')'       {$result = $e.result;        }
    | 'exp' '(' e=expr ')' {$result = ('exp', $e.result)}
    | 'ln'  '(' e=expr ')' {$result = ('ln' , $e.result)}
    | v=VAR                {$result = $v.text           }
    | n=NUMBER             {$result = int($n.text)      }
    ;

VAR    : [a-zA-Z][a-zA-Z0-9]*;
NUMBER : '0'|[1-9][0-9]*;
WS     : [ \t\n\r] -> skip; 
