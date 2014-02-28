%{
#define  YYSTYPE double
#define  updateLocs()                         \
    yylloc.first_line   = yylloc.last_line;   \
    yylloc.first_column = yylloc.last_column;

#include "ltcalc.tab.h"
#include <string.h>
#include <math.h>
%}

Fraction [0-9]+|([0-9]*\.[0-9]+)
Exponent [eE][-+]?[0-9]+

%%
{Fraction}{Exponent}? { /* floating point numbers */
                        yylval = atof(yytext);
                        updateLocs();
                        yylloc.last_column += strlen(yytext);
                        return NUM;
                      }

[ \t]                 { /* ignore blanks and tabs */ 
                        updateLocs();
                        yylloc.last_column++;
                      }

.                     { updateLocs();
                        yylloc.last_column++;
	                return yytext[0];
                      }
\n                    { updateLocs();
                        yylloc.last_column = 0;
                        yylloc.last_line++;
	                return yytext[0];            
                      }

%%

void yyerror(char* msg) {
    printf("%s at '%s'\n", msg, yytext);
}
