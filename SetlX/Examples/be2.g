c : c '&' d
  | d
  ;

d : d '|' l
  | l
  ;

l : I 
  | '!' I
  ;

