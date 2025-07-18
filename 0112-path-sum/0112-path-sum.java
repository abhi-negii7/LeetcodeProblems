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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return PathExist(root, targetSum);
    }

    public boolean PathExist(TreeNode root, int targetSum) {

        // BASE CASE
        if (root == null)
            return false;

        // if we gets the answer
        if (root.left == null && root.right == null)
            return targetSum == root.val;

        return PathExist(root.left, targetSum - root.val) || PathExist(root.right, targetSum - root.val);

    }
}