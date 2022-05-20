package com.leetcode.easy;
// 70

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        // Map<Integer, Integer> memo = new HashMap<>();
        // memo.put(1, 1);
        // memo.put(2, 2);
        // return climbStairs(n, memo);

        if (n <= 1) {
            return 1;
        }

        //         int[] dp = new int[n + 1];
        //         dp[1] = 1;
        //         dp[2] = 2;

        //         for (int i = 3; i <= n; i++) {
        //             dp[i] = dp[i - 1] + dp[i - 2];
        //         }

        //         return dp[n];

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
    }
    // private int climbStairs(int n, Map<Integer, Integer> memo) {
    //     if (memo.containsKey(n)) {
    //         return memo.get(n);
    //     }
    //     memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
    //     return memo.get(n);
    // }
}
