function factorial(n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}

print("Berechnung der Fakultät für i = 1 bis 9");
for (i = 0; i < 10; i = i + 1) {
    print(i, "! = ", factorial(i));
}
print();



