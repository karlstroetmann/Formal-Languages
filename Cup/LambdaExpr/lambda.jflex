import java_cup.runtime.*;
      
%%
%cup
   
%{   
    private Symbol symbol(int type) {
        return new Symbol(type, yychar, yychar + yylength());
    }
 %}
   
%%
   
"+"           { return symbol( sym.PLUS       ); }
"-"           { return symbol( sym.MINUS      ); }
"*"           { return symbol( sym.TIMES      ); }
"/"           { return symbol( sym.DIVIDE     ); }
"("           { return symbol( sym.LPAREN     ); }
")"           { return symbol( sym.RPAREN     ); }
"["           { return symbol( sym.LBRACKET   ); }
"]"           { return symbol( sym.RBRACKET   ); }
","           { return symbol( sym.COMMA      ); }
"|->"         { return symbol( sym.MAPSTO     ); }

[1-9][0-9]*   { return symbol( sym.NUMBER     ); }
[a-zA-Z]+     { return symbol( sym.IDENTIFIER ); }

[ \t\v\n\r\f] { /* skip white space and form feeds */              }   
[^]           { throw new Error("Illegal character '" + yytext()); }
