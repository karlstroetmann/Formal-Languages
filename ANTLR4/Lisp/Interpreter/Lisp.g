grammar Lisp;

@header {
  package Interpreter; 
  import java.util.LinkedList;
}

program : (symExpr { System.out.println($symExpr.symExp); } '\n')+;

symExpr returns [SymbolicExpression symExp]
    : symbol { $symExp = $symbol.symExp; }
    | '(' { List<SymbolicExpression> l = new LinkedList<SymbolicExpression>(); } 
      (se = symExpr { l.add($se.symExp); })* 
      ')' { SymbolicExpression s = new LispList(l);
            $symExp = s.eval();
          }                         
    ;

symbol returns [SymbolicExpression symExp]
    : OP     { $symExp = new Atom($OP.text); }
    | ID     { $symExp = new Atom($ID.text); }
    | NUMBER { $symExp = new Number($NUMBER.text); }
    ;

// lexer
OP : ('+'|'-'|'*'|'%'|'/'|'&'|'|'|'<'|'>'|'='|'?'|'!')+;
ID : LETTER (LETTER | DIGIT | '_')*;
NUMBER : DIGIT+;

fragment DIGIT : '0'..'9';
fragment LETTER: 'a'..'z'|'A'..'Z';

WS : (' '|'\t'|'\r')+ {skip();};
