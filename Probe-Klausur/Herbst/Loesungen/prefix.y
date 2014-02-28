%{
#include <stdio.h>
%}

%union {
    int value;
}

%token <value>  NUMBER
%type  <value>  expr

%%
lines : /* empty */     
      | lines expr '\n' { printf("%d\n", $2); }
      ;

expr  : '+' expr expr   { $$ = $2 + $3; }
      | '-' expr expr   { $$ = $2 - $3; }
      | '*' expr expr   { $$ = $2 * $3; }
      | '/' expr expr   { $$ = $2 / $3; }
      | NUMBER          { $$ = $1;      }
      ;

%%

int main() {
    yyparse();
    return 0;
}

