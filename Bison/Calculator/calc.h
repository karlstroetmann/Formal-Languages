/*
 *	Header for calculator program
 */

#define NSYMS 1000	// maximum number of symbols 

typedef struct symtab {
 	char*  name;
	double (*funcPtr)(double x);
	double value;
} SymbolTable;

SymbolTable symtab[NSYMS];

SymbolTable* lookUpSymbol(char* symbol);
void yyerror(char* msg);

