function power(S) {
    if (S == {}) {
	return { {} };
    }
    x := arb(S);
    S := S - { x };
    P := power(S);
    return P + { A + { x } : A in P };
}

print("The power set of the set ", {1..3}, " is: ", power({1 .. 3}), ".");
