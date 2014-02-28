%{
#include <string.h>
#include <stdio.h>
#include "yydoc.h"
#include "yydoc.tab.h"
int braceCount = 0;
%}

word [A-Za-z0-9_]+

%option yylineno
%x BRACE PARSE COMMENT DONE

%%

"%%"                      { BEGIN(PARSE); }
.|\n                      { /* skip anything up to first "%%" */ }

<PARSE>[A-Z][A-Z0-9_]*    { yylval.name = strdup(yytext); 
	                        return TOKEN;       
                          }
<PARSE>[a-z][A-Za-z0-9_]* { yylval.name = strdup(yytext); 
                            return NONTERMINAL; 
                          }
<PARSE>'\\?.'             { yylval.name = strdup(yytext); 
	                        return CHAR;        
                          }
<PARSE>"\""[^"]*"\""      { yylval.name = strdup(yytext); 
                            return STRING;
                          }
<PARSE>[:|;]              { return yytext[0];           }
<PARSE>[ \t\r\n]          { /* ignore white space */    }
<PARSE>"%%"               { BEGIN(DONE);                }
<PARSE>"{"                { /* start counting braces */
	                        braceCount = 1; 
                                BEGIN(BRACE); 
                          }
<PARSE>"//".*             { /* skip single line comment */ }
<PARSE>"/*"               { BEGIN(COMMENT); }
<PARSE>"%prec "{word}     { /* skip precedence declarations */ }
<PARSE>"%prec "'\\?.'     { /* skip precedence declarations */ }

<COMMENT>"*/"             { BEGIN(PARSE);      }
<COMMENT>.|\n             { /* skip comment */ }

<BRACE>"{"                { ++braceCount; }
<BRACE>[^{}]              { /* skip */    }
<BRACE>"}"                { --braceCount; 
                            if (braceCount == 0) {
                              BEGIN(PARSE); 
                            }
                          }

<DONE>.|\n                { /* skip to end of file */ }

%%

void yyerror(char* msg) {
    printf("Line %d: %s at '%s'\n", yylineno, msg, yytext);
}
