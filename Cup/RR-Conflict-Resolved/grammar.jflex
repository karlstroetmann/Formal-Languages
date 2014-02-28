import java_cup.runtime.*;
      
%%
   
%char
%line
%column
%cup
   
%{   
    private Symbol symbol(int type) {
        return new Symbol(type, yychar, yychar + yylength());
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yychar, yychar + yylength(), value);
    }
%}
   
%%
   
"x"          { return symbol( sym.X ); } 
"y"          { return symbol( sym.Y ); }

[ \t\n]      { /* skip white space */ }   

[^]          { throw new Error("Illegal character '" + yytext() + 
							   "' at line " + yyline + ", column " + yycolumn); }
