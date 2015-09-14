/* Reverse polish notation calculator. */

%{
#define YYSTYPE double
#include <math.h>
#include <stdlib.h>
void yyerror(char* msg);
int yylex();
	
%}

%token NUM

%% /* Grammar rules and actions follow */

input : /* empty */
      | input line
      ;

line  : '\n'
      | exp '\n'  { printf ("\t%.10g\n", $1); }
      ;

exp   : NUM             { $$ = $1;          }
      | exp exp '+'     { $$ = $1 + $2;     }
      | exp exp '-'     { $$ = $1 - $2;     }
      | exp exp '*'     { $$ = $1 * $2;     }
      | exp exp '/'     { $$ = $1 / $2;     }
      | exp exp '^'     { $$ = pow($1, $2); } // exponentiation
      | exp 'n'         { $$ = -$1;         } // unary minus
      ;
%%

int main() { yyparse (); return 0; }
