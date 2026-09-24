#import "stdio.h"

int sum(int n) {
        int s;
        s = 0;
  loop: if (n == 0) goto finish;
        s = s + n;
        n = n - 1;    
        goto loop;   
  finish:
        return s;
}

int main() {
    printf("%d\n", sum(6*6));
    return 0;
}
