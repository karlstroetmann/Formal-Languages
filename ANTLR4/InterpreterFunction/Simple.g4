grammar Simple;

@header {
import java.util.List;
import java.util.ArrayList;
}

program[Environment e] returns [List<Statement> r] 
    : { $r = new ArrayList<Statement>(); }
      ( d = definition { $d.dfntn.execute(e); Statement.prompt(); }
      | s = statement  { $s.stmnt.execute(e); Statement.prompt(); }
      )+
    ;
    catch [ReturnException re] {} 

definition returns [Definition dfntn]
    @init {
        List<Statement> stmnts = new ArrayList<Statement>(); 
    }
    : 'function' f = VAR '(' p = paramList ')' '{' 
       (l = statement { stmnts.add($l.stmnt); })* '}'
       { $dfntn = new Definition($f.text, $p.params, stmnts); }
    ;

statement returns [Statement stmnt]
    @init { 
        List<Statement> stmnts = new ArrayList<Statement>(); 
    }
    : v = VAR ':=' e = expr ';'     
      { $stmnt = new Assignment($v.text, $e.r); }
    | v = VAR ':=' 'read' '(' ')' ';'     
      { $stmnt = new Read(new Variable($v.text)); }
    | 'print' '(' pl = printExprList ')' ';' 
      { $stmnt = new Print($pl.r); }
    | 'printDigits' '(' r = expr ',' e = expr ')' ';' 
      { $stmnt = new PrintDigits($r.r, $e.r); } 
    | 'if' '(' b = boolExpr ')' '{' 
      (l = statement { stmnts.add($l.stmnt); })* '}' 
      { $stmnt = new IfThen($b.r, stmnts); }
    | 'while' '(' b = boolExpr ')' '{' 
      (l = statement { stmnts.add($l.stmnt); })* '}' 
      { $stmnt = new While($b.r, stmnts); }
    | 'for' '(' a = assignment ';' b = boolExpr ';' u = assignment ')' '{'
      (l = statement { stmnts.add($l.stmnt); })* '}'
      { $stmnt = new For($a.assign, $b.r, $u.assign, stmnts); }
    | 'return' expr? ';' 
      { $stmnt = new Return($expr.r); }
    | e = expr ';'
      { $stmnt = new ExprStmnt($e.r); } 
    | 'quit' ';'?
      { $stmnt = new Quit(); } 
    ;

printExprList returns [List<PrintExpr> r]
    @init {
        $r = new ArrayList<PrintExpr>(); 
    }
    : ( p = printExpr { $r.add($p.p); }
        (',' q = printExpr { $r.add($q.p); })*
      )?
    ; 

printExpr returns [PrintExpr p]
    : s = STRING { $p = new PrintString($s.text); }
    | e = expr   { $p = $e.r;                     }
    ;

assignment returns [Assignment assign]
    : v = VAR ':=' e = expr 
      { $assign = new Assignment($v.text, $e.r); }
    ;

paramList returns [List<String> params]
    @init {
        $params = new ArrayList<String>();
    }
    : 
    | p = VAR      { $params.add($p.text); }
      (',' q = VAR { $params.add($q.text); })* 
    ;

boolExpr returns [BoolExpr r]
    : c = conjunction { $r = $c.r; }
      ('||' d = conjunction { $r = new Disjunction($r, $d.r); })*
    ;

conjunction returns [BoolExpr r]
    : n = literal { $r = $n.r; }
      ('&&' m = literal { $r = new Conjunction($r, $m.r); })*
    ;

literal returns [BoolExpr r]
    : '!' s = boolFactor { $r = new Negation($s.r); }
    | s = boolFactor     { $r = $s.r;               }
    ;

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
        ( ('+' q = product) { $r = new Sum(       $r, $q.r);  }
        | ('-' q = product) { $r = new Difference($r, $q.r ); }
        )*
    ;

product returns [Expr r]
    : f = factor { $r = $f.r; }
      ( ('*' g = factor) { $r = new Product( $r, $g.r); }
      | ('/' g = factor) { $r = new Quotient($r, $g.r); }
      | ('%' g = factor) { $r = new Modulo(  $r, $g.r); }
      )* 
    ;

factor returns [Expr r]
    @init {
        List<Expr> exprList = new ArrayList<Expr>();
    }
    : '(' expr ')'      { $r = $expr.r;               }
    | v = VAR           { $r = new Variable($v.text); }
    | n = NUMBER        { $r = new MyNumber($n.text); }
    | n = DOUBLE        { $r = new MyDouble($n.text); }
    | f = VAR '(' (e = expr { exprList.add($e.r); }
                    (',' g = expr { exprList.add($g.r); })*
                  )? 
              ')'
      { $r = new FunctionCall($f.text, exprList); }
    ;

VAR    : [a-zA-Z][a-zA-Z_0-9]*;
NUMBER : '0'|[1-9][0-9]*;
DOUBLE : '0'|[1-9][0-9]*'.'[0-9]+([eE][+\-]?[0-9]+)?;
STRING : '"' (~('"')|'\\"')* '"';

MULTI_COMMENT : '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT  : '//' ~('\n')* -> channel(HIDDEN);
WS            : [ \t\v\n\r]   -> channel(HIDDEN);

