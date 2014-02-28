%{
#include "mfcalc.h"
#include "mfcalc.tab.h"
#include <math.h>
%}

Fraction [0-9]+|([0-9]*\.[0-9]+)
Exponent [eE][-+]?[0-9]+

%%
{Fraction}{Exponent}? { /* floating point numbers */
                        yylval.val = atof(yytext);
                        return NUM;
                      }
[A-Za-z][A-Za-z0-9]*  { symrec* ptr = getsym(yytext);
                        if (ptr == 0) {
                            ptr = putsym(yytext, VAR);
						}
						yylval.tptr = ptr;
						return ptr->type;
                      }
[ \t]                 { /* ignore blanks and tabs */ }
.|\n                  { return yytext[0];            }

%%

void yyerror(char* msg) {
    printf("%s at '%s'\n", msg, yytext);
}
