package org.example.binaryTrees;

public class LC236 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        if (root == p || root == q) {
            return root;
        }

        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        if (leftLCA != null) {
            return leftLCA;
        }

        if (rightLCA != null) {
            return rightLCA;
        }

        return null;

    }
}
