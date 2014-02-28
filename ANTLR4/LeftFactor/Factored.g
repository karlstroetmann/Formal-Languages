grammar Factored;

options {
    k = 1;
}

a : 'x' ( b | c)
  ;

b : 'y' ;

c : 'z' ;

WS: (' '|'\n'|'\r'|'\t'|'\v')+ { skip(); };
