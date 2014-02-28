// Iterative Berechnung der Lösung der Gleichung x = cos(x).

function solve() {
    x    = 0;
    oldX = 1;
    while (x != oldX) {
        oldX = x;
        x = cos(x);
    }
    return x;
}

print("Lösung von \"x = cos(x)\" ist x = ", solve(), " (iterative Lösung)");

// Rekursive Berechnung der Lösung der Gleichung x = cos(x).
function solveRecursive(x) {
    if (x == cos(x)) {
        return x;
    }    
    return solveRecursive(cos(x));
}

print("Lösung von \"x = cos(x)\" ist x = ", solveRecursive(0), " (rekursive Lösung)");

quit;

