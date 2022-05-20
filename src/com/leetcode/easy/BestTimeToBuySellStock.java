package com.leetcode.easy;
// 121


public class BestTimeToBuySellStock {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;
    
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }

        return max;
    }
}
