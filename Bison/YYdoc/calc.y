%{
#include "calc.h"
#include <string.h>
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
%}

%union {
    double       value;
    SymbolTable* symPtr;
}

%token <symPtr> NAME FUNC
%token <value>  NUMBER
%type  <value>  arithExpr product factor

%%
lines     : statement '\n'
          | lines statement '\n'
          ;

statement : NAME '=' arithExpr     { $1->value = $3;     }
          | arithExpr              { printf("%g\n", $1); }
          ;

arithExpr : arithExpr '+' product  { $$ = $1 + $3; }
          | arithExpr '-' product  { $$ = $1 - $3; }
          | product
          ;

product   : product '*' factor     { $$ = $1 * $3; }
          | product '/' factor     { $$ = $1 / $3; }
          | factor 
          ;

factor    : '(' arithExpr ')'      { $$ = $2;                }
          | NAME                   { $$ = $1->value;         }
          | FUNC '(' arithExpr ')' { $$ = ($1->funcPtr)($3); }
          | NUMBER 
          ;

%%
// look up a symbol table entry, add if not present 
SymbolTable* lookUpSymbol(char* symbol) {
    SymbolTable* symbolPtr;    
    for (symbolPtr = symtab; symbolPtr < &symtab[NSYMS]; ++symbolPtr) {
        // Is it already here? 
        if (symbolPtr->name && !strcmp(symbolPtr->name, symbol)) {
            return symbolPtr;
        }
        // Is it free?
        if (!symbolPtr->name) {
            symbolPtr->name = strdup(symbol);
            return symbolPtr;
        }
        // otherwise continue to next table entry
    }
    yyerror("Too many symbols");
    exit(1); // abort
} 

void addfunc(char* name, double (*func)(double x)) {
    SymbolTable* symbolPtr = lookUpSymbol(name);
    symbolPtr->funcPtr     = func;
}

int main() {
    // extern double sqrt(), exp(), log();
    addfunc("sqrt", sqrt);
    addfunc("exp", exp);
    addfunc("log", log);
    yyparse();
	return 0;
}

