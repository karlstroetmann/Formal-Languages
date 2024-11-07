function factorial(n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

for (i := 2; i <= 25; i := i + 1) {
    print(factorial(i));
}
