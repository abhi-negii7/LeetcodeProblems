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
    public int findTilt(TreeNode root) {
        int[] ansSum = { 0 };
        solve(root, 0, ansSum);
        return ansSum[0];
    }

    public int solve(TreeNode root, int sum, int[] ansSum) {
        //BASE CASE
        if (root == null)
            return 0;

         // Recursively compute the sum of left and right subtrees
        int ls = solve(root.left, sum, ansSum);
        int rs = solve(root.right, sum, ansSum);

        // Add the tilt of the current node to the total tilt
        // Tilt = absolute difference between left and right subtree sums
        ansSum[0] +=  Math.abs(ls - rs);

         // Return the total sum of the current subtree (left + right + current node value)
        return ls+rs+root.val;
    }
}