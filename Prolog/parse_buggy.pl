test(E) :- 
	parse( [ 1, '+', 2 ], E ).

parse(L, E) :-
	parseExpr(L, [], E).

% Expr -> Product
parseExpr(L, R, E) :-
	parseProduct(L, R, E).

% Expr -> Expr '+' Product
parseExpr(L, R, E) :-
	parseExpr(L, R1, E1),
	parseToken(R1, '+', R2),
	parseProduct(R2, R, P),
	E is E1 + P.

% Expr -> Expr '-' Product
parseExpr(L, R, E) :-
	parseExpr(L, R1, E1),
	parseToken(R1, '-', R2),
	parseProduct(R2, R, P),
	E is E1 - P.

% Product -> Factor
parseProduct(L, R, P) :-
	parseFactor(L, R, P).

% Product -> Product '*' Factor
parseProduct(L, R, P) :-
	parseProduct(L, R1, P1),
	parseToken(R1, '*', R2),
	parseFactor(R2, R, F),
	P is P1 * F.

% Product -> Product '/' Factor
parseProduct(L, R, P) :-
	parseProduct(L, R1, P1),
	parseToken(R1, '/', R2),
	parseFactor(R2, R, F),
	P is P1 / F.

% Factor -> '(' Expr ')'
parseFactor(L, R, F) :-
	parseToken(L, '(', R1),
	parseExpr(R1, R2, F),
	parseToken(R2, ')', R).

% Factor -> Number
parseFactor(L, R, N) :-
	parseNumber(L, R, N).


parseNumber( [ N | R ], R, N ) :-
	number(N).


parseToken( [ T | R ], T, R ).
