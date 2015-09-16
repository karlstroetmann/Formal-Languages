#include <stdlib.h>
#include <string.h>
#include <math.h>

/* Data type for links in the chain of symbols.      */
struct symrec {
	char *name;  /* name of symbol                     */
	int   type;  /* type of symbol: either VAR or FNCT */
	union {
		double var;           /* value of a VAR  */
		double (*fnctptr)();  /* value of a FNCT */
	} value;
	struct symrec *next;    /* link field */
};

typedef struct symrec symrec;

/* The symbol table: a chain of `struct symrec'.     */
extern symrec* sym_table;

extern int yylex();
extern void yyerror(char* msg);
extern void init_table();
extern symrec* putsym(char* sym_name, int sym_type);
extern symrec* getsym(char* sym_name);
