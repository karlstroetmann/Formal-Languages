%{
#define  YYSTYPE double
#include "rpcalc.tab.h"
#include <math.h>
%}

Fraction [0-9]+|([0-9]*\.[0-9]+)
Exponent [eE][-+]?[0-9]+

%%
{Fraction}{Exponent}? { /* floating point numbers */
                        yylval = atof(yytext);
                        return NUM;
                      }

[ \t]                 { /* ignore blanks and tabs */ }

.|\n                  { return yytext[0];            }

%%

void yyerror(char* msg) {
    printf("%s at '%s'\n", msg, yytext);
}
