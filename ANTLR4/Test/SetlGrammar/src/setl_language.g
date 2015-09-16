grammar setl_language;

@header {
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
}

program returns [List<Statement> result]
@init { $result = new ArrayList<Statement>(); }
    :	 ( s = statement {$result.add($s.stmnt);}
	| p = procedure { $result.add($p.proc); }
	 )+
    ;

statement returns [Statement stmnt]
@init {
    List<Statement> stmntListOne = new ArrayList<Statement>();
    List<Statement> stmntListTwo = new ArrayList<Statement>();
	List<Expr> exprList = new ArrayList<Expr>();
}
    :
      v = VAR (':=' e = expr  {$stmnt = new Assignment($v.text, $e.result);}
	    | '+=' f = expr  {$stmnt = new AssignmentAdd($v.text, $f.result);}
		| '-=' g = expr  {$stmnt = new AssignmentSub($v.text, $g.result);}
		) ';'
    | 'print' '(' (h = expr { exprList.add($h.result); })
        (',' i = expr { exprList.add($i.result); })* ')' ';'
		{ $stmnt = new Print(exprList); }
    | 'if'  b = boolExpr 'then' (s = statement { stmntListOne.add($s.stmnt); })* 
	    ('else' (t = statement { stmntListTwo.add($t.stmnt); })*)? 
		'end' 'if' ';'
		{ $stmnt = new IfThen($b.result, stmntListOne, stmntListTwo); }
    | 'while' c = boolExpr 'loop' 
	    (u = statement { stmntListOne.add($u.stmnt); })*
	    'end' 'loop' ';'
		{ $stmnt = new While($c.result, stmntListOne); }
    | 'for' w = VAR 'in' j = expr 'loop' 
	    (x = statement { stmntListOne.add($x.stmnt); })* 
	    'end' 'loop' ';'
		{ $stmnt = new For($w.text, $j.result, stmntListOne); }
    | 'return' y = expr? ';'
	   { $stmnt = new Return($y.result); }
    | z = expr ';'
	   { $stmnt = new ExprStmnt($z.result); }
    ;
	
procedure returns [Definition proc]
@init {
    List<Statement> stmntList = new ArrayList<Statement>();
	List<String> params = new ArrayList<String>();
}
    :
    'procedure' p = VAR '(' ( v = VAR { params.add($v.text); }
       (',' w = VAR { params.add($w.text); })*)? ')' ';' 
	   (s = statement { stmntList.add($s.stmnt); })+ 'end' q = VAR ';'
	   { $proc = new Definition($p.text, params, stmntList, $q.text); }
    ;
	
expr returns [Expr result]
    :
     p = product { $result = $p.result; }
	   ('+' q = product { $result = new Sum( $result, $q.result); }
	   |'-' q = product { $result = new Difference( $result, $q.result); }
	   )*
    ;
	
product returns [Expr result]
    :
     p = power { $result = $p.result; }
	   ('*' q = power { $result = new Product( $result, $q.result); }
	   |'/' q = power { $result = new Quotient( $result, $q.result); }
	   |'mod' q = power { $result = new Modulo( $result, $q.result); }
	   )*
     ;

power returns [Expr result]
@init{
     Expr e = null;
}
     : 
     f = factor
       ('**' g = power { e = $g.result; })?
	   { $result = new Power($f.result, e); }
    ;
	
factor returns [Expr result]
@init {
    List<Expr> exprList = new ArrayList<Expr>();
}
    :
    '(' e = expr ')' { $result = $e.result; }
    | v = VAR 
	     ( '('( p = paramList { exprList.addAll($p.params); })? ')' 
	         { $result = new FunctionCall($v.text, exprList); }
	     | '[' q = expr ']' { $result = new ListCall($v.text, $q.result); }
		 | { $result = new Variable($v.text); }
		 )
    | '+/' s = factor { $result = new MyCrossSum($s.result); }
	| '*/' t = factor { $result = new MyCrossMul($t.result); }
	| '#' u = factor { $result = new Count($u.result); }
	| 'arb' x = factor { $result = new Arb($x.result); }
	| 'pow' ps = factor { $result = new PowSet($ps.result);}
    | w = setOrList { $result = $w.result; }
	| m = BOOLEAN { $result = new MyBooleanWrapper($m.text); }
    | y = STRING { $result = new MyStringWrapper($y.text); }
    | n = NUMBER { $result = new MyNumberWrapper($n.text); }
    ;

