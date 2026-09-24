/* computing pi via a strange series */
function computePi(n) {
    pi := 0.0;
    f  := 1.0;
    for (k := 0; k <= n; k := k + 1) {
        k8 := 8.0 * k;
        pi := pi + (4.0 / (k8 + 1.0) - 2.0 / (k8 + 4.0) - 1.0 / (k8 + 5.0) - 1.0 / (k8 + 6.0)) / f;
        f := f * 16.0;
        print(pi);
    }
    return pi;
}

print("The number pi is: ", computePi(20));

