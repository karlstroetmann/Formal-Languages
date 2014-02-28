function factorial(n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}
var i;
for (i = 0; i < 12; i = i + 1) {
    print(factorial(i));
}