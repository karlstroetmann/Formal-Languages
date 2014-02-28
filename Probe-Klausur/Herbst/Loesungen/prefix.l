%{
#include "prefix.tab.h"
%}

%%
[0-9]+   { yylval.value = atoi(yytext); return NUMBER;    }

[ \t\r]  { /* ignore blanks, tabs and carriage returns */ }

[-+*/\n] { return yytext[0];                              }
%%

void yyerror(char* msg) {
    printf("%s at '%s'\n", msg, yytext);
}
