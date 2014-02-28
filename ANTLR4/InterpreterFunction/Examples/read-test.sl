function sum(n) {
    s := 0;
    for (i := 1; i <= n; i := i + 1) {
        s := s + i;
    }
    return s;
}

function main() {
    print("Geben Sie die Zahl an, bis zu der summiert werden soll.");
    n := read();
    s := sum(n);
    print("Die Summe über alle i von i = 1 bis ", n, " ist gleich ", s, ".");
    print("");
}

main();



