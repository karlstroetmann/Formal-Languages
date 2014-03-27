d : d '|' c
  | c
  ;

c : c '&' l
  | l
  ;

l : '(' d ')'
  | '!' ID
  | ID
  ;

