package org.example.binaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LC144 {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root==null) return output;
        stack.add(root);

        while(!stack.isEmpty()){
            TreeNode currNode = stack.pop();
            output.add(currNode.val);

            if(currNode.right!=null) stack.add(currNode.right);

            if(currNode.left!=null) stack.add(currNode.left);

        }

        return output;

    }

}
