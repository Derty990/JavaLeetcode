package org.example.binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LC94 {
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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        travel(result, root);
        return result;
    }

    private void travel(List<Integer> result, TreeNode node) {

        if(node !=null){
            if(node.left!=null){
                travel(result, node.left);
            }
            result.add(node.val);
            if(node.right!=null){
                travel(result,node.right);
            }
        }

    }

}
