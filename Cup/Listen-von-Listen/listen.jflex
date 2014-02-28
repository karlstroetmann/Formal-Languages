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
   
"["      { return symbol( sym.OPEN  ); }
"]"      { return symbol( sym.CLOSE ); }
","      { return symbol( sym.COMMA ); }

[0-9]+   { return symbol( sym.NUMBER, new Integer(yytext()) ); }

[ \t\n]  { /* skip white space */ }   

[^]      { throw new Error("Illegal character '" + yytext() + 
                           "' at line " + yyline + ", column " + yycolumn); }
