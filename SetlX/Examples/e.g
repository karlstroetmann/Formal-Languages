e : e '+' p
  | e '-' p
  | p 
  ;

p : p '*' f
  | p '/' f
  | f 
  ;

f : '(' e ')'
  | N
  ;
