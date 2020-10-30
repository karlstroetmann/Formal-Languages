grammar Simple;

program returns [stmnt_list]
    @init {SL = []}    
    : (s = statement {SL.append($s.stmnt)})+ {$stmnt_list = SL}
    ;

statement returns [stmnt]
    @init {SL = []}
    : v = VAR ':=' e = expr ';'       {$stmnt = (':=', $v.text, $e.result)}
    | v = VAR ':=' 'read' '(' ')' ';' {$stmnt = ('read', $v.text)}
    | 'print' '(' r = expr ')' ';'    {$stmnt = ('print', $r.result)}
    | 'if' '(' b = boolExpr ')' '{' (l = statement {SL.append($l.stmnt) })* '}' 
      {$stmnt = ('if', $b.result, SL)}
    | 'while' '(' b = boolExpr ')' '{' (l = statement {SL.append($l.stmnt) })* '}' 
      {$stmnt = ('while', $b.result, SL)}
    ;

boolExpr returns [result]
    : l = expr '==' r = expr {$result = ('==', $l.result, $r.result)} 
    | l = expr '<'  r = expr {$result = ('<',  $l.result, $r.result)}
    ;

expr returns [result]
    : e = expr '+' p = product {$result = ('+', $e.result, $p.result)}
    | e = expr '-' p = product {$result = ('-', $e.result, $p.result)}
    | p = product              {$result = $p.result}
    ;

product returns [result]
    : p = product '*' f = factor {$result = ('*', $p.result, $f.result)}
    | p = product '/' f = factor {$result = ('/', $p.result, $f.result)}
    | f = factor                 {$result = $f.result}
    ;

factor returns [result]
    : '(' expr ')' {$result = $expr.result}
    | v = VAR      {$result = $v.text}
    | n = NUMBER   {$result = int($n.text)}
    ;

VAR    : [a-zA-Z][a-zA-Z_0-9]*;
NUMBER : '0'|[1-9][0-9]*;

MULTI_COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT  : '//' ~('\n')* -> skip;
WS            : [ \t\n\r]     -> skip;
