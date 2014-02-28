grammar EBNF_Grammar;

options {
    k = 2;
}

@header {
    import java.util.List;
    import java.util.ArrayList;
}

ebnf_grammar returns [Grammar g]
    : prolog
      { List<Rule> rules = new ArrayList<Rule>(); }
      (rule { rules.add($rule.rule); })+ 
      { List<Rule> regexpRules = new ArrayList<Rule>(); }
      (regexpDef { regexpRules.add($regexpDef.rule); })*
      { $g = new Grammar(rules, regexpRules); }
    ;

prolog
    : 'grammar' name ';' 'options'? '@header'? '@lexer::header'?
    ;

rule returns [Rule rule]
    : VAR type? ('returns' type)? '@init'? '@after'? ':' expr ';'
      { $rule = new Rule($VAR.text, $expr.expr); }
    ;

type
    : '[' typeSpec name (',' typeSpec name)* ']'
    ;

typeSpec
    : name ('<' typeSpec (',' typeSpec)* '>')?
    ;

name
    : VAR
    | TOKEN
    ;

expr returns [Expr expr]
    : p = product { $expr = $p.expr; }
      ('|' q = product { $expr = new Alternative($expr, $q.expr); })*
    ;

product returns [Expr expr]
    : { $expr = new Epsilon(); }
      (factor { if ($expr instanceof Epsilon) {
                    $expr = $factor.expr;
                } else {
                    $expr = new Concatenation($expr, $factor.expr); 
                }
              }
      )*
    ;

factor returns [Expr expr]
    : element { $expr = $element.expr; }
      ( '*'  { $expr = new Postfix($expr, "*" ); }
      | '+'  { $expr = new Postfix($expr, "+" ); }
      | '?'  { $expr = new Postfix($expr, "?" ); }
      | '=>' { $expr = new Postfix($expr, "=>"); }
      )?
    ;

element returns [Expr expr]
    : '(' expr { $expr = $expr.expr; } ')'
    | (name '=')? ( VAR     { $expr = new Variable($VAR.text  );   } 
                  | TOKEN   { $expr = new MyToken( $TOKEN.text);   }
                  | LITERAL { $expr = new MyToken( $LITERAL.text); }
                  )
    ;


// regular expressions
regexpDef returns [Rule rule]
    : TOKEN ':' regexp { $rule = new Rule($TOKEN.text, $regexp.expr); } ';'
    ;

regexp returns [Expr expr]
    : p = regexpProduct { $expr = $p.expr; }
      ('|' q = regexpProduct { $expr = new Alternative($expr, $q.expr); })*
    ;

regexpProduct returns [Expr expr]
    : { $expr = new Epsilon(); }
      (regexpFactor { if ($expr instanceof Epsilon) {
                          $expr = $regexpFactor.expr;
                      } else {
                          $expr = new Concatenation($expr, $regexpFactor.expr);
                      }
                    }
      )+
    ;

regexpFactor returns [Expr expr]
    : prefix { $expr = $prefix.expr; }
      ( '*'  { $expr = new Postfix($prefix.expr, "*" ); }
      | '+'  { $expr = new Postfix($prefix.expr, "+" ); }
      | '?'  { $expr = new Postfix($prefix.expr, "?" ); }
      )?
    ;

prefix returns [Expr expr]
    : '~' atom  { $expr = new Negation($atom.expr); }
    | atom      { $expr = $atom.expr;               }
    ; 

atom returns [Expr expr]
    : '(' regexp ')' { $expr = $regexp.expr; }
    | l = LITERAL { $expr = new MyToken($l.text); }
      ('..' r = LITERAL { $expr = new Range($l.text, $r.text); })?
    | TOKEN { $expr = new MyToken($TOKEN.text); }
    ;

VAR      : ('a'..'z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
TOKEN    : ('A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
LITERAL  : '\'' (~('\''|'\\')|'\\' ('\''|'\\'|'t'|'n'|'r'))+ '\'';

ACTION   : '{' (ACTION | ~('{'|'}'))* '}' ('?')? { skip(); };
WS       : (' '|'\t'|'\n'|'\r') { skip(); };

LINE_COMMENT  : '//' (~('\n'))*                              { skip(); };
MULTI_COMMENT : '/*' (~('*') | '*'+ ~('*' | '/'))* '*'+ '/'  { skip(); };
