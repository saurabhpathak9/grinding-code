package com.leetcode.medium;
// 322
import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int amount = 18;
        int[] coins = {1, 2, 5};
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE / 2);

        dp[0] = 0;

        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i] <= j)
                    dp[j] = Math.min(dp[j], 1 + dp[j - coins[i]]);
            }
        }

        //  System.out.println(minCoins(18, coins));

        System.out.println("Done");
    }

    public static int minCoins(int amount, int[] coins) {
        if (amount == 0) return 0;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < coins.length; i++) {
            if (amount - coins[i] >= 0) {
                int subAns = minCoins(amount - coins[i], coins);

                if (subAns != Integer.MAX_VALUE && subAns + 1 < ans) {
                    ans = subAns + 1;
                }
            }

        }

        return ans;
    }
}
