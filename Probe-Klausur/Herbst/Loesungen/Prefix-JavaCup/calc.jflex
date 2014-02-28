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
   
"+"           { return symbol( sym.PLUS   ); }
"-"           { return symbol( sym.MINUS  ); }
"*"           { return symbol( sym.TIMES  ); }
"/"           { return symbol( sym.DIVIDE ); }

[1-9][0-9]*|0 { return symbol(sym.NUMBER, new Integer(yytext())); }

[ \t\v\n\r]   { /* skip white space */ }   

[^]           { throw new Error("Illegal character '" + yytext() + 
                                "' at line " + yyline + ", column " + yycolumn); }
