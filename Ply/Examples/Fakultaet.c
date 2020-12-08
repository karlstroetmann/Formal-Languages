int fakultaet(int n) {
    int p;
    p = 1;
    while (n != 0) {
        p = p * n;
        n = n - 1;
    }
    return p;
}

int main() {
    int n;
    n = 1; 
    while (n <= 10) {
        println(fakultaet(n));
        n = n + 1;
    }
}
