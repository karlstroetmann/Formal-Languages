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
%}
   
%%
   
";"           { return symbol( sym.SEMI     ); } 
"+"           { return symbol( sym.PLUS     ); }
"-"           { return symbol( sym.MINUS    ); }
"*"           { return symbol( sym.TIMES    ); }
"/"           { return symbol( sym.DIV      ); }
"%"           { return symbol( sym.MOD      ); }
"("           { return symbol( sym.LPAR     ); }
")"           { return symbol( sym.RPAR     ); }
"\{"          { return symbol( sym.LBRACE   ); }
"\}"          { return symbol( sym.RBRACE   ); }
","           { return symbol( sym.COMMA    ); }
";"           { return symbol( sym.SEMI     ); }
"="           { return symbol( sym.ASSIGN   ); }
"=="          { return symbol( sym.EQ       ); }
"!="          { return symbol( sym.NE       ); }
"<"           { return symbol( sym.LT       ); }
">"           { return symbol( sym.GT       ); }
"<="          { return symbol( sym.LE       ); }
">="          { return symbol( sym.GE       ); }
"&&"          { return symbol( sym.AND      ); }
"||"          { return symbol( sym.OR       ); }
"!"           { return symbol( sym.NOT      ); }
"function"    { return symbol( sym.FUNCTION ); }
"return"      { return symbol( sym.RETURN   ); }
"if"          { return symbol( sym.IF       ); }
"else"        { return symbol( sym.ELSE     ); }
"while"       { return symbol( sym.WHILE    ); }
"for"         { return symbol( sym.FOR      ); }

([1-9][0-9]*|0)(\.[0-9]+)? { return symbol(sym.NUMBER); }
[a-zA-Z_][a-zA-Z0-9_]*     { return symbol(sym.ID);     }
\"[^\"]*\"                 { return symbol(sym.STRING); }

[ \t\n]       { /* skip white space */ }   
"//" [^\n]*   { /* skip comments    */ }   

[^]           { throw new Error("Illegal character '" + yytext() + 
                                "' at line " + yyline + ", column " + yycolumn); }
