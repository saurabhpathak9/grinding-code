package com.leetcode.easy;
// 226

import com.leetcode.utils.TreeNode;

public class InvertBinaryTree {

    public static void main(String[] args) {

        TreeNode a = new TreeNode(4);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(7);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(3);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        System.out.println(a);

        invertTree(a);

        System.out.println(a);


    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        inOrderInvert(root);

        return root;
    }

    public static void inOrderInvert(TreeNode node) {
        if (node == null) return;

        inOrderInvert(node.left);
        inOrderInvert(node.right);

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        return;
    }
}
