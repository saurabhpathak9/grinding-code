package com.leetcode.easy;
// 110

import com.leetcode.utils.TreeNode;

public class BalancedBinaryTree {

    public static void main(String[] args) {

        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);


        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;

        System.out.println(a);

        System.out.println(isBalanced(a));

    }
    private static boolean result = true;

    public static boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return result;
    }

    public static int maxDepth(TreeNode root) {
        if (!result) return 0;
        if (root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1) {
            result = false;
        }
        return 1 + Math.max(l, r);
    }
}