paramList returns [List<Expr> params]
@init{
    List<Expr> result = new ArrayList<Expr>();
}
    :
    ( e = expr { result.add($e.result); }
	  (',' f = expr { result.add($f.result); })* )
	  { $params = result; }
    ;
	
setOrList returns [Expr result]
    :
    '[' (s = sExpr)? { $result =  new MyListWrapper($s.result); } ']'
    | '{' (t = sExpr)? { $result =  new MySetWrapper($t.result); } '}'
    ;
	
sExpr returns [SExpr result]
@init{
    ArrayList<Expr> exprList = new ArrayList<Expr>();
	ArrayList<MyIterator> iteratorList = new ArrayList<MyIterator>();
}
    :	
     e = expr ( '..' f = expr { $result = new Range($e.result, $f.result); }
	    | { exprList.add($e.result); } (',' g = expr {exprList.add($g.result);} )* 
		   { $result = new ExprList(exprList); }
		| ':' h = iterator { iteratorList.add($h.result); } (',' i = iterator { iteratorList.add($i.result); })* ('|' j = boolExpr)?
		   { $result = new IteratorList($e.result, iteratorList, $j.result); }
		)
    | k = iterator { iteratorList.add($k.result); }  
		{ $result = new IteratorAndBool(iteratorList, null); }
		('|' b = boolExpr { $result = new IteratorAndBool(iteratorList, $b.result); })?
    ;

iterator returns [MyIterator result]
    :
    v = VAR 'in' e = expr { $result = new MyIterator($v.text, $e.result); } 
    ;
	
boolExpr returns [BoolExpr result]
@init{
    ArrayList<BoolExpr> bExprList = new ArrayList<BoolExpr>();
}
    :
	c = conjunction ('or' d = conjunction { bExprList.add($d.result); })*
	   { $result = new Disjunction($c.result, bExprList); }
    ;
	
conjunction returns [BoolExpr result]
@init{
    ArrayList<BoolExpr> boolList = new ArrayList<BoolExpr>();
}
    :
    l = literal { boolList.add($l.result); } 
	  ('and' k = literal { boolList.add($k.result); } )*
	  { $result = new Conjunction($l.result, boolList); }
    ;
	
literal returns [BoolExpr result]
    :
    'not' b = boolFactor { $result = new Negation($b.result); }
    | b = boolFactor { $result = $b.result; }
    ;	
	
boolFactor returns [BoolExpr result]
    :
    ('(' boolExpr ')') => '(' b = boolExpr { $result = $b.result; } ')'
    | e = expr ( '==' f = expr { $result = new Equal( $e.result, $f.result); }
	   | '!=' g = expr { $result = new NotEqual(      $e.result, $g.result); }
	   | '<=' h = expr { $result = new LessOrEqual(   $e.result, $h.result); }
	   | '>=' i = expr { $result = new GreaterOrEqual($e.result, $i.result); }
	   | '<' j = expr  { $result = new LessThan(      $e.result, $j.result); }
	   | '>' k = expr  { $result = new GreaterThan(   $e.result, $k.result); }
	   | 'in' l = expr { $result = new InSet(    $l.result, $e.result); }
	   ) 
    ;

BOOLEAN	   : ('TRUE' | 'true' | 'FALSE' | 'false');
VAR     : ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
NUMBER  : '0'..'9' | ('1'..'9')('0'..'9')+;
STRING  : '"' ~('"')* '"';

MULTI_COMMENT : '/*' (~('*') | '*'+ ~('*'|'/'))* '*'+ '/' { skip(); };
COMMENT	      : '--' ~('\n')*                             { skip(); };
WS            : (' '|'\t'|'\n'|'\r') { skip(); };
