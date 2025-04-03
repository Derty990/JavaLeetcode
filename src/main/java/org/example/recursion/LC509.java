package org.example.recursion;

public class LC509 {
    public int fib(int n) {
        if (n<=1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
}

/* n=3
F(3) = (3-1) + (3-2) = 2+1 = 3
 */
