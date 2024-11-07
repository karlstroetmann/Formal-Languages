n := read();
function sum(n) {
    s := 0;
    for (i := 1; i <= n * n; i := i + 1) {
         s := s + i;
    }
    return s;
}
print(sum(n));
