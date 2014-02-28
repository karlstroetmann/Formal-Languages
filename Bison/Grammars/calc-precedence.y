%token N

%left   "+" "-"
%left   "*" "/"
%right  "^"

%%

E : E "+" E
  | E "-" E
  | E "*" E
  | E "/" E
  | E "^" E
  | "(" E ")"
  | N
  ;


