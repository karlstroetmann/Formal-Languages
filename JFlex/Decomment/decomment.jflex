/**
  remove C comments from a file 
*/

%%

%class Decomment
%standalone
%unicode

%%

\/\*([^*]|\*+[^*/])*\*+\/[ \t]*\R? { /* skip multi  line comments */ }
\/\/.*\R?                          { /* skip single line comments */ }

