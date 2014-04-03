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
   
"+"                   { return symbol( sym.PLUS      ); } 
"-"                   { return symbol( sym.MINUS     ); } 
"*"                   { return symbol( sym.TIMES     ); } 
"/"                   { return symbol( sym.SLASH     ); } 
"("                   { return symbol( sym.LPAREN    ); } 
")"                   { return symbol( sym.RPAREN    ); }
"{"                   { return symbol( sym.LBRACE    ); }
"}"                   { return symbol( sym.RBRACE    ); }
","                   { return symbol( sym.COMMA     ); }
";"                   { return symbol( sym.SEMICOLON ); }
"="                   { return symbol( sym.ASSIGN    ); }
"=="                  { return symbol( sym.EQUALS    ); }
"!="                  { return symbol( sym.NEQUALS   ); }
"<"                   { return symbol( sym.LT        ); }
">"                   { return symbol( sym.GT        ); }
"<="                  { return symbol( sym.LE        ); }
">="                  { return symbol( sym.GE        ); }
"&&"                  { return symbol( sym.AND       ); }
"||"                  { return symbol( sym.OR        ); }
"!"                   { return symbol( sym.NOT       ); }
"int"                 { return symbol( sym.INT       ); }
"return"              { return symbol( sym.RETURN    ); }
"if"                  { return symbol( sym.IF        ); }
"else"                { return symbol( sym.ELSE      ); }
"while"               { return symbol( sym.WHILE     ); }

[a-zA-Z][a-zA-Z_0-9]* { return symbol(sym.IDENTIFIER, yytext());          }
0|[1-9][0-9]*         { return symbol(sym.NUMBER, new Integer(yytext())); }

[ \t\v\n\r]           { /* skip white space */ }   
"//" [^\n]*           { /* skip comments    */ }   

[^] { throw new Error("Illegal character '" + yytext() + 
                      "' at line " + yyline + ", column " + yycolumn); }
