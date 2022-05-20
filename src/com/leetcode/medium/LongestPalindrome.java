package com.leetcode.medium;
// 5
public class LongestPalindrome {

    public static void main(String[] args) {

        String s = "cac";

        int[] lowercase = new int[26];
        int[] uppercase = new int[26];
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp >= 97) lowercase[temp - 'a']++;
            else uppercase[temp - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            res += (lowercase[i] / 2) * 2;
            res += (uppercase[i] / 2) * 2;
        }
        int i = res == s.length() ? res : res + 1;

        System.out.println(i);

    }
}
