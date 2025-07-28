/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        // Using BFS
        
        // Queue to use the BFS
        Queue<TreeNode> q = new LinkedList<>();
        // To Store the sum
        int sum = 0;

        // Add root to the queue
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode currNode = q.poll();
            
            // if currNode left exist
            if (currNode.left != null) {
                // check if it is the leaf node
                if (currNode.left.left == null && currNode.left.right == null)
                    sum += currNode.left.val;
                // if not leaf node 
                else
                    q.add(currNode.left);
            }
            // if currNode right exist
            if (currNode.right != null)
                q.add(currNode.right);
        }
        return sum;
    }
}