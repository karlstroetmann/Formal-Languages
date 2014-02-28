/* Infix notation calculator--calc */

%{
#define YYSTYPE double
#include <stdlib.h>
#include <math.h>
void yyerror(char* msg);
int yylex();
%}

%token NUM
%left '-' '+'
%left '*' '/'
%left NEG     /* negation--unary minus */
%right '^'    /* exponentiation        */

%%
input : /* empty string */
      | input line
      ;

line  : '\n'
      | exp '\n'   { printf ("\t%.10g\n", $1); }
      | error '\n' { yyerrok;                  }
      ;

exp   : NUM                { $$ = $1;          }
      | exp '+' exp        { $$ = $1 + $3;     }
      | exp '-' exp        { $$ = $1 - $3;     }
      | exp '*' exp        { $$ = $1 * $3;     }
      | exp '/' exp        { $$ = $1 / $3;     }
      | '-' exp  %prec NEG { $$ = -$2;         }
      | exp '^' exp        { $$ = pow($1, $3); }
      | '(' exp ')'        { $$ = $2;          }
      ;
%%

int main() { yyparse (); return 0; }
