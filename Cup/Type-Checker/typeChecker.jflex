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
   
"+"                { return symbol( sym.PLUS      ); } 
"*"                { return symbol( sym.TIMES     ); } 
"("                { return symbol( sym.LEFT_PAR  ); } 
")"                { return symbol( sym.RIGHT_PAR ); }
","                { return symbol( sym.COMMA     ); }
":"                { return symbol( sym.COLON     ); }
";"                { return symbol( sym.SEMICOLON ); }
":="               { return symbol( sym.ASSIGN    ); }
"->"               { return symbol( sym.ARROW     ); }
"type"             { return symbol( sym.TYPE      ); }
"signature"        { return symbol( sym.SIGNATURE ); }

[a-z][a-zA-Z_0-9]* { return symbol(sym.FUNCTION,  yytext()); }
[A-Z][a-zA-Z_0-9]* { return symbol(sym.PARAMETER, yytext()); }

[ \t\n]            { /* skip white space */ }   
"//" [^\n]*        { /* skip comments    */ }   

[^] { throw new Error("Illegal character '" + yytext() + 
                      "' at line " + yyline + ", column " + yycolumn); }
