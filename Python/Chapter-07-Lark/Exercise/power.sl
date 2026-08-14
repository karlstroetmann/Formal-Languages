function power(S) {
    if (S == {}) {
	return { {} };
    }
    x := arb(S);
    S := S - { x };
    P := power(S);
    return P + { A + { x } : A in P };
}

function printPower(n) {
    P := power({1 .. n});
    print("The power set of the set, {1..", n, "}, is: ");
    print(P);
    print("It has ", len(P), " elements.");
    return 1;  // every functions has to return a value.
}

printPower(4);

