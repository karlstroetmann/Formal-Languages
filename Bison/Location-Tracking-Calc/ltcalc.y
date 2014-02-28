/* Location tracking calculator.  */

%{
  #define YYSTYPE double
  #include <stdlib.h>
  #include <stdio.h>
  #include <math.h>
  int yylex (void);
  void yyerror (char const *);
%}

/* Bison declarations.  */
%token NUM

%left '-' '+'
%left '*' '/'
%left NEG
%right '^'

%% 
input : /* empty */
      | input line
      ;

line  :     '\n'
      | exp '\n' { printf("%g\n", $1); }
      ;

exp   : NUM           { $$ = $1; }
      | exp '+' exp   { $$ = $1 + $3; }
      | exp '-' exp   { $$ = $1 - $3; }
      | exp '*' exp   { $$ = $1 * $3; }
      | exp '/' exp   { if ($3 != 0) {
                            $$ = $1 / $3;
                        } else {
							$$ = 1;
							fprintf(stderr, 
                                    "%d.%d-%d.%d: division by zero\n",
									@3.first_line, @3.first_column,
									@3.last_line,  @3.last_column);
							exit(1);
						}
	                  }
      | exp '^' exp   { $$ = pow ($1, $3); }
      | '(' exp ')'   { $$ = $2;           }
      | '-' exp %prec NEG { $$ = -$2; }
      ;

%%

int main() {
	yylloc.first_line   = yylloc.last_line   = 1;
	yylloc.first_column = yylloc.last_column = 0;
	return yyparse();
}
