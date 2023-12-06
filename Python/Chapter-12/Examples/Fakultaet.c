/*** This function computes the factorial of a given number n. ***/
int fakultaet(int n) {
    int p;
    p = 1;
    while (n != 0) {
        p = p * n;
        n = n - 1;
    }
    return p;
}
// This function os executed when the program runs.
int main() {
    int n;
    n = 1; 
    while (n <= 10) {
        println(fakultaet(n));
        n = n + 1;
    }
}
