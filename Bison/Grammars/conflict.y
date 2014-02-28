%token N

%%

E : E '+' E
  | E '*' E
  | N
  ;



