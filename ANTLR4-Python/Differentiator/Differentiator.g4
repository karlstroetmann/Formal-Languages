grammar Differentiator;

expr returns [result]
    : e=expr '+' p=product {$result = ('+', $e.result, $p.result)}
    | e=expr '-' p=product {$result = ('-', $e.result, $p.result)}
    | product          {$result = $product.result                }    
    ;

product returns [result]
    : p=product '*' f=factor {$result = ('*', $p.result, $f.result)}
    | p=product '/' f=factor {$result = ('/', $p.result, $f.result)}
    | f=factor               {$result = $f.result                  }
    ;

factor returns [result]
    : '(' expr ')'       {$result = $expr.result;        }
    | 'exp' '(' expr ')' {$result = ('exp', $expr.result)}
    | 'ln'  '(' expr ')' {$result = ('ln' , $expr.result)}
    | VAR                {$result = $VAR.text            }
    | NUM                {$result = int($NUM.text)       }
    ;

VAR : [a-zA-Z][a-zA-Z0-9]*;
NUM : '0'|[1-9][0-9]*;
WS  : [ \t\n\r] -> skip; 
