test(E) :- 
	parse( [ 1, '+', 2, '*', 3, '-', '(', 4, '+', 5, ')', '*', 0 ], E ).

parse(L, E) :-
	parse(L, 1, E).

parse(L, D, E) :-
	parseExpr(L, D, [], E), !.

parse(L, D, E) :-
	D1 is D + 1, 
	length(L, Length),
	D1 =< Length,
	parse(L, D1, E).

% Expr -> Product
parseExpr(L, Depth, R, E) :-
	parseProduct(L, Depth, R, E).

% Expr -> Expr '+' Product
parseExpr(L, Depth, R, E) :-
	D is Depth - 1,
	D > 0,
	parseExpr(L, D, R1, E1),
	parseToken(R1, '+', R2),
	parseProduct(R2, Depth, R, P),
	E is E1 + P.

% Expr -> Expr '-' Product
parseExpr(L, Depth, R, E) :-
	D is Depth - 1,
	D > 0,
	parseExpr(L, D, R1, E1),
	parseToken(R1, '-', R2),
	parseProduct(R2, Depth, R, P),
	E is E1 - P.

% Product -> Factor
parseProduct(L, Depth, R, P) :-
	parseFactor(L, Depth, R, P).

% Product -> Product '*' Factor
parseProduct(L, Depth, R, P) :-
	D is Depth - 1,
	D > 0,
	parseProduct(L, D, R1, P1),
	parseToken(R1, '*', R2),
	parseFactor(R2, Depth, R, F),
	P is P1 * F.

% Product -> Product '/' Factor
parseProduct(L, Depth, R, P) :-
	D is Depth - 1,
	D > 0,
	parseProduct(L, D, R1, P1),
	parseToken(R1, '/', R2),
	parseFactor(R2, Depth, R, F),
	P is P1 / F.

% Factor -> '(' Expr ')'
parseFactor(L, Depth, R, F) :-
	parseToken(L, '(', R1),
	parseExpr(R1, Depth, R2, F),
	parseToken(R2, ')', R).

% Factor -> Number
parseFactor(L, _Depth, R, N) :-
	parseNumber(L, R, N).


parseNumber( [ N | R ], R, N ) :-
	number(N).


parseToken( [ T | R ], T, R ).
