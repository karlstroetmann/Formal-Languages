%{
/* remove C comments from a file */
int lineCount = 0;
%}

%x comment
%%

"/*"          { BEGIN(comment);       }
^\n           { /* skip empty line */ }
.\n           { printf("%s", yytext); 
                ++lineCount;          }
"//".*\n      { ++lineCount;          }

<comment>"*/" { BEGIN(INITIAL);       }
<comment>.    { /* skip comment */    }
<comment>\n   { /* skip newline */    }

%%

int main() {
    yylex();
    printf("number of non-comment lines: %d\n", lineCount);
    return 0;
}
