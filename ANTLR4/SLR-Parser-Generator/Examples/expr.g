e : e '+' p
  | p
  ;

p : p '*' f
  | f
  ;

f : '(' e ')'
  | NUMBER
  ;
