/* computing pi via a strange series */
function computePi(n) {
    pi := 0;
    f  := 1;
    for (k := 0; k <= n; k := k + 1) {
        k8 := 8 * k;
        pi := pi + (4 / (k8 + 1) - 2 / (k8 + 4) - 1 / (k8 + 5) - 1 / (k8 + 6)) / f;
        f := f * 16;
        printDigits(pi, 100);
    }
    return pi;
}

print("Berechnung von pi:");
pi := computePi(100);
printDigits(pi, 100);
