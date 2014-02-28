%{
/* count non-empty lines */
int lineCount = 0;
%}

%%

^\n     { /* skip empty line */    }
\n      { ++lineCount;             }
.       { /* skip anything else */ } 

%%

int main() {
    yylex();
    printf("number of non-comment lines: %d\n", lineCount);
    return 0;
}
