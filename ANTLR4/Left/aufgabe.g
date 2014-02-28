grammar aufgabe;

aufgabe: a;

a : b 'x' 
  | 'y' b 'z'
  | 'u' 'z' 
  | 'y' 'u' 'x'
  ;

b : 'u';

