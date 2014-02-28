grammar Grammatik;

@header {
    import java.util.List;
    import java.util.ArrayList;
}

cfg returns [Grammar g]
    : { List<Rule> rules = new ArrayList<Rule>(); }
      (r = grammarRule { rules.add($r.regel); })+ { $g = new Grammar(rules); }
    ;

grammarRule returns [Rule regel]
    : { List<Body> bodyList = new ArrayList<Body>(); }
      v = VAR ':' b = body { bodyList.add($b.b); } 
             ('|' c = body { bodyList.add($c.b); })* ';' 
      { $regel = new Rule($v.text, bodyList); }
    ;
 
body returns [Body b]
    : { List<Item> l = new ArrayList<Item>(); }
      (item { l.add($item.element); })*
      { $b = new Body(l); }
    | { List<Item> l = new ArrayList<Item>(); } 
      comment
      { $b = new Body(l); }
    ; 

item returns [Item element]
    : VAR     { $element = new Variable($VAR.text    ); }
    | TOKEN   { $element = new MyToken( $TOKEN.text  ); }
    | LITERAL { $element = new Literal( $LITERAL.text); }
    ;

comment 
    : '/*' .*? '*/'
    ;

VAR     : [a-z][a-zA-Z_0-9]*;
TOKEN   : [A-Z][A-Z_0-9]*;
LITERAL : '\'' ~('\'')* '\'';

WS      : [ \t\v\n\r]   -> channel(HIDDEN);

