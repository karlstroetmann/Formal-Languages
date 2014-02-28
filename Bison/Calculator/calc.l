%{
#include "calc.h"
#include "calc.tab.h"
#include <math.h>
%}

Fraction [0-9]+|([0-9]*\.[0-9]+)
Exponent [eE][-+]?[0-9]+

%%
{Fraction}{Exponent}? { /* floating point numbers */
                        yylval.value = atof(yytext);
                        return NUMBER;
                      }

[ \t\r]               { /* ignore blanks, tabs and carriage returns */ }

[A-Za-z][A-Za-z0-9]*  { /* variable names and fuction names */
                        SymbolTable* sp = lookUpSymbol(yytext);
                        yylval.symPtr = sp;
                        if (sp->funcPtr != 0) {
                            return FUNC;
                        } else {
                            return NAME;
                        }
                      }

[\n=\-+*/()]          { /* operator symbols */ 
                        return yytext[0]; 
                      }
%%

void yyerror(char* msg) {
    printf("%s at '%s'\n", msg, yytext);
}
