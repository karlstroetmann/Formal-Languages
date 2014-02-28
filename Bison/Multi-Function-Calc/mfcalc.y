%{
#include <math.h>    /* For math functions, cos(), sin(), etc. */
#include "mfcalc.h"  /* Contains definition of `symrec'        */
%}

%union {
    double  val;    /* For returning numbers.                   */
    symrec* tptr;   /* For returning symbol-table pointers      */
}

%token <val>  NUM        /* Simple double precision number   */
%token <tptr> VAR FNCT   /* Variable and Function            */
%type  <val>  exp

%right '='
%left  '-' '+'
%left  '*' '/'
%left  NEG     /* Negation--unary minus */
%right '^'     /* Exponentiation        */

%%

input : /* empty */
      | input line
      ;

line  : '\n'
      | exp   '\n' { printf ("\t%.10g\n", $1); }
      | error '\n' { yyerrok;                  }
      ;

exp   : NUM                { $$ = $1;                         }
      | VAR                { $$ = $1->value.var;              }
      | VAR '=' exp        { $$ = $3; $1->value.var = $3;     }
      | FNCT '(' exp ')'   { $$ = (*($1->value.fnctptr))($3); }
      | exp '+' exp        { $$ = $1 + $3;                    }
      | exp '-' exp        { $$ = $1 - $3;                    }
      | exp '*' exp        { $$ = $1 * $3;                    }
      | exp '/' exp        { $$ = $1 / $3;                    }
      | '-' exp  %prec NEG { $$ = -$2;                        }
      | exp '^' exp        { $$ = pow ($1, $3);               }
      | '(' exp ')'        { $$ = $2;                         }
      ;

%%

#include <stdio.h>

int main() {
	init_table();
	yyparse();
	return 0;
}




