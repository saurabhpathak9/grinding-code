package com.leetcode.easy;
// 1

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 5, 11};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int gap = target - nums[i];
            if (m.containsKey(gap)) {
                res[0] = m.get(gap);
                res[1] = i;
                return res;
            } else {
                m.put(nums[i], i);
            }
        }

        return res;
    }
}
