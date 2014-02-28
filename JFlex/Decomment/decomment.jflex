/**
  remove C comments from a file 
*/

%%

%class Decomment
%standalone
%unicode

%%

\/\*([^*]|\*+[^*/])*\*+\/ { /* skip multi  line comments */ }
\/\/.*                    { /* skip single line comments */ }

