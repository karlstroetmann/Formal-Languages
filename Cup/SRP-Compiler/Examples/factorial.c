int factorial(int n) {
    int f;
    if (n == 0) {
        return 1;
    };
    f = factorial(n - 1);
    return n * f;
}
