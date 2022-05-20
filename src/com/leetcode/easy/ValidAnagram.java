package com.leetcode.easy;
// 242

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("saurabh", "hsrauba"));

    }

    public static boolean isAnagram(String s, String t) {

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 2) - 1);
            if (charMap.get(c) == 0) charMap.remove(c);
        }

        return charMap.size() == 0;

    }
}


