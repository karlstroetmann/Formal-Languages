grammar Left;

options {
    k = 2;
}

//a : 'x' (b | c) ;
a : 'x' b
  | 'x' c
  ;

b : 'y' ;

c : 'z' ;

WS: (' '|'\n'|'\r'|'\t'|'\v')+ { skip(); };

