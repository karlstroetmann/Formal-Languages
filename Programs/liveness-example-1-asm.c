#import "stdio.h"

int f(int n) {              //  1
    int a, b, c;            //  2
    a = 0;                  //  3
    c = 0;                  //  4
  loop:                     //  5
    b = a + 1;              //  6
    c = c + b;              //  7
    a = b * 2;              //  8
    if (a < n) goto loop;   //  9
    return c;               // 10
}

int main() {
    for (int i = 0; i < 100; ++i) {
        printf("f(%d) = %d\n", i, f(i));
    }
    return 0;
}
