// Iterative Berechnung der Lösung der Gleichung x = cos(x).
function solve() {
    x    := 0;
    oldX := 1;
    while (abs(x - oldX) > 1.0e-12) {
        oldX := x;
        x := cos(x);
        print(x);
    }
    return x;
}

x := solve();
print("Lösung von \"x := cos(x)\" ist x := ", x, " (iterative Lösung)");

// Rekursive Berechnung der Lösung der Gleichung x := cos(x).
function solveRecursive(x) {
    if (abs(x - cos(x)) < 1.0e-12) {
        return x;
    }    
    return solveRecursive(cos(x));
}

print("Lösung von \"x := cos(x)\" ist x = ", solveRecursive(0), " (rekursive Lösung)");

quit;

