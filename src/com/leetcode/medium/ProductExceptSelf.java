package com.leetcode.medium;
// 238
public class ProductExceptSelf {

    public static void main(String[] args) {


        int[] arr = {2, 3, 4, 5};
        int l = arr.length;
        int[] op = new int[l];

        op[0] = 1;

        for (int i = 1; i < l; i++) {
            op[i] = arr[i - 1] * op[i - 1];
        }

        int R = 1;

        for (int i = l - 1; i >= 0; i--) {
            op[i] = op[i] * R;
            R = R * arr[i];
        }


    }
}
