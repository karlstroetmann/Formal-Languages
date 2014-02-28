grammar Simple;

@header {
    import java.util.List;
    import java.util.ArrayList;
}

program 
    : (s = statement { $s.stmnt.execute(); Statement.prompt(); })+
    ;

// statement 
//     : assignment ';' 
//     | VAR ':=' 'read' '(' ')' ';'    
//     | 'print' '(' expr ')' ';' 
//     | 'if' '(' boolExpr ')' '{' statement* '}' 
//     | 'while' '(' boolExpr ')' '{' statement* '}' 
//     | 'for' '(' assignment boolExpr ';' assignment ')' '{' statement* '}'
//     | 'for' VAR 'from' expr 'to' expr ('step' expr)? '{' statement* '}'
//     ;
statement returns [Statement stmnt]
    @init { 
        List<Statement> stmnts = new ArrayList<Statement>(); 
    }
    : a = assignment ';' { $stmnt = $a.assign; }
    | v = VAR ':=' 'read' '(' ')' ';'     
      { $stmnt = new Read(new Variable($v.text)); }
    | 'print' '(' r = expr ')' ';' 
      { $stmnt = new Print($r.r); }
    | 'if' '(' b = boolExpr ')' '{' 
      (l = statement { stmnts.add($l.stmnt); })* '}' 
      { $stmnt = new IfThen($b.r, stmnts); }
    | 'while' '(' b = boolExpr ')' '{' 
      (l = statement { stmnts.add($l.stmnt); })* '}' 
      { $stmnt = new While($b.r, stmnts); }
    | 'for' '(' a = assignment ';' b = boolExpr ';' u = assignment ')' '{'
      (l = statement { stmnts.add($l.stmnt); })* '}'
      { $stmnt = new For($a.assign, $b.r, $u.assign, stmnts); }
    ;

// assignment : VAR "=" expr
assignment returns [Assignment assign]
    : v = VAR ':=' e = expr 
      { $assign = new Assignment(new Variable($v.text), $e.r); }
    ;

// boolExpr : conjunction ('||' conjunction)*;
boolExpr returns [BoolExpr r]
    : c = conjunction { $r = $c.r; }
      ('||' d = conjunction { $r = new Disjunction($r, $d.r); })*
    ;

// conjunction : literal ('&&' literal)*;
conjunction returns [BoolExpr r]
    : n = literal { $r = $n.r; }
      ('&&' m = literal { $r = new Conjunction($r, $m.r); })*
    ;

// literal : "!" boolFactor
//         | boolFactor
//         ;
literal returns [BoolExpr r]
    : '!' s = boolFactor { $r = new Negation($s.r); }
    | s = boolFactor     { $r = $s.r;               }
    ;

// boolFactor 
//     : '(' boolExpr ')'
//     | expr ( '==' expr 
//            | '!='  expr
//            | '<='  expr
//            | '>='  expr
//            | '<'   expr
//            | '>'   expr
//            ) 
//     ;
boolFactor returns [BoolExpr r]
    : '(' b = boolExpr ')' { $r = $b.r; }
    | x = expr ( '==' y = expr { $r = new Equal(         $x.r, $y.r); } 
               | '!=' y = expr { $r = new NotEqual(      $x.r, $y.r); }
               | '<=' y = expr { $r = new LessOrEqual(   $x.r, $y.r); }
               | '>=' y = expr { $r = new GreaterOrEqual($x.r, $y.r); }
               | '<'  y = expr { $r = new LessThan(      $x.r, $y.r); }
               | '>'  y = expr { $r = new GreaterThan(   $x.r, $y.r); }
               )
    ;

expr returns [Expr r]
    : p = product { $r = $p.r; }
      (   ('+' q = product) { $r = new Sum(       $r, $q.r); }
        | ('-' q = product) { $r = new Difference($r, $q.r); }
      )*
    ;

product returns [Expr r]
    : f = factor { $r = $f.r; }
      (
          ('*' g = factor) { $r = new Product( $r, $g.r); }
        | ('/' g = factor) { $r = new Quotient($r, $g.r); }
      )* 
    ;

factor returns [Expr r]
    : '(' expr ')' { $r = $expr.r;          }
    | v = VAR      { $r = new Variable($v.text); }
    | n = NUMBER   { $r = new MyNumber($n.text); }
    ;

VAR    : [a-zA-Z][a-zA-Z_0-9]*;
NUMBER : '0'|[1-9][0-9]*;

MULTI_COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT  : '//' ~('\n')* -> channel(HIDDEN);
WS            : [ \t\v\n\r]   -> channel(HIDDEN);


