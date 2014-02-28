s = 0;
i = 0;
while (i < 6 * 6) {
    i = i + 1;
    if (0 < i) {
        print(i);
        print(s);
    }
    s = s + i;
}
print(s);
