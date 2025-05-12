package org.example.queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC199 {
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

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while(!queue.isEmpty()){

            int levelSize = queue.size();
            int lastValue = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                lastValue = node.val;

                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
            result.add(lastValue);
        }
        return result;
    }
}
