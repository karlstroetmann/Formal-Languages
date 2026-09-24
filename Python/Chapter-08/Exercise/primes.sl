

function primes(n) {
    All := { 2 .. n };
    return All - { p * q : p in { 2 .. n / 2 }, q in { p .. n / p } };
}

print(primes(100));
print(primes(10_000));
