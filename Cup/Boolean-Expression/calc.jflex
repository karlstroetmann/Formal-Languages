import java_cup.runtime.*;
      
%%
   
%char
%line
%column
%cup
%unicode
   
%{   
    private Symbol symbol(int type) {
        return new Symbol(type, yychar, yychar + yylength());
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yychar, yychar + yylength(), value);
    }
%}
   
%%
   
"&"          { return symbol( sym.AND    ); } 
"|"          { return symbol( sym.OR     ); }
"!"          { return symbol( sym.NOT    ); }

[a-z]*       { return symbol(sym.IDENTIFIER, yytext()); }

[ \t\n]      { /* skip white space */ }   

[^]          { throw new Error("Illegal character '" + yytext() + 
                               "' at line " + yyline + ", column " + yycolumn); }
