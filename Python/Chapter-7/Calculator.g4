grammar Calculator;

@header {
import math
}

start: statement+ ; 

statement
    : IDENTIFIER ':=' expr ';' {self.Values[$IDENTIFIER.text] = $expr.result}
    | expr ';'                 {print($expr.result)                         }
    ;

expr returns[result]
    : e=expr '+' p=product {$result = $e.result + $p.result}
    | e=expr '-' p=product {$result = $e.result - $p.result}
    | p=product            {$result = $p.result            }
    ;

product returns[result]
    : p=product '*' f=factor {$result = $p.result * $f.result}
    | p=product '/' f=factor {$result = $p.result / $f.result}
    | f=factor               {$result = $f.result            }
    ;

factor returns[result]
    : 'sqrt' '(' expr ')' {$result = math.sqrt($expr.result)      }
    | '(' expr ')'        {$result = $expr.result                 }
    | FLOAT               {$result = float($FLOAT.text)           }
    | IDENTIFIER          {$result = self.Values[$IDENTIFIER.text]}
    ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*         ;
FLOAT     : ([0]|[1-9][0-9]*)([.][0-9]+)? ;
WS        : [ \t\n\r] -> skip             ; 
