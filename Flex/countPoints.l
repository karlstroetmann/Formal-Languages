%{

/* This lexer computes the number of points that can be
   attained in an exam.
 */
#include <stdlib.h>
#include <stdio.h>

int   sumPoints;
void  errorMsg();
float note();

%}

ZAHL   0|[0-9][0-9]*
FLOAT  [0-9.]+

%x COUNT

%% 

\\punkte\{           { BEGIN(COUNT); }
\\pnkt\{{FLOAT}\}\{  { BEGIN(COUNT); }

<COUNT>{ZAHL}        { sumPoints += atoi(yytext); 
                       BEGIN(INITIAL);
                     }
.|\n                 { /* skip */ }
%%

int main() {
    yylex();
	printf("Anzahl Punkte: %d\n", sumPoints);
    return 0;
}
