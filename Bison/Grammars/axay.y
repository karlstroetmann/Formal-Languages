
%token x y

%%

S : A x A y
  | B y B x
  ; 

A : /* epsilon */ ;

B : /* epsilon */ ;

%%


