#import "stdio.h"

int sum(int n) {
    int s;
    s = 0;
    while (n != 0) {
        s = s + n;
        n = n - 1;    
    };
    return s;
}

int main() {
    printf("%d\n", sum(6*6));
    return 0;
}
