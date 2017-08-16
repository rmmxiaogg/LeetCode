package com.example;

import com.example.model.TreeNode;

/**
 * Created by Cain on 2017/8/16.
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 * 617
 * Pass by Cain on 2017/8/16.
 */

public class MergeTwoBinaryTrees {
    public class Solution {
        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null) return t2;
            if (t2 == null) return t1;
            TreeNode treeNode = new TreeNode(t1.val + t2.val);
            treeNode.left = mergeTrees(t1.left, t2.left);
            treeNode.right = mergeTrees(t1.right, t2.right);
            return treeNode;
        }
    }
}
