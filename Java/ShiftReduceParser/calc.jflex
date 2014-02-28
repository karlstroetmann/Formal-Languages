     
%%
   
%class Scanner
%type  Symbol
   
%%
   
"+"           { return new Symbol( Symbol.PLUS,   "+" ); }
"-"           { return new Symbol( Symbol.MINUS,  "-" ); }
"*"           { return new Symbol( Symbol.TIMES,  "*" ); }
"/"           { return new Symbol( Symbol.DIVIDE, "/" ); }
"("           { return new Symbol( Symbol.LPAREN, "(" ); }
")"           { return new Symbol( Symbol.RPAREN, ")" ); }

0|[1-9][0-9]* { return new Symbol( Symbol.NUMBER, yytext()) ; }

[ \t\v\n\r]   { /* skip white space */ }   

[^]          { throw new Error("Illegal character '" + yytext() + 
                               "' at line " + yyline + ", column " + yycolumn); }
