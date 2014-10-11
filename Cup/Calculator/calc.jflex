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
   
";"           { return symbol( sym.SEMI   ); } 
"+"           { return symbol( sym.PLUS   ); }
"-"           { return symbol( sym.MINUS  ); }
"*"           { return symbol( sym.TIMES  ); }
"/"           { return symbol( sym.DIVIDE ); }
"%"           { return symbol( sym.MOD    ); }
"^"           { return symbol( sym.POW    ); }
"("           { return symbol( sym.LPAREN ); }
")"           { return symbol( sym.RPAREN ); }

([1-9][0-9]*|0)(\.[0-9]+)? { return symbol(sym.NUMBER, new Double(yytext())); }

[ \t\n]       { /* skip white space */ }   

[^]           { throw new Error("Illegal character '" + yytext() + 
                                "' at line " + yyline + ", column " + yycolumn); }
