package com.leetcode.medium;
// 56
import java.util.ArrayList;
import java.util.List;

public class MergeInterval {

    public static void main(String[] args) {
        int[][] i = {{1, 2}, {8, 9}};
        int[] n = {8, 16};

        applyLogic(i, n);
        System.out.println("Done");

    }

    private static void applyLogic(int[][] i, int[] n) {
        List<int[]> r = new ArrayList<int[]>();

        for (int[] item : i) {
            if (item[0] > n[1]) {
                r.add(n);
                r.add(item);
            } else if (item[1] < n[0]) {
                r.add(item);
            } else {
                n[0] = Math.min(item[0], n[0]);
                n[1] = Math.max(item[1], n[1]);
            }
        }

        if (n != null) r.add(n);

        System.out.println(r);

    }
}
