%{

/* Sum up prices on a sales slip */

#include <stdio.h>
#include <stdlib.h>

double total = 0.0; // total of all prices

%}

%% 

[0-9]+\.[0-9]{2}  { total += atof(yytext);     }
.|\n              { /* skip everything else */ }

%%

int main() {
    yylex();
    printf("\nTotal price: %g\n", total);
    return 0;
}
