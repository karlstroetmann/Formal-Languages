c : c '|' d
  | d
  ;

d : d '&' l
  | l
  ;

l : '!' ID
  | ID
  ;

