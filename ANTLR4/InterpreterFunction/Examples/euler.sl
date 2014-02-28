// Computing Euler's number via the Taylor series.
function computeEuler(n) {
    e := 1;
    f := 1;
    for (i := 1; i <= n; i := i + 1) {
        e := e + 1/f;
        f := f * (i + 1);
        printDigits(e, 100);
    }
    return e;
}
print("Berechnung von e:");
e := computeEuler(100);
printDigits(e,100);

