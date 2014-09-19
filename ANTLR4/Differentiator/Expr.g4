grammar Expr;

expr returns [Expr result]
    : e = expr '+' p = product { $result = new Sum(       $e.result, $p.result); }
    | e = expr '-' p = product { $result = new Difference($e.result, $p.result); }
    | p = product              { $result = $p.result; }    
    ;

product returns [Expr result]
    : p = product '*' f = factor { $result = new Product( $p.result, $f.result); }
    | p = product '/' f = factor { $result = new Quotient($p.result, $f.result); }
    | f = factor                 { $result = $f.result; }
    ;

factor returns [Expr result]
    : '(' expr ')'       { $result = $expr.result;                  }
    | 'exp' '(' expr ')' { $result = new Exponential($expr.result); }
    | 'log' '(' expr ')' { $result = new Logarithm(  $expr.result); }
    | VAR                { $result = new Variable($VAR.text);       }
    | NUM                { $result = new Number($NUM.text);         }
    ;

VAR : [a-zA-Z][a-zA-Z0-9]*;
NUM : '0'|[1-9][0-9]*;
WS  : [ \v\t\n\r] -> skip; 
