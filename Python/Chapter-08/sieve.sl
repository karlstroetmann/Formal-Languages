// The sieve of Eratosthenes, using a list of truth values.
// After the sieve has run, isPrime[i] is true if and only if i is a prime number.

function sieve(n) {
    isPrime    := [true] * (n + 1);
    isPrime[0] := false;
    isPrime[1] := false;
    for (i := 2; i * i <= n; i := i + 1) {
        if (isPrime[i]) {
            for (j := i * i; j <= n; j := j + i) {
                isPrime[j] := false;
            }
        }
    }
    return [ i : i in [2 .. n] | isPrime[i] ];
}

print("The primes less than 100 are ", sieve(100));
