%token a;
%token b;

%%

S : A B C
  | A
  ;

A : A A
  | a
  ;

B : A C ;

C : B A ;
