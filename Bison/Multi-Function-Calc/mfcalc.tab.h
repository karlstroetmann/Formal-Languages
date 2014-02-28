typedef union {
    double  val;    /* For returning numbers.                   */
    symrec* tptr;   /* For returning symbol-table pointers      */
} YYSTYPE;
#define	NUM	257
#define	VAR	258
#define	FNCT	259
#define	NEG	260


extern YYSTYPE yylval;
