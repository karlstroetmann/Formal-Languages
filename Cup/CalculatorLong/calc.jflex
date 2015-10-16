import java_cup.runtime.*;
%%
%char
%line
%column
%cupsym ExprParserSym
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
  return new Symbol(ExprParserSym.EOF);
%eofval}   
%%
";"           { return symbol( ExprParserSym.SEMI   ); } 
"+"           { return symbol( ExprParserSym.PLUS   ); }
"-"           { return symbol( ExprParserSym.MINUS  ); }
"*"           { return symbol( ExprParserSym.TIMES  ); }
"/"           { return symbol( ExprParserSym.DIVIDE ); }
"%"           { return symbol( ExprParserSym.MOD    ); }
"("           { return symbol( ExprParserSym.LPAREN ); }
")"           { return symbol( ExprParserSym.RPAREN ); }
0|[1-9][0-9]* { return symbol(ExprParserSym.NUMBER, new Integer(yytext())); }
[ \t\v\n\r]   { /* skip white space */ }   
[^]           { throw new Error("Illegal character '" + yytext() + 
                                "' at line " + yyline + ", column " + yycolumn); }
