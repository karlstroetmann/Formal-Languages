int sum(int n) {
    int s;
    s = 0;
    do {
        s = s + n;
        n = n - 1;
    } while (n != 0);
    return s;
}

int main() {
    int n;
    n = getchar();
    n = n - 48;
    putchar(sum(n) + 48);
    putchar(10);
}
