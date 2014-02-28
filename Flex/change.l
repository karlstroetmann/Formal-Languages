%{

/* This trivial lexer replaces occurrences of the string "Stephan" with "Stefan". */

#include <stdio.h>

int numberChanges = 0; // number of occurrences that have been changed

%}

%% 

Stephan  { printf("Stefan"); ++numberChanges; }
.        { printf("%s", yytext); }

%%

int main() {
    yylex();
    printf("\nNumber of changes: %d\n", numberChanges);
    return 0;
}
