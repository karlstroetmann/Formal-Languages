import java_cup.runtime.*;    
%%
%char
%line
%column
%cupsym IntegerCParserSym
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

%eofval{
    return new Symbol(IntegerCParserSym.EOF);
%eofval}
   
%%
   
"+"                   { return symbol( IntegerCParserSym.PLUS      ); } 
"-"                   { return symbol( IntegerCParserSym.MINUS     ); } 
"*"                   { return symbol( IntegerCParserSym.TIMES     ); } 
"/"                   { return symbol( IntegerCParserSym.SLASH     ); } 
"("                   { return symbol( IntegerCParserSym.LPAREN    ); } 
")"                   { return symbol( IntegerCParserSym.RPAREN    ); }
"{"                   { return symbol( IntegerCParserSym.LBRACE    ); }
"}"                   { return symbol( IntegerCParserSym.RBRACE    ); }
","                   { return symbol( IntegerCParserSym.COMMA     ); }
";"                   { return symbol( IntegerCParserSym.SEMICOLON ); }
"="                   { return symbol( IntegerCParserSym.ASSIGN    ); }
"=="                  { return symbol( IntegerCParserSym.EQ        ); }
"!="                  { return symbol( IntegerCParserSym.NE        ); }
"<"                   { return symbol( IntegerCParserSym.LT        ); }
">"                   { return symbol( IntegerCParserSym.GT        ); }
"<="                  { return symbol( IntegerCParserSym.LE        ); }
">="                  { return symbol( IntegerCParserSym.GE        ); }
"&&"                  { return symbol( IntegerCParserSym.AND       ); }
"||"                  { return symbol( IntegerCParserSym.OR        ); }
"!"                   { return symbol( IntegerCParserSym.NOT       ); }
"int"                 { return symbol( IntegerCParserSym.INT       ); }
"return"              { return symbol( IntegerCParserSym.RETURN    ); }
"if"                  { return symbol( IntegerCParserSym.IF        ); }
"else"                { return symbol( IntegerCParserSym.ELSE      ); }
"while"               { return symbol( IntegerCParserSym.WHILE     ); }

[a-zA-Z][a-zA-Z_0-9]* { return symbol(IntegerCParserSym.ID,     yytext());              }
0|[1-9][0-9]*         { return symbol(IntegerCParserSym.NUMBER, new Integer(yytext())); }

[ \t\v\n\r]           { /* skip white space          */ }   
"//" [^\n]*           { /* skip single line comments */ }   
"/*" ~"*/"            { /* skip multi  line comments */ }   

[^] { throw new Error("Illegal character '" + yytext() + 
                      "' at line " + yyline + ", column " + yycolumn); }
