package com.leetcode.easy;
// 235

import com.leetcode.utils.TreeNode;

public class LCAOfBST {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(6);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(0);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(7);
        TreeNode g = new TreeNode(9);
        TreeNode h = new TreeNode();
        TreeNode i = new TreeNode();
        TreeNode j = new TreeNode(3);
        TreeNode k = new TreeNode(5);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = j;
        e.right = k;
        c.left = f;
        c.right = g;

        System.out.println(a);
        System.out.println(lowestCommonAncestor(a, b, c));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

}


