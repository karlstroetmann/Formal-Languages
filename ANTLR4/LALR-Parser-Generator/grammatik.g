grammar grammatik;

@header {
    import java.util.List;
    import java.util.ArrayList;
}

grammatik returns [Grammar g]
    : { List<Rule> rules = new ArrayList<Rule>(); }
      (r = rule { rules.add($r.regel); })+ { $g = new Grammar(rules); }
    ;

rule returns [Rule regel]
    : { List<Body> bodyList = new ArrayList<Body>(); }
      v = VAR ':' b = body { bodyList.add($b.b); } 
             ('|' c = body { bodyList.add($c.b); })* ';' 
      { $regel = new Rule(new Variable($v.text), bodyList); }
    ;
 
body returns [Body b]
    : { List<Item> l = new ArrayList<Item>(); }
      (item { l.add($item.element); })*
      { $b = new Body(l); }
    ; 

item returns [Item element]
    : VAR     { $element = new Variable($VAR.text    ); }
    | TOKEN   { $element = new MyToken( $TOKEN.text  ); }
    | LITERAL { $element = new MyToken( $LITERAL.text); }
    ;

VAR     : ('a'..'z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
TOKEN   : ('A'..'Z')('A'..'Z'|'_'|'0'..'9')*;
LITERAL : '\'' ~('\'')+ '\'';

MULTI_COMMENT : '/*' (~('*') | '*'+ ~('*'|'/'))* '*'+ '/' { skip(); };
LINE_COMMENT  : '//' ~('\n')*                             { skip(); };
WS            : (' '|'\t'|'\v'|'\n'|'\r')                 { skip(); };
