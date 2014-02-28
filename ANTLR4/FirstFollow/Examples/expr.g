
factor
	: CONSTANT
	| '(' expr ')'
	;

product
	: factor
	| factor '*' product
	| factor '/' product
	| factor '%' product
	;

expr
	: product
	| product '+' expr
	| product '-' expr
	;

