grammar Expr;

expr returns [Expr result]
    : p = product { $result = $p.result; }
      (   ('+' q = product) { $result = new Sum(       $result, $q.result); }
        | ('-' q = product) { $result = new Difference($result, $q.result); }
      )*
    ;

product returns [Expr result]
    : f = factor { $result = $f.result; }
      (
          ('*' g = factor) { $result = new Product( $result, $g.result); }
        | ('/' g = factor) { $result = new Quotient($result, $g.result); }
      )* 
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
