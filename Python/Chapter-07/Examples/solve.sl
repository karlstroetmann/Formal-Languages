function abs(x) {
    if (x < 0) {
	return 0 - x;
    }
    return x;
}
print(abs(2-3));

// Solving the equation x = cos(x) iteratively.
function solve() {
    x    := 0;
    oldX := 1;
    while (abs(x - oldX) > 1.0e-15) {
        oldX := x;
        x := cos(x);
        print(x);
    }
    return x;
}

x := solve();
print(x);

// Recursive solution of the equation x = cos(x).
function solveRecursive(x) {
    if (abs(x - cos(x)) < 1.0e-15) {
        return x;
    }    
    return solveRecursive(cos(x));
}
x := solveRecursive(x);
print(x);
