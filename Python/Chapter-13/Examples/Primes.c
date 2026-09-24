/*** This function checks whether n is a prime number.
     It returns the number n, if n is prime.  Otherwise,
     0 is returned.
 ***/
int is_prime(int n) {
    int f;
    f = 2;
    while (f < n) {
        if (n % f == 0)
            return 0;
        f = f + 1;
    }
    return n;
}
// This function computes all primes less than 100.
int main() {
    int n;
    int p;
    n = 2; 
    while (n <= 100) {
        p = is_prime(n);
        if (p > 0) {
            println(p);
        }
        n = n + 1;
    }
}
