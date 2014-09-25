grammar Simple;

@header {
    import java.util.List;
    import java.util.ArrayList;
}

program 
    : (s = statement { $s.stmnt.execute(); Statement.prompt(); })+
    ;

statement returns [Statement stmnt]
    @init { 
        List<Statement> stmnts = new ArrayList<Statement>(); 
    }
    : v = VAR ':=' e = expr ';'     
      { $stmnt = new Assignment(new Variable($v.text), $e.result); }
    | v = VAR ':=' 'read' '(' ')' ';'     
      { $stmnt = new Read(new Variable($v.text)); }
    | 'print' '(' r = expr ')' ';' 
      { $stmnt = new Print($r.result); }
    | 'if' '(' b = boolExpr ')' '{' 
          (l = statement { stmnts.add($l.stmnt); })*
      '}' 
      { $stmnt = new IfThen($b.result, stmnts); }
    | 'while' '(' b = boolExpr ')' '{' 
          (l = statement { stmnts.add($l.stmnt); })*
      '}' 
      { $stmnt = new While($b.result, stmnts); }
    ;

boolExpr returns [BoolExpr result]
    : l = expr '==' r = expr { $result = new Equal(   $l.result, $r.result); } 
    | l = expr '<'  r = expr { $result = new LessThan($l.result, $r.result); }
    ;

expr returns [Expr result]
    : e = expr '+' p = product { $result = new Sum(       $e.result, $p.result); }
    | e = expr '-' p = product { $result = new Difference($e.result, $p.result); }
    | p = product              { $result = $p.result;                            }
    ;

product returns [Expr result]
    : p = product '*' f = factor { $result = new Product( $p.result, $f.result); }
    | p = product '/' f = factor { $result = new Quotient($p.result, $f.result); }
    | f = factor                 { $result = $f.result;                          }
    ;

factor returns [Expr result]
    : '(' expr ')' { $result = $expr.result;          }
    | v = VAR      { $result = new Variable($v.text); }
    | n = NUMBER   { $result = new MyNumber($n.text); }
    ;

VAR    : [a-zA-Z][a-zA-Z_0-9]*;
NUMBER : '0'|[1-9][0-9]*;

MULTI_COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT  : '//' ~('\n')* -> channel(HIDDEN);
WS            : [ \t\v\n\r]   -> channel(HIDDEN);
