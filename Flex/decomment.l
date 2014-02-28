%{
  /* remove C comments from a file */
%}

%%

\/\*([^*]|\*+[^*/])*\*+\/ { /* skip multi  line comments */ }
\/\/.*                    { /* skip single line comments */ }

%%

int main() {
    yylex();
}
