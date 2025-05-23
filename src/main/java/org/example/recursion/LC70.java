package org.example.recursion;

public class LC70 {
    public int climbStairs(int n) {
       if(n==1) return 1;

       int[] dp = new int[n+1];

       dp[1] = 1;
       dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

/* n=4
1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
 */

