grammar simpleLanguage;

@header {
    import output.*;
    import java.util.List;
    import java.util.ArrayList;
}

simpleLanguage returns [List<Statement> program]
    : { $program = new ArrayList<Statement>(); }
      (s = statement { program.add($s.stmnt); })+
    ;

// statement : VAR "=" expr ";"
//           | "print" "(" expr ")" ";"
//           | "if"    "(" boolExpr ")" "{" stmntList "}"
//           | "while" "(" boolExpr ")" "{" stmntList "}"
//           ;
statement returns [Statement stmnt]
    : v = VAR 
    		('=' e = expr ';'     
      		{ $stmnt = new Assignment(new Variable($v.text), $e.result); }
      		|'++;'     
      		{ $stmnt = new Increment(new Variable($v.text)); })
    | 'print' '(' r = expr ')' ';' 
      { $stmnt = new Print($r.result); }
    | { List<Statement> stmnts = new ArrayList<Statement>(); }
      'if' '(' b = boolExpr ')' '{' 
      (l = statement { stmnts.add($l.stmnt); })* '}' 
      { $stmnt = new IfThen($b.result, stmnts); }
    | { List<Statement> stmnts = new ArrayList<Statement>(); }
      'while' '(' b = boolExpr ')' '{' 
      (l = statement { stmnts.add($l.stmnt); })* '}' 
      { $stmnt = new While($b.result, stmnts); }
   | { List<Statement> stmnts = new ArrayList<Statement>(); 
       List<Statement> loopstmnts = new ArrayList<Statement>(); 						}
      'for' '(' init = statement ';'  b = boolExpr ';' (loop = statement { loopstmnts.add($loop.stmnt); })* ')' '{' 
      (l = statement { stmnts.add($l.stmnt); })* '}' 
      { $stmnt = new ForLoop($init.stmnt, $b.result,  loopstmnts, stmnts); }
   ;

//boolExpr returns [BoolExpr result]
//    : conj ( '||' conj)*
//    ;

boolExpr returns [BoolExpr result]
    : r = conj { $result = $r.result; }
    (   ('||' q = conj) { $result = new Disjunction( $result, $q.result); })*
    ;

    
//conj returns [BoolExpr result]
//    : neg ( '&&' neg)*
//    ;
    
conj returns [BoolExpr result]
      : r = neg { $result = $r.result; }
      (   ('&&' q = neg) { $result = new Conjunction( $result, $q.result); })*
      ;


neg returns [BoolExpr result]
options {backtrack = true; }    
    : '!'  n = neg {$result =new Neg($n.result);}
    | '(' b = boolExpr ')' {$result =$b.result;}
    | s = simpleboolExpr {$result =$s.result;}
    ;

// simpleboolExpr : expr "==" expr
//          | expr "<"  expr
//          ;            
simpleboolExpr returns [BoolExpr result]
    : l = expr ( '==' r = expr { $result = new Equal(   $l.result, $r.result); } 
               | '<'  r = expr { $result = new LessThan($l.result, $r.result); }
               )
    ;

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
    : '(' expr ')' { $result = $expr.result;          }
    | v = VAR      { $result = new Variable($v.text); }
    | n = NUMBER   { $result = new MyNumber($n.text); }
    ;

VAR     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
NUMBER  : '0'..'9' | ('1'..'9')('0'..'9')+;
WS      : (' '|'\t'|'\n'|'\r') { skip(); };
COMMENT : '/*' ~('*/')+ '*/'   { skip(); };
