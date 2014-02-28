s = 0;
i = 0;
while (i <= 6 * 6) {
    i = i + 1;
    if (0 < i) {
        print(s);
    }
    s = s + sin(i);
}
print("Summe sin(i) für i = 1..36 = ", s);
print("");

quit;

