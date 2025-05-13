package org.example.binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LC230 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> sortedArray = inOrder(root, new ArrayList<>());
        return sortedArray.get(k-1);
    }

    private List<Integer> inOrder(TreeNode root, ArrayList<Integer> array) {
        if(root == null) return array;

        inOrder(root.left, array);
        array.add(root.val);
        inOrder(root.right, array);
        return array;

    }

}
