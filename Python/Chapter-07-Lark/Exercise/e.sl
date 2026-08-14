

function factorial(n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

function e(n) {
    sum := 1.0;
    for (i := 1; i <= n; i := i + 1) {
	sum := sum + 1.0 / factorial(i);
    }
    return sum;
}

print("Euler's number is: ", e(20));
