function gcd(a, b) {
    if (b == 0) {
	return a;
    }
    return gcd(b, a % b);
}
// Compute a ** n % m
function power(a, n, m) {
    if (n == 0) {
	return 1;
    }
    p := power(a, n / 2, m);
    if (n % 2 == 0) {
	return p * p % m;
    }
    return p * p * a % m;
}

function is_prime(n) {
    t := 2;
    while (t * t < n) {
	if (n % t == 0) {
	    return 0;
	}
	t := t + 1;
    }
    return 1;
}

function is_carmichael(n) {
    if (n == 1 || is_prime(n) == 1) {
	return 0;   // Carmichael numbers are composite
    }
    for (a := 3; a <= n; a := a + 1) { 
        if (gcd(a, n) == 1 && power(a, n - 1, n) != 1) {
            return 0;
	}
    }
    return 1;
}

carmichaels := { n : n in {2 .. 10_000} | is_carmichael(n) == 1 };
print(carmichaels);

function factors(n) {
    result := { 2 .. 1 }; // empty set
    t := 2;
    while (t * t < n) {
	if (n % t == 0) {
	    result := result + { t };
	}
	t := t + 1;
    }
    return result;
}

print({ factors(n) : n in carmichaels });
