%{

/* This lexer computes grades. */
#include <stdlib.h>
#include <stdio.h>

int   sumPoints, maxPoints;
int   lineNumber = 1;
void  errorMsg();
float note();

%}

ZAHL   0|[1-9][0-9]*
NAME   [A-Za-zöäüÖÄÜß]+[ ][A-Za-zöäüÖÄÜß]+

%% 

[A-Za-z]+:.*\n { ++lineNumber;               }
{NAME}/:       { printf("%s", yytext); 
                 sumPoints = 0;              }
:[ \t]+        { printf("%s", yytext);       }
{ZAHL}         { sumPoints += atoi(yytext);  }
-              { /* skip hyphens     */      }
[ \t]          { /* skip white space */      }
^[ \t]*\n      { ++lineNumber;               }
\n             { printf(" %3.1f\n", note()); 
                 ++lineNumber;
               }
.              { errorMsg();                 }
%%

float note() {
	return 7.0 - 6.0 * sumPoints / maxPoints;
}

void errorMsg() {
	printf("invalid character '%s' at line %d\n", yytext, lineNumber); 
	exit(0);
}

int main(int argc, char* argv[]) {
	maxPoints = atoi(argv[1]);
    yylex();
    return 0;
}
