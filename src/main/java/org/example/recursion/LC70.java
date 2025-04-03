package org.example.recursion;

public class LC70 {
    public int climbStairs(int n) {
        if(n<=0){
            return 0;
        }
        if(n<=1){
            return 1;
        }
        if(n<=2){
            return 2;
        }

        return climbStairs(n-1) + climbStairs(n-2);
    }
}

/* n=4
1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
 */

