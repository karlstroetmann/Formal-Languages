grammar Expr;
 
calc: e = expr { System.out.println($e.r); } ;

expr returns [double r]
    : e = expr '+' p = product { $r = $e.r + $p.r; }
    | e = expr '-' p = product { $r = $e.r - $p.r; }
    | p = product              { $r = $p.r;        }
    ;

product returns [double r]
    : p = product '*' f = factor { $r = $p.r * $f.r; }
    | p = product '/' f = factor { $r = $p.r / $f.r; }
    | f = factor                 { $r = $f.r;        }
    ;

factor returns [double r]
    : b = base '**' f = factor { $r = Math.pow($b.r, $f.r); }
    | b = base                 { $r = $b.r;                 }
    ;

base returns [double r]
    : '(' expr ')' { $r = $expr.r;            }
    | FLOAT        { $r = new Double($FLOAT.text); }
    ;

FLOAT: '0'|[1-9][0-9]*'.'[0-9]*;
WS   : [ \v\t\n\r] -> skip; 

