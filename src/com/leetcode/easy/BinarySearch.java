package com.leetcode.easy;
// 704


public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        System.out.println(search(nums, target));

    }

    public static int search(int[] n, int target) {

        int start = 0;
        int end = n.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > n[mid]) {
                start = mid + 1;
            } else if (target < n[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
